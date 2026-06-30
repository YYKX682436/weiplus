package rw2;

/* loaded from: classes10.dex */
public final class k extends kp4.a {

    /* renamed from: n, reason: collision with root package name */
    public final dk4.a f400614n;

    public k(dk4.a mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        this.f400614n = mediaInfo;
        this.f311074d = 0L;
        long j17 = mediaInfo.f234470g;
        this.f311075e = j17;
        this.f311076f = ((float) (j17 - 0)) / 1000.0f;
    }

    @Override // kp4.a
    public long a() {
        dk4.a aVar = this.f400614n;
        return aVar.f234477n + aVar.f234478o;
    }

    @Override // kp4.a
    public float b() {
        return 1.0f;
    }

    @Override // kp4.a
    public long c() {
        return this.f400614n.f234477n;
    }

    @Override // kp4.a
    public long d() {
        return this.f400614n.f234470g;
    }

    @Override // kp4.a
    public boolean e() {
        java.lang.String path = this.f400614n.f234483t;
        kotlin.jvm.internal.o.f(path, "path");
        return path.length() == 0;
    }
}
