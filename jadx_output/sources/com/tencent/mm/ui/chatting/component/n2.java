package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class n2 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.o2 f199530d;

    public n2(com.tencent.mm.ui.chatting.component.o2 o2Var) {
        this.f199530d = o2Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        java.lang.String str2;
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        str2 = "";
        objArr[2] = str == null ? "" : str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f343223a) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "revokeRecord errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        com.tencent.mm.ui.chatting.component.o2 o2Var = this.f199530d;
        android.app.ProgressDialog progressDialog = o2Var.f199618i.f199738g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        java.util.LinkedList linkedList = o2Var.f199615f;
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ";");
        if (this.f343223a == 0) {
            o2Var.f199618i.w0(o2Var.f199613d, 4, o2Var.f199614e, linkedList.size(), linkedList.size(), 2, c17);
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.ui.chatting.component.q2 q2Var = o2Var.f199618i;
        if (K0) {
            str = q2Var.f198580d.g().getString(com.tencent.mm.R.string.igq);
        }
        if (fVar != null) {
            java.lang.String str3 = fVar.f343224b;
            str2 = str3 != null ? str3 : "";
            str = fVar.f343225c;
            java.lang.String string = q2Var.f198580d.g().getString(com.tencent.mm.R.string.igq);
            if (str == null) {
                str = string;
            }
        }
        db5.e1.y(q2Var.f198580d.g(), str, str2, q2Var.f198580d.g().getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.chatting.component.m2(this));
        o2Var.f199618i.w0(o2Var.f199613d, 4, o2Var.f199614e, linkedList.size(), linkedList.size(), 3, c17);
    }
}
