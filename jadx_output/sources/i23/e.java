package i23;

/* loaded from: classes12.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final qv4.j f288079d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        su4.s0 s0Var = (su4.s0) i95.n0.c(su4.s0.class);
        i23.a aVar = new i23.a(activity, this);
        ((iv4.e) s0Var).getClass();
        this.f288079d = new qv4.j(aVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        qv4.j jVar = this.f288079d;
        jVar.c();
        findViewById(jVar.f302235a.n()).post(new i23.c(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(getActivity(), new i23.d(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        qv4.j jVar = this.f288079d;
        if (jVar.f302235a.isTeenMode()) {
            return;
        }
        if (jVar.f366982g) {
            jVar.f366982g = false;
            return;
        }
        if (!jVar.f().f367020n) {
            rv4.h hVar = jVar.f().f367011e;
            if (hVar != null) {
                hVar.l(false);
            }
            jVar.f().k();
        }
        jVar.f().f367020n = false;
    }
}
