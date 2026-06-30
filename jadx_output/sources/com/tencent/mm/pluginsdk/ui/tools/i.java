package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191689d;

    public i(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191689d = appChooserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191689d;
        appChooserUI.f191344r = true;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(appChooserUI);
        appChooserUI.f191338m = y1Var;
        y1Var.j(com.tencent.mm.R.layout.acv);
        android.view.View view2 = appChooserUI.f191338m.f212027f;
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.e1p)).getPaint());
        android.widget.Button button = (android.widget.Button) view2.findViewById(com.tencent.mm.R.id.e1m);
        android.widget.Button button2 = (android.widget.Button) view2.findViewById(com.tencent.mm.R.id.e1n);
        button.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.j(appChooserUI));
        button2.setOnClickListener(appChooserUI.S);
        appChooserUI.f191339n = (com.tencent.mm.view.recyclerview.WxRecyclerView) view2.findViewById(com.tencent.mm.R.id.e1o);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.17
            public AnonymousClass17() {
            }

            @Override // in5.s
            public in5.r getItemConvert(int i17) {
                return i17 == 2 ? new com.tencent.mm.pluginsdk.ui.tools.z(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.this) : new com.tencent.mm.pluginsdk.ui.tools.x(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.this);
            }
        }, appChooserUI.D, true);
        appChooserUI.f191340o = wxRecyclerAdapter;
        wxRecyclerAdapter.Q(new com.tencent.mm.pluginsdk.ui.tools.k(appChooserUI), false);
        appChooserUI.f191339n.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(appChooserUI));
        appChooserUI.f191339n.setAdapter(appChooserUI.f191340o);
        appChooserUI.f191340o.notifyDataSetChanged();
        appChooserUI.f191338m.o(appChooserUI.X);
        appChooserUI.f191338m.s();
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).Ai(3, appChooserUI.f191352z, "", appChooserUI.G);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
