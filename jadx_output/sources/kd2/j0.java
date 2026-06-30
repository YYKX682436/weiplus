package kd2;

/* loaded from: classes2.dex */
public final class j0 implements o04.p {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f306762a = "";

    /* renamed from: b, reason: collision with root package name */
    public kd2.i0 f306763b;

    @Override // o04.p
    public r45.x60 a() {
        return b(this.f306763b);
    }

    public final r45.x60 b(kd2.i0 i0Var) {
        r45.x60 x60Var = new r45.x60();
        if (i0Var != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = i0Var.f306756a;
            java.lang.String description = baseFinderFeed.getFeedObject().getDescription();
            if (!java.lang.Boolean.valueOf(!(description == null || description.length() == 0)).booleanValue()) {
                description = null;
            }
            if (description == null) {
                description = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.o0z, baseFinderFeed.getFeedObject().getNickNameSpan());
            }
            x60Var.f389813d = description;
            x60Var.f389816g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8e);
            x60Var.f389814e = "2";
            com.tencent.mars.xlog.Log.i("Finder.FinderRecoverPageHelper", "onGetRecoveryData " + hc2.b0.f(baseFinderFeed, true) + " progress:" + i0Var.f306757b);
            r45.rs2 rs2Var = new r45.rs2();
            rs2Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            rs2Var.set(1, java.lang.Long.valueOf(i0Var.f306757b * ((long) 1000)));
            x60Var.f389815f = hc2.b.a(rs2Var);
        }
        return x60Var;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderRecoverPageHelper", "resetRecoverData");
        this.f306763b = null;
        ((q04.y) ((xs.k1) i95.n0.c(xs.k1.class))).Di(this.f306762a, 2, new r45.x60());
    }
}
