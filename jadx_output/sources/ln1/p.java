package ln1;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.r f319784d;

    public p(ln1.r rVar) {
        this.f319784d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln1.y yVar;
        ln1.z zVar;
        this.f319784d.f319793h = true;
        while (true) {
            long j17 = this.f319784d.f319788c.get();
            ln1.r rVar = this.f319784d;
            if (rVar.f319792g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupFlowQueue", "backup flow close index:%d, outIndex:%d", java.lang.Long.valueOf(rVar.f319787b.get()), java.lang.Long.valueOf(j17));
                this.f319784d.f319793h = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupFlowQueue", "outTask end");
                return;
            }
            synchronized (rVar.f319788c) {
                yVar = (ln1.y) rVar.f319786a.get(java.lang.Long.valueOf(rVar.f319788c.get()));
                if (yVar != null) {
                    rVar.f319786a.remove(java.lang.Long.valueOf(rVar.f319788c.get()));
                    rVar.f319788c.addAndGet(1L);
                } else {
                    yVar = null;
                }
            }
            if (yVar != null) {
                this.f319784d.f319795j.addAndGet(-yVar.f319875c);
                this.f319784d.f319791f.c();
                this.f319784d.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupFlowQueue", "outTask flowData hashCode:%d, outIndex:%d, sendSeqCount:%d, cacheSize:%d", java.lang.Integer.valueOf(yVar.hashCode()), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(sn1.i.f410013g.size()), java.lang.Long.valueOf(this.f319784d.f319795j.get()));
                java.lang.Object obj = yVar.f319874b;
                if (obj != null && (zVar = yVar.f319873a) != null) {
                    zVar.a(obj);
                }
            } else {
                this.f319784d.f319790e.b();
                this.f319784d.f319790e.a(200L);
            }
        }
    }
}
