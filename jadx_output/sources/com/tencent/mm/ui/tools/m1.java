package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class m1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f210562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210563e;

    public m1(qk.o oVar, java.lang.String str) {
        this.f210562d = oVar;
        this.f210563e = str;
    }

    @Override // c01.da
    public boolean a() {
        return com.tencent.mm.ui.tools.n1.f210589a;
    }

    @Override // c01.da
    public void c() {
        boolean T0 = this.f210562d.T0();
        java.lang.String str = this.f210563e;
        if (T0) {
            com.tencent.mm.storage.w Ai = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai();
            Ai.getClass();
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4(str);
            l4Var.T1("officialaccounts");
            Ai.a(l4Var, Di);
            com.tencent.mm.autogen.events.BizDeleteContactEvent bizDeleteContactEvent = new com.tencent.mm.autogen.events.BizDeleteContactEvent();
            bizDeleteContactEvent.f54001g.getClass();
            bizDeleteContactEvent.e();
        }
        r01.q3.cj().d(str);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(str);
    }
}
