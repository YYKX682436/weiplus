package jk4;

/* loaded from: classes10.dex */
public final class f extends dk4.a {
    public final java.util.ArrayList A;
    public int B;

    /* renamed from: y, reason: collision with root package name */
    public float f300155y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f300156z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String mediaId, java.lang.String path, java.lang.String url, int i17, int i18) {
        super(mediaId, path, url, i17, i18);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(url, "url");
        this.f300155y = 1.0f;
        this.A = new java.util.ArrayList();
    }

    public final boolean a() {
        return this.A.contains(1);
    }
}
