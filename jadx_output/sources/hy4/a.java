package hy4;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return;
        }
        if (r6Var.y()) {
            for (com.tencent.mm.vfs.r6 r6Var2 : r6Var.G()) {
                a(r6Var2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ABI64WebViewCompat", "delete isSuccessDelete: %s fileName: %s", java.lang.Boolean.valueOf(r6Var.l()), r6Var.o());
    }
}
