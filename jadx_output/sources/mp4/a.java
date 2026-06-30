package mp4;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mm.xeffect.effect.IStickerDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f330464a;

    public a() {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/emojidecoder/DefaultDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/vlog/ui/timelineeditor/emojidecoder/DefaultDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        this.f330464a = createBitmap;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void destroy() {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public long duration() {
        return 1073741824L;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.graphics.Bitmap getFrame() {
        return this.f330464a;
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public void seekTo(long j17) {
    }

    @Override // com.tencent.mm.xeffect.effect.IStickerDecoder
    public android.util.Size size() {
        return new android.util.Size(0, 0);
    }
}
