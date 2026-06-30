package jh3;

/* loaded from: classes11.dex */
public class n extends ih3.q implements tg3.i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f299830d = new java.util.concurrent.ConcurrentHashMap();

    public static boolean f(long j17) {
        return ((jh3.m) ((java.util.concurrent.ConcurrentHashMap) f299830d).get(java.lang.Long.valueOf(j17))) != null;
    }

    public static void i(long j17, int i17) {
        jh3.m mVar = (jh3.m) ((java.util.concurrent.ConcurrentHashMap) f299830d).get(java.lang.Long.valueOf(j17));
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(msgId:%s action:%s)", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        } else {
            k(mVar, i17);
        }
    }

    public static void k(jh3.m mVar, int i17) {
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(action:%s)", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.OpenimDimissionSucceedStruct openimDimissionSucceedStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenimDimissionSucceedStruct();
        openimDimissionSucceedStruct.f59815d = openimDimissionSucceedStruct.b("ResignationWorkUsername", mVar.f299825a, true);
        openimDimissionSucceedStruct.f59816e = openimDimissionSucceedStruct.b("TakeOverWorkUsername", mVar.f299826b, true);
        openimDimissionSucceedStruct.f59817f = openimDimissionSucceedStruct.b("WorkEnterpriseDescId", mVar.f299827c, true);
        openimDimissionSucceedStruct.f59818g = openimDimissionSucceedStruct.b("WorkEnterpriseName", mVar.f299828d, true);
        openimDimissionSucceedStruct.f59819h = openimDimissionSucceedStruct.b("SessionId", mVar.f299829e, true);
        openimDimissionSucceedStruct.f59820i = i17;
        openimDimissionSucceedStruct.k();
    }

    @Override // tg3.i1
    public void Ra(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        h(str, map, p0Var);
    }

    @Override // ih3.q
    public void c(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String b17 = b(map, "new_link_succeed_contact");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onClickLinkImp head is null.");
            return;
        }
        long j17 = bundle.getLong("msg_id");
        jh3.m mVar = (jh3.m) ((java.util.concurrent.ConcurrentHashMap) f299830d).get(java.lang.Long.valueOf(j17));
        if (mVar == null) {
            mVar = l(j17, map, b17);
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "link_profile")) {
            k(mVar, 2);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "new_link_succeed_contact")) {
            k(mVar, 5);
        }
    }

    public void h(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j4Var.f377568r);
        java.lang.String b17 = b(map, "new_link_succeed_contact");
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onReceivedImp head is null.(%s %s)", g17, java.lang.Long.valueOf(o27.I0()));
        } else {
            k(l(o27.getMsgId(), map, b17), 1);
        }
    }

    public jh3.m l(long j17, java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".origin_username");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".heir_username");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".succeed_ticket");
        java.lang.String str5 = str4 != null ? str4 : "";
        jh3.m mVar = new jh3.m();
        mVar.f299825a = str2;
        mVar.f299826b = str3;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        mVar.f299827c = n17.G0();
        mVar.f299828d = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        mVar.f299829e = str5;
        ((java.util.concurrent.ConcurrentHashMap) f299830d).put(java.lang.Long.valueOf(j17), mVar);
        return mVar;
    }

    @Override // ih3.q, tg3.i1
    public void qf(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super.qf(str, map, bundle, weakReference, weakReference2);
    }
}
