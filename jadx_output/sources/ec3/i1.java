package ec3;

/* loaded from: classes.dex */
public final class i1 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f251038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f251039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f251040c;

    public i1(kotlin.jvm.internal.h0 h0Var, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f251038a = h0Var;
        this.f251039b = imageView;
        this.f251040c = imageView2;
    }

    @Override // gb3.i
    public final void onComplete(boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.h1(z17, this.f251038a, this.f251039b, this.f251040c));
    }
}
