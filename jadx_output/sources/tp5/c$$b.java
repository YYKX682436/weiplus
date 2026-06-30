package tp5;

/* loaded from: classes8.dex */
public final /* synthetic */ class c$$b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.util.Map.Entry entry : tp5.c.f421163p.entrySet()) {
            tp5.c cVar = (tp5.c) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (cVar == null) {
                tp5.c.f421163p.remove(entry.getKey());
            } else if (cVar.f421166d >= 2) {
                tp5.c.f421163p.remove(entry.getKey());
            } else {
                long j17 = currentTimeMillis - cVar.f421171i;
                if (j17 > 30000) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WCDBLazyResult", "ALIVE_TOO_LONG lazyId=" + cVar.f421170h + " ageMs=" + j17 + " status=" + cVar.f421166d + " threadCreate=" + cVar.f421172m, cVar.f421173o);
                }
            }
        }
    }
}
