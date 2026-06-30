package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class h2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199137d;

    public h2(com.tencent.mm.ui.chatting.component.q2 q2Var) {
        this.f199137d = q2Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199137d;
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) q2Var.f198580d.f460708c.a(sb5.f.class))).f198754s) {
            q2Var.f199743o = s01.r.p(((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) q2Var.f198580d.f460708c.a(sb5.f.class))).f198744f);
        } else {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String x17 = q2Var.f198580d.x();
            ((py.a) iVar).getClass();
            q2Var.f199743o = c01.v1.x(x17, false);
        }
        if (q2Var.f199736e) {
            c01.v1.a(q2Var.f198580d.x(), q2Var.f199737f);
        } else {
            ((java.util.HashMap) q2Var.f199737f).clear();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        q2Var.f198580d.J();
    }
}
