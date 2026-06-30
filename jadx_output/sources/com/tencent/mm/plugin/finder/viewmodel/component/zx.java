package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class zx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.tx f136722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f136724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(com.tencent.mm.plugin.finder.viewmodel.component.tx txVar, android.content.Context context, int i17) {
        super(0);
        this.f136722d = txVar;
        this.f136723e = context;
        this.f136724f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[goVerify] ");
        com.tencent.mm.plugin.finder.viewmodel.component.tx txVar = this.f136722d;
        sb6.append(txVar);
        sb6.append(" 视频号=");
        g92.b bVar = g92.b.f269769e;
        sb6.append(bVar.T0());
        com.tencent.mars.xlog.Log.i("Finder.PublishSecurityCheck", sb6.toString());
        kotlin.jvm.internal.m0.c(com.tencent.mm.plugin.finder.viewmodel.component.dy.f134173b).remove(txVar.f136063a);
        boolean S3 = com.tencent.mm.storage.z3.S3(txVar.f136063a);
        android.content.Context context = this.f136723e;
        int i17 = this.f136724f;
        if (S3) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            android.content.res.Resources resources = context.getResources();
            java.lang.String string = i17 == 1 ? resources.getString(com.tencent.mm.R.string.le8) : resources.getString(com.tencent.mm.R.string.le9);
            kotlin.jvm.internal.o.d(string);
            u1Var.g(string);
            u1Var.a(true);
            u1Var.n(context.getString(com.tencent.mm.R.string.le_));
            u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
            u1Var.l(new com.tencent.mm.plugin.finder.viewmodel.component.yx(txVar, context));
            u1Var.q(false);
        } else {
            if (bVar.T0().length() > 0) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(context);
                android.content.res.Resources resources2 = context.getResources();
                java.lang.String string2 = i17 == 1 ? resources2.getString(com.tencent.mm.R.string.le8) : resources2.getString(com.tencent.mm.R.string.le9);
                kotlin.jvm.internal.o.d(string2);
                u1Var2.g(string2);
                u1Var2.a(true);
                u1Var2.n(context.getString(com.tencent.mm.R.string.le_));
                u1Var2.j(context.getString(com.tencent.mm.R.string.f490347sg));
                u1Var2.l(new com.tencent.mm.plugin.finder.viewmodel.component.vx(txVar, context));
                u1Var2.q(false);
            } else {
                java.lang.String string3 = context.getString(i17 == 1 ? com.tencent.mm.R.string.f491335le3 : com.tencent.mm.R.string.f491336le4);
                kotlin.jvm.internal.o.d(string3);
                com.tencent.mm.plugin.finder.assist.p1.f102448a.a(context, context.getString(com.tencent.mm.R.string.crv), string3, context.getString(com.tencent.mm.R.string.crr), context.getString(com.tencent.mm.R.string.crl), new com.tencent.mm.plugin.finder.viewmodel.component.wx(context), com.tencent.mm.plugin.finder.viewmodel.component.xx.f136502d, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
