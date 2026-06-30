package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class fk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jk f199058d;

    public fk(com.tencent.mm.ui.chatting.component.jk jkVar) {
        this.f199058d = jkVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.jk jkVar = this.f199058d;
        if (jkVar.f199308v) {
            return;
        }
        jkVar.f199308v = true;
        jkVar.f199299m = -1L;
        yb5.d dVar = jkVar.f198580d;
        if (dVar != null) {
            dVar.J();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SearchComponent", "dismiss fts highlight");
    }
}
