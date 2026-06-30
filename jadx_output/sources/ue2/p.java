package ue2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.q f426846d;

    public p(ue2.q qVar) {
        this.f426846d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorUIC$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.q qVar = this.f426846d;
        com.tencent.mars.xlog.Log.i(qVar.f426847d, "点击了遮罩层");
        if (qVar.getFragment() instanceof com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) {
            androidx.fragment.app.Fragment fragment = qVar.getFragment();
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment");
            rg2.a aVar = ((com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) fragment).f111652n;
            if (aVar != null) {
                ((sp2.u2) aVar).f411229a.b(null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorUIC$onViewCreated$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
