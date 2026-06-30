package tz4;

/* loaded from: classes10.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423375d;

    public p(tz4.l lVar) {
        this.f423375d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f423375d;
        if (lVar.f423360f.get() != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) lVar.f423360f.get());
            noteEditorUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onClickTakePhotoBtn");
            noteEditorUI.J1.B(-1, false, true);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider h17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.h(4);
            h17.f155685w = 15000;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            h17.f155677o = uICustomParam;
            ut3.m.f431182a.c(noteEditorUI, 4098, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, h17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
