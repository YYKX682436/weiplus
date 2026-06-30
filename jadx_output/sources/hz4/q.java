package hz4;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f286451a;

    public static void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("wenote/");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb6.toString());
        if (r6Var.m() && r6Var.y()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteInit", "record stg dir[%s] not exsit, create it");
        r6Var.J();
    }
}
