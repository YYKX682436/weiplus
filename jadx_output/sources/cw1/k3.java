package cw1;

/* loaded from: classes12.dex */
public class k3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f223084d;

    public k3(cw1.j3 j3Var) {
        this.f223084d = j3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        cw1.j3 j3Var = this.f223084d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d, count=%d", valueOf, java.lang.Integer.valueOf(j3Var.getCount()));
        if (i17 < 0 || i17 >= j3Var.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        bw1.l item = j3Var.getItem(i17);
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), pt0.f0.Li(item.f24813e, item.f24814f).G, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        int i18 = item.f24810b;
        if (i18 == 1) {
            intent.putExtra("key_title", j3Var.f223025e.getString(com.tencent.mm.R.string.a_4));
            intent.putExtra("show_menu", false);
            intent.putExtra("key_image_path", com.tencent.mm.vfs.w6.j(item.f24812d) ? item.f24812d : item.f24811c);
            j45.l.u(j3Var.f223025e, ".ui.tools.ShowImageUI", intent, null);
        } else if (i18 == 3) {
            intent.putExtra("img_gallery_msg_id", item.f24814f).putExtra("img_gallery_talker", item.f24813e).putExtra("img_gallery_enter_from_chatting_ui", false).putExtra("msg_type", 0).putExtra("show_enter_grid", false);
            j45.l.u(j3Var.f223025e, ".ui.chatting.gallery.ImageGalleryUI", intent, null);
        } else if (i18 == 4) {
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 18);
            intent.putExtra("app_msg_id", item.f24814f);
            intent.putExtra("msg_talker", item.f24813e);
            j45.l.u(j3Var.f223025e, ".ui.chatting.AppAttachNewDownloadUI", intent, null);
        } else if (i18 == 5) {
            intent.putExtra("message_id", item.f24814f);
            intent.putExtra("message_talker", item.f24813e);
            intent.putExtra("record_xml", item.f24818j);
            intent.putExtra("record_show_share", false);
            intent.putExtra("from_scene", 2);
            j45.l.j(j3Var.f223025e, "record", ".ui.RecordMsgDetailUI", intent, null);
        } else if (i18 == 6) {
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
            am.sn snVar = openNoteFromSessionEvent.f54599g;
            snVar.f7906c = j3Var.f223025e;
            snVar.f7904a = item.f24814f;
            snVar.f7909f = item.f24813e;
            snVar.f7907d = false;
            snVar.f7910g = 6;
            snVar.f7905b = item.f24818j;
            openNoteFromSessionEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
