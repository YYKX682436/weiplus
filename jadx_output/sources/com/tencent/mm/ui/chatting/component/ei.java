package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public final class ei implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f198973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.hi f198975c;

    public ei(com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str, com.tencent.mm.ui.chatting.component.hi hiVar) {
        this.f198973a = u3Var;
        this.f198974b = str;
        this.f198975c = hiVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f198973a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f70616b);
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        java.lang.String str = this.f198974b;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick callback errType:%s, errCode:%s, reqTalkerName:%s rsp:%s", valueOf, valueOf2, str, fVar2);
        int i17 = fVar.f70615a;
        com.tencent.mm.ui.chatting.component.hi hiVar = this.f198975c;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = hiVar.f199168f;
            if (z2Var != null) {
                z2Var.B();
            }
            i41.l lVar = (i41.l) ((j41.c0) i95.n0.c(j41.c0.class));
            lVar.getClass();
            lVar.Bi().delete(new u41.e(str, null), new java.lang.String[0]);
        } else {
            java.lang.String str2 = fVar.f70617c;
            if (!(str2 == null || str2.length() == 0)) {
                yb5.d dVar = hiVar.f198580d;
                db5.e1.y(dVar != null ? dVar.g() : null, fVar.f70617c, "", hiVar.f198580d.g().getString(com.tencent.mm.R.string.f490507x1), null);
            }
        }
        return jz5.f0.f302826a;
    }
}
