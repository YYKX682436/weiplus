package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class q5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f199752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.l5 f199753e;

    public q5(com.tencent.mm.ui.chatting.component.l5 l5Var, java.util.List list) {
        this.f199753e = l5Var;
        this.f199752d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "MENU_ID_SEND_NORMAL to MENU_ID_SEND_RECORD");
        com.tencent.mm.ui.chatting.component.l5.a(this.f199753e, this.f199752d);
    }
}
