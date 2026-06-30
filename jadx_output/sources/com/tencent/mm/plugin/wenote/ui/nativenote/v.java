package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188280d;

    public v(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188280d = noteEditorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188280d;
        try {
            noteEditorUI.f188149o.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onNotifyDataChanged error");
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = noteEditorUI.G1;
        if (eVar != null) {
            int i17 = ((hz4.f) hz4.f.wi()).f286407d.f286423q;
            java.lang.String jsonData = ((hz4.f) hz4.f.wi()).f286407d.f286422p;
            java.lang.String title = noteEditorUI.J1.r(noteEditorUI.getString(com.tencent.mm.R.string.l_l));
            kotlin.jvm.internal.o.g(jsonData, "jsonData");
            kotlin.jvm.internal.o.g(title, "title");
            eVar.f188133y = i17;
            eVar.f188134z = jsonData;
            eVar.A = title;
        }
    }
}
