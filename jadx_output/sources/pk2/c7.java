package pk2;

/* loaded from: classes3.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f355618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f355619b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f355620c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f355621d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f355622e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f355623f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f355624g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f355625h;

    /* renamed from: i, reason: collision with root package name */
    public final pk2.w6 f355626i;

    /* renamed from: j, reason: collision with root package name */
    public final pk2.w6 f355627j;

    /* renamed from: k, reason: collision with root package name */
    public final pk2.w6 f355628k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f355629l;

    /* renamed from: m, reason: collision with root package name */
    public db5.o4 f355630m;

    /* renamed from: n, reason: collision with root package name */
    public db5.o4 f355631n;

    /* renamed from: o, reason: collision with root package name */
    public db5.o4 f355632o;

    static {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
    }

    public c7(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f355618a = context;
        this.f355619b = z17;
        this.f355620c = jz5.h.b(new pk2.y6(this));
        this.f355621d = jz5.h.b(new pk2.b7(this));
        this.f355622e = jz5.h.b(new pk2.z6(this));
        this.f355623f = jz5.h.b(new pk2.a7(this));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.am7, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f355624g = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ejl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ejh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f355625h = recyclerView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ejj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ejk);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.ejg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f355629l = textView;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.eji);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById4);
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById6);
        pk2.w6 w6Var = new pk2.w6(this);
        this.f355626i = w6Var;
        pk2.w6 w6Var2 = new pk2.w6(this);
        this.f355627j = w6Var2;
        pk2.w6 w6Var3 = new pk2.w6(this);
        this.f355628k = w6Var3;
        b((androidx.recyclerview.widget.RecyclerView) findViewById, w6Var);
        b(recyclerView, w6Var2);
        b((androidx.recyclerview.widget.RecyclerView) findViewById3, w6Var3);
    }

    public final com.tencent.mm.plugin.finder.view.e3 a() {
        return (com.tencent.mm.plugin.finder.view.e3) ((jz5.n) this.f355620c).getValue();
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, pk2.w6 w6Var) {
        recyclerView.setFocusable(false);
        recyclerView.setAdapter(w6Var);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this.f355618a, 5));
    }
}
