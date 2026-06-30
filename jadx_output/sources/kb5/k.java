package kb5;

/* loaded from: classes.dex */
public final class k extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f306255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f306255d = jz5.h.b(new kb5.g(this, activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (pi5.y) ((jz5.n) this.f306255d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new kb5.i(stringExtra, this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new kb5.j(this));
        }
    }
}
