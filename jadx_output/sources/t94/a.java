package t94;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t94.a f416583a = new t94.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f416584b;

    public final boolean a() {
        f416584b = ih.a.f(e42.d0.clicfg_sns_record_resolution_ratio_9_16, true);
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_NEW_RECORD_INT_SYNC, 0);
        if (r17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag " + f416584b);
            return f416584b;
        }
        if (r17 != 2) {
            if (f416584b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag false");
                f416584b = false;
            }
            return false;
        }
        if (!f416584b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag true");
            f416584b = true;
        }
        return true;
    }
}
