package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class yj implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f200327e;

    public yj(com.tencent.mm.ui.chatting.component.ck ckVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.modelbase.i iVar) {
        this.f200326d = f9Var;
        this.f200327e = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "cancel revoke msg:%s", java.lang.Long.valueOf(this.f200326d.I0()));
        this.f200327e.j();
    }
}
