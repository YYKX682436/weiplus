package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mc f118925d;

    public lc(com.tencent.mm.plugin.finder.live.widget.mc mcVar) {
        this.f118925d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentRecommendTopicEducationSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click start live, micTopic=");
        com.tencent.mm.plugin.finder.live.widget.mc mcVar = this.f118925d;
        sb6.append(mcVar.f119062b);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentRecommendTopicEducationSheet", sb6.toString());
        ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) mcVar.f119064d).getValue()).h();
        mcVar.f119063c.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentRecommendTopicEducationSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
