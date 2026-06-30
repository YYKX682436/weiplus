package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.h f132127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.view.h hVar) {
        super(1);
        this.f132127d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f132127d.f132196f;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
