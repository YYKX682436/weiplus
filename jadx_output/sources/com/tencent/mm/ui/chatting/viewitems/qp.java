package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qp implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.sp f205387d;

    public qp(com.tencent.mm.ui.chatting.viewitems.sp spVar) {
        this.f205387d = spVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.ui.chatting.viewitems.sp spVar = this.f205387d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String j17 = spVar.f205537d.f205626d.j();
            if ((j17 != null ? ot0.q.v(j17) : null) != null) {
                com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(spVar.f205537d.f205626d.getMsgId(), spVar.f205537d.f205626d.Q0());
                if (J0 != null) {
                    boolean h17 = com.tencent.mm.vfs.w6.h(J0.field_fileFullPath);
                    boolean delete = com.tencent.mm.pluginsdk.model.app.u5.wi().delete(J0, "msgInfoId");
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h17);
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(delete);
                    java.lang.Long valueOf3 = java.lang.Long.valueOf(J0.field_msgInfoId);
                    java.lang.String str2 = J0.field_mediaSvrId;
                    java.lang.String str3 = J0.field_fileFullPath;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", valueOf, valueOf2, valueOf3, str2, str3, new com.tencent.mm.sdk.platformtools.z3());
                }
            }
            c01.w9.f(spVar.f205537d.f205626d.getMsgId(), spVar.f205537d.f205626d.Q0());
            dp.a.makeText(spVar.f205537d.f205628f.f205723s.g(), spVar.f205537d.f205628f.f205723s.s().getString(com.tencent.mm.R.string.b3f), 0).show();
        }
        c01.d9.e().q(331, spVar.f205537d.f205628f.f205724t);
        com.tencent.mm.ui.chatting.viewitems.up upVar = spVar.f205537d.f205628f;
        upVar.f205724t = null;
        android.app.ProgressDialog progressDialog = upVar.f205725u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
