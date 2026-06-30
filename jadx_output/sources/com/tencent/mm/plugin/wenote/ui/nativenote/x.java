package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188307e;

    public x(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, boolean z17) {
        this.f188307e = noteEditorUI;
        this.f188306d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f188307e.R) {
            this.f188307e.t7();
            this.f188307e.f188158v = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "postToMainThread,isInitDataList = true,canDismissLoadingDialog :%B,mHasFreshedDataByHtml:%B", java.lang.Boolean.valueOf(this.f188306d), java.lang.Boolean.valueOf(this.f188307e.Q));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f188307e.V1;
            if (u3Var != null && this.f188306d) {
                u3Var.dismiss();
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.wenote.ui.nativenote.w(this));
        }
    }
}
