package e1;

/* loaded from: classes14.dex */
public abstract class o0 {
    public static void a(e1.p0 p0Var, e1.p0 path, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i17 & 2) != 0) {
            int i18 = d1.e.f225626e;
            j17 = d1.e.f225623b;
        }
        e1.i iVar = (e1.i) p0Var;
        iVar.getClass();
        kotlin.jvm.internal.o.g(path, "path");
        if (!(path instanceof e1.i)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        iVar.f246263a.addPath(((e1.i) path).f246263a, d1.e.c(j17), d1.e.d(j17));
    }
}
