package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class de implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f198935d;

    public de(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f198935d = leVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "dialog onCancel");
        com.tencent.mm.ui.chatting.component.le leVar = this.f198935d;
        java.lang.Thread thread = leVar.f199429x;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        leVar.f199429x.interrupt();
    }
}
