package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.o1 f188267e;

    public s1(com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var, boolean z17) {
        this.f188267e = o1Var;
        this.f188266d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f188266d;
        com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var = this.f188267e;
        if (z17) {
            o1Var.f188247d.f188244d.f188147m.a();
            o1Var.f188247d.f188244d.k7();
            o1Var.f188247d.f188244d.f188167z1 = true;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = o1Var.f188247d.f188244d;
        if (noteEditorUI.E || noteEditorUI.G) {
            noteEditorUI.E = false;
            noteEditorUI.G = false;
            noteEditorUI.F = true;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.r1(this, noteEditorUI.G7(true)));
    }
}
