package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EB!\b\u0016\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010F\u001a\u00020\u0002¢\u0006\u0004\bD\u0010GJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006H"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/AudioWaveView;", "Landroid/view/View;", "", "color", "Ljz5/f0;", "setColor", "Landroid/content/res/ColorStateList;", "colorStateList", "", "selected", "setSelected", "isShow", "setShow", "d", "I", "getMWidth", "()I", "setMWidth", "(I)V", "mWidth", "e", "getMRectWidth", "setMRectWidth", "mRectWidth", "f", "getMRectHeight", "setMRectHeight", "mRectHeight", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "getMWavePaint", "()Landroid/graphics/Paint;", "setMWavePaint", "(Landroid/graphics/Paint;)V", "mWavePaint", "h", "Landroid/content/res/ColorStateList;", "getMWavePatinColorState", "()Landroid/content/res/ColorStateList;", "setMWavePatinColorState", "(Landroid/content/res/ColorStateList;)V", "mWavePatinColorState", "i", "getOffset", "offset", "m", "getMRectCount", "setMRectCount", "mRectCount", "", "n", "D", "getMRandom", "()D", "setMRandom", "(D)V", "mRandom", "o", "Z", "isRunningShow", "()Z", "setRunningShow", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AudioWaveView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int mWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int mRectWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int mRectHeight;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Paint mWavePaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.content.res.ColorStateList mWavePatinColorState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int offset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int mRectCount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public double mRandom;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isRunningShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.offset = i65.a.c(getContext(), 3);
        a();
    }

    public final void a() {
        this.mRectCount = 20;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mWavePaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.mWavePaint;
        kotlin.jvm.internal.o.d(paint2);
        paint2.setColor(-3355444);
        android.graphics.Paint paint3 = this.mWavePaint;
        kotlin.jvm.internal.o.d(paint3);
        paint3.setAntiAlias(true);
    }

    public final double getMRandom() {
        return this.mRandom;
    }

    public final int getMRectCount() {
        return this.mRectCount;
    }

    public final int getMRectHeight() {
        return this.mRectHeight;
    }

    public final int getMRectWidth() {
        return this.mRectWidth;
    }

    public final android.graphics.Paint getMWavePaint() {
        return this.mWavePaint;
    }

    public final android.content.res.ColorStateList getMWavePatinColorState() {
        return this.mWavePatinColorState;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public final int getOffset() {
        return this.offset;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2, getHeight());
        int i17 = this.mRectCount;
        for (int i18 = 0; i18 < i17; i18++) {
            boolean z17 = this.isRunningShow;
            int i19 = this.offset;
            if (z17) {
                double random = java.lang.Math.random();
                this.mRandom = random;
                int i27 = this.mRectWidth;
                android.graphics.RectF rectF = new android.graphics.RectF((float) ((i27 * i18) + i19), 0.0f, i27 * (i18 + 1), -((float) (this.mRectHeight * random)));
                int i28 = this.mRectWidth;
                int i29 = i28 / 2;
                int i37 = i28 / 4;
                android.graphics.Paint paint = this.mWavePaint;
                kotlin.jvm.internal.o.d(paint);
                canvas.drawRect(rectF, paint);
            } else {
                int i38 = this.mRectWidth;
                android.graphics.RectF rectF2 = new android.graphics.RectF((float) ((i38 * i18) + i19), 0.0f, i38 * (i18 + 1), -0.5f);
                int i39 = this.mRectWidth;
                int i47 = i39 / 2;
                int i48 = i39 / 4;
                android.graphics.Paint paint2 = this.mWavePaint;
                kotlin.jvm.internal.o.d(paint2);
                canvas.drawRect(rectF2, paint2);
            }
        }
        postInvalidateDelayed(100L);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.mWidth = getWidth();
        this.mRectHeight = getHeight() / 2;
        this.mRectWidth = this.mWidth / (this.mRectCount * 2);
    }

    public final void setColor(int i17) {
        android.graphics.Paint paint = this.mWavePaint;
        kotlin.jvm.internal.o.d(paint);
        paint.setColor(i17);
    }

    public final void setMRandom(double d17) {
        this.mRandom = d17;
    }

    public final void setMRectCount(int i17) {
        this.mRectCount = i17;
    }

    public final void setMRectHeight(int i17) {
        this.mRectHeight = i17;
    }

    public final void setMRectWidth(int i17) {
        this.mRectWidth = i17;
    }

    public final void setMWavePaint(android.graphics.Paint paint) {
        this.mWavePaint = paint;
    }

    public final void setMWavePatinColorState(android.content.res.ColorStateList colorStateList) {
        this.mWavePatinColorState = colorStateList;
    }

    public final void setMWidth(int i17) {
        this.mWidth = i17;
    }

    public final void setRunningShow(boolean z17) {
        this.isRunningShow = z17;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.graphics.Paint paint = this.mWavePaint;
        kotlin.jvm.internal.o.d(paint);
        android.content.res.ColorStateList colorStateList = this.mWavePatinColorState;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : 0);
    }

    public final void setShow(boolean z17) {
        this.isRunningShow = z17;
    }

    public final void setColor(android.content.res.ColorStateList colorStateList) {
        kotlin.jvm.internal.o.g(colorStateList, "colorStateList");
        this.mWavePatinColorState = colorStateList;
        android.graphics.Paint paint = this.mWavePaint;
        kotlin.jvm.internal.o.d(paint);
        android.content.res.ColorStateList colorStateList2 = this.mWavePatinColorState;
        paint.setColor(colorStateList2 != null ? colorStateList2.getColorForState(getDrawableState(), 0) : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.offset = i65.a.c(getContext(), 3);
        a();
    }
}
