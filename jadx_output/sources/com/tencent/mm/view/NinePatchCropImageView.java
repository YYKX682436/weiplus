package com.tencent.mm.view;

/* loaded from: classes5.dex */
public class NinePatchCropImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f213371f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.NinePatch f213372g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f213373h;

    public NinePatchCropImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213371f = new android.graphics.Paint();
        this.f213372g = null;
        this.f213373h = null;
        n();
    }

    public final void n() {
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f213371f;
        paint.setXfermode(porterDuffXfermode);
        paint.setAntiAlias(true);
        this.f213373h = getResources().getDrawable(com.tencent.mm.R.color.BW_90);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f213372g == null) {
            super.onDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(null, null);
        android.graphics.drawable.Drawable drawable = this.f213373h;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.f213373h.draw(canvas);
        }
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.graphics.Paint paint = this.f213371f;
        this.f213372g.draw(canvas, new android.graphics.Rect(0, 0, getWidth(), getHeight()), paint);
        canvas.restoreToCount(saveLayer);
    }

    public void setEraseEdge(boolean z17) {
    }

    public void setNinePatchId(int i17) {
        android.content.res.Resources resources = getContext().getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/view/NinePatchCropImageView", "setNinePatchId", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/view/NinePatchCropImageView", "setNinePatchId", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        if (decodeResource != null) {
            this.f213372g = new android.graphics.NinePatch(decodeResource, decodeResource.getNinePatchChunk(), null);
        }
    }

    public NinePatchCropImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213371f = new android.graphics.Paint();
        this.f213372g = null;
        this.f213373h = null;
        n();
    }
}
