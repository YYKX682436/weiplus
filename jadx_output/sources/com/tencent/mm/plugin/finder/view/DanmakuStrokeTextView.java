package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B!\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b'\u0010*R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/DanmakuStrokeTextView;", "Lcom/tencent/mm/plugin/finder/view/StrokeTextView;", "", "n", "Z", "getNeedStroke", "()Z", "setNeedStroke", "(Z)V", "needStroke", "", "o", "I", "getCacheShadowColor", "()I", "setCacheShadowColor", "(I)V", "cacheShadowColor", "", "p", "F", "getCacheShadowRadius", "()F", "setCacheShadowRadius", "(F)V", "cacheShadowRadius", "", "value", "q", "[I", "getGradientTextColor", "()[I", "setGradientTextColor", "([I)V", "gradientTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DanmakuStrokeTextView extends com.tencent.mm.plugin.finder.view.StrokeTextView {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean needStroke;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int cacheShadowColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float cacheShadowRadius;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int[] gradientTextColor;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.LinearGradient f130835r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuStrokeTextView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // com.tencent.mm.plugin.finder.view.StrokeTextView
    public void b(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (!this.needStroke) {
            setShadowLayer(0.0f, getShadowDx(), getShadowDy(), 0);
        } else {
            setShadowLayer(this.cacheShadowRadius, getShadowDx(), getShadowDy(), this.cacheShadowColor);
            super.b(canvas);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        int[] iArr = this.gradientTextColor;
        if (iArr != null) {
            if (this.f130835r == null) {
                this.f130835r = new android.graphics.LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, iArr, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f130835r = null;
        }
        getPaint().setShader(this.f130835r);
        super.draw(canvas);
        getPaint().setShader(null);
    }

    @Override // com.tencent.mm.plugin.finder.view.StrokeTextView
    public void e(android.util.AttributeSet attrs, int i17) {
        kotlin.jvm.internal.o.g(attrs, "attrs");
        super.e(attrs, i17);
        this.cacheShadowRadius = getShadowRadius();
        this.cacheShadowColor = getShadowColor();
        this.needStroke = getStrokeWidth() > 0.0f;
    }

    public final int getCacheShadowColor() {
        return this.cacheShadowColor;
    }

    public final float getCacheShadowRadius() {
        return this.cacheShadowRadius;
    }

    public final int[] getGradientTextColor() {
        return this.gradientTextColor;
    }

    public final boolean getNeedStroke() {
        return this.needStroke;
    }

    public final void setCacheShadowColor(int i17) {
        this.cacheShadowColor = i17;
    }

    public final void setCacheShadowRadius(float f17) {
        this.cacheShadowRadius = f17;
    }

    public final void setGradientTextColor(int[] iArr) {
        this.gradientTextColor = iArr;
        this.f130835r = null;
    }

    public final void setNeedStroke(boolean z17) {
        this.needStroke = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuStrokeTextView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
