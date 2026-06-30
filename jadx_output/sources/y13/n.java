package y13;

/* loaded from: classes8.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f458891d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f458892e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f458893f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f458894g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f458895h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f458896i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f458897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f458891d = jz5.h.b(new y13.g(this));
        this.f458892e = jz5.h.b(new y13.i(this));
        this.f458893f = jz5.h.b(new y13.e(this));
        this.f458894g = jz5.h.b(new y13.h(this));
        this.f458895h = jz5.h.b(new y13.m(this));
        this.f458896i = jz5.h.b(new y13.j(this));
        this.f458897m = jz5.h.b(y13.l.f458889d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
        jz5.g gVar = this.f458892e;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((hn1.s) b0Var).Ai((android.widget.ImageView) value, "wxid_wi_1d142z0zdj03");
        java.lang.Object value2 = ((jz5.n) this.f458894g).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.LinearLayout) value2).setOnClickListener(new y13.k(this));
        java.lang.String r17 = i65.a.r(getActivity(), com.tencent.mm.R.string.p0a);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        xj.m mVar = new xj.m("", r17, "", "", "", null, null, false);
        java.lang.String str = com.tencent.mm.ui.bk.C() ? mVar.f454757e : mVar.f454756d;
        if (!r26.n0.N(str)) {
            int f17 = i65.a.f(getActivity(), com.tencent.mm.R.dimen.ajs);
            gk0.k kVar = new gk0.k(f17, f17);
            kVar.f272433d = 0.5f;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ((h83.g) n0Var).wi((android.widget.ImageView) value3, str, kVar);
        }
        java.lang.Object value4 = ((jz5.n) this.f458895h).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.TextView) value4).setText(mVar.f454754b);
        java.lang.String str2 = mVar.f454755c;
        boolean z17 = !r26.n0.N(str2);
        jz5.g gVar2 = this.f458896i;
        if (z17) {
            java.lang.Object value5 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            ((android.widget.TextView) value5).setText(str2);
            java.lang.Object value6 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value6, "getValue(...)");
            ((android.widget.TextView) value6).setVisibility(0);
        } else {
            java.lang.Object value7 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value7, "getValue(...)");
            ((android.widget.TextView) value7).setVisibility(8);
        }
        vh0.z0 z0Var = (vh0.z0) i95.n0.c(vh0.z0.class);
        java.lang.Object value8 = ((jz5.n) this.f458893f).getValue();
        kotlin.jvm.internal.o.f(value8, "getValue(...)");
        ((vh0.x1) z0Var).wi((android.view.ViewGroup) value8, mVar, new y13.f(this));
    }
}
