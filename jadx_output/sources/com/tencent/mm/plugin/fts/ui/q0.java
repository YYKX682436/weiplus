package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f138144a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f138145b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f138146c = false;

    public q0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI, com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.AnonymousClass1 anonymousClass1) {
    }

    public void a(com.tencent.mm.plugin.fts.ui.v2 v2Var, u13.g gVar) {
        if (v2Var != null) {
            boolean z17 = gVar instanceof e23.b1;
            if (z17) {
                v2Var.f138201a = 256;
            }
            ((java.util.ArrayList) this.f138144a).add(v2Var);
            if (z17) {
                d(v2Var, true);
            } else if (v2Var.f138201a == 16384) {
                d(v2Var, false);
            } else {
                c(v2Var);
            }
        }
    }

    public java.lang.Boolean b() {
        java.util.List list = this.f138144a;
        if (list == null || ((java.util.ArrayList) list).isEmpty()) {
            return null;
        }
        int i17 = ((com.tencent.mm.plugin.fts.ui.v2) ((java.util.ArrayList) list).get(0)).f138201a;
        return java.lang.Boolean.valueOf(i17 == 256 || i17 == 16384);
    }

    public void c(com.tencent.mm.plugin.fts.ui.v2 v2Var) {
        java.lang.Boolean b17 = b();
        java.util.Iterator it = ((java.util.ArrayList) this.f138145b).iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.plugin.fts.ui.s0) it.next()).a(v2Var, true, this.f138146c, b17, false, ((java.util.ArrayList) this.f138144a).isEmpty());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSMainUI", "notifyAdapterAdded error", e17);
            }
        }
    }

    public void d(com.tencent.mm.plugin.fts.ui.v2 v2Var, boolean z17) {
        java.lang.Boolean b17 = b();
        java.util.Iterator it = ((java.util.ArrayList) this.f138145b).iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.plugin.fts.ui.s0) it.next()).a(v2Var, z17, this.f138146c, b17, true, ((java.util.ArrayList) this.f138144a).isEmpty());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSMainUI", "notifyRelevantSearchAdded error", e17);
            }
        }
    }
}
