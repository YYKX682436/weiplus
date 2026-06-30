package m12;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m12.i f322836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f322837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.a f322838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f322839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f322840h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f322841i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f322842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m12.i iVar, java.nio.ByteBuffer byteBuffer, com.tencent.mm.plugin.gif.a aVar, kotlinx.coroutines.y0 y0Var, java.util.Set set, java.util.List list, kotlinx.coroutines.q qVar) {
        super(2);
        this.f322836d = iVar;
        this.f322837e = byteBuffer;
        this.f322838f = aVar;
        this.f322839g = y0Var;
        this.f322840h = set;
        this.f322841i = list;
        this.f322842m = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap != null) {
            m12.i iVar = this.f322836d;
            if (iVar.f322815a.width() != iVar.f322816b || iVar.f322815a.height() != iVar.f322817c) {
                android.graphics.Rect rect = iVar.f322815a;
                int i17 = rect.left;
                int i18 = rect.top;
                int width = rect.width();
                int width2 = bitmap.getWidth();
                android.graphics.Rect rect2 = iVar.f322815a;
                int i19 = width2 - rect2.left;
                if (width > i19) {
                    width = i19;
                }
                int height = rect2.height();
                int height2 = bitmap.getHeight() - iVar.f322815a.top;
                if (height > height2) {
                    height = height2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(bitmap);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/VideoEmojiGenerator$generate$2$1$2", "invoke", "(JLandroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/emoji/editor/generator/VideoEmojiGenerator$generate$2$1$2", "invoke", "(JLandroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.d(createBitmap);
                bitmap = createBitmap;
            }
            android.graphics.Bitmap bitmap2 = iVar.f322818d;
            if (bitmap2 != null) {
                new android.graphics.Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
            java.nio.ByteBuffer byteBuffer = this.f322837e;
            byteBuffer.rewind();
            bitmap.copyPixelsToBuffer(byteBuffer);
            this.f322838f.a(byteBuffer.array(), -1L);
        }
        kotlinx.coroutines.y0 y0Var = this.f322839g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new m12.f(this.f322840h, longValue, this.f322841i, this.f322842m, null), 2, null);
        return jz5.f0.f302826a;
    }
}
