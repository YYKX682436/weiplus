package com.tencent.mm.ui.tools;

/* loaded from: classes.dex */
public final class ea implements tk.p {
    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onCallback success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17) {
            return;
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.phz, 1).show();
    }
}
