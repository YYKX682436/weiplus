package un;

/* loaded from: classes.dex */
public final class w extends wm3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final un.q f429333f = new un.q(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429334d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f429335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new un.v(this));
        this.f429334d = jz5.h.b(new un.u(this));
        this.f429335e = jz5.h.b(new un.r(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new un.s(this));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), un.t.f429326d);
    }
}
