package s01;

/* loaded from: classes11.dex */
public class d0 extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f401857g = {l75.n0.getCreateSQLs(s01.a0.F, "BizChatUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f401858d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f401859e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.v0 f401860f;

    public d0(l75.k0 k0Var) {
        super(k0Var, s01.a0.F, "BizChatUserInfo", null);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f401858d = hashMap;
        this.f401860f = new s01.b0(this);
        this.f401859e = k0Var;
        k0Var.A("BizChatUserInfo", "CREATE INDEX IF NOT EXISTS bizUserIdIndex ON BizChatUserInfo ( userId )");
        hashMap.clear();
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(s01.a0 a0Var) {
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(a0Var);
        if (insert) {
            s01.c0 c0Var = new s01.c0();
            l75.v0 v0Var = this.f401860f;
            v0Var.d(c0Var);
            v0Var.c();
        }
        return insert;
    }

    public boolean J0(s01.a0 a0Var) {
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatUserInfoStorage", "update wrong argument");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_userName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "dealWithChatNamePY null");
        } else {
            a0Var.field_userNamePY = x51.k.a(a0Var.field_userName);
        }
        boolean replace = super.replace(a0Var);
        if (replace) {
            s01.c0 c0Var = new s01.c0();
            l75.v0 v0Var = this.f401860f;
            v0Var.d(c0Var);
            v0Var.c();
        }
        return replace;
    }

    public s01.a0 y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatUserInfoStorage", "get  wrong argument");
            return null;
        }
        s01.a0 a0Var = new s01.a0();
        a0Var.field_userId = str;
        super.get(a0Var, new java.lang.String[0]);
        return a0Var;
    }

    public java.lang.String z0(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId brandUserName is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserId:%s", str);
        java.util.Map map = this.f401858d;
        if (((java.util.HashMap) map).containsKey(str) && ((java.util.HashMap) map).get(str) != null) {
            return (java.lang.String) ((java.util.HashMap) map).get(str);
        }
        s01.s z07 = r01.q3.Di().z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo == null brandUserName:%s", str);
            return null;
        }
        ((java.util.HashMap) map).put(str, z07.field_userId);
        return z07.field_userId;
    }
}
