package eg4;

/* loaded from: classes4.dex */
public final class h2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.ib f252724d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f252725e;

    public h2(com.tencent.mm.storage.ib msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f252724d = msg;
        this.f252725e = str;
    }

    @Override // in5.c
    public long getItemId() {
        long j17 = this.f252724d.field_msgSvrId;
        if (j17 > 0) {
            return j17;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = eg4.c2.f252685a;
        return eg4.c2.f252685a.decrementAndGet();
    }

    @Override // in5.c
    public int h() {
        eg4.e2 e2Var = eg4.f2.f252703e;
        return 2;
    }

    public /* synthetic */ h2(com.tencent.mm.storage.ib ibVar, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(ibVar, (i17 & 2) != 0 ? null : str);
    }
}
