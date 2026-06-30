package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f151793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.lang.String str, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView) {
        super(2);
        this.f151792d = str;
        this.f151793e = mMRoundCornerImageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n vieweWakHolder = (cp0.n) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(vieweWakHolder, "vieweWakHolder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadBitmap finished:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(',');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append("], url:");
        sb6.append(this.f151792d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", sb6.toString());
        if (bitmap != null) {
            this.f151793e.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
