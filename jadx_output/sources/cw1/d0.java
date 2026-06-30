package cw1;

/* loaded from: classes3.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f222867d;

    public d0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        this.f222867d = cleanAllMessagesUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.x(0, com.tencent.mm.R.string.b8d, this.f222867d.getColor(com.tencent.mm.R.color.f479482a31));
    }
}
