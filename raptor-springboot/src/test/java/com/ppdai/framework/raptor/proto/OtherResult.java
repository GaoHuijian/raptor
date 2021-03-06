// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: com/ppdai/framework/raptor/proto/OtherResult.proto
package com.ppdai.framework.raptor.proto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ppdai.framework.raptor.annotation.RaptorField;
import com.ppdai.framework.raptor.annotation.RaptorMessage;

import java.util.List;
import java.util.Objects;

@RaptorMessage(
    protoFile = "OtherResult"
)
public final class OtherResult {
  private static final long serialVersionUID = 0L;

  @RaptorField(
      fieldType = "string",
      order = 1,
      name = "url"
  )
  @JsonProperty("url")
  private String url;

  @RaptorField(
      fieldType = "string",
      order = 2,
      name = "title"
  )
  @JsonProperty("title")
  private String title;

  @RaptorField(
      fieldType = "string",
      order = 3,
      name = "snippets",
      repeated = true
  )
  @JsonProperty("snippets")
  private List<String> snippets;

  public OtherResult() {
  }

  public OtherResult(String url, String title, List<String> snippets) {
    this.url = url;
    this.title = title;
    this.snippets = snippets;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url=url;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title=title;
  }

  public List<String> getSnippets() {
    return this.snippets;
  }

  public void setSnippets(List<String> snippets) {
    this.snippets=snippets;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OtherResult)) return false;
    OtherResult o = (OtherResult) other;
    return true
        && Objects.equals(url, o.url)
        && Objects.equals(title, o.title)
        && Objects.equals(snippets, o.snippets);
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = result * 37 + (url != null ? url.hashCode() : 0);
    result = result * 37 + (title != null ? title.hashCode() : 0);
    result = result * 37 + (snippets != null ? snippets.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (url != null) builder.append(", url=").append(url);
    if (title != null) builder.append(", title=").append(title);
    if (snippets != null  && !snippets.isEmpty()) builder.append(", snippets=").append(snippets);
    return builder.replace(0, 2, "OtherResult{").append('}').toString();
  }
}
