package rk4;

/* loaded from: classes14.dex */
public final class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f397099d;

    public y5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        this.f397099d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.app.Dialog dialog = this.f397099d.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
    }
}
