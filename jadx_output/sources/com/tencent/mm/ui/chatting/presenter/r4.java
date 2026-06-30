package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y4 f202445g;

    public r4(com.tencent.mm.ui.chatting.presenter.y4 y4Var, java.lang.String str, java.util.Map map, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202445g = y4Var;
        this.f202442d = str;
        this.f202443e = map;
        this.f202444f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.y4 y4Var = this.f202445g;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202444f;
        try {
            if (y4Var.f202565s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).d1(y4Var.f202542e, this.f202442d);
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
                        this.f202443e.put(java.lang.Long.valueOf(f9Var.getMsgId()), f9Var);
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
