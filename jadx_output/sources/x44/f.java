package x44;

/* loaded from: classes4.dex */
public final class f implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public static final x44.f f451828a = new x44.f();

    @Override // m02.b
    public final void a(m02.a aVar, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$startDownload$1");
        com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "download id is " + j17 + ", result = " + aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$startDownload$1");
    }
}
