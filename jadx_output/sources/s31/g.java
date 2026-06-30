package s31;

/* loaded from: classes5.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.FrameLayout f402452a;

    /* renamed from: b, reason: collision with root package name */
    public s31.h f402453b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f402452a == null) {
            this.f402452a = new android.widget.FrameLayout(context);
        }
        android.widget.FrameLayout frameLayout = this.f402452a;
        kotlin.jvm.internal.o.d(frameLayout);
        return frameLayout;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        this.f402453b = (s31.h) pVar;
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f402453b;
    }
}
