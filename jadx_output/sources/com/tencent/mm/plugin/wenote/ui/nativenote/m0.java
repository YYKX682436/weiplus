package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class m0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.s f188241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iz4.k f188242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188243f;

    public m0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, mz4.s sVar, iz4.k kVar) {
        this.f188243f = noteEditorUI;
        this.f188241d = sVar;
        this.f188242e = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        mz4.s sVar = this.f188241d;
        sVar.f333348p = true;
        sVar.interrupt();
        this.f188242e.f296120w = true;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = this.f188243f;
        noteEditorUI.z7(true, 100L);
        noteEditorUI.y7(1, 0L);
    }
}
