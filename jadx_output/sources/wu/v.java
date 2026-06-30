package wu;

/* loaded from: classes9.dex */
public final class v extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.k kVar = new z01.k();
        s15.h hVar = item.f284997e;
        s15.l r17 = hVar.r();
        if (r17 != null) {
            ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ui(r17);
            kVar.t(r17.getMd5());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            return;
        }
        kVar.q(c01.id.c());
        kVar.o(hVar.getAppId());
        mvvmView.setViewModel(kVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = view.getContext();
        s15.h hVar = item.f284997e;
        s15.l r17 = hVar.r();
        if (r17 == null || (str = r17.getMd5()) == null) {
            str = "";
        }
        te5.t.f418749a.j(context, str, hVar.getAppId(), "");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView chattingEmojiMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView(context, null, 0, 6, null);
        chattingEmojiMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingEmojiMvvmView, -2, -2);
    }
}
