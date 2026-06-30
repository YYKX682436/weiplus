package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188201d;

    public f(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188201d = noteEditorUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188201d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, onGlobalLayout, current time is %d,from oncreate to dataloading, cost %d", valueOf, java.lang.Long.valueOf(currentTimeMillis - noteEditorUI.f188152p1));
        gm0.j1.e().k(new com.tencent.mm.plugin.wenote.ui.nativenote.e(this), noteEditorUI.f188164y0 == 1 ? 100L : 0L);
        noteEditorUI.f188148n.getViewTreeObserver().removeGlobalOnLayoutListener(noteEditorUI.P1);
    }
}
