package w41;

/* loaded from: classes15.dex */
public final class i implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w41.j f442859d;

    public i(w41.j jVar) {
        this.f442859d = jVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView = this.f442859d.f442862h;
        if (openIMKefuConfirmDialogView != null) {
            openIMKefuConfirmDialogView.h();
        }
    }
}
