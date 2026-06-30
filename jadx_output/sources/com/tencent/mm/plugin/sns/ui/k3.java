package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o3 f169607d;

    public k3(com.tencent.mm.plugin.sns.ui.o3 o3Var) {
        this.f169607d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f169607d;
        if (com.tencent.mm.plugin.sns.ui.o3.d(o3Var) != null) {
            com.tencent.mm.plugin.sns.ui.d0 d0Var = (com.tencent.mm.plugin.sns.ui.d0) com.tencent.mm.plugin.sns.ui.o3.d(o3Var);
            d0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI = d0Var.f168149a;
            r45.jj4 cntMedia = artistBrowseUI.f166810o.getCntMedia();
            if (cntMedia == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            } else {
                m21.w.d(723);
                if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), cntMedia.f377855d) + ca4.z0.J(cntMedia))) {
                    com.tencent.mm.plugin.sns.model.l4.Nj().p(cntMedia);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(artistBrowseUI, com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.class);
                    intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.addFlags(67108864);
                    com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI2 = d0Var.f168149a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(artistBrowseUI2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    artistBrowseUI2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(artistBrowseUI2, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    artistBrowseUI.finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
    }
}
