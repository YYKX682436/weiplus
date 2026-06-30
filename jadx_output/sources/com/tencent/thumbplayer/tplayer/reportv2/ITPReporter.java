package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public interface ITPReporter {
    void addReportChannelListener(com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener iTPReportChannelListener);

    void init(android.content.Context context, com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams tPReporterInitParams);

    void onEvent(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo);

    void reset();

    void setPlayerInfoGetter(com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter);

    void setReportInfoGetter(com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter iTPReportInfoGetter);
}
