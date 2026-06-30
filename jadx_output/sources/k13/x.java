package k13;

/* loaded from: classes8.dex */
public final class x extends androidx.recyclerview.widget.k3 implements android.view.View.OnCreateContextMenuListener, db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f303277d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f303278e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f303279f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f303280g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f303281h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f303282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303283m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f303283m = forceNotifyListUI;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.d(findViewById);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.d(findViewById2);
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.o7u);
        kotlin.jvm.internal.o.d(findViewById3);
        this.f303277d = (android.widget.TextView) findViewById3;
        this.f303278e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ovc);
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f486653m06);
        kotlin.jvm.internal.o.d(findViewById4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById4;
        this.f303279f = linearLayout;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.lqy);
        kotlin.jvm.internal.o.d(findViewById5);
        this.f303280g = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.cgi);
        findViewById6.setOnTouchListener(new k13.t(forceNotifyListUI));
        findViewById6.setOnLongClickListener(new k13.u(forceNotifyListUI, this));
        linearLayout.setOnClickListener(new k13.w(forceNotifyListUI, this));
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.add(this.f303283m.getContext().getResources().getString(com.tencent.mm.R.string.fet));
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303283m;
        if (!isNetworkConnected) {
            dp.a.makeText(forceNotifyListUI.getContext(), forceNotifyListUI.getResources().getText(com.tencent.mm.R.string.f490500wu), 1).show();
            return;
        }
        forceNotifyListUI.f137340i.remove(getAdapterPosition());
        k13.s sVar = forceNotifyListUI.f137337f;
        kotlin.jvm.internal.o.d(sVar);
        sVar.notifyItemRemoved(getAdapterPosition());
        ((h13.l0) i95.n0.c(h13.l0.class)).wi(this.f303282i, 4);
        if (forceNotifyListUI.f137340i.isEmpty()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = forceNotifyListUI.f137336e;
            kotlin.jvm.internal.o.d(recyclerView);
            recyclerView.setVisibility(8);
            android.view.View view = forceNotifyListUI.f137339h;
            kotlin.jvm.internal.o.d(view);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
