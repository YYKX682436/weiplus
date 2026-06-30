package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class l4 implements x51.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r4 f191763d;

    public l4(com.tencent.mm.pluginsdk.ui.tools.r4 r4Var) {
        this.f191763d = r4Var;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.r4 r4Var = this.f191763d;
        r4Var.f191870g.put(str, bitmap);
        android.widget.ImageView imageView = (android.widget.ImageView) r4Var.f191868e.get(str);
        if (imageView != null) {
            r4Var.f191869f.remove(imageView);
            r4Var.f191867d.post(new com.tencent.mm.pluginsdk.ui.tools.k4(this, imageView, bitmap));
        }
        r4Var.f191868e.remove(str);
    }
}
