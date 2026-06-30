package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class c5 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f198871d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f198872e;

    public c5(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f198872e = b5Var;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f198872e;
        sb5.u1 u1Var = (sb5.u1) b5Var.f198580d.f460708c.a(sb5.u1.class);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) u1Var;
            if (jkVar.f199301o) {
                com.tencent.mm.ui.chatting.n7 n7Var = jkVar.f199305s;
                if (n7Var != null) {
                    n7Var.f202013q = "";
                    if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
                        n7Var.c();
                        n7Var.q();
                    }
                }
                jkVar.n0(-1);
            } else if (!b5Var.f198696g) {
                jkVar.p0();
                b5Var.f198694e.setVisibility(8);
            } else if (this.f198871d != null) {
                jkVar.p0();
                b5Var.f198694e.setVisibility(0);
                b5Var.f198694e.c(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class))).L0());
            }
        } else {
            b5Var.f198694e.setVisibility(8);
            com.tencent.mm.ui.chatting.component.jk jkVar2 = (com.tencent.mm.ui.chatting.component.jk) u1Var;
            jkVar2.o0();
            com.tencent.mm.ui.chatting.n7 n7Var2 = jkVar2.f199305s;
            if (n7Var2 != null) {
                n7Var2.f202013q = str;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    n7Var2.c();
                    n7Var2.q();
                }
            }
        }
        this.f198871d = str;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 21L, 1L, true);
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f198872e;
        if (((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class))).T) {
            ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) b5Var.f198580d.f460708c.a(sb5.u1.class))).o0();
            b5Var.f198694e.setVisibility(8);
        }
        b5Var.f198580d.f460710e.W();
        tb5.i0.f417055a.c(b5Var.p0(), ya.a.SEARCH, b5Var.f198580d.x(), b5Var.f198703q);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f198872e;
        sb5.z zVar = (sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class);
        if (((com.tencent.mm.ui.chatting.adapter.k) zVar).T) {
            ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) b5Var.f198580d.f460708c.a(sb5.u1.class))).p0();
            b5Var.f198694e.setVisibility(0);
            b5Var.f198694e.c(((com.tencent.mm.ui.chatting.adapter.k) zVar).L0());
        }
        b5Var.f198580d.e().N0();
        b5Var.f198580d.f460710e.g0();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
