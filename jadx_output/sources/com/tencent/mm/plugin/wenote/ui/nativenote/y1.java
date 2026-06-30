package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188314d;

    public y1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188314d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById = this.f188314d.O1.findViewById(com.tencent.mm.R.id.f487617p71);
        findViewById.setFocusable(true);
        findViewById.setFocusableInTouchMode(true);
        findViewById.sendAccessibilityEvent(128);
    }
}
