package ze5;

/* loaded from: classes9.dex */
public final class k implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f472039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472040c;

    public k(android.view.View view, android.widget.TextView textView, yb5.d dVar) {
        this.f472038a = view;
        this.f472039b = textView;
        this.f472040c = dVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.view.View todoContainerLl = this.f472038a;
        kotlin.jvm.internal.o.f(todoContainerLl, "$todoContainerLl");
        android.widget.TextView todoTextView = this.f472039b;
        kotlin.jvm.internal.o.f(todoTextView, "$todoTextView");
        te5.t.k(booleanValue, todoContainerLl, todoTextView, this.f472040c);
        return null;
    }
}
