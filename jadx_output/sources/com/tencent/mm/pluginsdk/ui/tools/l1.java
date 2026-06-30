package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.n1 f191756d;

    public l1(com.tencent.mm.pluginsdk.ui.tools.n1 n1Var) {
        this.f191756d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.tools.n1 n1Var = this.f191756d;
        boolean z17 = n1Var.f191887h;
        if (z17) {
            n1Var.d();
        } else {
            n1Var.f191887h = true;
            if (n1Var.f191781p != null) {
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(n1Var.f191781p);
            }
            p13.u uVar = new p13.u();
            uVar.f351141c = "query_app_msg_file";
            uVar.f351142d = null;
            uVar.f351146h = new int[]{42};
            uVar.f351151m = n1Var;
            uVar.f351152n = n1Var.f191780o;
            uVar.f351140b = 256;
            n1Var.f191781p = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "do search %s", "query_app_msg_file");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "[isInit:" + z17 + "] chatting load data end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + n1Var.f191888i);
    }
}
