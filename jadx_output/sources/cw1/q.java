package cw1;

/* loaded from: classes3.dex */
public final class q implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223254d;

    public q(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        this.f223254d = cleanAllMessagesUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223254d;
        g4Var.f(0, cleanAllMessagesUI.getString(com.tencent.mm.R.string.acb));
        g4Var.x(1, com.tencent.mm.R.string.a_i, cleanAllMessagesUI.getColor(com.tencent.mm.R.color.f479482a31));
    }
}
