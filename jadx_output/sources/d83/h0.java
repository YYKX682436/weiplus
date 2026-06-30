package d83;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f226970a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f226971b;

    /* renamed from: c, reason: collision with root package name */
    public long f226972c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f226973d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f226974e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f226975f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f226976g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f226977h;

    /* renamed from: i, reason: collision with root package name */
    public final e70.c0 f226978i;

    public h0(int i17, java.util.concurrent.atomic.AtomicLong lastReceiveTime, long j17, java.util.concurrent.CopyOnWriteArrayList onReceiveListenerList, kotlinx.coroutines.r2 r2Var, yz5.a onRelease, int i18, kotlin.jvm.internal.i iVar) {
        lastReceiveTime = (i18 & 2) != 0 ? new java.util.concurrent.atomic.AtomicLong(0L) : lastReceiveTime;
        j17 = (i18 & 4) != 0 ? 5000L : j17;
        onReceiveListenerList = (i18 & 8) != 0 ? new java.util.concurrent.CopyOnWriteArrayList() : onReceiveListenerList;
        r2Var = (i18 & 16) != 0 ? null : r2Var;
        kotlin.jvm.internal.o.g(lastReceiveTime, "lastReceiveTime");
        kotlin.jvm.internal.o.g(onReceiveListenerList, "onReceiveListenerList");
        kotlin.jvm.internal.o.g(onRelease, "onRelease");
        this.f226970a = i17;
        this.f226971b = lastReceiveTime;
        this.f226972c = j17;
        this.f226973d = onReceiveListenerList;
        this.f226974e = r2Var;
        this.f226975f = onRelease;
        this.f226976g = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.StreamInternal", null, 0, 6, null);
        this.f226978i = new d83.f0(this);
    }

    public final void a(boolean z17) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f226971b;
        if (!z17 || atomicLong.get() == 0) {
            atomicLong.set(java.lang.System.currentTimeMillis());
            kotlinx.coroutines.r2 r2Var = this.f226974e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f226974e = v65.i.b(this.f226976g, null, new d83.g0(this, null), 1, null);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83.h0)) {
            return false;
        }
        d83.h0 h0Var = (d83.h0) obj;
        return this.f226970a == h0Var.f226970a && kotlin.jvm.internal.o.b(this.f226971b, h0Var.f226971b) && this.f226972c == h0Var.f226972c && kotlin.jvm.internal.o.b(this.f226973d, h0Var.f226973d) && kotlin.jvm.internal.o.b(this.f226974e, h0Var.f226974e) && kotlin.jvm.internal.o.b(this.f226975f, h0Var.f226975f);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f226970a) * 31) + this.f226971b.hashCode()) * 31) + java.lang.Long.hashCode(this.f226972c)) * 31) + this.f226973d.hashCode()) * 31;
        kotlinx.coroutines.r2 r2Var = this.f226974e;
        return ((hashCode + (r2Var == null ? 0 : r2Var.hashCode())) * 31) + this.f226975f.hashCode();
    }

    public java.lang.String toString() {
        return "StreamInternal(bizType=" + this.f226970a + ", lastReceiveTime=" + this.f226971b + ", timeout=" + this.f226972c + ", onReceiveListenerList=" + this.f226973d + ", releaseJob=" + this.f226974e + ", onRelease=" + this.f226975f + ')';
    }
}
