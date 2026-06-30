package hq5;

/* loaded from: classes5.dex */
public final class i extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283234d = jz5.h.b(new hq5.h(this));
    }

    public final java.lang.String T6() {
        eq5.h hVar;
        j75.f Q6 = Q6();
        return (Q6 == null || (hVar = (eq5.h) Q6.getState()) == null) ? "" : jq5.o.f301283a.a(getContext(), hVar.f255917h, hVar.f255918i, hVar.f255919m);
    }

    public final java.lang.String U6() {
        eq5.h hVar;
        java.lang.String str;
        j75.f Q6 = Q6();
        return (Q6 == null || (hVar = (eq5.h) Q6.getState()) == null || (str = hVar.f255915f) == null) ? "" : str;
    }

    public final em.f4 V6() {
        return (em.f4) ((jz5.n) this.f283234d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.g(this));
        }
    }
}
