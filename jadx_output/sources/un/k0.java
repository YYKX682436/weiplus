package un;

/* loaded from: classes.dex */
public final class k0 extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429296d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f429297e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f429298f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f429299g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f429300h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f429301i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f429302m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f429303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429296d = jz5.h.b(new un.x(this));
        this.f429297e = jz5.h.b(new un.j0(this));
        this.f429298f = jz5.h.b(new un.i0(activity));
        this.f429299g = jz5.h.b(new un.a0(activity));
        this.f429301i = jz5.h.b(new un.z(activity, this));
        this.f429302m = jz5.h.b(new un.h0(activity, this));
        this.f429303n = jz5.h.b(new un.y(activity, this));
    }

    public static final java.lang.String U6(un.k0 k0Var) {
        return (java.lang.String) ((jz5.n) k0Var.f429296d).getValue();
    }

    public static final em.l2 V6(un.k0 k0Var) {
        return (em.l2) ((jz5.n) k0Var.f429297e).getValue();
    }

    @Override // zm3.a
    public ym3.f T6() {
        return ((ym3.n) ((pi5.o) ((jz5.n) this.f429302m).getValue()).b((pi5.i) ((jz5.n) this.f429301i).getValue())).b((pi5.d) ((jz5.n) this.f429303n).getValue());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ul5.k bounceView;
        androidx.appcompat.app.b supportActionBar;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (supportActionBar = P6.getSupportActionBar()) != null) {
            supportActionBar.o();
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null && (bounceView = P62.getBounceView()) != null) {
            bounceView.setBounceEnabled(false);
        }
        S6(new un.b0(this));
        R6(new un.g0(this));
    }
}
