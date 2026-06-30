package f93;

/* loaded from: classes3.dex */
public final class p5 extends hg5.d {
    public final java.util.ArrayList A;
    public final jz5.g B;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f260426r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f260427s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f260428t;

    /* renamed from: u, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f260429u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f260430v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f260431w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f260432x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f260433y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f260434z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(android.content.Context uiContext, java.lang.String labelId) {
        super(uiContext);
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        kotlin.jvm.internal.o.g(labelId, "labelId");
        this.f260426r = uiContext;
        this.f260427s = labelId;
        this.f260428t = kotlinx.coroutines.z0.b();
        this.f260429u = new android.text.SpannableStringBuilder("");
        this.f260430v = jz5.h.b(new f93.n5(this));
        this.f260431w = jz5.h.b(new f93.m5(this));
        this.f260432x = jz5.h.b(new f93.o5(this));
        this.f260433y = jz5.h.b(new f93.l5(this));
        this.f260434z = jz5.h.b(f93.g5.f260344d);
        this.A = new java.util.ArrayList();
        this.B = jz5.h.b(new f93.f5(this));
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.csa, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f281403i;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            findViewById.setOnClickListener(new f93.h5(this));
        }
        jz5.g gVar = this.f260430v;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.f260433y).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter((f93.e5) ((jz5.n) this.B).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.N(new f93.i5(this));
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f260432x).getValue();
        if (textView != null) {
            textView.setText(this.f260429u);
        }
        kotlinx.coroutines.l.d(this.f260428t, kotlinx.coroutines.q1.f310570c, null, new f93.k5(this, null), 2, null);
    }

    @Override // hg5.d
    public void J() {
        super.J();
        kotlinx.coroutines.z0.e(this.f260428t, null, 1, null);
    }
}
