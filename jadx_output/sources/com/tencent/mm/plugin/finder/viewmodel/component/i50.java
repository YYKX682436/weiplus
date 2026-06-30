package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class i50 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.m50 f134700g;

    public i50(com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var) {
        this.f134700g = m50Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
        int i18 = com.tencent.mm.view.TouchableLayout.f213511d;
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = this.f134700g;
        if (i18 != m50Var.f135126f || com.tencent.mm.view.TouchableLayout.f213512e != m50Var.f135127g) {
            m50Var.Q6("TOUCH");
            m50Var.f135126f = com.tencent.mm.view.TouchableLayout.f213511d;
            m50Var.f135127g = com.tencent.mm.view.TouchableLayout.f213512e;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var2 = this.f134700g;
        if (m50Var2.f135129i > 0 && (ev6 instanceof ec2.f)) {
            ec2.f fVar = (ec2.f) ev6;
            boolean z17 = false;
            int i19 = fVar.f250959d;
            if (i19 == 1) {
                m50Var2.f135134q = false;
                long j17 = fVar.f250965j;
                m50Var2.f135133p = j17;
                if (m50Var2.f135135r) {
                    m50Var2.P6(m50Var2.f135132o == j17 ? 1 : 0, false, j17, m50Var2.f135130m, m50Var2.f135131n, false);
                }
                m50Var.f135135r = false;
                m50Var.f135132o = -1L;
                m50Var.Q6("VIDEO_REAL_PLAY");
            } else if (i19 == 2) {
                m50Var2.f135124d++;
            } else if (i19 == 3) {
                m50Var2.f135130m = fVar.f250963h;
                m50Var2.f135131n = fVar.f250964i;
            }
            int i27 = m50Var.f135124d;
            int i28 = m50Var.f135129i;
            if (1 <= i28 && i28 < i27) {
                z17 = true;
            }
            if (z17 && m50Var.f135128h > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var3 = this.f134700g;
                if (currentTimeMillis - m50Var3.f135125e >= m50Var3.f135128h) {
                    m50Var3.f135134q = true;
                    int i29 = m50Var3.f135130m + 1;
                    m50Var3.f135130m = i29;
                    com.tencent.mm.plugin.finder.viewmodel.component.m50.O6(m50Var3, fVar.f250965j, i29, m50Var3.f135131n, false);
                    m50Var.f135132o = fVar.f250965j;
                    m50Var.Q6("pausePlay");
                }
            }
            if (i19 == 17) {
                m50Var.f135135r = true;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var4 = this.f134700g;
            if (m50Var4.f135134q || i19 != 17) {
                return;
            }
            m50Var4.P6(0, false, m50Var4.f135133p, m50Var4.f135130m, m50Var4.f135131n, true);
        }
    }
}
