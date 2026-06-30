package x5;

/* loaded from: classes14.dex */
public final class h implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f451947a;

    public h(boolean z17) {
        this.f451947a = z17;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        java.io.File data = (java.io.File) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        java.io.File file = (java.io.File) obj;
        x36.m b17 = x36.v.b(x36.v.e(file));
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        java.lang.String name = file.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        return new x5.n(b17, singleton.getMimeTypeFromExtension(r26.n0.o0(name, '.', "")), v5.d.DISK);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        java.io.File data = (java.io.File) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (!this.f451947a) {
            java.lang.String path = data.getPath();
            kotlin.jvm.internal.o.f(path, "data.path");
            return path;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) data.getPath());
        sb6.append(':');
        sb6.append(data.lastModified());
        return sb6.toString();
    }
}
