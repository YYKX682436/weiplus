package xi;

/* loaded from: classes12.dex */
public final class f implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f454653a;

    public f(xi.k kVar, long j17) {
        this.f454653a = j17;
    }

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File it) {
        kotlin.jvm.internal.o.g(it, "it");
        return this.f454653a - it.lastModified() > xi.k.f454657a;
    }
}
