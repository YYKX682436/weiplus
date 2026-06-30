package dk2;

/* loaded from: classes12.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233963e;

    public qb(int i17, dk2.tb tbVar) {
        this.f233962d = i17;
        this.f233963e = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPolling ");
        int i17 = this.f233962d;
        sb6.append(i17);
        sb6.append(' ');
        dk2.tb tbVar = this.f233963e;
        sb6.append(tbVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        tbVar.f234123d.remove(i17);
        ((java.util.LinkedList) tbVar.f234125f).remove(java.lang.Integer.valueOf(i17));
        kz5.h0.A(tbVar.f234120a, new dk2.pb(i17));
        tbVar.f234121b.remove(java.lang.Integer.valueOf(i17));
        dk2.tb.b(tbVar);
    }
}
