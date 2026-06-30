package qe5;

/* loaded from: classes12.dex */
public final class b0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f362072d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362073e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362074f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362075g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f362076h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.a0(this));
        }
    }
}
