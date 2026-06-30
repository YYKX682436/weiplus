package yw;

/* loaded from: classes11.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.f1 f466317d = new yw.f1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.b2 nj6 = r01.q3.nj();
        com.tencent.mm.storage.s1 b17 = nj6.b1();
        if (b17 == null) {
            return;
        }
        pq5.h.a().q(new com.tencent.mm.storage.v1(nj6, b17.field_orderFlag)).h(new com.tencent.mm.storage.u1(nj6));
    }
}
