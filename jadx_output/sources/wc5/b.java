package wc5;

/* loaded from: classes10.dex */
public final class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444532d;

    public b(wc5.q qVar) {
        this.f444532d = qVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "loading toast cancelled, finish activity");
        wc5.q qVar = this.f444532d;
        qVar.f444629n = null;
        if (qVar.f444622d.isFinishing() || qVar.f444622d.isDestroyed()) {
            return;
        }
        qVar.f444622d.finish();
    }
}
