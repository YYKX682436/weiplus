package rb2;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f393778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393779e;

    public u0(rb2.y0 y0Var, in5.s0 s0Var) {
        this.f393778d = y0Var;
        this.f393779e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View itemView = this.f393779e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        rb2.y0.n(this.f393778d, itemView);
    }
}
