package vw3;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f441036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f441036d = r6Var;
        this.f441037e = repairerFileListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("repairer_temp_zip");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r6 r6Var = this.f441036d;
        sb6.append(r6Var.getName());
        sb6.append(".zip");
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(h07, sb6.toString());
        if (r6Var2.m()) {
            r6Var2.l();
        }
        boolean T = com.tencent.mm.vfs.w6.T(r6Var.o(), r6Var2.o());
        android.content.Context context = this.f441037e;
        if (T) {
            pm0.v.X(new vw3.l0(context));
            ex3.c cVar = ex3.c.f257206a;
            java.lang.String o17 = r6Var2.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            cVar.a(context, o17);
        } else {
            pm0.v.X(new vw3.m0(context));
        }
        return jz5.f0.f302826a;
    }
}
