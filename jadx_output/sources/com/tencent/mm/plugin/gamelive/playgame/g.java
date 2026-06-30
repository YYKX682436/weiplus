package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelive.playgame.c f142105e;

    public g(com.tencent.mm.plugin.gamelive.playgame.c cVar) {
        this.f142105e = cVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488041f6;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.gamelive.playgame.f fVar = (com.tencent.mm.plugin.gamelive.playgame.f) cVar;
        ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.kro)).setText(fVar.f142103d);
        if (fVar.f142104e == this.f142105e.f142100h) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.krn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.krn);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, int i17) {
    }
}
