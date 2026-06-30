package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210948d;

    public zb(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210948d = showVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowVideoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210948d;
        if (showVideoUI.f210236x != null) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(showVideoUI, showVideoUI.f210236x, 2, 2, 4, new java.util.HashMap());
        }
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ri(showVideoUI, showVideoUI.f210236x, 2, "pic_video_close");
        showVideoUI.Z6();
        yj0.a.h(this, "com/tencent/mm/ui/tools/ShowVideoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
