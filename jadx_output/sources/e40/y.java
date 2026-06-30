package e40;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f247628a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f247629b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f247630c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f247631d;

    /* renamed from: e, reason: collision with root package name */
    public final long f247632e;

    public y(java.lang.String fileId, java.lang.String aesKey, java.lang.String downloadPath, java.lang.String str, java.lang.String str2, long j17, int i17, kotlin.jvm.internal.i iVar) {
        str2 = (i17 & 16) != 0 ? null : str2;
        j17 = (i17 & 32) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        this.f247628a = fileId;
        this.f247629b = aesKey;
        this.f247630c = downloadPath;
        this.f247631d = str2;
        this.f247632e = j17;
    }
}
