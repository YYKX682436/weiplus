package cw1;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223299e;

    public s(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, yz5.a aVar) {
        this.f223298d = cleanAllMessagesUI;
        this.f223299e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[2];
        int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI.f95646n;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223298d;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanAllMessagesUI.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanAllMessagesUI.f95652i));
        ((cy1.a) rVar).Hj("chat_history_clean_all_last_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        this.f223299e.invoke();
    }
}
