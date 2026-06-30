package vz5;

/* loaded from: classes14.dex */
public final class h extends vz5.k {

    /* renamed from: b, reason: collision with root package name */
    public boolean f441789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vz5.j jVar, java.io.File rootFile) {
        super(rootFile);
        kotlin.jvm.internal.o.g(rootFile, "rootFile");
    }

    @Override // vz5.k
    public java.io.File a() {
        if (this.f441789b) {
            return null;
        }
        this.f441789b = true;
        return this.f441796a;
    }
}
