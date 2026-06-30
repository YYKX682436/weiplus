package p61;

/* loaded from: classes14.dex */
public class s5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f352375d;

    public s5(com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI) {
        this.f352375d = new java.lang.ref.WeakReference(verifyQQUI);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.bind.ui.VerifyQQUI verifyQQUI = (com.tencent.mm.plugin.account.bind.ui.VerifyQQUI) this.f352375d.get();
        if (verifyQQUI != null && !verifyQQUI.isFinishing()) {
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) verifyQQUI.findViewById(com.tencent.mm.R.id.aim);
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = (com.tencent.mm.ui.base.MMClearEditText) verifyQQUI.findViewById(com.tencent.mm.R.id.ail);
            java.lang.String trim = mMClearEditText.getText().toString().trim();
            verifyQQUI.f73100g = mMClearEditText2.getText().toString().trim();
            try {
                long V = com.tencent.mm.sdk.platformtools.t8.V(trim, 0L);
                verifyQQUI.f73099f = V;
                if (V < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                    db5.e1.i(verifyQQUI.getContext(), com.tencent.mm.R.string.aie, com.tencent.mm.R.string.aic);
                    return true;
                }
                if (verifyQQUI.f73100g.equals("")) {
                    db5.e1.i(verifyQQUI.getContext(), com.tencent.mm.R.string.aid, com.tencent.mm.R.string.aic);
                    return true;
                }
                verifyQQUI.hideVKB();
                n61.b bVar = new n61.b(verifyQQUI.f73099f, verifyQQUI.f73100g, "", "", "", 1, verifyQQUI.f73104n, verifyQQUI.f73105o, false);
                gm0.j1.d().g(bVar);
                verifyQQUI.f73098e = db5.e1.Q(verifyQQUI.getContext(), verifyQQUI.getString(com.tencent.mm.R.string.aig), verifyQQUI.getString(com.tencent.mm.R.string.ai8), true, true, new p61.r5(this, bVar));
                return true;
            } catch (java.lang.Exception unused) {
                db5.e1.i(verifyQQUI.getContext(), com.tencent.mm.R.string.aie, com.tencent.mm.R.string.aic);
            }
        }
        return true;
    }
}
