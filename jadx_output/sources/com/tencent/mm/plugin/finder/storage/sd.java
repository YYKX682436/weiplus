package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sd extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f127542u;

    public sd() {
        super(0, "关注tab瀑布流形态", null, null, 12, null);
        this.f127542u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return 0;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        java.lang.Integer valueOf = ls2Var != null ? java.lang.Integer.valueOf(ls2Var.getInteger(2)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            return 1;
        }
        boolean tj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).tj();
        if (this.f127542u == -1 || !tj6) {
            this.f127542u = ((java.lang.Number) super.r()).intValue();
        }
        return java.lang.Integer.valueOf(this.f127542u);
    }
}
