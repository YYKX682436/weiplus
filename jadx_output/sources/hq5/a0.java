package hq5;

/* loaded from: classes5.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283214d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f283215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f283216f;

    /* renamed from: g, reason: collision with root package name */
    public int f283217g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283214d = "MicroMsg.WeDrop.WeDropPreviewUIC";
        this.f283215e = jz5.h.b(new hq5.x(this));
    }

    public static final boolean T6(hq5.a0 a0Var) {
        eq5.h hVar;
        j75.f Q6 = a0Var.Q6();
        return ((Q6 == null || (hVar = (eq5.h) Q6.getState()) == null) ? 0 : hVar.f255919m) > 0;
    }

    public final em.h4 U6() {
        return (em.h4) ((jz5.n) this.f283215e).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.y(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        em.h4 U6 = U6();
        if (U6 != null) {
            if (U6.f254404f == null) {
                U6.f254404f = (android.widget.FrameLayout) U6.f254399a.findViewById(com.tencent.mm.R.id.cpv);
            }
            android.widget.FrameLayout frameLayout = U6.f254404f;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new hq5.z(this));
            }
        }
    }
}
