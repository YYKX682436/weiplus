package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class b2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.d2 f124487d;

    public b2(com.tencent.mm.plugin.finder.profile.widget.d2 d2Var) {
        this.f124487d = d2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.profile.widget.b2 b2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("member reddot [SHOW NEW] red=");
        boolean z17 = true;
        sb6.append(z9Var != null && z9Var.f105327a);
        com.tencent.mars.xlog.Log.i("Finder.HeaderMemberWidget", sb6.toString());
        if (z9Var == null || !z9Var.f105327a) {
            b2Var = this;
            z17 = false;
        } else {
            b2Var = this;
        }
        com.tencent.mm.plugin.finder.profile.widget.d2 d2Var = b2Var.f124487d;
        if (!z17 || !d2Var.f124514b) {
            d2Var.a().O.f434614e.setVisibility(8);
            d2Var.a().P.f434614e.setVisibility(8);
            return;
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
        if (I0 != null && L0 != null) {
            com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
        }
        d2Var.a().O.f434614e.setVisibility(0);
        d2Var.a().P.f434614e.setVisibility(0);
    }
}
