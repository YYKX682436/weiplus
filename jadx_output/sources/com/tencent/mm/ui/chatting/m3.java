package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class m3 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f201942d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f201943e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f201944f;

    public m3(java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.String str2) {
        this.f201942d = str;
        this.f201943e = f9Var;
        this.f201944f = str2;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        com.tencent.mm.storage.f9 f9Var;
        java.lang.String str = r1Var.f445529a;
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        com.tencent.mm.ui.chatting.n3.d(this.f201944f, h17);
        if (h17 == null || h17.f415011i != 199 || (f9Var = this.f201943e) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.n3.b(h17, f9Var.z0(), this.f201942d, h17.f415022t, h17.f415015m, h17.g(), f9Var.getType(), tg3.l1.a(f9Var));
    }
}
