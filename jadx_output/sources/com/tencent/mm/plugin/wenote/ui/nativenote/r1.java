package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.s1 f188261e;

    public r1(com.tencent.mm.plugin.wenote.ui.nativenote.s1 s1Var, boolean z17) {
        this.f188261e = s1Var;
        this.f188260d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f188260d;
        com.tencent.mm.plugin.wenote.ui.nativenote.s1 s1Var = this.f188261e;
        if (!z17) {
            db5.e1.T(s1Var.f188267e.f188247d.f188244d.getContext(), s1Var.f188267e.f188247d.f188244d.getString(com.tencent.mm.R.string.f489710j));
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "sns uploadSucc false, return");
            return;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 30;
        z9Var.f8540m = 1;
        z9Var.f8532e = s1Var.f188267e.f188247d.f188244d.A;
        favoriteOperationEvent.e();
        am.aa aaVar = favoriteOperationEvent.f54244h;
        java.lang.String str = aaVar.f6136c;
        s1Var.f188267e.f188247d.f188244d.Z = aaVar.f6137d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            s1Var.f188267e.f188247d.f188244d.f188141J.post(new com.tencent.mm.plugin.wenote.ui.nativenote.q1(this));
            return;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.c7(s1Var.f188267e.f188247d.f188244d, str);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = s1Var.f188267e.f188247d.f188244d;
        noteEditorUI.f100600g.f343488m++;
        noteEditorUI.U6(4);
    }
}
