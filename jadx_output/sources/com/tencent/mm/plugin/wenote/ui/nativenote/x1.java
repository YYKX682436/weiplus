package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class x1 implements com.tencent.mm.pluginsdk.ui.chat.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f188310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188311c;

    public x1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, int i17, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        this.f188311c = noteEditorUI;
        this.f188309a = i17;
        this.f188310b = wXRTEditText;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void a() {
        float f17 = this.f188309a;
        int i17 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
        this.f188311c.h7(f17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void b(java.lang.String str) {
        this.f188310b.requestFocus();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188311c;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText b17 = noteEditorUI.f188147m.b();
        if (b17 != null) {
            b17.getEditableText().insert(b17.getSelectionEnd(), str);
        }
        noteEditorUI.O1.n();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.gb
    public void c(boolean z17) {
    }
}
