package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class k4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.n4 f173052d;

    public k4(com.tencent.mm.plugin.teenmode.ui.n4 n4Var) {
        this.f173052d = n4Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
        com.tencent.mm.plugin.teenmode.ui.n4 n4Var = this.f173052d;
        if (str == null) {
            g4Var.f(2, n4Var.f173081d.getString(com.tencent.mm.R.string.jt_));
            return;
        }
        g4Var.f(0, n4Var.f173081d.getString(com.tencent.mm.R.string.jtg));
        if (c01.e2.a0()) {
            return;
        }
        g4Var.f(1, n4Var.f173081d.getString(com.tencent.mm.R.string.f493342jt3));
    }
}
