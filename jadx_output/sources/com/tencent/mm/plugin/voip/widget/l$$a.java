package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes7.dex */
public final /* synthetic */ class l$$a implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        intent.setFlags(268435456);
        try {
            android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent, fp.g0.a(0)).send();
            return null;
        } catch (android.app.PendingIntent.CanceledException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.NewVoipSmallWindow", e17, "send pending intent error: %s", e17.getMessage());
            return null;
        }
    }
}
