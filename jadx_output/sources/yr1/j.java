package yr1;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment f464644d;

    public j(com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment) {
        this.f464644d = bizContactInfoDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.app.Dialog dialog = this.f464644d.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
    }
}
