package s01;

/* loaded from: classes11.dex */
public class v extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f401929f = {l75.n0.getCreateSQLs(s01.s.f401928p, "BizChatMyUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f401930d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f401931e;

    public v(l75.k0 k0Var) {
        super(k0Var, s01.s.f401928p, "BizChatMyUserInfo", null);
        this.f401931e = new s01.t(this);
        this.f401930d = k0Var;
        k0Var.A("BizChatMyUserInfo", "CREATE INDEX IF NOT EXISTS bizChatbrandUserNameIndex ON BizChatMyUserInfo ( brandUserName )");
    }

    public boolean D0(s01.s sVar) {
        if (sVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(sVar);
        if (insert) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f401931e;
            v0Var.d(uVar);
            v0Var.c();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert fail");
        }
        return insert;
    }

    public boolean J0(s01.s sVar) {
        if (sVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "update wrong argument");
            return false;
        }
        boolean replace = super.replace(sVar);
        if (replace) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f401931e;
            v0Var.d(uVar);
            v0Var.c();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update fail");
        }
        return replace;
    }

    @Override // l75.n0
    public int getCount() {
        android.database.Cursor f17 = this.f401930d.f("SELECT COUNT(*) FROM BizChatMyUserInfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public boolean y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "delete wrong argument");
            return false;
        }
        s01.s sVar = new s01.s();
        sVar.field_brandUserName = str;
        boolean delete = super.delete(sVar, "brandUserName");
        if (delete) {
            s01.u uVar = new s01.u();
            l75.v0 v0Var = this.f401931e;
            v0Var.d(uVar);
            v0Var.c();
        }
        return delete;
    }

    public s01.s z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMyUserInfoStorage", "get： wrong argument");
            return null;
        }
        s01.s sVar = new s01.s();
        sVar.field_brandUserName = str;
        super.get(sVar, new java.lang.String[0]);
        return sVar;
    }
}
