package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        super(0);
        this.f130297d = q3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130297d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(q3Var.f130367d);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491936ep3));
        u1Var.a(true);
        u1Var.l(com.tencent.mm.plugin.finder.uniComments.k3.f130286a);
        u1Var.q(false);
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = q3Var.f130373m;
        if (a5Var != null) {
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer h17 = a5Var.h();
            yz5.a aVar = h17.interceptClose;
            if (!(aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false)) {
                h17.u();
            }
        }
        return jz5.f0.f302826a;
    }
}
