package vd2;

/* loaded from: classes10.dex */
public final class g2 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vd2.g2 f435735d = new vd2.g2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        boolean z17;
        long j17;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what != vd2.j2.f435775d) {
            return true;
        }
        vd2.j2 j2Var = vd2.j2.f435772a;
        java.lang.Object obj = it.obj;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.storage.MsgInfo>");
        java.util.LinkedList<com.tencent.mm.storage.f9> linkedList = (java.util.LinkedList) obj;
        if (!vd2.j2.f435777f || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "refreshLiveInfo isPageFocus:" + vd2.j2.f435777f + ",data size:" + linkedList.size() + '!');
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.mm.storage.f9 f9Var : linkedList) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
            java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
            long Z = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            long Z2 = pm0.v.Z(str2);
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.control_flag");
            if (str3 == null) {
                str3 = "";
            }
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str3, 0);
            boolean z19 = pm0.v.z(D1, 64);
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
            java.lang.String str5 = str4 != null ? str4 : "";
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "refreshLiveInfo liveId:" + Z + ",tipsId:" + str + ",controlFlag:" + D1 + ",msgType:" + str5 + ",need_dynamic_reason:" + z19);
            java.lang.Long l17 = (java.lang.Long) vd2.j2.f435773b.get(str);
            if (l17 != null) {
                long longValue = l17.longValue();
                z17 = z19;
                j17 = longValue;
            } else {
                z17 = z19;
                j17 = 0;
            }
            if (Z != 0) {
                if (!(str == null || str.length() == 0) && c01.id.e() > j17) {
                    hashMap.put(java.lang.Long.valueOf(Z), f9Var);
                    r45.m71 m71Var = new r45.m71();
                    m71Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(str5, 0)));
                    m71Var.set(1, java.lang.Integer.valueOf((int) z17));
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    vd2.h2 h2Var = new vd2.h2(Z, str, hashMap, z17, f9Var, Z2);
                    qs5.d dVar = qs5.d.f366426e;
                    s40.w0.u9((s40.w0) c17, Z, false, null, h2Var, 5, null, null, m71Var, 96, null);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyRefreshManager", "liveId:" + Z + ",tipsId:" + str + " is not allow to refresh, next time stamp:" + j17);
        }
        return true;
    }
}
