package yo3;

/* loaded from: classes9.dex */
public class j implements c01.qa {
    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null || sVar.G() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "doLocalProxyScene dispatcher == null || dispatcher.getAccInfo() == null");
            return;
        }
        byte[] v17 = sVar.G().v("offline_token");
        if (v17 != null) {
            yo3.m.f464154a = new java.lang.String(v17);
        }
        byte[] v18 = sVar.G().v("offline_token_V2");
        if (v18 != null) {
            yo3.m.f464155b = new java.lang.String(v18);
        }
        byte[] v19 = sVar.G().v("offline_key_list");
        if (v19 != null) {
            yo3.m.f464157d = new java.lang.String(v19);
        }
    }
}
