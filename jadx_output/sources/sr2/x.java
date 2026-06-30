package sr2;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411791d;

    public x(sr2.w0 w0Var) {
        this.f411791d = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sr2.w0 w0Var = this.f411791d;
        android.widget.RelativeLayout relativeLayout = w0Var.f411759m;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("shortTitleLayout");
            throw null;
        }
        androidx.appcompat.app.AppCompatActivity activity = w0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).X6(relativeLayout, true);
    }
}
