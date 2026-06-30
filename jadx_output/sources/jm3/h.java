package jm3;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI f300320d;

    public h(com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI musicMvMakerPreviewUI) {
        this.f300320d = musicMvMakerPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI musicMvMakerPreviewUI = this.f300320d;
        android.content.Intent intent = new android.content.Intent(musicMvMakerPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvPostUI.class);
        r45.ss4 ss4Var = musicMvMakerPreviewUI.f150866e;
        if (ss4Var != null) {
            intent.putExtra("key_track_data", ss4Var.toByteArray());
        }
        pm0.v.g(intent, musicMvMakerPreviewUI.getIntent(), "key_mv_from_scene", 0);
        musicMvMakerPreviewUI.f150867f = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(musicMvMakerPreviewUI, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        musicMvMakerPreviewUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(musicMvMakerPreviewUI, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        musicMvMakerPreviewUI.finish();
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
        c17.f59482k = 7L;
        c17.G = 0;
        c17.k();
        c17.o();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
