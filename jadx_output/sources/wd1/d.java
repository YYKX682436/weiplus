package wd1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd1.k f444801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wd1.k kVar) {
        super(0);
        this.f444801d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close runtime:");
        wd1.k kVar = this.f444801d;
        sb6.append(kVar.f444822d);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnapshotWebViewService", sb6.toString());
        wl1.h hVar = kVar.f444824f;
        if (hVar != null) {
            hVar.b();
            kVar.f444824f = null;
        }
        com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar = kVar.f444823e;
        if (lVar != null) {
            if (lVar.getParent() != null) {
                com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar2 = kVar.f444823e;
                kotlin.jvm.internal.o.d(lVar2);
                android.view.ViewParent parent = lVar2.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(kVar.f444823e);
            }
            kVar.f444823e = null;
        }
        return jz5.f0.f302826a;
    }
}
