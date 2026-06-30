package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.h2 f195066d;

    public k2(com.tencent.mm.storage.h2 h2Var) {
        this.f195066d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.h2 h2Var = this.f195066d;
        h2Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int count = h2Var.getCount();
        if (count > 2000) {
            h2Var.f194993d.A("BizTimeLineSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100));
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(count));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData count: %d", java.lang.Integer.valueOf(count));
        }
        h2Var.f194996g = false;
    }
}
