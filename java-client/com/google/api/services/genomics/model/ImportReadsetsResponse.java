/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.genomics.model;

/**
 * Model definition for ImportReadsetsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class ImportReadsetsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A job ID that can be used to get status information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * IDs of the readsets to which data is being imported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> readsetIds;

  /**
   * A job ID that can be used to get status information.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * A job ID that can be used to get status information.
   * @param jobId jobId or {@code null} for none
   */
  public ImportReadsetsResponse setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * IDs of the readsets to which data is being imported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReadsetIds() {
    return readsetIds;
  }

  /**
   * IDs of the readsets to which data is being imported.
   * @param readsetIds readsetIds or {@code null} for none
   */
  public ImportReadsetsResponse setReadsetIds(java.util.List<java.lang.String> readsetIds) {
    this.readsetIds = readsetIds;
    return this;
  }

  @Override
  public ImportReadsetsResponse set(String fieldName, Object value) {
    return (ImportReadsetsResponse) super.set(fieldName, value);
  }

  @Override
  public ImportReadsetsResponse clone() {
    return (ImportReadsetsResponse) super.clone();
  }

}
