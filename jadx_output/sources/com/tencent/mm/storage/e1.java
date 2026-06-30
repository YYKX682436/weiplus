package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f1 f193853d;

    public e1(com.tencent.mm.storage.f1 f1Var) {
        this.f193853d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f1 f1Var = this.f193853d;
        f1Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int count = f1Var.getCount();
        if (count > 2000) {
            f1Var.f193909d.A("BizPhotoSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizPhotoSingleMsgInfo", "msgSvrId", "msgSvrId", "BizPhotoSingleMsgInfo", "createTime", 100));
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoSingleMsgStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(count));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoSingleMsgStorage", "deleteTooOldData count: %d", java.lang.Integer.valueOf(count));
        }
        f1Var.f193911f = false;
    }
}
