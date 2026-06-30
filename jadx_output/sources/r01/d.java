package r01;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f368041a = "";

    /* renamed from: b, reason: collision with root package name */
    public static long f368042b;

    public static boolean a() {
        int i17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, null);
        if (m17 == null || !(m17 instanceof java.lang.Integer)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "openFlag is null.");
            i17 = 1;
        } else {
            i17 = ((java.lang.Integer) m17).intValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "openFlag is %d.", java.lang.Integer.valueOf(i17));
        return i17 == 1;
    }

    public final boolean b(qk.o oVar) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
            return false;
        }
        if (!a()) {
            return false;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBizAttrSyncFreq", -1);
        if (b17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
            b17 = 3600;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = oVar.field_incrementUpdateTime;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b17), oVar.field_attrSyncVersion);
        return currentTimeMillis - j17 >= ((long) b17) * 1000;
    }

    public boolean c(java.lang.String str, r01.c cVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(f368041a, str) && java.lang.System.currentTimeMillis() - f368042b < 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is just delete.");
            return false;
        }
        qk.o b17 = r01.q3.cj().b1(str);
        if (!b(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
            return false;
        }
        if (str.equals("gh_f0a92aa7146c")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "username == ContactStorageLogic.SPUSER_WXPAY_COLLECTION，go NetScene Plugin");
            gm0.j1.n().f273288b.g(new r01.k3(new r01.b(this, str)));
        }
        gm0.j1.n().f273288b.g(new r01.d3(str, b17.field_attrSyncVersion, new r01.a(this, str, new java.lang.ref.WeakReference(cVar), b17)));
        return true;
    }
}
