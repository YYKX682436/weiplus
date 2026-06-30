package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class p1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz4.r f188252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.o1 f188253e;

    public p1(com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var, iz4.r rVar) {
        this.f188253e = o1Var;
        this.f188252d = rVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var = this.f188253e;
        o72.r2 F = oj6.F(o1Var.f188247d.f188244d.A);
        if (F == null || F.field_id == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "favitem with local id = %d is not ready to pin.");
            return;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.b7(o1Var.f188247d.f188244d, this.f188252d);
        gm0.j1.d().q(401, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "pin favitem with favid = %d, after it's inserted to the database.", java.lang.Integer.valueOf(F.field_id));
    }
}
