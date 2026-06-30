package qv;

@j95.b
/* loaded from: classes.dex */
public class o extends i95.w implements rv.u2 {
    public boolean Ai(java.lang.String str) {
        qk.o b17 = r01.z.b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizInfoStorageLogicService", "bizInfo is null");
            return false;
        }
        qk.n D0 = b17.D0(false);
        if (D0 != null && D0.e() != null && D0.e().a()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BizInfoStorageLogicService", "this is not hardware biz");
        return false;
    }

    public boolean Bi(java.lang.String str) {
        qk.n D0;
        qk.f e17;
        qk.o b17 = r01.z.b(str);
        return (b17 == null || (D0 = b17.D0(false)) == null || (e17 = D0.e()) == null || !e17.a() || e17.f364101c != 1) ? false : true;
    }

    public boolean wi(java.lang.String str) {
        return r01.z.g(str);
    }
}
