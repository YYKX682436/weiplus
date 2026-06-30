package vn4;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final vn4.f f438440a = new vn4.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f438441b;

    static {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("hpRevert"));
        if (!r6Var.m()) {
            r6Var.J();
        }
        f438441b = r6Var;
    }

    public final boolean a(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var != null && r6Var.m() && r6Var.h() && r6Var.A() && r6Var.C() > 0;
    }
}
