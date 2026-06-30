package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.h1.class)
/* loaded from: classes8.dex */
public final class qh extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public yb5.d f199785e;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        android.app.Activity g17;
        yb5.d dVar = this.f199785e;
        if (dVar == null || (g17 = dVar.g()) == null) {
            return;
        }
        if (!((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(g17)) {
            com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent = new com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent();
            notifyMulitTaskIconShowEvent.f54548g.f8018a = true;
            notifyMulitTaskIconShowEvent.e();
            return;
        }
        r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(g17, 5, r45.kr4.class);
        if (kr4Var != null) {
            kr4Var.set(9, java.lang.Boolean.TRUE);
            r45.ir4 ir4Var = (r45.ir4) kr4Var.getCustom(7);
            if (ir4Var != null) {
                ir4Var.set(6, 1L);
                if (c01.id.c() >= kr4Var.getLong(1)) {
                    ir4Var.set(5, java.lang.Long.valueOf(ir4Var.getLong(5) + (c01.id.c() - kr4Var.getLong(1))));
                    kr4Var.set(1, java.lang.Long.valueOf(c01.id.c()));
                }
            }
            r45.hr4 hr4Var = (r45.hr4) kr4Var.getCustom(10);
            if (hr4Var != null && c01.id.c() >= hr4Var.getLong(0)) {
                hr4Var.set(3, java.lang.Long.valueOf(hr4Var.getLong(3) + (c01.id.c() - hr4Var.getLong(0))));
                hr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
            r45.hr4 hr4Var2 = (r45.hr4) kr4Var.getCustom(12);
            if (hr4Var2 != null && c01.id.c() >= hr4Var2.getLong(0)) {
                hr4Var2.set(3, java.lang.Long.valueOf(hr4Var2.getLong(3) + (c01.id.c() - hr4Var2.getLong(0))));
                hr4Var2.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
            r45.hr4 hr4Var3 = (r45.hr4) kr4Var.getCustom(11);
            if (hr4Var3 == null || c01.id.c() < hr4Var3.getLong(0)) {
                return;
            }
            hr4Var3.set(3, java.lang.Long.valueOf(hr4Var3.getLong(3) + (c01.id.c() - hr4Var3.getLong(0))));
            hr4Var3.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        android.app.Activity g17;
        yb5.d dVar = this.f199785e;
        if (dVar == null || (g17 = dVar.g()) == null) {
            return;
        }
        if (!((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(g17)) {
            com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent = new com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent();
            notifyMulitTaskIconShowEvent.f54548g.f8018a = true;
            notifyMulitTaskIconShowEvent.e();
            return;
        }
        r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(g17, 5, r45.kr4.class);
        if (kr4Var != null) {
            kr4Var.set(9, java.lang.Boolean.FALSE);
            kr4Var.set(1, java.lang.Long.valueOf(c01.id.c()));
            r45.hr4 hr4Var = (r45.hr4) kr4Var.getCustom(11);
            if (hr4Var != null) {
                hr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
            r45.hr4 hr4Var2 = (r45.hr4) kr4Var.getCustom(10);
            if (hr4Var2 != null) {
                hr4Var2.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
            r45.hr4 hr4Var3 = (r45.hr4) kr4Var.getCustom(12);
            if (hr4Var3 == null) {
                return;
            }
            hr4Var3.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f199785e = dVar;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        android.app.Activity g17;
        zk3.c Ai;
        yb5.d dVar = this.f199785e;
        if (dVar == null || (g17 = dVar.g()) == null || (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(g17)) == null) {
            return;
        }
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).T6(false);
    }
}
