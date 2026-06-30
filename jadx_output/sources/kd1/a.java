package kd1;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, android.os.Bundle> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,");
        kd1.e.b().getClass();
        sb6.append((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, ""));
        java.lang.String sb7 = sb6.toString();
        kd1.e.b();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCLoadPaySpeechDialectConfig", "idsStr:%s  resId:%s", sb7, str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("idsStr", sb7);
        bundle.putString("resId", str);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
