package rm5;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f397529a;

    /* renamed from: b, reason: collision with root package name */
    public uq5.y f397530b;

    /* renamed from: c, reason: collision with root package name */
    public long f397531c;

    public n(java.lang.String path, uq5.y yVar, long j17, int i17, kotlin.jvm.internal.i iVar) {
        path = (i17 & 1) != 0 ? "" : path;
        yVar = (i17 & 2) != 0 ? null : yVar;
        j17 = (i17 & 4) != 0 ? 1000L : j17;
        kotlin.jvm.internal.o.g(path, "path");
        this.f397529a = path;
        this.f397530b = yVar;
        this.f397531c = j17;
    }

    public final boolean a() {
        return this.f397529a.length() > 0;
    }
}
