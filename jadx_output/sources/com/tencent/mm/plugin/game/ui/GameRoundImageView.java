package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class GameRoundImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: m, reason: collision with root package name */
    public static final android.graphics.PorterDuffXfermode f140961m = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f140962f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f140963g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f140964h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f140965i;

    public GameRoundImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        if (this.f140964h == null) {
            this.f140964h = new android.graphics.Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f140963g == null) {
            this.f140963g = new android.graphics.RectF(this.f140964h);
        }
        if (this.f140962f != null && this.f140965i != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            android.graphics.Bitmap bitmap = this.f140965i;
            android.graphics.Rect rect = this.f140964h;
            canvas.drawBitmap(bitmap, rect, rect, paint);
            paint.setXfermode(f140961m);
            canvas.drawBitmap(this.f140962f, (android.graphics.Rect) null, this.f140964h, paint);
            canvas.restoreToCount(saveLayer);
            paint.setXfermode(null);
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f479171rv));
        canvas.drawRoundRect(this.f140963g, 18.0f, 18.0f, paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.f140963g = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        this.f140964h = new android.graphics.Rect(0, 0, i17, i18);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameRoundImageView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/game/ui/GameRoundImageView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1);
        canvas.drawRoundRect(this.f140963g, 18.0f, 18.0f, paint);
        this.f140965i = createBitmap;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f140962f = bitmap;
        super.setImageBitmap(bitmap);
    }
}
