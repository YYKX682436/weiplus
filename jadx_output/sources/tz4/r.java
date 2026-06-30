package tz4;

/* loaded from: classes12.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423377d;

    public r(tz4.l lVar) {
        this.f423377d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f423377d;
        if (lVar.f423360f.get() != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) lVar.f423360f.get());
            noteEditorUI.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(noteEditorUI, "android.permission.RECORD_AUDIO", 80, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
            if (a17) {
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText b17 = noteEditorUI.f188147m.b();
                int height = noteEditorUI.f188150p.getHeight() - noteEditorUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479899ic);
                if (noteEditorUI.O1 == null) {
                    com.tencent.mm.pluginsdk.ui.chat.ib ibVar = new com.tencent.mm.pluginsdk.ui.chat.ib(noteEditorUI.getContext(), false, null);
                    noteEditorUI.O1 = ibVar;
                    ibVar.setIsFromWeNote(true);
                    noteEditorUI.f188150p.addView(noteEditorUI.O1, new android.view.ViewGroup.LayoutParams(-1, height));
                    noteEditorUI.O1.setCallback(new com.tencent.mm.plugin.wenote.ui.nativenote.x1(noteEditorUI, height, b17));
                }
                android.view.ViewGroup.LayoutParams layoutParams = noteEditorUI.O1.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = noteEditorUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479899ic);
                    layoutParams.height = height;
                    noteEditorUI.O1.setLayoutParams(layoutParams);
                }
                noteEditorUI.O1.k(true);
                noteEditorUI.O1.h();
                noteEditorUI.O1.setVisibility(0);
                noteEditorUI.O1.setTranslationY(height);
                noteEditorUI.O1.animate().cancel();
                noteEditorUI.O1.animate().translationY(0.0f).withEndAction(new com.tencent.mm.plugin.wenote.ui.nativenote.y1(noteEditorUI)).start();
                hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
                if (hVar != null) {
                    java.lang.String h17 = hVar.h();
                    hz4.i iVar = hVar.f286418i;
                    java.lang.String a18 = iVar.a(h17);
                    boolean g17 = hVar.g();
                    com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
                    favoriteNoteClickReportStruct.f56344d = 17;
                    favoriteNoteClickReportStruct.f56346f = favoriteNoteClickReportStruct.b("noteid", a18, true);
                    favoriteNoteClickReportStruct.f56347g = g17 ? 1 : 0;
                    favoriteNoteClickReportStruct.f56345e = favoriteNoteClickReportStruct.b("sessionID", iVar.f286425a, true);
                    favoriteNoteClickReportStruct.k();
                    if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                        java.lang.String n17 = favoriteNoteClickReportStruct.n();
                        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
