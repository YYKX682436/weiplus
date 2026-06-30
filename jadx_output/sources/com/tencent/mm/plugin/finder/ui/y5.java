package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class y5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f130042d;

    public y5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        this.f130042d = finderFansListUI;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.String string;
        r45.lt2 req = (r45.lt2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) != 0 || (string = req.getString(0)) == null) {
            return;
        }
        int i17 = com.tencent.mm.plugin.finder.ui.FinderFansListUI.D;
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f130042d;
        finderFansListUI.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.a6(finderFansListUI, string));
    }
}
