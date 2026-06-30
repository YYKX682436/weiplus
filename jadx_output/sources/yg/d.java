package yg;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f462042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f462043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f462044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f462045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, android.graphics.Bitmap bitmap) {
        super(0);
        this.f462042d = magicBrushView;
        this.f462043e = i17;
        this.f462044f = i18;
        this.f462045g = bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            com.tencent.magicbrush.ui.MagicBrushView r0 = r5.f462042d
            gh.r r0 = r0.f48652e
            boolean r1 = r0 instanceof android.view.TextureView
            java.lang.String r1 = "null cannot be cast to non-null type android.view.TextureView"
            kotlin.jvm.internal.o.e(r0, r1)
            android.view.TextureView r0 = (android.view.TextureView) r0
            int r1 = r5.f462043e
            int r2 = r5.f462044f
            android.graphics.Bitmap r3 = r5.f462045g
            if (r3 != 0) goto L16
            goto L29
        L16:
            int r4 = r3.getWidth()
            if (r4 != r1) goto L23
            int r4 = r3.getHeight()
            if (r4 != r2) goto L23
            goto L2a
        L23:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L29
            r3.reconfigure(r1, r2, r4)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L31
            android.graphics.Bitmap r0 = r0.getBitmap(r3)
            goto L35
        L31:
            android.graphics.Bitmap r0 = r0.getBitmap(r1, r2)
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.d.invoke():java.lang.Object");
    }
}
