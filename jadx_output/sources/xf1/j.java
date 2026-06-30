package xf1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xf1.j f454241d = new xf1.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D(), "wxacache");
        com.tencent.mm.vfs.w6.u(r6Var.o());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "unzip");
        com.tencent.mm.vfs.w6.u(r6Var2.o());
        return r6Var2;
    }
}
