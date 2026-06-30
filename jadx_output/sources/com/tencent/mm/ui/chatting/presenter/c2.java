package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l2 f202141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f202144g;

    public c2(com.tencent.mm.ui.chatting.presenter.l2 l2Var, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f202141d = l2Var;
        this.f202142e = str;
        this.f202143f = countDownLatch;
        this.f202144g = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202141d;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202143f;
        try {
            if (l2Var.f202324s.get()) {
                return;
            }
            android.database.Cursor d17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).d1(l2Var.f202542e, this.f202142e);
            if (d17 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f202144g;
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
                        concurrentHashMap.put(java.lang.Long.valueOf(f9Var.getMsgId()), f9Var);
                    } finally {
                    }
                }
                vz5.b.a(d17, null);
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
