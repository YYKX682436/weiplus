package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f189036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.s5 f189038f;

    public p5(com.tencent.mm.pluginsdk.model.app.s5 s5Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f189038f = s5Var;
        this.f189036d = m1Var;
        this.f189037e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        com.tencent.mm.pluginsdk.model.app.s5.f189068s++;
        com.tencent.mm.modelbase.m1 m1Var = this.f189036d;
        int type = m1Var.getType();
        com.tencent.mm.pluginsdk.model.app.s5 s5Var = this.f189038f;
        if (type == 222) {
            j18 = -1;
        } else if (m1Var instanceof bt3.l0) {
            s5Var.f189074i = false;
            j18 = ((bt3.l0) m1Var).f24316h;
        } else {
            if (!(m1Var instanceof com.tencent.mm.pluginsdk.model.app.w4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SceneAppMsg", "onSceneEnd Error SceneType:" + m1Var.getType());
                com.tencent.mm.pluginsdk.model.app.s5.f189068s = com.tencent.mm.pluginsdk.model.app.s5.f189068s + (-1);
                return;
            }
            s5Var.f189075m = false;
            com.tencent.mm.pluginsdk.model.app.w4 w4Var = (com.tencent.mm.pluginsdk.model.app.w4) m1Var;
            com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
            java.lang.String str = dVar == null ? null : dVar.field_mediaSvrId;
            java.lang.String str2 = (java.lang.String) s5Var.f189069d.remove(java.lang.Long.valueOf(dVar == null ? 0L : dVar.field_msgInfoId));
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(w4Var.f189126t);
            long j19 = w4Var.f189118i;
            if (!z17 && !w4Var.f189127u && !w4Var.f189128v && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.pluginsdk.model.app.d dVar2 = new com.tencent.mm.pluginsdk.model.app.d();
                com.tencent.mm.pluginsdk.model.app.u5.wi().get(j19, dVar2);
                if (dVar2.systemRowid == j19) {
                    com.tencent.mm.pluginsdk.model.app.k0.y(dVar2.field_msgInfoId, dVar2.field_msgInfoTalker, str, null, true);
                    j17 = j19;
                    c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.c4(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId, str2, null));
                    j18 = j17;
                }
            }
            j17 = j19;
            j18 = j17;
        }
        if (j18 != -1) {
            if (((java.util.HashMap) s5Var.f189073h).get(java.lang.Long.valueOf(j18)) != null) {
                java.util.Map map = s5Var.f189073h;
                ((fp.j) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j18))).a();
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j18));
            }
        }
        m1Var.getType();
        if (this.f189037e != 0) {
            s5Var.f189077o--;
        }
        int i17 = s5Var.f189077o;
        boolean z18 = s5Var.f189074i;
        boolean z19 = s5Var.f189075m;
        if (i17 > 0) {
            com.tencent.mm.pluginsdk.model.app.s5.a(s5Var);
        } else if (!z19 && !z18) {
            s5Var.c();
        }
        com.tencent.mm.pluginsdk.model.app.s5.f189068s--;
    }

    public java.lang.String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
