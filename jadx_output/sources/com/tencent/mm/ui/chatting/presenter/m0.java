package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z0 f202337g;

    public m0(com.tencent.mm.ui.chatting.presenter.z0 z0Var, java.lang.String str, java.util.Map map, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202337g = z0Var;
        this.f202334d = str;
        this.f202335e = map;
        this.f202336f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = this.f202337g;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202336f;
        try {
            if (z0Var.f202572s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).d1(z0Var.f202542e, this.f202334d);
            if (d17 != null) {
                while (d17.moveToNext()) {
                    try {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.setMsgId(d17.getLong(0));
                        f9Var.setType(d17.getInt(1));
                        f9Var.e1(d17.getLong(2));
                        f9Var.u1(d17.getString(3));
                        f9Var.d1(d17.getString(4));
                        f9Var.j1(d17.getInt(5));
                        f9Var.p1(d17.getString(6));
                        f9Var.f1(d17.getInt(7));
                        f9Var.r1(d17.getInt(8));
                        this.f202335e.put(java.lang.Long.valueOf(f9Var.getMsgId()), f9Var);
                    } catch (java.lang.Throwable th6) {
                        d17.close();
                        throw th6;
                    }
                }
                d17.close();
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
