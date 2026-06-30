package ep5;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f255764a;

    /* renamed from: b, reason: collision with root package name */
    public int f255765b;

    /* renamed from: c, reason: collision with root package name */
    public int f255766c;

    /* renamed from: d, reason: collision with root package name */
    public long f255767d;

    /* renamed from: e, reason: collision with root package name */
    public long f255768e;

    public a(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f255764a = tag;
    }

    public final boolean a(int i17) {
        boolean H0 = ((jp5.o) i95.n0.c(jp5.o.class)).H0();
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isCameraPause:" + ((jp5.o) i95.n0.c(jp5.o.class)).H0());
        if (H0) {
            this.f255767d = java.lang.System.currentTimeMillis();
            return false;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f255767d) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isBlackRender:" + this.f255768e + ", " + longValue + ", " + this.f255767d);
        return longValue >= ((long) i17) && this.f255767d != 0;
    }

    public final boolean b(int i17) {
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f255767d) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "isRenderFailed:" + this.f255768e + ", " + longValue + ", " + this.f255767d);
        if (this.f255768e != 0) {
            return longValue >= ((long) i17) && this.f255767d != 0;
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep5.a) && kotlin.jvm.internal.o.b(this.f255764a, ((ep5.a) obj).f255764a);
    }

    public int hashCode() {
        return this.f255764a.hashCode();
    }

    public java.lang.String toString() {
        return "TraceInfo(tag=" + this.f255764a + ')';
    }
}
