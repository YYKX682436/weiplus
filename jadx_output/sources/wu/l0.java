package wu;

/* loaded from: classes9.dex */
public final class l0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.y yVar = new z01.y();
        s15.i0 H = item.f284997e.H();
        yVar.f469187g = H != null ? H.j() : null;
        hu.f fVar = this.f449610e;
        yVar.f469184d = fVar.n();
        java.lang.String q17 = fVar.q();
        kotlin.jvm.internal.o.g(q17, "<set-?>");
        yVar.f469185e = q17;
        yVar.f469186f = com.tencent.mm.R.drawable.d87;
        yVar.f469189i = new wu.k0(this, item);
        mvvmView.setViewModel(yVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        s15.w j17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        hu.f fVar = this.f449610e;
        if (fVar.n() == 0 || r26.n0.N(fVar.q())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordDetailNoteItemConvert", "empty msgId");
            return;
        }
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f54599g.f7906c = view.getContext();
        openNoteFromSessionEvent.f54599g.f7904a = fVar.n();
        openNoteFromSessionEvent.f54599g.f7909f = fVar.q();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        snVar.f7907d = false;
        s15.i0 H = item.f284997e.H();
        if (H == null || (j17 = H.j()) == null || (str = j17.toXml()) == null) {
            str = "";
        }
        snVar.f7905b = str;
        openNoteFromSessionEvent.f54599g.f7910g = 10;
        openNoteFromSessionEvent.e();
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView chattingNoteMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingNoteMvvmView(context, null, 0, 6, null);
        chattingNoteMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingNoteMvvmView, -2, -2);
    }
}
