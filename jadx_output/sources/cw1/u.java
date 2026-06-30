package cw1;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223342d;

    public u(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        this.f223342d = cleanAllMessagesUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223342d;
        cw1.m mVar = cleanAllMessagesUI.f95649f;
        if (mVar != null) {
            java.lang.String string = cleanAllMessagesUI.getString(com.tencent.mm.R.string.nhx, fp.n0.a(65535L));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            mVar.a(string);
        }
    }
}
