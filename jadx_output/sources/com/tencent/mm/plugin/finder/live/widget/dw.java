package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dw implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118167b;

    public dw(java.util.List list, com.tencent.mm.plugin.finder.live.widget.nw nwVar) {
        this.f118166a = list;
        this.f118167b = nwVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        com.tencent.mars.xlog.Log.i("FinderLiveSwitchRoleDialog", "Add role resultCode " + i17 + " data " + intent);
        if (i17 == -1) {
            r45.of1 of1Var = new r45.of1();
            java.lang.String str3 = "";
            if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                str = "";
            }
            of1Var.set(0, str);
            if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                str2 = "";
            }
            of1Var.set(1, str2);
            if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                str3 = stringExtra;
            }
            of1Var.set(3, str3);
            of1Var.set(2, 2);
            java.util.List list = this.f118166a;
            if (list.size() > 0) {
                list.add(1, of1Var);
            } else {
                list.add(of1Var);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new cm2.e((r45.of1) it.next()));
            }
            arrayList.addAll(arrayList2);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f118167b.f119212m;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("roleListView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.E0(arrayList);
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(list);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var != null) {
                c1Var.V3 = linkedList;
            }
            zl2.r4.f473950a.U2(linkedList);
        }
    }
}
