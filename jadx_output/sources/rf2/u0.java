package rf2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394908i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394909m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rf2.v0 v0Var, r45.f02 f02Var, android.view.View view, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, android.view.View view3) {
        super(3);
        this.f394903d = v0Var;
        this.f394904e = f02Var;
        this.f394905f = view;
        this.f394906g = textView;
        this.f394907h = view2;
        this.f394908i = textView2;
        this.f394909m = view3;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mm2.r4 data = (mm2.r4) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f394905f;
        android.widget.TextView textView = this.f394906g;
        rf2.v0 v0Var = this.f394903d;
        r45.f02 f02Var = this.f394904e;
        v0Var.h(f02Var, data, view, textView);
        if (data.f329376a != 1) {
            v0Var.g(this.f394907h, this.f394908i, this.f394909m, f02Var);
        }
        return jz5.f0.f302826a;
    }
}
