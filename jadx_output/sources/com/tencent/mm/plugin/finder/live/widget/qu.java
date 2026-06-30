package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class qu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vu f119552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f119553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f119554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(com.tencent.mm.plugin.finder.live.widget.vu vuVar, hn2.d dVar, r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119552d = vuVar;
        this.f119553e = dVar;
        this.f119554f = yx1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.qu(this.f119552d, this.f119553e, this.f119554f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.qu quVar = (com.tencent.mm.plugin.finder.live.widget.qu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        quVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f119552d;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = vuVar.f120098j;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMProcessBar, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMProcessBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean S6 = ((om2.g) vuVar.f120090b.business(om2.g.class)).S6();
        com.tencent.mm.ui.widget.button.WeButton weButton = vuVar.f120099k;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        hn2.d dVar = this.f119553e;
        int i17 = !dVar.c() && !S6 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weButton, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weButton.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(weButton, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = vuVar.f120100l;
        kotlin.jvm.internal.o.f(textView, "<get-tvHasReqeusted>(...)");
        vuVar.getClass();
        int i18 = (this.f119554f.f391464m == 3) && dVar.c() ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
