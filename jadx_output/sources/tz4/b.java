package tz4;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.i f423338d;

    public b(tz4.i iVar) {
        this.f423338d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolBarAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.i iVar = this.f423338d;
        if (iVar.f423346f.get() != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) iVar.f423346f.get());
            noteEditorUI.getClass();
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
            if (hVar != null) {
                java.lang.String h17 = hVar.h();
                hz4.i iVar2 = hVar.f286418i;
                java.lang.String a17 = iVar2.a(h17);
                boolean g17 = hVar.g();
                com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
                favoriteNoteClickReportStruct.f56344d = 19;
                favoriteNoteClickReportStruct.f56346f = favoriteNoteClickReportStruct.b("noteid", a17, true);
                favoriteNoteClickReportStruct.f56347g = g17 ? 1 : 0;
                favoriteNoteClickReportStruct.f56345e = favoriteNoteClickReportStruct.b("sessionID", iVar2.f286425a, true);
                favoriteNoteClickReportStruct.k();
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                    java.lang.String n17 = favoriteNoteClickReportStruct.n();
                    kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
                }
            }
            boolean z17 = !noteEditorUI.l7(oz4.f.class);
            oz4.f fVar = oz4.w.f350316b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            mz4.j0 j0Var = noteEditorUI.f188147m;
            if (j0Var != null) {
                j0Var.g(fVar, valueOf);
            }
            noteEditorUI.z7(true, 50L);
            noteEditorUI.y7(1, 0L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolBarAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
