package ry4;

/* loaded from: classes3.dex */
public final class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.j0 f401633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f401634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry4.a f401635f;

    public h0(ry4.j0 j0Var, androidx.recyclerview.widget.k3 k3Var, ry4.a aVar) {
        this.f401633d = j0Var;
        this.f401634e = k3Var;
        this.f401635f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        ry4.j0 j0Var = this.f401633d;
        java.util.Map map = j0Var.f401653t;
        androidx.recyclerview.widget.k3 k3Var = this.f401634e;
        map.remove(k3Var);
        this.f401635f.itemView.setTag(com.tencent.mm.R.id.v59, null);
        j0Var.h(k3Var);
    }
}
