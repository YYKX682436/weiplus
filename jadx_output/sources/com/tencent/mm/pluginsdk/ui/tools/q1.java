package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r1 f191849d;

    public q1(com.tencent.mm.pluginsdk.ui.tools.r1 r1Var) {
        this.f191849d = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.tools.r1 r1Var = this.f191849d;
        boolean z17 = r1Var.f191887h;
        if (z17) {
            com.tencent.mm.pluginsdk.ui.tools.r1.d(r1Var);
        } else {
            r1Var.f191887h = true;
            while (true) {
                if (r1Var.f191885f.size() >= 10) {
                    break;
                }
                if (com.tencent.mm.pluginsdk.ui.tools.r1.d(r1Var) <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "has no data to load，chatting init sync end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    break;
                }
            }
        }
        pm0.v.X(new com.tencent.mm.pluginsdk.ui.tools.p1(r1Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "[isInit:" + z17 + "] fav load data end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + r1Var.f191888i);
    }
}
