package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188188d;

    public c2(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188188d = noteEditorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        int i17 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188188d;
        tz4.l lVar = noteEditorUI.f188153q;
        if (lVar == null || !lVar.f423359e) {
            z17 = true;
        } else {
            noteEditorUI.w7();
            z17 = false;
        }
        if (!z17) {
            return true;
        }
        noteEditorUI.g7();
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "back btn click, bReadEnd=%b", java.lang.Boolean.valueOf(noteEditorUI.I1));
        com.tencent.mm.plugin.wenote.multitask.e eVar = noteEditorUI.G1;
        if (eVar != null) {
            if (eVar.c0(1, noteEditorUI.J1.r(noteEditorUI.getString(com.tencent.mm.R.string.l_l)), noteEditorUI.I1)) {
                return true;
            }
        }
        cz4.f fVar = noteEditorUI.F1;
        if (fVar != null && fVar.m0(1)) {
            return true;
        }
        noteEditorUI.m7(1);
        noteEditorUI.finish();
        return true;
    }
}
