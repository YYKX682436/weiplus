package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f207902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f207903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.e8 f207904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(r45.br2 br2Var, yb5.d dVar, com.tencent.mm.ui.conversation.e8 e8Var) {
        super(1);
        this.f207902d = br2Var;
        this.f207903e = dVar;
        this.f207904f = e8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.ce0 ce0Var;
        r45.ce0 ce0Var2;
        r45.ea1 ea1Var = (r45.ea1) obj;
        java.lang.String str2 = null;
        if ((ea1Var != null ? (r45.y23) ea1Var.getCustom(1) : null) != null) {
            r45.y23 y23Var = (r45.y23) ea1Var.getCustom(1);
            if (y23Var != null && (ce0Var2 = (r45.ce0) y23Var.getCustom(9)) != null) {
                str2 = ce0Var2.getString(2);
            }
            r45.br2 br2Var = this.f207902d;
            br2Var.set(12, str2);
            r45.y23 y23Var2 = (r45.y23) ea1Var.getCustom(1);
            if (y23Var2 == null || (ce0Var = (r45.ce0) y23Var2.getCustom(9)) == null || (str = ce0Var.getString(3)) == null) {
                str = "";
            }
            br2Var.set(13, str);
            ot0.q qVar = new ot0.q();
            qVar.f348666i = 82;
            zy2.l lVar = new zy2.l();
            lVar.f477449b = br2Var;
            qVar.f(lVar);
            qVar.f348666i = 82;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            ((ez.w0) ot0.j1.a()).wi(qVar, "", "", this.f207903e.x(), "", null, false);
        } else {
            com.tencent.mm.ui.conversation.e8 e8Var = this.f207904f;
            db5.t7.g(e8Var.f207650a.g(), e8Var.f207650a.g().getResources().getString(com.tencent.mm.R.string.f493408k22));
        }
        return jz5.f0.f302826a;
    }
}
