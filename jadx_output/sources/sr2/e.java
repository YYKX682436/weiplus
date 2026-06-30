package sr2;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.f f411541d;

    public e(sr2.f fVar) {
        this.f411541d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAccountUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.f fVar = this.f411541d;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderPostAccountUIC", "[onClickSwitch]");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = fVar.f411552f.iterator();
        while (it.hasNext()) {
            m92.b bVar = (m92.b) it.next();
            arrayList2.add(new j92.a(bVar, kotlin.jvm.internal.o.b(bVar.field_username, fVar.f411550d)));
        }
        fVar.f411557n = arrayList2;
        if (fVar.f411556m == null) {
            h92.b bVar2 = com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer.f101699y;
            android.app.Activity context = fVar.getContext();
            android.view.Window window = fVar.getContext().getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer a17 = bVar2.a(context, window, new jb2.b());
            fVar.f411556m = a17;
            androidx.recyclerview.widget.RecyclerView recyclerView = a17.getRecyclerView();
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(fVar.getContext()));
            java.util.ArrayList arrayList3 = fVar.f411557n;
            if (arrayList3 != null) {
                fVar.f411558o = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.post.FinderPostAccountUIC$buildConvert$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new i92.b(null, false);
                    }
                }, arrayList3, false);
            }
            recyclerView.setAdapter(fVar.f411558o);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = fVar.f411558o;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f293105o = new sr2.d(fVar);
            }
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = fVar.f411558o;
            if (wxRecyclerAdapter2 != null) {
                java.util.List data = wxRecyclerAdapter2.getData();
                data.clear();
                java.util.ArrayList arrayList4 = fVar.f411557n;
                if (arrayList4 != null) {
                    java.util.Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        data.add((j92.a) it6.next());
                    }
                }
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
        }
        java.util.ArrayList arrayList5 = fVar.f411557n;
        int size = arrayList5 != null ? arrayList5.size() : 0;
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = fVar.f411556m;
        if (finderAccountSwitchDrawer != null) {
            finderAccountSwitchDrawer.setTopPadding(size);
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer2 = fVar.f411556m;
        if (finderAccountSwitchDrawer2 != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.s(finderAccountSwitchDrawer2, false, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
