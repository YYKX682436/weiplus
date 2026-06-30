package tz4;

/* loaded from: classes10.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz4.l f423374d;

    public o(tz4.l lVar) {
        this.f423374d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tz4.l lVar = this.f423374d;
        if (lVar.f423360f.get() != null) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((tz4.k) lVar.f423360f.get());
            noteEditorUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onClickAlbumBtn");
            noteEditorUI.J1.B(-1, false, true);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", 9);
            intent.putExtra("query_source_type", 13);
            intent.putExtra("query_media_type", 3);
            intent.putExtra("show_header_view", true);
            intent.putExtra("send_btn_string", noteEditorUI.getString(com.tencent.mm.R.string.c__));
            com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
            if (sightParams == null) {
                sightParams = new com.tencent.mm.plugin.mmsight.SightParams(4, 0);
            }
            java.lang.String str = "micromsg_" + java.lang.System.currentTimeMillis();
            java.lang.String str2 = lp0.b.m() + str + ".mp4";
            java.lang.String str3 = lp0.b.m() + str + ".jpeg";
            int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
            com.tencent.mm.plugin.mmsight.SightParams sightParams2 = new com.tencent.mm.plugin.mmsight.SightParams(4, 1);
            sightParams2.f148818e = 2;
            sightParams2.f148817d = 0;
            if (sightParams2.f148819f == null) {
                sightParams2.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
            }
            sightParams2.f148819f.f71195h = intExtra;
            sightParams2.a(str, str2, str3, q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
            intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
            intent.putExtra("record_video_force_sys_camera", false);
            intent.putExtra("record_video_is_sight_capture", true);
            intent.addFlags(67108864);
            intent.putExtra("key_can_select_video_and_pic", true);
            intent.putExtra("record_video_time_limit", 15000);
            j45.l.n(noteEditorUI, "gallery", ".ui.GalleryEntryUI", intent, 4097);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
