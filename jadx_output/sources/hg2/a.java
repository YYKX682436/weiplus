package hg2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281336d;

    public a(hg2.h hVar) {
        this.f281336d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dk2.vf vfVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/flashsale/FlashSaleBubbleController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hg2.h hVar = this.f281336d;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = hVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null && (vfVar = ((mm2.f6) hVar.business(mm2.f6.class)).X) != null) {
            hg2.s.b(vfVar, hVar.O6(), k0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/flashsale/FlashSaleBubbleController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
