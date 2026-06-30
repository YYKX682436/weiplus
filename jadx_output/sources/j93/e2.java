package j93;

/* loaded from: classes.dex */
public final class e2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298376d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f298377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298376d = jz5.h.b(new j93.d2(this));
        this.f298377e = jz5.h.b(new j93.b2(this));
        this.f298378f = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        jz5.g gVar = this.f298376d;
        if (i18 == -1 && i17 == 1 && intent != null && (stringExtra = intent.getStringExtra("Contact_User")) != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) gVar).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.s(ri5.j.I.a(stringExtra, ri5.j.Z, 0));
            }
        }
        java.util.ArrayList P1 = b93.r.wi().P1((java.lang.String) ((jz5.n) this.f298377e).getValue());
        if (com.tencent.mm.sdk.platformtools.t8.L0(P1) || P1.contains(this.f298378f)) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k18 = ((em.l2) ((jz5.n) gVar).getValue()).k();
        kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a18 = xm3.u0.a(k18);
        if (a18 != null) {
            a18.s(ri5.j.I.a(this.f298378f, ri5.j.Z, 0));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.c2(this));
    }
}
