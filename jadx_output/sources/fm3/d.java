package fm3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final fm3.c f264035f = new fm3.c(null);

    /* renamed from: g, reason: collision with root package name */
    public static int f264036g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264037a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264038b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264039c;

    /* renamed from: d, reason: collision with root package name */
    public final long f264040d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f264041e;

    public d(java.lang.String name, int i17, int i18, long j17, java.lang.String thumbPath, int i19, kotlin.jvm.internal.i iVar) {
        thumbPath = (i19 & 16) != 0 ? "" : thumbPath;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        this.f264037a = name;
        this.f264038b = i17;
        this.f264039c = i18;
        this.f264040d = j17;
        this.f264041e = thumbPath;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_default_video/");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(new com.tencent.mm.vfs.r6(sb6.toString(), this.f264037a).o(), false);
        return i17 == null ? "" : i17;
    }
}
