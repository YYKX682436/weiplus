package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class w6 extends com.tencent.mm.ui.tools.fd {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.LayoutInflater f210876q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.tools.v6 f210877r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f210878s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.g4 f210879t;

    /* renamed from: u, reason: collision with root package name */
    public db5.o4 f210880u;

    /* renamed from: v, reason: collision with root package name */
    public db5.t4 f210881v;

    public w6(android.content.Context context) {
        super(context);
        this.f210878s = true;
        this.f210876q = com.tencent.mm.ui.id.b(context);
        this.f210879t = new db5.g4(context);
    }

    @Override // com.tencent.mm.ui.tools.fd
    public android.widget.BaseAdapter b() {
        if (this.f210877r == null) {
            this.f210877r = new com.tencent.mm.ui.tools.v6(this, null);
        }
        return this.f210877r;
    }

    public boolean e() {
        db5.o4 o4Var = this.f210880u;
        db5.g4 g4Var = this.f210879t;
        if (o4Var != null) {
            o4Var.onCreateMMMenu(g4Var);
        }
        java.lang.CharSequence charSequence = g4Var.f228345e;
        this.f210878s = charSequence != null && charSequence.length() > 0;
        d(com.tencent.mm.ui.zk.e(this.f210424e, com.tencent.mm.R.dimen.f479738dv));
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        boolean z17 = this.f210878s;
        if (z17 && i17 == 0) {
            return;
        }
        if (z17) {
            i17--;
        }
        db5.t4 t4Var = this.f210881v;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(this.f210879t.getItem(i17), i17);
        }
        a();
    }
}
