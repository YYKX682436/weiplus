package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188195d;

    public d2(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188195d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById = this.f188195d.findViewById(com.tencent.mm.R.id.f482482fq);
        if (findViewById != null) {
            findViewById.setTag(com.tencent.mm.R.id.nwn, "1");
        }
    }
}
