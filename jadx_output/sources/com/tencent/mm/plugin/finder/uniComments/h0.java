package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        super(0);
        this.f130254d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130254d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(o0Var.f130322d);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491936ep3));
        u1Var.a(true);
        u1Var.l(com.tencent.mm.plugin.finder.uniComments.g0.f130248a);
        u1Var.q(false);
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = o0Var.f130330o;
        if (a2Var != null) {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer e17 = a2Var.e();
            yz5.a aVar = e17.interceptClose;
            if (!(aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false)) {
                e17.h();
            }
        }
        return jz5.f0.f302826a;
    }
}
