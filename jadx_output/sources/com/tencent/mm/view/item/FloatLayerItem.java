package com.tencent.mm.view.item;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/item/FloatLayerItem;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FloatLayerItem extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f213603d;

    public FloatLayerItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213603d = new java.util.ArrayList();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        android.graphics.Paint paint = new android.graphics.Paint();
        float f17 = width;
        float f18 = height;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f17, f18, null, 31);
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        for (android.graphics.RectF rectF : this.f213603d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatLayerItem", "onDraw, " + height + ", " + width + ", " + rectF.left + ", " + rectF.right + ',' + rectF.bottom + ", " + rectF.top);
            canvas.drawRect(rectF, paint);
        }
        paint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    public FloatLayerItem(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213603d = new java.util.ArrayList();
    }
}
