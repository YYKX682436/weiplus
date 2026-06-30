package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rp implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.e f205471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.sp f205472e;

    public rp(com.tencent.mm.ui.chatting.viewitems.sp spVar, zf4.e eVar) {
        this.f205472e = spVar;
        this.f205471d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f205471d);
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.ui.chatting.viewitems.sp spVar = this.f205472e;
        e17.q(331, spVar.f205537d.f205628f.f205724t);
        com.tencent.mm.ui.chatting.viewitems.up upVar = spVar.f205537d.f205628f;
        upVar.f205724t = null;
        android.app.ProgressDialog progressDialog = upVar.f205725u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
