package eq1;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f255802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f255803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f255805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255806h;

    public f(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        this.f255802d = imageView;
        this.f255803e = bitmap;
        this.f255804f = str;
        this.f255805g = i17;
        this.f255806h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eq1.h hVar = eq1.h.f255812a;
        android.widget.ImageView bgIv = this.f255802d;
        kotlin.jvm.internal.o.g(bgIv, "bgIv");
        android.graphics.Bitmap bitmap = this.f255803e;
        if (bitmap != null) {
            java.lang.String str = this.f255804f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                bgIv.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                float width = this.f255805g / bitmap.getWidth();
                float height = this.f255806h / bitmap.getHeight();
                if (width <= height) {
                    width = height;
                }
                matrix.setScale(width, width, 0.0f, 0.0f);
                bgIv.setImageMatrix(matrix);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                kotlin.jvm.internal.o.d(str);
                byte[] bytes = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                sb6.append(kk.k.g(bytes));
                sb6.append("_biz_chat_blur");
                java.lang.String sb7 = sb6.toString();
                android.graphics.Bitmap e17 = n11.a.b().e(sb7);
                if (e17 != null) {
                    bgIv.setImageBitmap(e17);
                    return;
                }
                uq5.y g17 = new com.tencent.mm.xeffect.effect.EffectManager().g(uq5.k.BlurEffect);
                kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
                uq5.b bVar = (uq5.b) g17;
                bVar.d(20.0f);
                bVar.e(1.0f);
                um5.d dVar = new um5.d();
                dVar.b(bitmap);
                int width2 = (int) (bitmap.getWidth() * 1.2d);
                dVar.f429141b = width2;
                dVar.f429142c = (int) (bitmap.getHeight() * 1.2d);
                dVar.f429144e.f429193b.c(bVar);
                dVar.a(new eq1.b(str, bgIv, sb7));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("BizChatUtil", "imageData.bitmap == null || coverUrl == null");
    }
}
