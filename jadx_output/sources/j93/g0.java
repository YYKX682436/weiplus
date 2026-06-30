package j93;

/* loaded from: classes.dex */
public final class g0 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298390d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f298391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298390d = jz5.h.b(new j93.f0(this));
        this.f298391e = jz5.h.b(new j93.b0(this));
        jz5.h.b(new j93.e0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.d0(this));
    }
}
