package g93;

/* loaded from: classes.dex */
public final class j extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f269781d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f269782e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f269783f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f269784g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f269785h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f269786i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f269787m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f269781d = com.tencent.mm.ui.contact.i5.g(1, 2);
        this.f269782e = jz5.h.b(new g93.i(this));
        this.f269783f = jz5.h.b(new g93.a(this));
        this.f269784g = jz5.h.b(new g93.h(this));
        this.f269785h = jz5.h.b(new g93.c(this));
        this.f269786i = jz5.h.b(new g93.b(this));
        this.f269787m = jz5.h.b(new g93.d(activity, this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (qi5.b0) ((jz5.n) this.f269787m).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && intent != null && i17 == 1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        S6(g93.e.f269776d);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.z3(getActivity(), new g93.f(this));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new g93.g(this));
    }
}
