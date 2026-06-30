package com.tencent.thumbplayer.common.report;

/* loaded from: classes16.dex */
public interface ITPReportParams {
    void paramsToJson(org.json.JSONObject jSONObject);

    void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties);

    void reset();
}
