package jn5;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f300845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn5.i f300846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f300847h;

    public e(android.view.View view, int i17, int i18, jn5.i iVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f300843d = view;
        this.f300844e = i17;
        this.f300845f = i18;
        this.f300846g = iVar;
        this.f300847h = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn5.d dVar;
        android.view.View view = this.f300843d;
        if (view != null) {
            int i17 = this.f300844e;
            int i18 = this.f300845f;
            androidx.recyclerview.widget.k3 k3Var = this.f300847h;
            android.view.ViewPropertyAnimator animate = view.animate();
            if (i17 != 0) {
                animate.translationX(0.0f);
            }
            if (i18 != 0) {
                animate.translationY(0.0f);
            }
            jn5.i iVar = this.f300846g;
            if (iVar.I(k3Var)) {
                android.view.View itemView = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                dVar = new jn5.d(k3Var, itemView, iVar);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                animate.setUpdateListener(dVar);
            }
            animate.setDuration(iVar.f12170e).setInterpolator(iVar.f300858u).setListener(new jn5.c(iVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
