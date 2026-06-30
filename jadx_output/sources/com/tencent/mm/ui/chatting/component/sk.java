package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.f2.class)
/* loaded from: classes11.dex */
public class sk extends com.tencent.mm.ui.chatting.component.a implements sb5.f2, c01.w8, com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.i9 f199943e;

    /* renamed from: f, reason: collision with root package name */
    public int f199944f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199945g = false;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        c01.d9.e().a(522, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        c01.d9.e().q(522, this);
        n0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        c01.d9.e().q(522, this);
        n0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f199943e = new com.tencent.mm.ui.chatting.i9(this.f198580d);
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 != 207) {
            return;
        }
        p0(intent.getStringExtra("art_smiley_slelct_data"), 4, null);
    }

    public void m0(java.lang.String str) {
        com.tencent.mm.ui.chatting.component.ta taVar = (com.tencent.mm.ui.chatting.component.ta) ((sb5.p0) this.f198580d.f460708c.a(sb5.p0.class));
        taVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.d1(str);
        f9Var.j1(1);
        com.tencent.mm.ui.chatting.component.fa faVar = new com.tencent.mm.ui.chatting.component.fa(taVar, false, kz5.b0.c(f9Var));
        taVar.f199984s = faVar;
        pm0.v.W(faVar);
    }

    public final void n0() {
        com.tencent.mm.ui.chatting.i9 i9Var = this.f199943e;
        java.util.List list = mo3.l.f330419d;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(i9Var);
        }
        ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330408e = null;
        w21.k.f442400u = null;
        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f291334n = null;
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSendMsgEnable(), this.f199944f);
        this.f199944f = 0;
    }

    public final void o0() {
        com.tencent.mm.ui.chatting.i9 i9Var = this.f199943e;
        java.util.List list = mo3.l.f330419d;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(i9Var)) {
                ((java.util.ArrayList) list).add(i9Var);
            }
        }
        oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
        com.tencent.mm.ui.chatting.i9 i9Var2 = this.f199943e;
        ((mo3.g) jVar).f330408e = i9Var2;
        w21.k.f442400u = i9Var2;
        dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
        com.tencent.mm.ui.chatting.i9 notify = this.f199943e;
        ig0.o oVar = (ig0.o) fVar;
        oVar.getClass();
        kotlin.jvm.internal.o.g(notify, "notify");
        oVar.f291334n = new java.lang.ref.WeakReference(notify);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        yb5.d dVar = this.f198580d;
        if (dVar != null) {
            dVar.b();
        }
        if (522 == m1Var.getType()) {
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcSendMsgEnable(), this.f199944f);
            this.f199944f = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p0(java.lang.String r30, int r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.sk.p0(java.lang.String, int, java.lang.String):boolean");
    }

    public boolean q0(java.lang.String str, java.lang.String str2) {
        final com.tencent.mm.ui.chatting.component.h3 h3Var = (com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class));
        boolean z17 = false;
        if (!h3Var.u()) {
            return p0(str, 0, str2);
        }
        final com.tencent.mm.ui.chatting.component.sk$$a sk__a = new com.tencent.mm.ui.chatting.component.sk$$a(this, str, str2);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy dyVar = com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a;
        if (dyVar.b()) {
            dyVar.c(h3Var.f198580d.g(), h3Var.f198580d.t(), 2, new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.h3$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.ui.chatting.component.h3 h3Var2 = com.tencent.mm.ui.chatting.component.h3.this;
                    h3Var2.getClass();
                    com.tencent.mm.ui.chatting.component.sk$$a sk__a2 = (com.tencent.mm.ui.chatting.component.sk$$a) sk__a;
                    if (!sk__a2.f199946a.p0(sk__a2.f199947b, 0, sk__a2.f199948c)) {
                        return null;
                    }
                    h3Var2.m0();
                    return null;
                }
            });
        } else {
            z17 = p0(str, 0, str2);
            if (z17) {
                h3Var.m0();
            }
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (!this.f199945g) {
            o0();
        }
        this.f199945g = false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.ui.chatting.i9 i9Var = this.f199943e;
        java.util.List list = mo3.l.f330419d;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(i9Var);
        }
        ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330408e = null;
        w21.k.f442400u = null;
        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f291334n = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        o0();
        this.f199945g = true;
    }
}
