package com.tencent.mm.plugin.sns.ad.widget.anim;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/anim/EdgeAlphaFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EdgeAlphaFrameLayout extends android.widget.FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f163492v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f163493d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f163494e;

    /* renamed from: f, reason: collision with root package name */
    public float f163495f;

    /* renamed from: g, reason: collision with root package name */
    public float f163496g;

    /* renamed from: h, reason: collision with root package name */
    public float f163497h;

    /* renamed from: i, reason: collision with root package name */
    public float f163498i;

    /* renamed from: m, reason: collision with root package name */
    public float f163499m;

    /* renamed from: n, reason: collision with root package name */
    public float f163500n;

    /* renamed from: o, reason: collision with root package name */
    public float f163501o;

    /* renamed from: p, reason: collision with root package name */
    public float f163502p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f163503q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f163504r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f163505s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f163506t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f163507u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeAlphaFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163493d = new int[]{android.graphics.Color.parseColor("#fff7f7f7"), android.graphics.Color.parseColor("#00f7f7f7")};
        this.f163494e = new float[]{0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f163503q = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f163504r = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f163505s = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f163506t = paint4;
        java.util.List<android.graphics.Paint> k17 = kz5.c0.k(paint, paint2, paint3, paint4);
        this.f163507u = new android.graphics.Paint(1);
        for (android.graphics.Paint paint5 : k17) {
            paint5.setStyle(android.graphics.Paint.Style.FILL);
            paint5.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        this.f163507u.setColor(-1);
        this.f163507u.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        addOnLayoutChangeListener(new o84.a(this));
    }

    public final void a(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlphaRect", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        int width = getWidth();
        int height = getHeight();
        this.f163495f = f17;
        this.f163496g = f18;
        this.f163497h = f19;
        this.f163498i = f27;
        this.f163499m = f28;
        this.f163500n = f29;
        this.f163501o = f37;
        this.f163502p = f38;
        this.f163503q.setShader(new android.graphics.LinearGradient(f17, 0.0f, f17 + f18, 0.0f, this.f163493d, this.f163494e, android.graphics.Shader.TileMode.CLAMP));
        float f39 = width - f28;
        this.f163504r.setShader(new android.graphics.LinearGradient(f39, 0.0f, f39 - f29, 0.0f, this.f163493d, this.f163494e, android.graphics.Shader.TileMode.CLAMP));
        this.f163505s.setShader(new android.graphics.LinearGradient(0.0f, f19, 0.0f, f19 + f27, this.f163493d, this.f163494e, android.graphics.Shader.TileMode.CLAMP));
        float f47 = height - f37;
        this.f163506t.setShader(new android.graphics.LinearGradient(0.0f, f47, 0.0f, f47 - f38, this.f163493d, this.f163494e, android.graphics.Shader.TileMode.CLAMP));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlphaRect", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawChild", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.drawRect(0.0f, 0.0f, this.f163495f, getHeight(), this.f163507u);
        float f17 = this.f163495f;
        canvas.drawRect(f17, 0.0f, f17 + this.f163496g, getHeight(), this.f163503q);
        canvas.drawRect(getWidth() - this.f163499m, 0.0f, getWidth(), getHeight(), this.f163507u);
        canvas.drawRect((getWidth() - this.f163499m) - this.f163500n, 0.0f, getWidth() - this.f163499m, getHeight(), this.f163504r);
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.f163497h, this.f163507u);
        canvas.drawRect(0.0f, this.f163497h, getWidth(), this.f163498i + this.f163497h, this.f163505s);
        canvas.drawRect(0.0f, getHeight() - this.f163501o, getWidth(), getHeight(), this.f163507u);
        canvas.drawRect(0.0f, (getHeight() - this.f163501o) - this.f163502p, getWidth(), getHeight() - this.f163501o, this.f163506t);
        canvas.restoreToCount(saveLayer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawChild", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        return drawChild;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeAlphaFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163493d = new int[]{android.graphics.Color.parseColor("#fff7f7f7"), android.graphics.Color.parseColor("#00f7f7f7")};
        this.f163494e = new float[]{0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f163503q = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f163504r = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f163505s = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f163506t = paint4;
        java.util.List<android.graphics.Paint> k17 = kz5.c0.k(paint, paint2, paint3, paint4);
        this.f163507u = new android.graphics.Paint(1);
        for (android.graphics.Paint paint5 : k17) {
            paint5.setStyle(android.graphics.Paint.Style.FILL);
            paint5.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        this.f163507u.setColor(-1);
        this.f163507u.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        addOnLayoutChangeListener(new o84.a(this));
    }
}
