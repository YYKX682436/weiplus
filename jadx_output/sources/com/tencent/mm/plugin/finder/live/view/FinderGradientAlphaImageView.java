package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderGradientAlphaImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/view/l0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderGradientAlphaImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f115776f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.l0 f115777g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f115778h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f115779i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderGradientAlphaImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void n() {
        float[] fArr;
        int[] iArr;
        int width = getWidth();
        android.graphics.Paint paint = this.f115776f;
        if (width <= 0 || getHeight() <= 0 || this.f115779i == null || this.f115778h == null) {
            paint.setShader(null);
            return;
        }
        int ordinal = this.f115777g.ordinal();
        if (ordinal == 0) {
            fArr = new float[]{0.0f, 0.0f, getWidth(), 0.0f};
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            fArr = new float[]{0.0f, 0.0f, 0.0f, getHeight()};
        }
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        float[] fArr2 = this.f115779i;
        if (fArr2 == null) {
            iArr = new int[0];
        } else {
            int length = fArr2.length;
            int[] iArr2 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr2[i17] = android.graphics.Color.argb(e06.p.f((int) ((1.0f - fArr2[i17]) * 255), 0, 255), 0, 0, 0);
            }
            iArr = iArr2;
        }
        if (iArr.length == 0) {
            paint.setShader(null);
        } else {
            paint.setShader(new android.graphics.LinearGradient(f17, f18, f19, f27, iArr, this.f115778h, android.graphics.Shader.TileMode.CLAMP));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (getDrawable() != null) {
            android.graphics.Paint paint = this.f115776f;
            if (paint.getShader() != null && getWidth() > 0 && getHeight() > 0) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                if (paint.getShader() != null) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                }
                canvas.restoreToCount(saveLayer);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        n();
        invalidate();
    }

    public /* synthetic */ FinderGradientAlphaImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGradientAlphaImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.f115776f = paint;
        this.f115777g = com.tencent.mm.plugin.finder.live.view.l0.f116448d;
    }
}
