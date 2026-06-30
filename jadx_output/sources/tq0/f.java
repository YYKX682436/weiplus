package tq0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f421210a;

    /* renamed from: b, reason: collision with root package name */
    public int f421211b;

    public f(java.lang.String coverPath, int i17, int i18, kotlin.jvm.internal.i iVar) {
        coverPath = (i18 & 1) != 0 ? "" : coverPath;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(coverPath, "coverPath");
        this.f421210a = coverPath;
        this.f421211b = i17;
    }

    public java.lang.String toString() {
        return "MagicSclPlaceHolder( cachedHeight: " + this.f421211b + ", coverPath: " + this.f421210a + " )";
    }
}
