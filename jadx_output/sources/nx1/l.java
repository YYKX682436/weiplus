package nx1;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f341296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx1.n f341298f;

    public l(nx1.n nVar, int i17, java.lang.String str) {
        this.f341298f = nVar;
        this.f341296d = i17;
        this.f341297e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nx1.n nVar = this.f341298f;
        boolean z17 = nVar.f341314q;
        int i17 = this.f341296d;
        if (z17 || i17 == -50006) {
            nx1.o oVar = nVar.f341309i;
            ix1.i iVar = nVar.f341310m;
            com.tencent.mm.plugin.component.editor.o1 o1Var = (com.tencent.mm.plugin.component.editor.o1) oVar;
            o1Var.getClass();
            ix1.m mVar = (ix1.m) iVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "compressNoteVideo onImportFinish");
            java.lang.String str = this.f341297e;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str) && mVar != null) {
                mVar.f295346s = str;
                nx1.d q17 = nx1.d.q();
                com.tencent.mm.plugin.component.editor.EditorUI editorUI = o1Var.f96618a;
                q17.r(mVar, editorUI.f96503m.c(), true, true, false, true, false);
                editorUI.k7(true, 100L);
                editorUI.j7(1, 0L);
            }
        } else {
            nx1.o oVar2 = nVar.f341309i;
            ix1.i iVar2 = nVar.f341310m;
            com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = ((com.tencent.mm.plugin.component.editor.o1) oVar2).f96618a;
            if (i17 == -50002) {
                editorUI2.f7();
            } else if (i17 == -50008) {
                editorUI2.f7();
            }
        }
        if (nVar.f341314q || i17 != -50006) {
            gm0.j1.e().k(new nx1.k(this), 80L);
        }
    }
}
