package k50;

/* loaded from: classes.dex */
public final class z extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f304276d;

    /* renamed from: e, reason: collision with root package name */
    public long f304277e;

    /* renamed from: f, reason: collision with root package name */
    public long f304278f;

    /* renamed from: g, reason: collision with root package name */
    public int f304279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f304276d = jz5.h.b(new k50.y(this));
        this.f304279g = 3;
    }

    public final long T6() {
        return ((java.lang.Number) ((jz5.n) this.f304276d).getValue()).longValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        this.f304279g = 2;
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.s();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.L2(getActivity(), new k50.w(this));
        }
        this.f304277e = c01.id.c() - T6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(getActivity());
        ((cy1.a) ((cy1.a) aVar.ak(getActivity(), iy1.c.ForwardingListUI)).ik(getActivity(), 12, 32337)).Ai(getActivity(), new k50.x(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f304278f = c01.id.c() - T6();
    }
}
