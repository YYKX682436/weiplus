package i53;

/* loaded from: classes8.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameRecommendVideoFragment f288590d;

    public h2(com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment) {
        this.f288590d = gameRecommendVideoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p33.s sVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment = this.f288590d;
        p33.g0 g0Var = gameRecommendVideoFragment.f140062d.C;
        if (g0Var != null && (sVar = g0Var.f351578e) != null && (str = sVar.f351642d) != null) {
            com.tencent.mm.plugin.game.commlib.util.n.b(gameRecommendVideoFragment.requireContext(), str, -1, false, "");
        }
        gameRecommendVideoFragment.j0(true, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
