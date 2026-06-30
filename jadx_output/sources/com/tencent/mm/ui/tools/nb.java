package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class nb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210607d;

    public nb(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210607d = showImageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowImageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210607d;
        showImageUI.getClass();
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ri(showImageUI, showImageUI.f210197m, 2, "pic_video_close");
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(showImageUI, showImageUI.f210197m, 2, 2, 4, new java.util.HashMap());
        showImageUI.finish();
        yj0.a.h(this, "com/tencent/mm/ui/tools/ShowImageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
