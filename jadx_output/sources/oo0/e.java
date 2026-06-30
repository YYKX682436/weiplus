package oo0;

/* loaded from: classes8.dex */
public class e extends l75.n0 implements oo0.c {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f347118f = {l75.n0.getCreateSQLs(oo0.d.f347117z, "LiveTipsBar")};

    /* renamed from: g, reason: collision with root package name */
    public static oo0.e f347119g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f347120d;

    /* renamed from: e, reason: collision with root package name */
    public oo0.b f347121e;

    public e(l75.k0 k0Var) {
        super(k0Var, oo0.d.f347117z, "LiveTipsBar", null);
        this.f347120d = k0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.lang.System.currentTimeMillis();
        k0Var.A("LiveTipsBar", "CREATE INDEX IF NOT EXISTS HostRoom ON LiveTipsBar ( hostRoomId )");
        java.lang.System.currentTimeMillis();
        k0Var.w(java.lang.Long.valueOf(F));
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTipsBarStorage", "executeInitSQL last time[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public java.util.LinkedList D0(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f347120d.B("SELECT * FROM LiveTipsBar WHERE hostRoomId = '" + str + "' ORDER BY timeStamp", null);
        if (B == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveTipsBarStorage", "getTipsBarDataByHostRoomId failed, hostRoomId:%s", str);
            return linkedList;
        }
        while (B.moveToNext()) {
            oo0.d dVar = new oo0.d();
            dVar.convertFrom(B);
            linkedList.add(dVar);
        }
        B.close();
        return linkedList;
    }

    public boolean y0() {
        boolean A = this.f347120d.A("LiveTipsBar", "delete from LiveTipsBar");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTipsBarStorage", "deleteAllData, result:%b", java.lang.Boolean.valueOf(A));
        return A;
    }

    public void z0(long j17) {
        oo0.b bVar;
        l75.k0 k0Var = this.f347120d;
        java.lang.String str = null;
        android.database.Cursor B = k0Var.B("SELECT * FROM LiveTipsBar WHERE liveId = '" + j17 + "'", null);
        if (B != null) {
            if (B.moveToFirst()) {
                oo0.d dVar = new oo0.d();
                dVar.convertFrom(B);
                str = dVar.field_hostRoomId;
            }
            B.close();
        }
        int delete = k0Var.delete("LiveTipsBar", "liveId= ? ", new java.lang.String[]{"" + j17});
        if (delete < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveTipsBarStorage", "deleteByLiveId failed, result:%d", java.lang.Integer.valueOf(delete));
        } else {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(j17);
            objArr[1] = str != null ? str : "";
            objArr[2] = java.lang.Boolean.valueOf(this.f347121e == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTipsBarStorage", "deleteByLiveId success, liveId:%d, hostRoomId:%s, liveTipsBarNotify null:%b", objArr);
        }
        if (str == null || (bVar = this.f347121e) == null) {
            return;
        }
        ((com.tencent.mm.ui.q9) bVar).a(str);
    }
}
