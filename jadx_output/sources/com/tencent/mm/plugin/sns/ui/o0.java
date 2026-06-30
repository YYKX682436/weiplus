package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.plugin.sns.ui.w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistUI f170062e;

    public o0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        this.f170062e = artistUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.w
    public void a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_gallery_is_artist", true);
        intent.putExtra("sns_gallery_position", i17);
        int i18 = com.tencent.mm.plugin.sns.ui.ArtistUI.f166201r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.tencent.mm.plugin.sns.ui.ArtistUI artistUI = this.f170062e;
        java.lang.String str2 = artistUI.f166205g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        intent.putExtra("sns_gallery_artist_lan", str2);
        intent.putExtra("sns_gallery_showtype", 2);
        intent.putExtra("key_from_scene", 6);
        intent.setClass(artistUI, com.tencent.mm.plugin.sns.ui.ArtistBrowseUI.class);
        com.tencent.mm.plugin.sns.ui.ArtistUI artistUI2 = this.f170062e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(artistUI2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        artistUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(artistUI2, "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
    }
}
