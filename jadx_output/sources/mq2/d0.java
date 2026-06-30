package mq2;

/* loaded from: classes15.dex */
public final class d0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330727d;

    public d0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330727d = nearbyPersonV1UIC;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330727d;
        nearbyPersonV1UIC.f122106x = true;
        com.tencent.mm.plugin.report.service.f0.e(11);
        if (nearbyPersonV1UIC.f330722d != null) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            java.lang.Object obj = nearbyPersonV1UIC.f330722d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.d((com.tencent.mm.modelbase.m1) obj);
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "showLoadingDialog  [loading cancel] cancel in loading");
        if (nearbyPersonV1UIC.f122101s) {
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "showLoadingDialog [loading cancel] cancel in first loading");
    }
}
