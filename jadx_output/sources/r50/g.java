package r50;

/* loaded from: classes.dex */
public final class g extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f392577d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f392578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f392577d = jz5.h.b(new r50.e(this));
        this.f392578e = jz5.h.b(new r50.f(activity));
    }

    public final em.b T6() {
        return (em.b) ((jz5.n) this.f392577d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new r50.d(this));
        }
    }
}
