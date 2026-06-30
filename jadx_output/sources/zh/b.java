package zh;

/* loaded from: classes12.dex */
public final class b implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final zh.b f472844a = new zh.b();

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File pathname) {
        kotlin.jvm.internal.o.f(pathname, "pathname");
        return java.util.regex.Pattern.matches("cpu[0-9]+", pathname.getName());
    }
}
