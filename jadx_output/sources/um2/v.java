package um2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f428985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f428986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f428987h;

    public v(um2.x5 x5Var, android.view.View view, boolean z17, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f428983d = x5Var;
        this.f428984e = view;
        this.f428985f = z17;
        this.f428986g = f0Var;
        this.f428987h = f0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f428983d.S(this.f428984e, this.f428985f, this.f428986g.f310116d, this.f428987h.f310116d);
    }
}
