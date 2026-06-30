package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class n1 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.o1 f199529d;

    public n1(com.tencent.mm.ui.chatting.component.o1 o1Var) {
        this.f199529d = o1Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f343223a) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        int i19 = this.f343223a;
        com.tencent.mm.ui.chatting.component.o1 o1Var = this.f199529d;
        if (i19 == 0) {
            com.tencent.mm.ui.chatting.component.q2 q2Var = o1Var.f199612m;
            q2Var.f199745q = com.tencent.mm.ui.chatting.component.q2.m0(q2Var, o1Var.f199607e, o1Var.f199608f, o1Var.f199610h, o1Var.f199611i, o1Var.f199609g, true);
            return;
        }
        android.app.ProgressDialog progressDialog = o1Var.f199612m.f199739h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.ui.chatting.component.q2 q2Var2 = o1Var.f199612m;
        db5.e1.y(q2Var2.f198580d.g(), q2Var2.f198580d.g().getString(com.tencent.mm.R.string.ign), "", q2Var2.f198580d.g().getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.chatting.component.m1(this));
        if (o1Var.f199609g == 1) {
            q2Var2.w0(o1Var.f199607e, q2Var2.f199744p.intValue(), o1Var.f199608f, o1Var.f199610h.size(), 1, 3, (java.lang.String) o1Var.f199608f.get(0));
        }
    }
}
