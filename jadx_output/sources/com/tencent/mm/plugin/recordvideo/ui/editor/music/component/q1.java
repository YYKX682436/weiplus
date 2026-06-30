package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes16.dex */
public final class q1 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j f156307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f156308b;

    public q1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f156307a = jVar;
        this.f156308b = y1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar = this.f156307a;
        if (jVar.f156262b != this.f156308b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicClipDialog", "onDialogDismissed");
        if (jVar.f156272l) {
            yz5.l lVar = jVar.f156269i;
            if (lVar != null) {
                lVar.invoke(null);
            }
            jVar.f156272l = false;
        }
        jVar.f156262b = null;
        jVar.f156266f = null;
        jVar.f156267g = null;
        jVar.f156268h = null;
    }
}
