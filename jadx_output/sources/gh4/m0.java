package gh4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f271939a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f271940b;

    static {
        gh4.m0 m0Var = new gh4.m0();
        java.lang.String str = m0Var.a() + "coverimg/";
        f271939a = str;
        java.lang.String str2 = com.tencent.mm.vfs.q7.c("taskbar") + "/coverimg/";
        f271940b = str2;
        if (!com.tencent.mm.vfs.w6.j(m0Var.a())) {
            com.tencent.mm.vfs.w6.u(m0Var.a());
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        if (com.tencent.mm.vfs.w6.j(str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(str2);
    }

    public final java.lang.String a() {
        return gm0.j1.u().d() + "taskbar/";
    }
}
