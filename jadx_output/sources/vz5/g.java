package vz5;

/* loaded from: classes14.dex */
public final class g extends vz5.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f441784b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.File[] f441785c;

    /* renamed from: d, reason: collision with root package name */
    public int f441786d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz5.j f441788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vz5.j jVar, java.io.File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        this.f441788f = jVar;
    }

    @Override // vz5.k
    public java.io.File a() {
        boolean z17 = this.f441787e;
        java.io.File file = this.f441796a;
        vz5.j jVar = this.f441788f;
        if (!z17 && this.f441785c == null) {
            jVar.f441795g.getClass();
            java.io.File[] listFiles = file.listFiles();
            this.f441785c = listFiles;
            if (listFiles == null) {
                jVar.f441795g.getClass();
                this.f441787e = true;
            }
        }
        java.io.File[] fileArr = this.f441785c;
        if (fileArr != null) {
            int i17 = this.f441786d;
            kotlin.jvm.internal.o.d(fileArr);
            if (i17 < fileArr.length) {
                java.io.File[] fileArr2 = this.f441785c;
                kotlin.jvm.internal.o.d(fileArr2);
                int i18 = this.f441786d;
                this.f441786d = i18 + 1;
                return fileArr2[i18];
            }
        }
        if (this.f441784b) {
            jVar.f441795g.getClass();
            return null;
        }
        this.f441784b = true;
        return file;
    }
}
