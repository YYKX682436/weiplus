package rr;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f399129d;

    public i(rr.n nVar) {
        this.f399129d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rr.n nVar = this.f399129d;
        android.app.Activity activity = nVar.f399135a;
        int i17 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(activity);
        t4Var.f6042e = nVar.f399135a.getString(com.tencent.mm.R.string.f491118c03);
        t4Var.f(true);
        nVar.f399140f = t4Var.g();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        nVar.f399139e = android.os.SystemClock.elapsedRealtime();
    }
}
