package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f188230g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f188231h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI f188232i;

    public l(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, java.lang.String str, int i17, java.lang.String str2, long j17, r45.bq0 bq0Var) {
        this.f188232i = noteEditorUI;
        this.f188227d = str;
        this.f188228e = i17;
        this.f188229f = str2;
        this.f188230g = j17;
        this.f188231h = bq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "saveWNNoteFavitem");
        this.f188232i.A7(this.f188227d, true, false, this.f188228e, this.f188229f, this.f188230g, this.f188231h);
    }
}
