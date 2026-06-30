package oj5;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f345891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f345893g;

    public u(androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f345890d = recyclerView;
        this.f345891e = c0Var;
        this.f345892f = h0Var;
        this.f345893g = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f345890d;
        boolean b17 = n3.x0.b(recyclerView);
        kotlin.jvm.internal.c0 c0Var = this.f345891e;
        kotlin.jvm.internal.h0 h0Var = this.f345892f;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f345893g;
        if (b17) {
            recyclerView.addOnAttachStateChangeListener(new oj5.t(recyclerView, c0Var, h0Var, n3Var));
            return;
        }
        c0Var.f310112d = true;
        java.lang.Runnable runnable = (java.lang.Runnable) h0Var.f310123d;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
        }
    }
}
