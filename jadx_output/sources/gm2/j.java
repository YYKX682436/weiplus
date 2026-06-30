package gm2;

/* loaded from: classes3.dex */
public final class j extends gm2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.h f273414e = new gm2.h(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f273415f = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: d, reason: collision with root package name */
    public gm2.i f273416d;

    static {
        com.tencent.mars.xlog.Log.i("FinderLiveFansSpan", "initMemoryTrim");
        ki.i.f308101c.c(new gm2.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f273416d = new gm2.i(null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287, null);
    }

    @Override // gm2.y1
    public int a() {
        gm2.i iVar = this.f273416d;
        return iVar.a() + iVar.f273404o + iVar.f273405p;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i29 = i28 - i19;
        gm2.i iVar = this.f273416d;
        int i37 = iVar.f273403n;
        if (i29 < i37) {
            return;
        }
        float f18 = f17 + iVar.f273404o;
        float f19 = i19 + (i29 > i37 ? (i29 - i37) / 2 : 0);
        float f27 = i37 + f19;
        if (!(java.lang.Integer.valueOf(iVar.f273406q) != null) || this.f273416d.f273406q <= 0) {
            paint.setColor(this.f273416d.f273402m);
            canvas.drawRoundRect(new android.graphics.RectF(f18, f19, this.f273416d.a() + f18, f27), 45.0f, 45.0f, paint);
        } else {
            android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(this.f273416d.f273406q);
            drawable.setBounds((int) f18, (int) f19, (int) (this.f273416d.a() + f18), (int) f27);
            drawable.draw(canvas);
        }
        gm2.i iVar2 = this.f273416d;
        android.graphics.drawable.Drawable drawable2 = iVar2.f273396g;
        if (drawable2 != null) {
            int i38 = i19 + ((i29 - iVar2.f273398i) / 2);
            gm2.i iVar3 = this.f273416d;
            int i39 = iVar3.f273408s;
            drawable2.setBounds(new android.graphics.Rect(((int) f18) + i39, i38, (int) (iVar3.f273397h + f18 + i39), iVar3.f273398i + i38));
            drawable2.draw(canvas);
        }
        com.tencent.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f273416d.f273391b);
        paint.setTextSize(this.f273416d.f273392c);
        float f28 = 2;
        float abs = (java.lang.Math.abs(paint.ascent() + paint.descent()) / f28) + (i29 / 2);
        java.lang.String str = this.f273416d.f273390a;
        float measureText = paint.measureText(str, 0, str.length());
        gm2.i iVar4 = this.f273416d;
        float f29 = iVar4.f273397h;
        canvas.drawText(iVar4.f273390a, (f29 > measureText ? (f29 - measureText) / f28 : 0.0f) + f18, abs, paint);
        com.tencent.mm.ui.bk.t0(paint);
        com.tencent.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f273416d.f273394e);
        paint.setTextSize(this.f273416d.f273395f);
        int i47 = this.f273416d.f273403n;
        int i48 = i29 > i47 ? (i29 - i47) / 2 : 0;
        float abs2 = java.lang.Math.abs(paint.ascent() + paint.descent()) / f28;
        gm2.i iVar5 = this.f273416d;
        float f37 = abs2 + (iVar5.f273403n / 2) + i48;
        float f38 = iVar5.f273397h + iVar5.f273408s + iVar5.f273407r;
        kotlin.jvm.internal.o.f(paint.getFontMetrics(), "getFontMetrics(...)");
        canvas.drawText(this.f273416d.f273393d, f38 + f18, f37, paint);
        com.tencent.mm.ui.bk.t0(paint);
        android.graphics.drawable.Drawable drawable3 = this.f273416d.f273399j;
        if (drawable3 != null) {
            paint.setTextSize(r6.f273395f);
            java.lang.String str2 = this.f273416d.f273393d;
            float measureText2 = paint.measureText(str2, 0, str2.length());
            float f39 = (((((f18 + r9.f273397h) + r9.f273408s) + r9.f273407r) + 1) + measureText2) - (r9.f273400k / 2);
            int i49 = i19 + ((i29 - this.f273416d.f273401l) / 2);
            drawable3.setBounds(new android.graphics.Rect((int) f39, i49, (int) (f39 + r10.f273400k), this.f273416d.f273401l + i49));
            drawable3.draw(canvas);
        }
        paint.setColor(color);
        paint.setTextSize(textSize);
    }
}
