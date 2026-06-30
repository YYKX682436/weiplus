package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class me implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f169914d;

    public me(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f169914d = snsBaseGalleryUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = this.f169914d;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
        if (snsInfoFlip == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
            return false;
        }
        r45.jj4 cntMedia = snsInfoFlip.getCntMedia();
        if (cntMedia != null && cntMedia.f377856e == 2) {
            snsBaseGalleryUI.n7(com.tencent.mm.plugin.sns.model.i1.l(snsBaseGalleryUI.f166810o.getCntMedia()), true);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
        return false;
    }
}
