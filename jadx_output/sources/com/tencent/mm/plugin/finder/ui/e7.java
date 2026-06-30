package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class e7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        super(2);
        this.f129094d = finderImagePreviewUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n imageView = (cp0.n) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (bitmap != null) {
            this.f129094d.G = bitmap;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.ui.d7(imageView, bitmap));
        }
        return jz5.f0.f302826a;
    }
}
