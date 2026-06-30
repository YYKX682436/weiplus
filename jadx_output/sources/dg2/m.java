package dg2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f232306a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f232307b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f232308c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f232309d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f232310e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f232311f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f232312g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f232313h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f232314i;

    public m(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f232306a = context;
        this.f232307b = new java.util.LinkedList();
        this.f232308c = "";
        this.f232309d = "";
        this.f232314i = jz5.h.b(new dg2.g(this));
    }

    public final dg2.e a() {
        return (dg2.e) ((jz5.n) this.f232314i).getValue();
    }

    public final void b(java.util.LinkedList list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.LinkedList linkedList = this.f232307b;
        linkedList.clear();
        linkedList.addAll(list);
        dg2.e a17 = a();
        a17.getClass();
        a17.f232288d = new java.util.LinkedList(linkedList);
        a17.f232289e.clear();
        a17.notifyDataSetChanged();
    }

    public final void c() {
        if (this.f232313h != null) {
            dg2.e a17 = a();
            java.util.LinkedList optionList = this.f232307b;
            a17.getClass();
            kotlin.jvm.internal.o.g(optionList, "optionList");
            a17.f232288d = new java.util.LinkedList(optionList);
            a17.f232289e.clear();
            a17.notifyDataSetChanged();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f232313h;
            if (k0Var != null) {
                k0Var.v();
                return;
            }
            return;
        }
        android.content.Context context = this.f232306a;
        this.f232313h = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dgz, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f485593qd2);
        wxRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        wxRecyclerView.setAdapter(a());
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f485594qd3);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        textView.setText(this.f232308c);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.qcy);
        android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.qcx);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        textView2.setText(this.f232309d);
        a().f232292h = new dg2.h(textView2);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        textView2.setOnClickListener(new dg2.i(c0Var, this));
        findViewById.setOnClickListener(new dg2.j(this));
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f232313h;
        if (k0Var2 != null) {
            k0Var2.f211854d = new dg2.k(this, c0Var);
        }
        if (k0Var2 != null) {
            k0Var2.f211872n = new dg2.l(this, roundedCornerFrameLayout);
        }
        if (k0Var2 != null) {
            k0Var2.e(true);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f232313h;
        if (k0Var3 != null) {
            k0Var3.v();
        }
    }
}
