package q01;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.x f359341d;

    public w(q01.x xVar) {
        this.f359341d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneInspect duplicating callback: ");
        q01.x xVar = this.f359341d;
        sb6.append(xVar.e());
        sb6.append(" - dump: ");
        jz5.g gVar = xVar.f359351n;
        sb6.append(((java.util.List) ((jz5.n) gVar).getValue()).size());
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", sb6.toString());
        int i17 = 0;
        for (java.lang.Object obj : (java.util.List) ((jz5.n) gVar).getValue()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "\tcaller " + i17 + ':');
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.z3.c((java.lang.Throwable) obj);
            if (c17 != null) {
                java.util.Iterator it = r26.n0.f0(c17, new java.lang.String[]{"\n"}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "\t\t- " + ((java.lang.String) it.next()));
                }
            }
            i17 = i18;
        }
    }
}
