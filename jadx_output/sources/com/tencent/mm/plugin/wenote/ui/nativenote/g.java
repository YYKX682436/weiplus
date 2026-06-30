package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188205d;

    public g(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188205d = noteEditorUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mOnGlobalLayoutComplaintListener scrollRange:");
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188205d;
        sb6.append(noteEditorUI.f188148n.computeVerticalScrollRange());
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", sb6.toString());
        if (noteEditorUI.f188157u != null) {
            if (noteEditorUI.f188148n.computeVerticalScrollRange() + noteEditorUI.f188157u.getMeasuredHeight() <= noteEditorUI.f188148n.getMeasuredHeight()) {
                noteEditorUI.f188157u.setVisibility(0);
                return;
            }
            rz4.b bVar = noteEditorUI.f188149o;
            bVar.f401821h = true;
            bVar.notifyDataSetChanged();
            noteEditorUI.f188157u.setVisibility(8);
            noteEditorUI.f188148n.getViewTreeObserver().removeOnGlobalLayoutListener(noteEditorUI.Q1);
        }
    }
}
