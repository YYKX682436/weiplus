package ql2;

/* loaded from: classes10.dex */
public final class e0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql2.i0 f364512a;

    public e0(ql2.i0 i0Var) {
        this.f364512a = i0Var;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        ql2.i0 i0Var = this.f364512a;
        i0Var.f364521d = i17;
        java.lang.ref.WeakReference weakReference = i0Var.f364522e;
        i0Var.t(weakReference != null ? (android.widget.ImageView) weakReference.get() : null);
        i0Var.r(null, i17);
    }
}
