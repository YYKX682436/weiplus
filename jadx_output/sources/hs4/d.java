package hs4;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f284616a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f284617b;

    /* renamed from: c, reason: collision with root package name */
    public db5.o4 f284618c;

    /* renamed from: d, reason: collision with root package name */
    public db5.t4 f284619d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f284620e;

    /* renamed from: f, reason: collision with root package name */
    public db5.g4 f284621f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f284622g;

    /* renamed from: h, reason: collision with root package name */
    public hs4.c f284623h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f284624i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f284625j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f284626k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f284627l = false;

    /* renamed from: m, reason: collision with root package name */
    public int f284628m = 0;

    public d(android.content.Context context) {
        hs4.a aVar = new hs4.a(this);
        this.f284617b = context;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false)) {
            this.f284616a = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 3);
        } else {
            this.f284616a = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 3);
        }
        this.f284621f = new db5.g4(context);
        this.f284622g = new db5.g4(context);
        this.f284624i = new androidx.recyclerview.widget.RecyclerView(context, null);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        this.f284624i.setFocusable(false);
        this.f284624i.setLayoutParams(layoutParams);
        this.f284624i.setHasFixedSize(true);
        this.f284624i.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        this.f284624i.setItemViewCacheSize(20);
        this.f284624i.setPadding(0, 0, 0, 0);
        hs4.c cVar = new hs4.c(this);
        this.f284623h = cVar;
        cVar.f284614e = this.f284621f;
        cVar.f284613d = aVar;
        this.f284624i.setAdapter(cVar);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f284616a;
        if (z2Var != null) {
            z2Var.j(this.f284624i);
        }
    }

    public boolean a() {
        return this.f284616a.h();
    }

    public void b() {
        hs4.c cVar = this.f284623h;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        this.f284616a.C();
    }

    public void c() {
        this.f284616a.B();
    }

    public void d() {
        hs4.c cVar;
        db5.o4 o4Var = this.f284618c;
        if (o4Var != null) {
            o4Var.onCreateMMMenu(this.f284621f);
        }
        this.f284624i.setPadding(0, 0, 0, 0);
        if (this.f284622g != null && (cVar = this.f284623h) != null) {
            cVar.notifyDataSetChanged();
        }
        this.f284616a.C();
    }
}
