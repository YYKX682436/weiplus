package x44;

/* loaded from: classes4.dex */
public final class s1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q64.b f451886a;

    public s1(q64.b bVar) {
        this.f451886a = bVar;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$onServerRun$2");
        boolean b17 = obj instanceof java.lang.Integer ? kotlin.jvm.internal.o.b(obj, 513) : false;
        q64.b bVar = this.f451886a;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", i18);
            bundle.putBoolean("noticed", b17);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$onServerRun$2");
    }
}
