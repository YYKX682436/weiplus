package y01;

/* loaded from: classes9.dex */
public final class c extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f458586b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f458587c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f458588d;

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : bArr);
    }

    public c(java.lang.String imageKey, java.lang.String tempCachePath, byte[] bArr) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(tempCachePath, "tempCachePath");
        this.f458586b = imageKey;
        this.f458587c = tempCachePath;
        this.f458588d = bArr;
    }
}
