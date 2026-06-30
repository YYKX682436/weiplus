package tz4;

/* loaded from: classes10.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423378d;

    public s(tz4.l lVar) {
        this.f423378d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f423378d;
        if (lVar.f423360f.get() != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) lVar.f423360f.get());
            noteEditorUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onClickFileBtn");
            noteEditorUI.J1.B(-1, false, true);
            if (fp.i.b()) {
                android.content.Intent intent = new android.content.Intent(noteEditorUI, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.class);
                intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                intent.putExtra("INTENT_MAX_SELECT_COUNT", 1);
                if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new com.tencent.mm.plugin.wenote.ui.nativenote.z1(noteEditorUI, noteEditorUI, intent))) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(4100);
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.k(noteEditorUI, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onClickFileBtn", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            } else {
                db5.t7.k(noteEditorUI, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
