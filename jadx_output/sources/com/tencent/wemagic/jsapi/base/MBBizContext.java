package com.tencent.wemagic.jsapi.base;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0011\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0082 J!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0082 J1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0082 ¨\u0006\""}, d2 = {"Lcom/tencent/wemagic/jsapi/base/MBBizContext;", "Lcom/tencent/wemagic/common/api/IMBBizContext;", "<init>", "()V", "getPhysicalPath", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "getInternalByte", "Landroid/graphics/Bitmap;", "internalPath", "isForeground", "", "provideActivity", "Landroid/app/Activity;", "sendEvent", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "onCallback", "callbackId", "", "errCode", "", "errMsg", "dataStr", "testEvaluateScript", "script", "callback", "Lcom/tencent/wemagic/common/api/IMBBizContext$EvaluateCallback;", "getIsForeground", "envId", "doSendEvent", "doCallback", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class MBBizContext implements vw5.a {
    private final native void doCallback(long envId, long callbackId, int errCode, java.lang.String errMsg, java.lang.String dataStr);

    private final native void doSendEvent(long envId, java.lang.String name, java.lang.String data);

    private final native boolean getIsForeground(long envId);

    public void b(long j17, int i17, java.lang.String errMsg, java.lang.String dataStr) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(dataStr, "dataStr");
        doCallback(a(), j17, i17, errMsg, dataStr);
    }
}
