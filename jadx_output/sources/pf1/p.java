package pf1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf1.q f353786d;

    public p(pf1.q qVar) {
        this.f353786d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf1.q qVar = this.f353786d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLVConsoleViewBase", "destroy hash[%d]", java.lang.Integer.valueOf(qVar.hashCode()));
        qVar.f353791g.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            return;
        }
        qVar.getContext().setBaseContext(context);
    }
}
