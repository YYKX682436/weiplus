package cw1;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223323e;

    public t(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, yz5.a aVar) {
        this.f223322d = cleanAllMessagesUI;
        this.f223323e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[2];
        int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI.f95646n;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223322d;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanAllMessagesUI.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanAllMessagesUI.f95652i));
        ((cy1.a) rVar).Hj("chat_history_clean_all_double_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.X6(cleanAllMessagesUI, cleanAllMessagesUI.getString(com.tencent.mm.R.string.nhw), cleanAllMessagesUI.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg), cleanAllMessagesUI.getContext().getResources().getString(com.tencent.mm.R.string.f490353sl), new cw1.s(cleanAllMessagesUI, this.f223323e));
    }
}
