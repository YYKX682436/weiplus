package n35;

/* loaded from: classes4.dex */
public final class b extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final long f334805d;

    /* renamed from: e, reason: collision with root package name */
    public final long f334806e;

    public b(long j17, long j18) {
        super(java.lang.String.format("contentLength: %d, requestRange:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        this.f334805d = j17;
        this.f334806e = j18;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "FileSizeOutOfRangeException{contentLength=" + this.f334805d + ", requestRange=" + this.f334806e + '}';
    }
}
