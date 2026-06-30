package fx3;

/* loaded from: classes10.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f267146d;

    /* renamed from: e, reason: collision with root package name */
    public xm3.t0 f267147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f267146d = jz5.h.b(new fx3.p(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new fx3.n(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new fx3.o(this));
        }
    }
}
