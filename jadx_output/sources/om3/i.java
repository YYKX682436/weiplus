package om3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f346404a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f346405b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f346406c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f346407d;

    /* renamed from: e, reason: collision with root package name */
    public ll3.h1 f346408e;

    /* renamed from: f, reason: collision with root package name */
    public int f346409f;

    /* renamed from: g, reason: collision with root package name */
    public final om3.g f346410g;

    public i(android.content.Context context, android.view.View rootView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f346404a = context;
        this.f346405b = rootView;
        this.f346406c = jz5.h.b(new om3.h(this));
        this.f346407d = new java.util.ArrayList();
        this.f346409f = -1;
        this.f346410g = new om3.g();
    }

    public final androidx.recyclerview.widget.RecyclerView a() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f346406c).getValue();
    }
}
