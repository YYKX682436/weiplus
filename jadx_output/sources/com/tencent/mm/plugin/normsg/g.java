package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
public class g extends android.content.BroadcastReceiver {
    public g(com.tencent.mm.plugin.normsg.u uVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            if (intent == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g1.");
                return;
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g2.");
            } else {
                if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                w04.l.INSTANCE.ic(intent);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g3.");
        }
    }
}
