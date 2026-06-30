package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes9.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f189620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0 f189621e;

    public l0(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0 m0Var, java.util.List list) {
        this.f189621e = m0Var;
        this.f189620d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (r45.es5 es5Var : this.f189620d) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0 m0Var = this.f189621e;
            java.lang.String I = m0Var.I();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(es5Var.f373713d);
            java.util.LinkedList linkedList = es5Var.f373714e;
            objArr[1] = com.tencent.mm.sdk.platformtools.t8.L0(linkedList) ? "null" : java.lang.String.valueOf(linkedList.size());
            com.tencent.mars.xlog.Log.i(I, "resType(%d) responses.size() = %s", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.vr5 vr5Var = (r45.vr5) it.next();
                    int i17 = es5Var.f373713d;
                    if (vr5Var != null) {
                        com.tencent.mars.xlog.Log.i(m0Var.I(), "handleOperation --START--, resType = %d, subType = %d, res.Oper = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f388468d), java.lang.Integer.valueOf(vr5Var.f388471g));
                        if (vr5Var.f388469e != null) {
                            com.tencent.mars.xlog.Log.i(m0Var.I(), "resource.Info.FileFlag %d ", java.lang.Integer.valueOf(vr5Var.f388469e.f371028g));
                        }
                        int i18 = vr5Var.f388471g;
                        if (i18 == 0) {
                            com.tencent.mars.xlog.Log.i(m0Var.I(), "just do nothing");
                        } else {
                            if ((i18 & 1) > 0) {
                                com.tencent.mars.xlog.Log.i(m0Var.I(), "do cache");
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().e(i17, vr5Var, false);
                            }
                            if ((vr5Var.f388471g & 2) > 0) {
                                com.tencent.mars.xlog.Log.i(m0Var.I(), "do decrypt");
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().f(i17, vr5Var, false, false);
                            }
                            if ((vr5Var.f388471g & 4) > 0) {
                                com.tencent.mars.xlog.Log.i(m0Var.I(), "do delete");
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().g(i17, vr5Var, false);
                            }
                            com.tencent.mars.xlog.Log.i(m0Var.I(), "handleOperation --END--, resType = %d, subType = %d, res.Oper = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f388468d), java.lang.Integer.valueOf(vr5Var.f388471g));
                        }
                    }
                }
            }
        }
    }
}
