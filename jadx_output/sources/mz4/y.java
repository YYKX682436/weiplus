package mz4;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.a0 f333357d;

    public y(mz4.a0 a0Var) {
        this.f333357d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mz4.a0 a0Var = this.f333357d;
        a0Var.f333220a.dismiss();
        android.view.View view2 = a0Var.f333221b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mz4.z zVar = a0Var.f333222c;
        if (zVar != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) zVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onOperateWindowPaste %s", java.lang.Long.valueOf(noteEditorUI.A));
            hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
            if (hVar != null) {
                java.lang.String h17 = hVar.h();
                hz4.i iVar = hVar.f286418i;
                java.lang.String a17 = iVar.a(h17);
                boolean g17 = hVar.g();
                com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
                favoriteNoteClickReportStruct.f56344d = 32;
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
            int c17 = mz4.u.c(noteEditorUI.getContext());
            if (c17 == 2) {
                java.util.ArrayList arrayList3 = nz4.e.f341601a.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f341600b;
                if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList3)) {
                    noteEditorUI.o7(arrayList3);
                } else if (mz4.u.d(noteEditorUI)) {
                    noteEditorUI.v7();
                } else {
                    mz4.d dVar = noteEditorUI.J1;
                    dVar.getClass();
                    com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$k(dVar, z17));
                    mz4.u.a();
                    iz4.i iVar2 = new iz4.i();
                    iVar2.f296155t = "";
                    iVar2.f296104b = false;
                    iVar2.f296110h = false;
                    iVar2.f296105c = 0;
                    iVar2.f296112j = true;
                    dVar.b(iVar2, false);
                    noteEditorUI.t7();
                }
            } else if (c17 == 3) {
                noteEditorUI.o7(mz4.u.b());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
