package ld;

/* loaded from: classes15.dex */
public class f extends java.util.HashMap {
    public f(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        put("codeCacheSwitch", java.lang.String.valueOf(wxaLiteAppStartReport.H.codeCacheSwitch ? 1 : 0));
        put("codeCacheResult", java.lang.String.valueOf(wxaLiteAppStartReport.H.codeCacheResult));
        put("hitSnapshotSwitch", java.lang.String.valueOf(wxaLiteAppStartReport.H.hitSnapshotSwitch ? 1 : 0));
        put("snapshotRuntimeType", java.lang.String.valueOf(wxaLiteAppStartReport.H.snapshotRuntimeType));
        put("isPreloadPage", java.lang.String.valueOf(wxaLiteAppStartReport.f46016z ? 1 : 0));
        put("isPreloadEngine", java.lang.String.valueOf(wxaLiteAppStartReport.f46010t ? 1 : 0));
    }
}
