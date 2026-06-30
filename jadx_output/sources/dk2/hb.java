package dk2;

/* loaded from: classes12.dex */
public final class hb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f233576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233577e;

    public hb(java.util.List list, dk2.tb tbVar) {
        this.f233576d = list;
        this.f233577e = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f233576d;
        if (list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCmdIds ");
        dk2.tb tbVar = this.f233577e;
        sb6.append(tbVar.d(list));
        sb6.append(' ');
        sb6.append(tbVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!((java.util.LinkedList) tbVar.f234124e).contains(java.lang.Integer.valueOf(intValue))) {
                ((java.util.LinkedList) tbVar.f234124e).add(java.lang.Integer.valueOf(intValue));
            }
            tbVar.g(intValue, false, true);
        }
        dk2.tb.b(tbVar);
    }
}
