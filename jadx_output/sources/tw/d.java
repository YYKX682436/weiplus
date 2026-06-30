package tw;

/* loaded from: classes9.dex */
public final class d implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f422396a;

    public d(tw.i iVar) {
        this.f422396a = iVar;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsNotifySettingUIC", "onSubscribeMsgStatusChanged error");
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "onSubscribeMsgStatusChanged templateId: " + templateId + ", businessType: " + result.f247083i + ", isSubscribed: " + result.f247075a + ", isSwitchOpened: " + result.f247076b);
        tw.i iVar = this.f422396a;
        iVar.f422406h.removeCallbacks(iVar.f422415t);
        iVar.f422406h.postDelayed(iVar.f422415t, 100L);
    }
}
