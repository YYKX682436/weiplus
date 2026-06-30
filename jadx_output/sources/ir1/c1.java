package ir1;

/* loaded from: classes5.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f293947d;

    public c1(android.widget.PopupWindow popupWindow) {
        this.f293947d = popupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f293947d.dismiss();
    }
}
