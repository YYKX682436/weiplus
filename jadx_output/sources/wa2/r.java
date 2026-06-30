package wa2;

/* loaded from: classes.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f444172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f444173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f444174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444175g;

    public r(kotlin.jvm.internal.h0 h0Var, androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.jvm.internal.f0 f0Var, yz5.l lVar) {
        this.f444172d = h0Var;
        this.f444173e = recyclerView;
        this.f444174f = f0Var;
        this.f444175g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.k3 p07 = this.f444173e.p0(this.f444174f.f310116d);
        android.view.View view = p07 != null ? p07.itemView : null;
        kotlin.jvm.internal.h0 h0Var = this.f444172d;
        h0Var.f310123d = view;
        this.f444175g.invoke(h0Var.f310123d);
    }
}
