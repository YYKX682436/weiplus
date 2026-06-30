package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.b2 f196295d;

    public w1(com.tencent.mm.storage.b2 b2Var) {
        this.f196295d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.b2 b2Var = this.f196295d;
        android.database.Cursor B = b2Var.f193763d.B("SELECT count(*) FROM BizTimeLineInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        if (i17 > 0) {
            int i18 = b2Var.f193765f;
            b2Var.f193765f = i18 - 1;
            if (i18 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable start");
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable end ret=%b", java.lang.Boolean.valueOf(b2Var.f193763d.A("BizTimeLineInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineInfo", "orderFlag", "orderFlag", "BizTimeLineInfo", "orderFlag", 100))));
                ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.storage.w1(b2Var), 10L, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable count: %d", java.lang.Integer.valueOf(i17));
    }
}
