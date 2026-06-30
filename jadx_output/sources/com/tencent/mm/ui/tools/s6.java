package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class s6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f210720d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f210721e;

    /* renamed from: f, reason: collision with root package name */
    public db5.o4 f210722f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f210723g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.c1 f210724h;

    /* renamed from: i, reason: collision with root package name */
    public db5.g4 f210725i;

    /* renamed from: m, reason: collision with root package name */
    public final db5.g4 f210726m;

    /* renamed from: n, reason: collision with root package name */
    public db5.l4 f210727n;

    public s6(android.content.Context context) {
        this.f210720d = context;
        android.view.LayoutInflater.from(context);
        this.f210721e = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        this.f210725i = new db5.g4(context);
        this.f210726m = new db5.g4(context);
    }

    public void a(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, com.tencent.mm.ui.widget.dialog.c1 c1Var) {
        android.content.Context context = this.f210720d;
        if ((context instanceof com.tencent.mm.ui.MMFragmentActivity) && ((com.tencent.mm.ui.MMFragmentActivity) context).isSwiping()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenu");
            return;
        }
        this.f210724h = c1Var;
        this.f210723g = t4Var;
        db5.g4 g4Var = this.f210726m;
        g4Var.clear();
        onCreateContextMenuListener.onCreateContextMenu(g4Var, view, null);
        this.f210722f = new com.tencent.mm.ui.tools.r6(this);
        this.f210721e.V1 = true;
        d();
    }

    public void b(android.view.View view, int i17, long j17, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        android.content.Context context = this.f210720d;
        if ((context instanceof com.tencent.mm.ui.MMFragmentActivity) && ((com.tencent.mm.ui.MMFragmentActivity) context).isSwiping()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenuForAdapterView");
            return;
        }
        this.f210723g = t4Var;
        db5.g4 g4Var = this.f210726m;
        g4Var.clear();
        android.view.ContextMenu.ContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        onCreateContextMenuListener.onCreateContextMenu(g4Var, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) g4Var.f228344d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f228381y = adapterContextMenuInfo;
        }
        this.f210722f = new com.tencent.mm.ui.tools.q6(this);
        this.f210721e.V1 = true;
        d();
    }

    public void c(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        this.f210723g = t4Var;
        if (view instanceof android.widget.AbsListView) {
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new com.tencent.mm.ui.tools.l6(this, onCreateContextMenuListener));
        } else if (view instanceof com.tencent.mm.ui.widget.MMWebView) {
            view.setOnLongClickListener(new com.tencent.mm.ui.tools.n6(this, onCreateContextMenuListener));
        } else {
            view.setOnLongClickListener(new com.tencent.mm.ui.tools.p6(this, onCreateContextMenuListener));
        }
    }

    public android.app.Dialog d() {
        if (this.f210722f != null) {
            this.f210725i.clear();
            db5.g4 g4Var = new db5.g4(this.f210720d);
            this.f210725i = g4Var;
            this.f210722f.onCreateMMMenu(g4Var);
        }
        if (this.f210725i.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f210721e;
        k0Var.f211872n = this.f210722f;
        k0Var.f211881s = this.f210723g;
        k0Var.f211854d = this.f210724h;
        k0Var.G = this.f210727n;
        k0Var.v();
        return null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) this.f210725i.f228344d).get(i17);
        boolean c17 = h4Var.c();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f210721e;
        if (c17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSubMenuHelper", "onItemClick menu item has listener");
            if (k0Var.i()) {
                k0Var.u();
            }
            yj0.a.h(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        db5.t4 t4Var = this.f210723g;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(h4Var, i17);
        }
        if (k0Var.i()) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
