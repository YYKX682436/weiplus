package wu;

/* loaded from: classes9.dex */
public final class a0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.o oVar = new z01.o();
        x05.k kVar = new x05.k();
        s15.r u17 = item.f284997e.u();
        if (u17 == null || (str = u17.toXml()) == null) {
            str = "";
        }
        kVar.fromXml(str);
        oVar.f469134d = kVar;
        mvvmView.setViewModel(oVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        x05.k kVar = new x05.k();
        s15.r u17 = item.f284997e.u();
        if (u17 == null || (str = u17.toXml()) == null) {
            str = "";
        }
        kVar.fromXml(str);
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        te5.t.f418749a.h(view, kVar, "");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderLiveMvvmView chattingFinderLiveMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderLiveMvvmView(context, null, 0, 6, null);
        chattingFinderLiveMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingFinderLiveMvvmView, -2, -2);
    }
}
