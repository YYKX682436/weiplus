package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188234d;

    public l1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI) {
        this.f188234d = noteEditorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188234d;
        rl5.r rVar = new rl5.r(noteEditorUI.getContext(), menuItem.getActionView());
        rVar.F = true;
        rVar.f397335J = noteEditorUI.getString(com.tencent.mm.R.string.k28);
        rVar.f397355y = new com.tencent.mm.plugin.wenote.ui.nativenote.y0(this);
        rVar.f397354x = new com.tencent.mm.plugin.wenote.ui.nativenote.z0(this);
        rVar.m();
        return true;
    }
}
