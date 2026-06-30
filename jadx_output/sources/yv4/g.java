package yv4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, yv4.k kVar) {
        super(0);
        this.f466222d = str;
        this.f466223e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String path = this.f466222d;
        kotlin.jvm.internal.o.g(path, "path");
        if (com.tencent.mm.sdk.platformtools.y1.g(path)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            path = m11.b1.Di().P0(path);
            kotlin.jvm.internal.o.d(path);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "setImage >> ".concat(path));
        boolean j17 = com.tencent.mm.vfs.w6.j(path);
        yv4.k kVar = this.f466223e;
        if (j17 && !r26.i0.n(path, ".temp", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "setImage >> is set");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(path, options);
            if (d17 != null) {
                d17.recycle();
            }
            int a17 = com.tencent.mm.sdk.platformtools.l.a(path);
            kVar.U6().setVisibility(0);
            kVar.U6().setOrientation(a17);
            com.tencent.mm.ui.base.WxImageView U6 = kVar.U6();
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            U6.f68219h = i17;
            U6.f68220i = i18;
            kVar.U6().i();
            kVar.U6().t(path, com.davemorrissey.labs.subscaleview.view.ImageSource.uri(path));
        } else if (r26.i0.n(path, ".temp", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "path: " + path + " is error");
            kVar.U6().setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "path: " + path + " is no exist");
            kVar.U6().setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
