package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class r0 implements java.lang.Runnable {
    public r0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.PopupWindow popupWindow = nz4.y.h().f341660r;
        nz4.y.h().A(popupWindow != null && popupWindow.isShowing());
        android.widget.PopupWindow popupWindow2 = nz4.y.h().f341663u;
        nz4.y.h().C(popupWindow2 != null && popupWindow2.isShowing());
    }
}
