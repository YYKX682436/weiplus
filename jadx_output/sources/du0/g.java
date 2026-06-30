package du0;

/* loaded from: classes5.dex */
public abstract class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f243347d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243348e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f243349f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243350g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243348e = jz5.h.b(new du0.c(this));
        this.f243349f = jz5.h.b(new du0.f(this));
        jz5.h.b(new du0.e(this));
        this.f243350g = jz5.h.b(new du0.d(this));
        this.f243351h = jz5.h.b(new du0.b(this));
    }

    public final java.lang.Object O6(kotlin.coroutines.Continuation continuation) {
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new du0.a(null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final du0.i0 P6() {
        return (du0.i0) ((jz5.n) this.f243351h).getValue();
    }

    public final du0.t0 Q6() {
        return (du0.t0) ((jz5.n) this.f243348e).getValue();
    }

    public final du0.v0 R6() {
        return (du0.v0) ((jz5.n) this.f243350g).getValue();
    }

    public final du0.t1 S6() {
        return (du0.t1) ((jz5.n) this.f243349f).getValue();
    }

    public final androidx.lifecycle.c1 T6(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.q8n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f243347d = (android.widget.FrameLayout) findViewById;
        super.onViewCreated(contentView);
    }
}
