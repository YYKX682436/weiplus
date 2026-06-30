package ia1;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f289895d = {l75.n0.getCreateSQLs(ia1.a.D, "WxagGameInfo")};

    public b(l75.k0 k0Var) {
        super(k0Var, ia1.a.D, "WxagGameInfo", null);
        if (k0Var != null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MiniGameInfoStorage", "storage can not work!!!");
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        add("MicroMsg.MiniGameInfoStorage.WORKER", q0Var);
    }
}
