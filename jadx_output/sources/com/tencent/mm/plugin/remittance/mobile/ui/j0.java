package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.m0 f156680d;

    public j0(com.tencent.mm.plugin.remittance.mobile.ui.m0 m0Var) {
        this.f156680d = m0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.remittance.mobile.ui.m0 m0Var = this.f156680d;
            if (i17 >= m0Var.f156692d.f156586r.f381582i.size()) {
                return;
            }
            g4Var.f(i17, ((r45.n34) m0Var.f156692d.f156586r.f381582i.get(i17)).f381048d);
            i17++;
        }
    }
}
