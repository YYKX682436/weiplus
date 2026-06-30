package eg4;

/* loaded from: classes4.dex */
public final class i2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.m7 f252732d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f252733e;

    public i2(com.tencent.mm.storage.m7 fMsgConv, java.lang.String str) {
        kotlin.jvm.internal.o.g(fMsgConv, "fMsgConv");
        this.f252732d = fMsgConv;
        this.f252733e = str;
    }

    @Override // in5.c
    public long getItemId() {
        long j17 = this.f252732d.field_fmsgSysRowId;
        if (j17 > 0) {
            return j17;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = eg4.c2.f252685a;
        return eg4.c2.f252685a.decrementAndGet();
    }

    @Override // in5.c
    public int h() {
        eg4.e2 e2Var = eg4.f2.f252703e;
        return 3;
    }

    public /* synthetic */ i2(com.tencent.mm.storage.m7 m7Var, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(m7Var, (i17 & 2) != 0 ? null : str);
    }
}
