package cw1;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f223358e;

    public v(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, long j17) {
        this.f223357d = cleanAllMessagesUI;
        this.f223358e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223357d;
        cw1.m mVar = cleanAllMessagesUI.f95649f;
        if (mVar != null) {
            java.lang.String string = cleanAllMessagesUI.getString(com.tencent.mm.R.string.nhx, fp.n0.a(this.f223358e));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            mVar.a(string);
        }
    }
}
