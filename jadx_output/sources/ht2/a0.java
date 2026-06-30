package ht2;

/* loaded from: classes2.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f284807d;

    public a0(android.view.ViewGroup viewGroup) {
        this.f284807d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f284807d;
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewGroup);
        }
    }
}
