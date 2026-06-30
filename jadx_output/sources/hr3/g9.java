package hr3;

/* loaded from: classes3.dex */
public final class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.j9 f283583d;

    public g9(hr3.j9 j9Var) {
        this.f283583d = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hr3.j9 j9Var = this.f283583d;
        android.text.Layout layout = j9Var.f283687d.getLayout();
        boolean z17 = (layout != null ? layout.getEllipsisCount(0) : 0) > 0;
        if (j9Var.f283695l || z17) {
            j9Var.f283688e.setVisibility(0);
        }
    }
}
