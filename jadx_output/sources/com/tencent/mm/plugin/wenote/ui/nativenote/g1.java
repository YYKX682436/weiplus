package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f188207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188208e;

    public g1(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, android.graphics.Bitmap bitmap) {
        this.f188208e = noteEditorUI;
        this.f188207d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        ((yb0.g) b0Var).Ni(this.f188208e, new com.tencent.mm.plugin.wenote.ui.nativenote.e1(this), new com.tencent.mm.plugin.wenote.ui.nativenote.f1(this));
    }
}
