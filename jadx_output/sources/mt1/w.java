package mt1;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f331272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331273g;

    public w(java.util.List list, java.util.List list2, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.List list3) {
        this.f331270d = list;
        this.f331271e = list2;
        this.f331272f = cancellationSignal;
        this.f331273g = list3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f331270d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!((java.lang.Boolean) this.f331271e.get(i17)).booleanValue()) {
                com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f331272f;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.throwIfCanceled();
                    } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "Cannot update hash for " + ((java.lang.String) list.get(i17)) + ", e = " + e17);
                    }
                }
                java.lang.String u07 = ot1.h.u0((java.lang.String) list.get(i17));
                if (u07 != null) {
                    byte[] a17 = c01.td.a(u07);
                    mt1.b0.f331191a.n().f348849d.j("WxFileIndex3", "UPDATE WxFileIndex3 SET hash = ? WHERE rowid = ?", new java.lang.Object[]{a17, java.lang.Long.valueOf(((java.lang.Number) this.f331273g.get(i17)).longValue())}, cancellationSignal);
                }
            }
        }
    }
}
