package ni2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView f337387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337387d = finderLiveMicGiftMemberPanelTabView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.n(this.f337387d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ni2.n nVar = (ni2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = this.f337387d;
        finderLiveMicGiftMemberPanelTabView.f111703f.setVisibility(8);
        finderLiveMicGiftMemberPanelTabView.f111704g.setVisibility(0);
        android.widget.TextView textView = finderLiveMicGiftMemberPanelTabView.f111702e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelTabView", "showErrorTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelTabView", "showErrorTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
