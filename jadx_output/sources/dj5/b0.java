package dj5;

/* loaded from: classes.dex */
public final class b0 extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f233055d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f233056e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f233057f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f233058g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f233059h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f233060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f233055d = jz5.h.b(new dj5.s(this));
        this.f233056e = jz5.h.b(new dj5.a0(this));
        this.f233057f = jz5.h.b(new dj5.z(activity));
        this.f233058g = jz5.h.b(new dj5.v(this, activity));
        this.f233059h = jz5.h.b(new dj5.t(this));
        this.f233060i = jz5.h.b(new dj5.u(this, activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f233055d).getValue()).booleanValue() ? (ym3.f) ((jz5.n) this.f233059h).getValue() : (pi5.y) ((jz5.n) this.f233060i).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new dj5.w(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new dj5.y(this, stringExtra));
        }
    }
}
