package wc5;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444538d;

    public c(wc5.q qVar) {
        this.f444538d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.q qVar = this.f444538d;
        qVar.f444630o = null;
        if (qVar.f444622d.isFinishing() || qVar.f444622d.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "show loading toast after 300ms");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = qVar.f444622d;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(appCompatActivity);
        e4Var.f211776c = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490604zq);
        e4Var.f211780g = 2;
        e4Var.f211778e = true;
        e4Var.f211781h = new wc5.b(qVar);
        qVar.f444629n = e4Var.c();
    }
}
