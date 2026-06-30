package gg3;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271727b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f271728c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f271729d;

    /* renamed from: e, reason: collision with root package name */
    public final long f271730e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f271731f;

    public c(java.lang.String id6, java.lang.String thumbPath, java.lang.String filePath, java.lang.String originFileName, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(originFileName, "originFileName");
        this.f271726a = id6;
        this.f271727b = thumbPath;
        this.f271728c = filePath;
        this.f271729d = originFileName;
        this.f271730e = j17;
        this.f271731f = z17;
    }

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) == 0 ? str4 : "", (i17 & 16) != 0 ? 0L : j17, (i17 & 32) != 0 ? false : z17);
    }
}
