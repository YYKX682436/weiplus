package ku3;

/* loaded from: classes3.dex */
public final class m4 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312318d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312319e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312320f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312321g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312322h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312323i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312324m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312325n;

    /* renamed from: o, reason: collision with root package name */
    public final su3.d f312326o;

    /* renamed from: p, reason: collision with root package name */
    public float f312327p;

    /* renamed from: q, reason: collision with root package name */
    public int f312328q;

    public m4(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312318d = kitContext;
        this.f312319e = parent;
        this.f312320f = jz5.h.b(new ku3.z3(this));
        this.f312321g = jz5.h.b(new ku3.a4(this));
        this.f312322h = jz5.h.b(new ku3.b4(this));
        this.f312323i = jz5.h.b(new ku3.c4(this));
        this.f312324m = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481087kd);
        this.f312325n = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481088ke);
        this.f312326o = new su3.d();
        ou3.h hVar = ou3.h.f348944e;
        this.f312328q = 0;
    }

    public final android.view.View a() {
        java.lang.Object value = ((jz5.n) this.f312320f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView b() {
        java.lang.Object value = ((jz5.n) this.f312321g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.View c() {
        java.lang.Object value = ((jz5.n) this.f312322h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.h4 h4Var = new ku3.h4(this);
        zt3.a aVar = this.f312318d;
        aVar.Q6(12, h4Var);
        aVar.Q6(10, new ku3.j4(this));
        aVar.R6(new ku3.l4(this));
        a().setOnClickListener(ku3.d4.f312198d);
        c().setBackground(this.f312325n);
        b().s(com.tencent.mm.R.raw.icons_menu_filter, com.tencent.mm.R.color.f478773gt);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f312319e.getContext());
        linearLayoutManager.Q(0);
        jz5.g gVar = this.f312323i;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setLayoutManager(linearLayoutManager);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        su3.d dVar = this.f312326o;
        ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(dVar);
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value3).N(new tu3.a(dVar.getItemCount()));
        dVar.f412777f = new ku3.e4(this);
        c().setOnClickListener(new ku3.g4(this));
    }
}
