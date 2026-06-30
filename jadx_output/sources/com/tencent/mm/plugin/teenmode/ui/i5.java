package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public class i5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder f173033d;

    public i5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder) {
        this.f173033d = settingsTeenModeMainFinder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f173033d.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.plugin.teenmode.ui.w2 w2Var = (com.tencent.mm.plugin.teenmode.ui.w2) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.teenmode.ui.w2.class);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(w2Var.getActivity(), 1, 2, true);
        z2Var.m(w2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f490347sg), w2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f490507x1));
        z2Var.v(w2Var.getActivity().getResources().getColor(com.tencent.mm.R.color.a0c));
        z2Var.q(w2Var.getActivity().getString(com.tencent.mm.R.string.jsa));
        android.widget.TextView textView = z2Var.C;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        int i17 = w2Var.f173173g;
        if (i17 < 0) {
            i17 = 10;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = w2Var.f173174h.getList(2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.lz2 lz2Var = (r45.lz2) it.next();
            if (i17 >= lz2Var.getInteger(0) && i17 <= lz2Var.getInteger(1)) {
                arrayList2.addAll(lz2Var.getList(2));
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            java.util.LinkedList list = w2Var.f173174h.getList(2);
            kotlin.jvm.internal.o.f(list, "getVisible_info(...)");
            r45.lz2 lz2Var2 = (r45.lz2) kz5.n0.Z(list);
            if (lz2Var2 != null) {
                arrayList2.addAll(lz2Var2.getList(2));
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new com.tencent.mm.plugin.teenmode.ui.p2(w2Var, (r45.mz2) it6.next()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.plugin.teenmode.ui.p2 p2Var = (com.tencent.mm.plugin.teenmode.ui.p2) it7.next();
            if ((w2Var.f173172f & p2Var.f173102d.getLong(0)) > 0) {
                p2Var.f173103e = true;
            }
        }
        r45.mz2 mz2Var = new r45.mz2();
        mz2Var.set(0, 0L);
        mz2Var.set(1, w2Var.getActivity().getString(com.tencent.mm.R.string.js6));
        com.tencent.mm.plugin.teenmode.ui.p2 p2Var2 = new com.tencent.mm.plugin.teenmode.ui.p2(w2Var, mz2Var);
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                if (((com.tencent.mm.plugin.teenmode.ui.p2) it8.next()).f173103e) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            p2Var2.f173103e = true;
        }
        arrayList4.add(0, p2Var2);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = new com.tencent.mm.view.recyclerview.WxRecyclerView(w2Var.getActivity());
        final androidx.appcompat.app.AppCompatActivity activity2 = w2Var.getActivity();
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(activity2) { // from class: com.tencent.mm.plugin.teenmode.ui.FinderTeenModeContentManageUIC$createContentRv$4
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF123307r() {
                return false;
            }
        });
        wxRecyclerView.setNestedScrollingEnabled(false);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.teenmode.ui.FinderTeenModeContentManageUIC$createContentRv$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.teenmode.ui.r2(com.tencent.mm.plugin.teenmode.ui.w2.this);
            }
        }, arrayList4, false);
        wxRecyclerAdapter.setHasStableIds(true);
        wxRecyclerView.N(new com.tencent.mm.plugin.teenmode.ui.q2(w2Var, w2Var.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479648bn), arrayList4.size(), 0, 4, null));
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = w2Var.f173172f;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.teenmode.ui.s2(arrayList4, g0Var);
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.plugin.teenmode.ui.t2 t2Var = new com.tencent.mm.plugin.teenmode.ui.t2(z2Var);
        com.tencent.mm.plugin.teenmode.ui.u2 u2Var = new com.tencent.mm.plugin.teenmode.ui.u2(w2Var, g0Var, z2Var);
        z2Var.D = t2Var;
        z2Var.E = u2Var;
        z2Var.j(wxRecyclerView);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
