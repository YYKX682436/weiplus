package pg2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.a0 f354171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f354173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mn0.a0 a0Var, android.view.View view, android.app.Activity activity, ug5.v vVar) {
        super(0);
        this.f354171d = a0Var;
        this.f354172e = view;
        this.f354173f = activity;
        this.f354174g = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f354171d.b();
        android.view.View view = this.f354172e;
        view.postDelayed(new pg2.n(view, this.f354173f, this.f354174g), 200L);
        return jz5.f0.f302826a;
    }
}
