package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001b\u0010\u0012\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R6\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicClipRangeBarView;", "Landroid/view/View;", "", "ms", "Ljz5/f0;", "setMinDurationMs", "", "bars", "setWaveformData", "progressMs", "setPlayProgressMs", "getStartMs", "getEndMs", "getDurationMs", "M", "Ljz5/g;", "getFallbackBars", "()[F", "fallbackBars", "Lkotlin/Function2;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lyz5/p;", "getOnRangeChanging", "()Lyz5/p;", "setOnRangeChanging", "(Lyz5/p;)V", "onRangeChanging", "U", "getOnRangeChanged", "setOnRangeChanged", "onRangeChanged", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/k", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicClipRangeBarView extends android.view.View {
    public final android.graphics.Paint A;
    public final android.graphics.RectF B;
    public final android.graphics.RectF C;
    public final android.graphics.RectF D;
    public final android.graphics.RectF E;
    public final android.graphics.Path F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f156144J;
    public long K;
    public float[] L;

    /* renamed from: M, reason: from kotlin metadata */
    public final jz5.g fallbackBars;
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k N;
    public float P;
    public float Q;
    public float R;
    public boolean S;

    /* renamed from: T, reason: from kotlin metadata */
    public yz5.p onRangeChanging;

    /* renamed from: U, reason: from kotlin metadata */
    public yz5.p onRangeChanged;

    /* renamed from: d, reason: collision with root package name */
    public final float f156145d;

    /* renamed from: e, reason: collision with root package name */
    public final float f156146e;

    /* renamed from: f, reason: collision with root package name */
    public final float f156147f;

    /* renamed from: g, reason: collision with root package name */
    public final float f156148g;

    /* renamed from: h, reason: collision with root package name */
    public final float f156149h;

    /* renamed from: i, reason: collision with root package name */
    public final float f156150i;

    /* renamed from: m, reason: collision with root package name */
    public final float f156151m;

    /* renamed from: n, reason: collision with root package name */
    public final float f156152n;

    /* renamed from: o, reason: collision with root package name */
    public final float f156153o;

    /* renamed from: p, reason: collision with root package name */
    public final int f156154p;

    /* renamed from: q, reason: collision with root package name */
    public final float f156155q;

    /* renamed from: r, reason: collision with root package name */
    public final float f156156r;

    /* renamed from: s, reason: collision with root package name */
    public final float f156157s;

    /* renamed from: t, reason: collision with root package name */
    public final float f156158t;

    /* renamed from: u, reason: collision with root package name */
    public final int f156159u;

    /* renamed from: v, reason: collision with root package name */
    public final int f156160v;

    /* renamed from: w, reason: collision with root package name */
    public final int f156161w;

    /* renamed from: x, reason: collision with root package name */
    public final int f156162x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f156163y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Paint f156164z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicClipRangeBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final float[] getFallbackBars() {
        return (float[]) ((jz5.n) this.fallbackBars).getValue();
    }

    public final void a(android.graphics.Canvas canvas, float f17, float f18, float f19, boolean z17) {
        float f27 = this.f156150i / 2.0f;
        float f28 = z17 ? f17 - f27 : f17 + f27;
        float f29 = (f18 + f19) / 2.0f;
        android.graphics.RectF rectF = this.E;
        float f37 = this.f156155q;
        float f38 = this.f156156r;
        rectF.set(f28 - (f37 / 2.0f), f29 - (f38 / 2.0f), f28 + (f37 / 2.0f), f29 + (f38 / 2.0f));
        android.graphics.Paint paint = this.A;
        float f39 = this.f156157s;
        canvas.drawRoundRect(rectF, f39, f39, paint);
    }

    public final float b(long j17, float f17, float f18) {
        long j18 = this.G;
        return j18 <= 0 ? f17 : f17 + (f18 * e06.p.e(((float) j17) / ((float) j18), 0.0f, 1.0f));
    }

    public final long getDurationMs() {
        return this.I - this.H;
    }

    /* renamed from: getEndMs, reason: from getter */
    public final long getI() {
        return this.I;
    }

    public final yz5.p getOnRangeChanged() {
        return this.onRangeChanged;
    }

    public final yz5.p getOnRangeChanging() {
        return this.onRangeChanging;
    }

    /* renamed from: getStartMs, reason: from getter */
    public final long getH() {
        return this.H;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float b17;
        float f19;
        float f27;
        float f28;
        boolean z17;
        boolean z18;
        boolean z19;
        float f29;
        boolean z27;
        int i17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f37 = this.f156145d;
        float f38 = this.f156153o;
        float f39 = (f37 * 2.0f) + f38;
        float f47 = (height - f38) - (f37 * 2.0f);
        float f48 = f47 - f39;
        if (f48 <= 0.0f) {
            return;
        }
        float f49 = this.f156150i;
        float f57 = width - f49;
        float f58 = f57 - f49;
        if (f58 <= 0.0f) {
            return;
        }
        float b18 = b(this.H, f49, f58);
        float b19 = b(this.I, f49, f58);
        long j17 = this.K;
        if (j17 == -1) {
            f17 = f48;
            f18 = f39;
            b17 = b18;
        } else {
            f17 = f48;
            f18 = f39;
            b17 = b(e06.p.h(j17, this.H, this.I), f49, f58);
        }
        float f59 = (f18 + f47) / 2.0f;
        float f66 = this.f156147f;
        float f67 = this.f156146e;
        float f68 = f66 + f67;
        int max = java.lang.Math.max(1, (int) (f58 / f68));
        float[] fArr = this.L;
        if (!(!(fArr.length == 0))) {
            fArr = getFallbackBars();
        }
        boolean z28 = this.K != -1;
        int i18 = 0;
        while (true) {
            f19 = f38;
            if (i18 >= max) {
                f27 = height;
                break;
            }
            float f69 = i18;
            float f76 = f68;
            float f77 = f49 + (f69 * f68);
            f27 = height;
            float f78 = f77 + f67;
            if (f78 > f57) {
                break;
            }
            float f79 = f57;
            if (fArr.length == 0) {
                z17 = true;
                z18 = true;
            } else {
                z17 = true;
                z18 = false;
            }
            if (!z18) {
                z19 = true;
                f29 = f67;
                z27 = false;
                i17 = e06.p.f((int) ((f69 / max) * fArr.length), 0, fArr.length - 1);
            } else {
                z19 = z17;
                f29 = f67;
                z27 = false;
                i17 = 0;
            }
            float max2 = java.lang.Math.max(this.f156148g, ((fArr.length == 0 ? z19 : z27) ^ true ? e06.p.e(fArr[i17], 0.0f, 1.0f) : 0.4f) * f17);
            android.graphics.RectF rectF = this.B;
            float f86 = max2 / 2.0f;
            rectF.set(f77, f59 - f86, f78, f86 + f59);
            float f87 = (f77 + f78) / 2.0f;
            android.graphics.Paint paint = this.f156163y;
            paint.setColor(!(((b18 > f87 ? 1 : (b18 == f87 ? 0 : -1)) > 0 || (f87 > b19 ? 1 : (f87 == b19 ? 0 : -1)) > 0) ? false : z19) ? this.f156160v : (!z28 || f87 > b17) ? this.f156161w : this.f156162x);
            float f88 = this.f156149h;
            canvas.drawRoundRect(rectF, f88, f88, paint);
            i18++;
            f38 = f19;
            height = f27;
            f68 = f76;
            f57 = f79;
            f67 = f29;
        }
        if (b19 > b18) {
            float f89 = b18 - f49;
            float f96 = f49 + b19;
            if (f96 - f89 > 0.0f && f27 - 0.0f > 0.0f) {
                android.graphics.RectF rectF2 = this.C;
                f28 = f27;
                rectF2.set(f89, 0.0f, f96, f28);
                float f97 = this.f156152n;
                float f98 = b18 + f97;
                float f99 = b19 - f97;
                float f100 = 0.0f + f19;
                float f101 = f28 - f19;
                android.graphics.Path path = this.F;
                path.reset();
                path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                float f102 = this.f156151m;
                path.addRoundRect(rectF2, f102, f102, android.graphics.Path.Direction.CW);
                if (f99 > f98 && f101 > f100) {
                    android.graphics.RectF rectF3 = this.D;
                    rectF3.set(f98, f100, f99, f101);
                    path.addRect(rectF3, android.graphics.Path.Direction.CCW);
                }
                canvas.drawPath(path, this.f156164z);
                float f103 = f28;
                a(canvas, b18, 0.0f, f103, true);
                a(canvas, b19, 0.0f, f103, false);
            }
        }
        f28 = f27;
        float f1032 = f28;
        a(canvas, b18, 0.0f, f1032, true);
        a(canvas, b19, 0.0f, f1032, false);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f156154p, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k kVar;
        kotlin.jvm.internal.o.g(event, "event");
        long j17 = 0;
        if (this.G <= 0) {
            return false;
        }
        float width = getWidth();
        float f17 = this.f156150i;
        float f18 = (width - f17) - f17;
        if (f18 <= 0.0f) {
            return false;
        }
        float x17 = event.getX();
        float y17 = event.getY();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.Q = x17;
            this.R = y17;
            this.P = x17;
            this.S = false;
            float b17 = b(this.H, f17, f18);
            float b18 = b(this.I, f17, f18);
            float f19 = f17 / 2.0f;
            float abs = java.lang.Math.abs(x17 - (b17 - f19));
            float abs2 = java.lang.Math.abs(x17 - (f19 + b18));
            float f27 = this.f156158t + f19;
            if (abs <= f27 && abs <= abs2) {
                kVar = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156280e;
            } else if (abs2 <= f27) {
                kVar = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156281f;
            } else {
                kVar = (b17 > x17 ? 1 : (b17 == x17 ? 0 : -1)) <= 0 && (x17 > b18 ? 1 : (x17 == b18 ? 0 : -1)) <= 0 ? com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156282g : com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156279d;
            }
            this.N = kVar;
            if (kVar == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156279d) {
                return false;
            }
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (this.K != -1) {
                this.K = -1L;
                invalidate();
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.N == com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156279d) {
                    return false;
                }
                if (!this.S) {
                    float abs3 = java.lang.Math.abs(x17 - this.Q);
                    int i17 = this.f156159u;
                    if (abs3 < i17 && java.lang.Math.abs(y17 - this.R) < i17) {
                        return true;
                    }
                    this.S = true;
                }
                float f28 = x17 - this.P;
                this.P = x17;
                long b19 = (this.G <= 0 || f18 <= 0.0f) ? 0L : a06.d.b((f28 / f18) * ((float) r8));
                int ordinal = this.N.ordinal();
                if (ordinal == 1) {
                    long h17 = e06.p.h(this.H + b19, 0L, this.I - this.f156144J);
                    if (h17 != this.H) {
                        this.H = h17;
                    }
                } else if (ordinal == 2) {
                    long h18 = e06.p.h(this.I + b19, this.H + this.f156144J, this.G);
                    if (h18 != this.I) {
                        this.I = h18;
                    }
                } else if (ordinal == 3) {
                    long j18 = this.I;
                    long j19 = this.H;
                    long j27 = j18 - j19;
                    long j28 = j19 + b19;
                    long j29 = j18 + b19;
                    if (j28 >= 0) {
                        long j37 = this.G;
                        if (j29 > j37) {
                            j17 = j37 - j27;
                            j27 = j37;
                        } else {
                            j27 = j29;
                            j17 = j28;
                        }
                    }
                    this.H = j17;
                    this.I = j27;
                }
                yz5.p pVar = this.onRangeChanging;
                if (pVar != null) {
                    pVar.invoke(java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(this.I));
                }
                invalidate();
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k kVar2 = this.N;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k kVar3 = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156279d;
        this.N = kVar3;
        this.S = false;
        android.view.ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        if (kVar2 == kVar3) {
            return false;
        }
        yz5.p pVar2 = this.onRangeChanged;
        if (pVar2 != null) {
            pVar2.invoke(java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(this.I));
        }
        return true;
    }

    public final void setMinDurationMs(long j17) {
        long max = java.lang.Math.max(0L, j17);
        this.f156144J = max;
        long j18 = this.I;
        long j19 = this.H;
        if (j18 - j19 < max) {
            long j27 = this.G;
            if (j27 > 0) {
                this.I = java.lang.Math.min(j27, j19 + max);
                invalidate();
            }
        }
    }

    public final void setOnRangeChanged(yz5.p pVar) {
        this.onRangeChanged = pVar;
    }

    public final void setOnRangeChanging(yz5.p pVar) {
        this.onRangeChanging = pVar;
    }

    public final void setPlayProgressMs(long j17) {
        long h17 = j17 != -1 ? e06.p.h(j17, this.H, this.I) : -1L;
        if (h17 != this.K) {
            this.K = h17;
            invalidate();
        }
    }

    public final void setWaveformData(float[] fArr) {
        float[] fArr2;
        if (fArr != null) {
            fArr2 = java.util.Arrays.copyOf(fArr, fArr.length);
            kotlin.jvm.internal.o.f(fArr2, "copyOf(...)");
        } else {
            fArr2 = new float[0];
        }
        this.L = fArr2;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicClipRangeBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        float a17 = com.tencent.mm.ui.zk.a(context, 1);
        this.f156145d = a17;
        float f17 = a17 * 2.0f;
        this.f156146e = f17;
        this.f156147f = f17;
        this.f156148g = f17;
        this.f156149h = f17 / 2.0f;
        this.f156150i = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479691cq);
        this.f156151m = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        this.f156152n = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479641bg);
        this.f156153o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.afe);
        this.f156154p = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        float f18 = 1.5f * a17;
        this.f156155q = f18;
        this.f156156r = 12.0f * a17;
        this.f156157s = f18 / 2.0f;
        this.f156158t = a17 * 12;
        this.f156159u = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        int color = context.getResources().getColor(com.tencent.mm.R.color.FG_4);
        this.f156160v = color;
        this.f156161w = context.getResources().getColor(com.tencent.mm.R.color.f478520a84);
        this.f156162x = context.getResources().getColor(com.tencent.mm.R.color.Brand_100);
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.Brand_100);
        int color3 = context.getResources().getColor(com.tencent.mm.R.color.adh);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(color);
        this.f156163y = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(color2);
        this.f156164z = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(color3);
        this.A = paint3;
        this.B = new android.graphics.RectF();
        this.C = new android.graphics.RectF();
        this.D = new android.graphics.RectF();
        this.E = new android.graphics.RectF();
        this.F = new android.graphics.Path();
        this.f156144J = 1000L;
        this.K = -1L;
        this.L = new float[0];
        this.fallbackBars = jz5.h.b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l.f156286d);
        this.N = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k.f156279d;
    }
}
