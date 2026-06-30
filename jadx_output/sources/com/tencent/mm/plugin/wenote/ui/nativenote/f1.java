package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.g1 f188203d;

    public f1(com.tencent.mm.plugin.wenote.ui.nativenote.g1 g1Var) {
        this.f188203d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "save image fail, no sdcard privilege.");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14811, 0, 0, 0, 1, java.lang.Integer.valueOf(this.f188203d.f188208e.f188162x1 ? 1 : 0));
    }
}
