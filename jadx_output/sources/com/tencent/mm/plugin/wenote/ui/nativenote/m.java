package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f188238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f188239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188240i;

    public m(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, java.lang.String str, int i17, java.lang.String str2, long j17, r45.bq0 bq0Var) {
        this.f188240i = noteEditorUI;
        this.f188235d = str;
        this.f188236e = i17;
        this.f188237f = str2;
        this.f188238g = j17;
        this.f188239h = bq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "updateWNNoteFavitem");
        this.f188240i.A7(this.f188235d, false, false, this.f188236e, this.f188237f, this.f188238g, this.f188239h);
    }
}
