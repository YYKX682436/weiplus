package ub4;

/* loaded from: classes4.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI f426199d;

    public u(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        this.f426199d = snsAlbumUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this.f426199d;
        android.content.Intent intent = new android.content.Intent(snsAlbumUI.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsUserUI.class);
        int i17 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.f167760t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.String str = snsAlbumUI.f167765h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        intent.putExtra("sns_rpt_scene", 21);
        intent.putExtra("sns_userName", com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.l0(snsAlbumUI));
        androidx.fragment.app.FragmentActivity activity = snsAlbumUI.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$4");
    }
}
