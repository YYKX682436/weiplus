package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class de extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, android.graphics.Bitmap bitmap, r45.mb4 mb4Var) {
        super(0);
        this.f129068d = finderSelectCoverUI;
        this.f129069e = bitmap;
        this.f129070f = mb4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f129069e;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129068d;
        finderSelectCoverUI.q7(width, height);
        cw2.aa i76 = finderSelectCoverUI.i7();
        android.view.View view = i76 != null ? i76.getView() : null;
        android.widget.ImageView imageView = view instanceof android.widget.ImageView ? (android.widget.ImageView) view : null;
        if (imageView == null) {
            imageView = new android.widget.ImageView(finderSelectCoverUI.getContext());
        }
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = finderSelectCoverUI.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout.G(imageView, bitmap.getWidth(), bitmap.getHeight(), new android.graphics.Matrix(), ml5.k.f328430d, com.tencent.mm.plugin.finder.ui.be.f128948d);
        finderSelectCoverUI.p7();
        imageView.setImageBitmap(bitmap);
        r45.mb4 mb4Var = this.f129070f;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.d7(finderSelectCoverUI, mb4Var.getBoolean(13), (r45.dd4) mb4Var.getCustom(14), bitmap);
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = finderSelectCoverUI.f128678u;
        if (cropLayout2 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout2.post(new com.tencent.mm.plugin.finder.ui.ce(finderSelectCoverUI, bitmap));
        android.view.View view2 = finderSelectCoverUI.G;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("selectBtn");
            throw null;
        }
        view2.setEnabled(true);
        android.view.View view3 = finderSelectCoverUI.N;
        if (view3 != null) {
            view3.setEnabled(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("previewBtn");
        throw null;
    }
}
