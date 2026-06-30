package zi3;

/* loaded from: classes14.dex */
public final class b implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zi3.f f473164a;

    public b(zi3.f fVar) {
        this.f473164a = fVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        cv.v0 v0Var = (cv.v0) obj;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Init) {
            return;
        }
        zi3.f fVar = this.f473164a;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAudioManager", "audioRouteConsumer: " + v0Var);
        int i17 = v0Var.f222518c;
        int i18 = v0Var.f222516a;
        if (i17 == 1) {
            cv.v0 v0Var2 = fVar.f473177r;
            boolean z17 = v0Var2 != null && v0Var2.f222516a == i18;
            fVar.f473177r = v0Var;
            if (i18 == 1) {
                zi3.f.C(fVar, v0Var, z17);
                fVar.f473176q = 1;
                return;
            } else if (i18 == 2) {
                zi3.f.C(fVar, v0Var, z17);
                fVar.f473176q = 2;
                return;
            } else if (i18 == 3) {
                zi3.f.C(fVar, v0Var, z17);
                return;
            } else {
                if (i18 != 4) {
                    return;
                }
                zi3.f.C(fVar, v0Var, false);
                return;
            }
        }
        xm1.o oVar = fVar.f473174o;
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            if (i18 == 3) {
                zi3.f.P(fVar, 3, false, 2, null);
            } else if (i18 == 4) {
                zi3.f.P(fVar, 4, false, 2, null);
            }
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = fVar.f473178s;
            if (multiTalkMainUI != null) {
                multiTalkMainUI.q2(oVar.a());
                return;
            }
            return;
        }
        if (i18 == 3) {
            oVar.getClass();
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f222516a == 3) {
                if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                    zi3.f.P(fVar, 4, false, 2, null);
                } else {
                    int i19 = fVar.f473176q;
                    if (i19 != -1) {
                        zi3.f.P(fVar, i19, false, 2, null);
                    } else {
                        zi3.f.P(fVar, 1, false, 2, null);
                    }
                }
            }
        } else if (i18 == 4) {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                zi3.f.P(fVar, 3, false, 2, null);
            } else {
                int i27 = fVar.f473176q;
                if (i27 != -1) {
                    zi3.f.P(fVar, i27, false, 2, null);
                } else {
                    zi3.f.P(fVar, 1, false, 2, null);
                }
            }
        }
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI2 = fVar.f473178s;
        if (multiTalkMainUI2 != null) {
            multiTalkMainUI2.q2(oVar.a());
        }
    }
}
