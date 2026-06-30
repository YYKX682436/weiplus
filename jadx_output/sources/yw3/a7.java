package yw3;

/* loaded from: classes11.dex */
public final class a7 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f466693d;

    /* renamed from: e, reason: collision with root package name */
    public xm3.t0 f466694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f466693d = jz5.h.b(new yw3.z6(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new yw3.x6(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new yw3.y6(this));
        }
    }
}
