package w41;

/* loaded from: classes15.dex */
public final class b implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w41.c f442849d;

    public b(w41.c cVar) {
        this.f442849d = cVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView openIMConfirmDialogView = this.f442849d.f442851g;
        if (openIMConfirmDialogView != null) {
            openIMConfirmDialogView.h();
        }
    }
}
