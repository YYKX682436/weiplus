package dk2;

/* loaded from: classes12.dex */
public final class sb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f234075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234076f;

    public sb(int i17, dk2.tb tbVar, int i18) {
        this.f234074d = i17;
        this.f234075e = tbVar;
        this.f234076f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update Req Interval for ");
        int i17 = this.f234074d;
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        dk2.tb tbVar = this.f234075e;
        java.util.Iterator it = tbVar.f234120a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((dk2.bb) obj2).f233248d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar = (dk2.bb) obj2;
        int i18 = this.f234076f;
        if (bbVar != null) {
            bbVar.f233251g = i18;
        }
        java.util.Iterator it6 = tbVar.f234120a.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((dk2.bb) next).f233248d == i17) {
                obj = next;
                break;
            }
        }
        dk2.bb bbVar2 = (dk2.bb) obj;
        if (bbVar2 != null) {
            bbVar2.f233252h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        dk2.bb bbVar3 = (dk2.bb) tbVar.f234121b.get(java.lang.Integer.valueOf(i17));
        if (bbVar3 != null) {
            bbVar3.f233251g = i18;
        }
        dk2.bb bbVar4 = (dk2.bb) tbVar.f234121b.get(java.lang.Integer.valueOf(i17));
        if (bbVar4 != null) {
            bbVar4.f233252h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        dk2.tb.b(tbVar);
    }
}
