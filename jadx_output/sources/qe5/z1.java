package qe5;

/* loaded from: classes8.dex */
public final class z1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f362228d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f362229e;

    /* renamed from: f, reason: collision with root package name */
    public zh1.v0 f362230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.h.b(new qe5.y1(this));
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.x1(this));
        }
    }
}
