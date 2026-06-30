package on2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.d f346824d;

    public a(on2.d dVar) {
        this.f346824d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        on2.d dVar = this.f346824d;
        dVar.k();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = dVar.f346862f;
        if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(2019);
        }
        ll2.e eVar = ll2.e.f319133a;
        ll2.e.b(eVar, dVar.f346866m, false, false, 6, null);
        ll2.e.b(eVar, dVar.f346867n, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
