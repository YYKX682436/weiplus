package kk5;

/* loaded from: classes.dex */
public final class c0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f308623d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f308624e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f308625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f308623d = jz5.h.b(kk5.z.f308704d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.z3(getActivity(), kk5.a0.f308611d);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new kk5.b0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        p13.c cVar = this.f308625f;
        if (cVar != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f308625f = null;
        }
    }
}
