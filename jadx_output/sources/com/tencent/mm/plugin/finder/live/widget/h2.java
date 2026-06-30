package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i2 f118507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.finder.live.widget.i2 i2Var) {
        super(2);
        this.f118507d = i2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((cp0.n) obj, "<anonymous parameter 0>");
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLivePostCoverWidget", "setCover: onTaskEnd, resource:" + bitmap);
        if (bitmap != null) {
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
            com.tencent.mm.plugin.finder.live.widget.i2 i2Var = this.f118507d;
            finderMedia.setUrl(i2Var.f118622m);
            finderMedia.setMediaType(9);
            finderMedia.setThumbUrl(i2Var.f118622m);
            finderMedia.setVideoDuration(0);
            finderMedia.setWidth(bitmap.getWidth());
            finderMedia.setHeight(bitmap.getHeight());
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(byteArrayOutputStream.toByteArray());
                if (b17 == null) {
                    b17 = "";
                }
                finderMedia.setMd5sum(b17);
            } catch (java.lang.Throwable unused) {
                finderMedia.setMd5sum("");
            }
            finderMedia.setCoverUrl(i2Var.f118622m);
            i2Var.f118623n = finderMedia;
        }
        return jz5.f0.f302826a;
    }
}
