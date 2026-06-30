package m11;

/* loaded from: classes12.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f322719a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322720b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f322721c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f322722d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f322723e;

    public j0(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, long j17, long j18) {
        this.f322722d = r0;
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f322723e = atomicLong;
        this.f322719a = str2;
        this.f322720b = str;
        this.f322721c = strArr;
        long[] jArr = {j17, j18};
        atomicLong.set(j17);
    }
}
