package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class mj implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f199513e;

    public mj(com.tencent.mm.ui.chatting.component.pj pjVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.modelbase.i iVar) {
        this.f199512d = f9Var;
        this.f199513e = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "cancel revoke msg:%d", java.lang.Long.valueOf(this.f199512d.getMsgId()));
        this.f199513e.j();
    }
}
