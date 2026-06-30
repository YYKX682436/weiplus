package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.gamelive.playgame.e f142098f;

    /* renamed from: h, reason: collision with root package name */
    public int f142100h;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f142097e = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f142099g = new java.util.ArrayList();

    public c(com.tencent.mm.plugin.gamelive.playgame.e eVar) {
        this.f142098f = eVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488040f5, (android.view.ViewGroup) null, false);
        this.f142097e = inflate;
        inflate.findViewById(com.tencent.mm.R.id.krl).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.c$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.gamelive.playgame.c cVar = com.tencent.mm.plugin.gamelive.playgame.c.this;
                cVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array2);
                cVar.h();
                yj0.a.h(cVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f142097e.findViewById(com.tencent.mm.R.id.krm);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage$1
            @Override // in5.s
            public in5.r getItemConvert(int i17) {
                return new com.tencent.mm.plugin.gamelive.playgame.g(com.tencent.mm.plugin.gamelive.playgame.c.this);
            }
        }, this.f142099g, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.gamelive.playgame.d(this);
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        return this.f142097e;
    }
}
