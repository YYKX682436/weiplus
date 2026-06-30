package jm3;

/* loaded from: classes10.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300295d;

    public a1(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI) {
        this.f300295d = musicMvPostUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI = this.f300295d;
        r45.ss4 ss4Var = musicMvPostUI.f150883e;
        if ((ss4Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0)) == null || (objectDesc = finderObject.getObjectDesc()) == null || (mvInfo = objectDesc.getMvInfo()) == null || mvInfo.getInteger(6) != 1) ? false : true) {
            musicMvPostUI.getClass();
            android.content.Intent intent = new android.content.Intent(musicMvPostUI, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI.class);
            r45.ss4 ss4Var2 = musicMvPostUI.f150883e;
            intent.putExtra("key_track_data", ss4Var2 != null ? ss4Var2.toByteArray() : null);
            intent.putExtra("key_seek_to_start", true);
            intent.putExtra("key_mv_from_scene", 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(musicMvPostUI, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFlexPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            musicMvPostUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(musicMvPostUI, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFlexPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            musicMvPostUI.getClass();
            android.content.Intent intent2 = new android.content.Intent(musicMvPostUI, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI.class);
            r45.ss4 ss4Var3 = musicMvPostUI.f150883e;
            intent2.putExtra("key_track_data", ss4Var3 != null ? ss4Var3.toByteArray() : null);
            intent2.putExtra("key_seek_to_start", true);
            pm0.v.g(intent2, musicMvPostUI.getIntent(), "key_mv_from_scene", 0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(musicMvPostUI, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFixPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            musicMvPostUI.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(musicMvPostUI, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFixPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
