package d51;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f226523a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f226524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f226525c;

    public c(java.lang.String url, java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(path, "path");
        this.f226523a = url;
        this.f226524b = path;
        this.f226525c = z17;
    }

    public java.lang.String toString() {
        return "url:" + this.f226523a + ", path:" + this.f226524b + ", delOnLoadFail:" + this.f226525c;
    }
}
