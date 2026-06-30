package p61;

/* loaded from: classes5.dex */
public final /* synthetic */ class b2$$a implements com.tencent.mm.ipcinvoker.r {
    @Override // com.tencent.mm.ipcinvoker.r
    public final void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.E;
        if (bundle != null) {
            java.lang.String string = bundle.getString("key_wording_cfg");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance config is empty");
            } else {
                com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.h7(string);
            }
        }
    }
}
