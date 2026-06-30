package nz4;

/* loaded from: classes12.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341628d;

    public m(nz4.y yVar) {
        this.f341628d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nz4.y yVar = this.f341628d;
        nz4.h hVar = yVar.f341665w;
        hz4.h hVar2 = ((hz4.f) hz4.f.wi()).f286407d;
        if (hVar2 != null) {
            java.lang.String h17 = hVar2.h();
            hz4.i iVar = hVar2.f286418i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar2.g();
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f56344d = 15;
            favoriteNoteClickReportStruct.f56346f = favoriteNoteClickReportStruct.b("noteid", a17, true);
            favoriteNoteClickReportStruct.f56347g = g17 ? 1 : 0;
            favoriteNoteClickReportStruct.f56345e = favoriteNoteClickReportStruct.b("sessionID", iVar.f286425a, true);
            favoriteNoteClickReportStruct.k();
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                java.lang.String n17 = favoriteNoteClickReportStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
            }
        }
        lz4.a aVar = yVar.f341664v;
        if (aVar != null) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).n7();
        }
        lz4.a aVar2 = yVar.f341664v;
        mz4.d dVar = aVar2 != null ? ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar2).J1 : null;
        if (dVar != null) {
            if (dVar.f333238j) {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$b(dVar));
            } else {
                com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$d(dVar));
            }
            com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$h(dVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
