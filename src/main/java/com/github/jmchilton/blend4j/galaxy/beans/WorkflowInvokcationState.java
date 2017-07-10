package com.github.jmchilton.blend4j.galaxy.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowInvokcationState {

	private String historyId, id, state;

	public String getHistoryId() {
		return historyId;
	}

	@JsonProperty("history")
	public void setHistoryId(final String historyId) {
		this.historyId = historyId;
	}

	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}
	
	
}
