package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f188190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f188193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188194h;

    public d0(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, android.app.Dialog dialog) {
        this.f188194h = noteEditorUI;
        this.f188190d = f9Var;
        this.f188191e = str;
        this.f188192f = str2;
        this.f188193g = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 4;
        eqVar.f6594l = this.f188190d;
        eqVar.f6588f = this.f188191e;
        eqVar.f6589g = this.f188192f;
        recordOperationEvent.e();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.c0(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult";
    }
}
