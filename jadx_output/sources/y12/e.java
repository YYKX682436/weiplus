package y12;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static y12.e f458856c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f458857a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f458858b = java.util.regex.Pattern.compile("_\\d");

    public static y12.e b() {
        if (f458856c == null) {
            synchronized (y12.e.class) {
                f458856c = new y12.e();
            }
        }
        return f458856c;
    }

    public void a(java.lang.String str) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null || G.length <= 0) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.y()) {
                a(r6Var2.u());
            } else {
                r6Var2.getName();
                r6Var2.l();
            }
        }
    }

    public void c(java.lang.String str) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null || G.length <= 0) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (!this.f458857a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
                return;
            }
            if (r6Var2.y()) {
                c(r6Var2.u());
            } else {
                java.lang.String name = r6Var2.getName();
                if (this.f458858b.matcher(name).find() || name.startsWith("temp")) {
                    r6Var2.l();
                }
            }
        }
    }
}
