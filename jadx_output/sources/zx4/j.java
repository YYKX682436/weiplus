package zx4;

/* loaded from: classes7.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final zx4.k a(java.lang.String path, zx4.e listener) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        return android.os.Build.VERSION.SDK_INT >= 29 ? new zx4.k(new java.io.File(path), listener) : new zx4.k(path, listener);
    }
}
