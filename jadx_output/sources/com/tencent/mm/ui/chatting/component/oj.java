package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class oj implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pj f199647b;

    public oj(com.tencent.mm.ui.chatting.component.pj pjVar, com.tencent.mm.storage.f9 f9Var) {
        this.f199647b = pjVar;
        this.f199646a = f9Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.ui.chatting.component.pj pjVar = this.f199647b;
        boolean z17 = false;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null) {
                pjVar.f198580d.b();
                return null;
            }
            r45.vx vxVar = (r45.vx) fVar2;
            if (vxVar.f388630d != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceRevokeComponent", "show alert dialog: %s", vxVar.f388631e);
                android.app.Activity g17 = pjVar.f198580d.g();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211729s = ((r45.vx) fVar.f70618d).f388631e;
                aVar.f211732v = of5.b.a(g17).getString(com.tencent.mm.R.string.f490455vj);
                r45.v56 v56Var = ((r45.vx) fVar.f70618d).f388633g;
                if (v56Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(v56Var.f387920d) && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.vx) fVar.f70618d).f388633g.f387921e)) {
                    r45.v56 v56Var2 = ((r45.vx) fVar.f70618d).f388633g;
                    aVar.f211732v = v56Var2.f387921e;
                    aVar.f211733w = v56Var2.f387920d;
                    aVar.E = new com.tencent.mm.ui.chatting.component.nj(this, fVar);
                    aVar.Z = true;
                }
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(g17, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "revoke_ticket: %s", vxVar.f388632f);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(((r45.vx) fVar.f70618d).f388632f);
                com.tencent.mm.storage.f9 f9Var = this.f199646a;
                if (K0) {
                    pjVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "do revoke local remittance msg");
                    f9Var.j1(0);
                    f9Var.setType(268445456);
                    f9Var.d1(pjVar.f198580d.s().getString(com.tencent.mm.R.string.b5s));
                    f9Var.x3(pjVar.f198580d.s().getString(com.tencent.mm.R.string.b5s));
                    f9Var.y3();
                    tg3.p1.f419206a.d(f9Var);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                    com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent = new com.tencent.mm.autogen.events.RevokeNativeMsgEvent();
                    long msgId = f9Var.getMsgId();
                    am.ds dsVar = revokeNativeMsgEvent.f54714g;
                    dsVar.f6496a = msgId;
                    dsVar.f6498c = f9Var.Q0();
                    revokeNativeMsgEvent.e();
                    ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Zi(f9Var.Q0(), f9Var.getMsgId(), f9Var.I0());
                    java.lang.Object l17 = c01.d9.b().p().l(290818, 0);
                    c01.d9.b().p().w(290818, java.lang.Integer.valueOf((l17 != null ? com.tencent.mm.sdk.platformtools.t8.P(l17.toString(), 0) : 0) + 1));
                    if (f9Var.k2()) {
                        v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                        ot0.u.a(f9Var);
                        ((u90.a) vVar).getClass();
                        com.tencent.mm.modelstat.e.f71505a.getClass();
                    } else {
                        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                        com.tencent.mm.modelstat.e.f71505a.getClass();
                    }
                } else {
                    ((com.tencent.mm.ui.chatting.component.ck) ((sb5.s1) pjVar.f198580d.f460708c.a(sb5.s1.class))).m0(f9Var, ((r45.vx) fVar.f70618d).f388632f, false, false);
                    z17 = true;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceRevokeComponent", "net error, do skip");
        }
        if (z17) {
            return null;
        }
        pjVar.f198580d.b();
        return null;
    }
}
