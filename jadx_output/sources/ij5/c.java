package ij5;

/* loaded from: classes.dex */
public class c extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f291758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f291758d = jz5.h.b(new ij5.b(this));
    }

    public final em.l2 U6() {
        return (em.l2) ((jz5.n) this.f291758d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new ij5.a(this));
    }
}
