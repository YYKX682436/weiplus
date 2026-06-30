package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210936d;

    public z1(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210936d = cropImageNewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210936d.f210002h;
        if (cropImageView.f210012e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
        } else {
            float[] fArr = {r0.getWidth() / 2, cropImageView.f210012e.getHeight() / 2};
            cropImageView.getImageMatrix().mapPoints(fArr);
            cropImageView.getImageMatrix().postRotate(90.0f, fArr[0], fArr[1]);
            cropImageView.setImageBitmap(cropImageView.f210012e);
            cropImageView.invalidate();
            cropImageView.f210030z++;
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
