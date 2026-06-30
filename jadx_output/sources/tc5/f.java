package tc5;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        super(1);
        this.f417559d = msgHistoryGalleryUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        em.d2 d2Var;
        com.tencent.mm.ui.chatting.history.groups.g option = (com.tencent.mm.ui.chatting.history.groups.g) obj;
        kotlin.jvm.internal.o.g(option, "option");
        int i17 = com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.f201697x1;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417559d;
        wc5.y0 n76 = msgHistoryGalleryUI.n7();
        kotlinx.coroutines.r2 r2Var = n76.f444658f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        n76.f444659g = false;
        n76.f444660h = "";
        n76.f444665p = vc5.j.f435324d;
        n76.f444666q = null;
        n76.f444667r = null;
        uc5.f fVar = n76.f444657e;
        fVar.getClass();
        fVar.f426482a = "";
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView i76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) n76.U6()).i7();
        if (i76 != null && (d2Var = i76.f201732f) != null) {
            android.text.Editable text = d2Var.d().getText();
            if (text != null) {
                text.clear();
            }
            em.d2 d2Var2 = i76.f201732f;
            if (d2Var2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            d2Var2.d().clearFocus();
            i76.b();
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.e(i76, false, false, false, 4, null);
        }
        n76.V6("", false);
        msgHistoryGalleryUI.B = option;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            msgHistoryGalleryUI.s7(option);
            msgHistoryGalleryUI.u7(option);
            msgHistoryGalleryUI.L = null;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(msgHistoryGalleryUI.m7().post(new tc5.k(msgHistoryGalleryUI))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mm.sdk.platformtools.Log.h("MicroMsg.MsgHistoryGalleryUI", m524exceptionOrNullimpl, "Not yet implemented?", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
