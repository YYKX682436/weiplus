package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210451d;

    public h2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210451d = cropImageNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210451d;
        if (com.tencent.mm.ui.tools.CropImageNewUI.T6(cropImageNewUI)) {
            if (cropImageNewUI.f210007p || cropImageNewUI.f210008q || !cropImageNewUI.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
                if (1 == cropImageNewUI.f209998d) {
                    cropImageNewUI.f210000f.b(cropImageNewUI.f210006o, cropImageNewUI.f210005n);
                    cropImageNewUI.f210001g.setVisibility(8);
                    cropImageNewUI.f210000f.setVisibility(0);
                    android.widget.ImageView imageView = cropImageNewUI.f210003i;
                    imageView.setTag(java.lang.Integer.valueOf(imageView.getVisibility()));
                    cropImageNewUI.f210003i.setVisibility(8);
                    cropImageNewUI.f210002h.setVisibility(8);
                    android.view.View findViewById = cropImageNewUI.f210000f.findViewById(com.tencent.mm.R.id.f483991cn3);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            if (cropImageNewUI.f210000f.getFilterBmp() == null) {
                cropImageNewUI.f210000f.b(cropImageNewUI.f210006o, cropImageNewUI.f210005n);
            }
            cropImageNewUI.f210001g.setVisibility(8);
            cropImageNewUI.f210000f.setVisibility(0);
            android.widget.ImageView imageView2 = cropImageNewUI.f210003i;
            imageView2.setTag(java.lang.Integer.valueOf(imageView2.getVisibility()));
            cropImageNewUI.f210003i.setVisibility(8);
            cropImageNewUI.f210002h.setVisibility(8);
            if (cropImageNewUI.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("CropImage_Filter_Show", true)) {
                return;
            }
            android.view.View findViewById2 = cropImageNewUI.f210000f.findViewById(com.tencent.mm.R.id.f483991cn3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
