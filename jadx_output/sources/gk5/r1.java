package gk5;

/* loaded from: classes.dex */
public final class r1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f272716d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f272717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272716d = jz5.h.b(new gk5.p1(this));
        this.f272717e = jz5.h.b(new gk5.q1(activity));
    }

    public final em.b T6() {
        return (em.b) ((jz5.n) this.f272716d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new gk5.o1(this));
        }
    }
}
