package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.h2 f195040d;

    public j2(com.tencent.mm.storage.h2 h2Var) {
        this.f195040d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.h2 h2Var = this.f195040d;
        int count = h2Var.getCount();
        if (count > 0) {
            int i17 = h2Var.f194995f;
            h2Var.f194995f = i17 - 1;
            if (i17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable start");
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable end ret=%b", java.lang.Boolean.valueOf(h2Var.f194993d.A("BizTimeLineSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100))));
                ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.storage.j2(h2Var), 10L, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable count: %d", java.lang.Integer.valueOf(count));
    }
}
