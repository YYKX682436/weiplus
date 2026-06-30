package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class o3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel f116555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f116556b;

    public o3(com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel, android.content.Context context) {
        this.f116555a = finderLiveCommentPostRealNamePanel;
        this.f116556b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f116555a;
        if (finderLiveCommentPostRealNamePanel.f115828g) {
            yz5.q qVar = finderLiveCommentPostRealNamePanel.f115825d;
            android.content.Context context = this.f116556b;
            if (qVar != null) {
                qVar.invoke(context, null, 0);
            }
            finderLiveCommentPostRealNamePanel.f115829h.alive();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI.class);
            intent.putExtra("enterRealnameVerifyUI", true);
            android.content.Context context2 = this.f116556b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$init$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$init$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327362f);
        }
    }
}
