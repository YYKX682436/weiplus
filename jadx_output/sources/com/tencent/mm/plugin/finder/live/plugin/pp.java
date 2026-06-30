package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pp implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f113926d;

    public pp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        this.f113926d = dqVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.t5 t5Var = (mm2.t5) obj;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "receive restrictEvent: " + t5Var + " quotaSendGiftData: " + this.f113926d.Z);
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f113926d;
        mm2.s5 s5Var = dqVar.Z;
        if (s5Var == null) {
            return;
        }
        if (t5Var instanceof mm2.r5) {
            dqVar.F1();
            return;
        }
        if (t5Var instanceof mm2.u5 ? true : t5Var instanceof mm2.q5) {
            com.tencent.mm.plugin.finder.live.util.t tVar = dqVar.N;
            if (tVar != null) {
                tVar.f115691m = true;
            }
            java.lang.String str = s5Var.f329417c.f233467b;
            dqVar.f112330w = str;
            java.util.Map map = dqVar.K;
            if (str == null) {
                str = "";
            }
            ((java.util.HashMap) map).put(str, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.finder.live.plugin.hp hpVar = com.tencent.mm.plugin.finder.live.plugin.dq.f112318x1;
            java.lang.String str2 = s5Var.f329415a;
            int i17 = s5Var.f329416b;
            java.lang.String str3 = s5Var.f329417c.f233467b;
            int i18 = s5Var.f329418d;
            boolean z17 = s5Var.f329419e;
            hpVar.a(str2, i17, str3, i18, z17, dqVar.y1(dqVar.R, s5Var.f329415a, z17), null);
            if (dk2.u7.f234181a.e(s5Var.f329415a) != null) {
                ((mm2.v5) dqVar.P0(mm2.v5.class)).O6((((int) r14.P0()) * (s5Var.f329419e ? s5Var.f329418d : 1)) / 10.0f);
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G0).getValue()).r()).intValue() != 1) {
                com.tencent.mm.plugin.finder.live.plugin.dq.D1(dqVar, s5Var.f329415a, s5Var.f329416b, s5Var.f329417c, s5Var.f329419e, false, 16, null);
                return;
            }
            boolean z18 = s5Var.f329419e;
            if (z18) {
                com.tencent.mm.plugin.finder.live.plugin.dq.D1(dqVar, s5Var.f329415a, s5Var.f329416b, s5Var.f329417c, z18, false, 16, null);
            } else {
                com.tencent.mm.plugin.finder.live.plugin.dq.D1(dqVar, s5Var.f329415a, 1, s5Var.f329417c, z18, false, 16, null);
            }
        }
    }
}
