package o50;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.b f343058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o50.b bVar) {
        super(1);
        this.f343058d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wg5.d) state.a(wg5.d.class)) != null) {
            co.a aVar = state.f436776g;
            if (aVar == null || (str = aVar.getString(aVar.f43702d + 1)) == null) {
                str = "";
            }
            o50.b bVar = this.f343058d;
            boolean z17 = !bVar.f343059d.isEmpty();
            java.util.List list = bVar.f343059d;
            java.lang.String str2 = z17 ? (java.lang.String) list.get(0) : "";
            int intExtra = bVar.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans ForwardPreviewConfirmAction fromMsgTalker:" + str + " to:" + list + " fromScene:" + intExtra + " sessionId: " + com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
            if (intExtra == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AfterForwardEnterChattingUIC", "EnterChattingAfterTrans skip, scene=Scene_3rd");
            } else if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                if (list.size() != 1 || kotlin.jvm.internal.o.b(str, str2)) {
                    com.tencent.mm.ui.widget.snackbar.j.a(bVar.getActivity(), null, str);
                } else {
                    com.tencent.mm.ui.widget.snackbar.j.a(bVar.getActivity(), str2, str);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
