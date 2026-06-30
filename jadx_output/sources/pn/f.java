package pn;

/* loaded from: classes11.dex */
public final class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn.m f356923d;

    public f(pn.m mVar) {
        this.f356923d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pn.m mVar = this.f356923d;
        com.tencent.mm.ui.MMActivity mMActivity = mVar.f356930a;
        java.lang.String str = mVar.f356931b;
        if (mMActivity == null) {
            mVar.getClass();
            return;
        }
        if (mVar.f()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", mVar.d(com.tencent.mm.R.string.f490840b00, com.tencent.mm.sdk.platformtools.m2.d()));
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("showShare", false);
            j45.l.j(mMActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        }
    }
}
