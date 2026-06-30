package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class l0 implements mf0.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175032a;

    public l0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175032a = jVar;
    }

    public boolean a(int i17) {
        for (wm4.y yVar : this.f175032a.f174999q) {
            if (yVar != null && i17 == yVar.f447318b && yVar.f447322f > 0) {
                return true;
            }
        }
        return false;
    }

    public void b(r45.qn6 qn6Var, int i17) {
        java.lang.String str = qn6Var.f384113d;
        long j17 = qn6Var.f384121o;
        int i18 = qn6Var.f384118i;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175032a;
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = jVar.f174993m;
        if (lVar != null) {
            lVar.s(str, j17, i18);
        }
        java.util.Iterator it = ((java.util.ArrayList) jVar.f174999q).iterator();
        while (it.hasNext()) {
            wm4.y yVar = (wm4.y) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onNewRedDotReceived item.category:%s category:%s", java.lang.Integer.valueOf(yVar.f447318b), java.lang.Integer.valueOf(i17));
            if (jVar.f174986d.isPaused() && wm4.u.q()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "proxyActivity is paused in MultiTask, does not clear finderMoreEntry timestamp");
                return;
            }
            if (pm4.w.l(yVar.f447318b) && pm4.w.l(i17)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.d0(this, yVar, str));
                if (!jVar.f175006x && yVar.f447323g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346434b, 107, 1, 0, 0L, "");
                }
            }
            if (pm4.w.m(yVar.f447318b) && pm4.w.m(i17)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.e0(this, yVar, str));
                if (!jVar.f175006x && yVar.f447323g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346433a, 107, 1, 0, 0L, "");
                }
            }
            if (pm4.w.n(yVar.f447318b) && pm4.w.n(i17)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.f0(this, yVar, str));
                if (!jVar.f175006x && yVar.f447323g <= 0) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346435c, 107, 1, 0, 0L, "");
                }
            }
        }
    }

    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.topstory.ui.webview.l lVar;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175032a;
        if (z17 && (lVar = jVar.f174993m) != null) {
            lVar.r(str, str2, i18, i19, i17, str3);
        }
        for (wm4.y yVar : jVar.f174999q) {
            if (pm4.w.l(yVar.f447318b)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.g0(this, yVar, i17, str2));
                if (i17 <= 0 || jVar.f175006x) {
                    return;
                }
                su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r(), 107, 2, yVar.f447323g, 0L, "");
                return;
            }
        }
    }

    public void d(long j17) {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175032a;
        for (wm4.y yVar : jVar.f174999q) {
            if (pm4.w.m(yVar.f447318b)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.i0(this, yVar));
                return;
            }
        }
    }

    public void e(long j17) {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175032a;
        for (wm4.y yVar : jVar.f174999q) {
            if (pm4.w.n(yVar.f447318b)) {
                jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.j0(this, yVar));
                return;
            }
        }
    }
}
