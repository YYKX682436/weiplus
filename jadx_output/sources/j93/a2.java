package j93;

/* loaded from: classes.dex */
public final class a2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298359d = jz5.h.b(new j93.z1(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new j93.y1(this));
        }
    }
}
