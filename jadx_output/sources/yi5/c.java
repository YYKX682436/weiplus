package yi5;

/* loaded from: classes.dex */
public final class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f462624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462624d = jz5.h.b(new yi5.b(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || i17 != 1 || intent == null || (stringExtra = intent.getStringExtra("Contact_User")) == null) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) this.f462624d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.s(ri5.j.I.a(stringExtra, ri5.j.Z, 0));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new yi5.a(this));
    }
}
