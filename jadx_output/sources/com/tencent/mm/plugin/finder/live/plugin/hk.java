package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hk implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112820d;

    public hk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112820d = hmVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.r2 r2Var = (mm2.r2) obj;
        if (r2Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112820d;
        java.lang.String str = r2Var.f329373d;
        if (hmVar.I1(str, null)) {
            qo0.b bVar = qo0.b.Z1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", str);
            bundle.putSerializable("PARAM_FINDER_LIVE_SEND_GIFT_DATA", r2Var);
            hmVar.f112827p.statusChange(bVar, bundle);
        }
    }
}
