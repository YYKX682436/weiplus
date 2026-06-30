package ix3;

/* loaded from: classes.dex */
public final class t1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295560d;

    /* renamed from: e, reason: collision with root package name */
    public xm3.t0 f295561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295560d = jz5.h.b(new ix3.s1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new ix3.q1(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new ix3.r1(this));
        }
    }
}
