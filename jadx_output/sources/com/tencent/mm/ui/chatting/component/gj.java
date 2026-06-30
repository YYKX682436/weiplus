package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class gj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.hj f199107d;

    public gj(com.tencent.mm.ui.chatting.component.hj hjVar) {
        this.f199107d = hjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 item;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || k17.get() == null || !(k17.get() instanceof com.tencent.mm.ui.chatting.ChattingUI)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("RedPacketPreviewComponent", "show preview");
        com.tencent.mm.ui.chatting.component.hj hjVar = this.f199107d;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) hjVar.f199170e.f198580d.f460717l.z0();
        if (kVar.getCount() == 0 || (item = kVar.getItem(0)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.e4.d0(hjVar.f199170e.f198580d, item);
    }
}
