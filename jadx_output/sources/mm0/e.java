package mm0;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: s, reason: collision with root package name */
    public static final mm0.f f328578s = new mm0.f(3);

    /* renamed from: t, reason: collision with root package name */
    public static final android.text.SpannableString f328579t = new android.text.SpannableString("");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f328580a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f328581b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f328582c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f328583d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.text.TextPaint f328584e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f328585f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.text.Layout.Alignment f328586g = android.text.Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: h, reason: collision with root package name */
    public int f328587h = 51;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f328588i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f328589j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f328590k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public android.text.TextDirectionHeuristic f328591l = null;

    /* renamed from: m, reason: collision with root package name */
    public float f328592m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f328593n = 1.1f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f328594o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f328595p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f328596q = -1;

    /* renamed from: r, reason: collision with root package name */
    public android.text.InputFilter.LengthFilter f328597r = null;

    public static mm0.e c() {
        mm0.e eVar;
        mm0.f fVar = f328578s;
        synchronized (fVar.f328600c) {
            int i17 = fVar.f328599b;
            eVar = null;
            if (i17 > 0) {
                int i18 = i17 - 1;
                mm0.e[] eVarArr = fVar.f328598a;
                mm0.e eVar2 = eVarArr[i18];
                eVarArr[i18] = null;
                fVar.f328599b = i18;
                eVar = eVar2;
            }
        }
        return eVar == null ? new mm0.e() : eVar;
    }

    public static mm0.e d(java.lang.CharSequence charSequence, int i17, nm0.a aVar) {
        if (charSequence == null) {
            charSequence = "";
        }
        int length = charSequence.length();
        mm0.e c17 = c();
        c17.f328580a = charSequence.toString();
        c17.f328581b = charSequence;
        c17.f328582c = 0;
        c17.f328583d = length;
        c17.f328585f = i17;
        c17.f328584e = new android.text.TextPaint();
        int i18 = aVar.f338451a;
        if (i18 != -1 && i18 >= 0) {
            c17.f328590k = i18;
        }
        int i19 = aVar.f338453c;
        if (i19 != -1 && i19 >= 0) {
            c17.f328595p = i19;
            c17.f328597r = new android.text.InputFilter.LengthFilter(c17.f328595p);
        }
        android.text.Layout.Alignment alignment = aVar.f338455e;
        if (alignment != null) {
            c17.f328586g = alignment;
        }
        android.text.TextUtils.TruncateAt truncateAt = aVar.f338456f;
        if (truncateAt != null) {
            c17.f328588i = truncateAt;
        }
        c17.f328587h = aVar.f338457g;
        int i27 = aVar.f338458h;
        if (i27 != -1 && i27 >= 0) {
            c17.f328589j = i27;
        }
        float f17 = aVar.f338459i;
        float f18 = aVar.f338460j;
        c17.f328592m = f17;
        c17.f328593n = f18;
        c17.f328594o = false;
        float f19 = aVar.f338462l;
        if (f19 != -1.0f) {
            c17.f328584e.setTextSize(f19);
        }
        int i28 = aVar.f338463m;
        if (i28 != -1) {
            c17.f328584e.setColor(i28);
        }
        int i29 = aVar.f338464n;
        if (i29 != -1) {
            c17.f328584e.linkColor = i29;
        }
        android.text.TextPaint textPaint = aVar.f338454d;
        if (textPaint != null) {
            c17.f328584e = textPaint;
        }
        int i37 = aVar.f338465o;
        if (i37 >= 0 && i37 >= 0) {
            c17.f328596q = i37;
        }
        return c17;
    }

    public mm0.g a() {
        int i17;
        int i18;
        android.text.StaticLayout staticLayout;
        android.text.InputFilter.LengthFilter lengthFilter;
        android.text.TextUtils.TruncateAt truncateAt = this.f328588i;
        if (truncateAt == null || (i17 = this.f328589j) <= 0) {
            i17 = this.f328585f;
        }
        if (truncateAt == null && this.f328590k == 1) {
            this.f328588i = android.text.TextUtils.TruncateAt.END;
        }
        if (this.f328595p > 0 && (lengthFilter = this.f328597r) != null) {
            java.lang.CharSequence charSequence = this.f328581b;
            java.lang.CharSequence filter = lengthFilter.filter(charSequence, 0, charSequence.length(), f328579t, 0, 0);
            if (filter != null) {
                this.f328581b = filter;
                if (this.f328583d > filter.length()) {
                    this.f328583d = this.f328581b.length();
                }
            }
        }
        android.text.Layout.Alignment alignment = this.f328586g;
        android.text.Layout.Alignment alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
        if (alignment == alignment2) {
            int i19 = this.f328587h & 8388615;
            if (i19 != 1) {
                if (i19 != 3) {
                    if (i19 != 5) {
                        if (i19 != 8388611) {
                            if (i19 != 8388613) {
                                this.f328586g = alignment2;
                            }
                        }
                    }
                    this.f328586g = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                }
                this.f328586g = alignment2;
            } else {
                this.f328586g = android.text.Layout.Alignment.ALIGN_CENTER;
            }
        }
        this.f328584e.setAntiAlias(true);
        boolean z17 = false;
        boolean z18 = (this.f328591l == null || (fp.h.c(18) && this.f328591l == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) && ((i18 = this.f328590k) == Integer.MAX_VALUE || i18 == -1);
        try {
            staticLayout = b(this.f328581b, z18, i17, this.f328596q);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("StaticTextView.StaticLayoutBuilder", "build static layout error: %s", e17.getMessage());
            android.text.StaticLayout staticLayout2 = null;
            int i27 = 0;
            while (i27 < 3) {
                try {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f328581b);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), android.text.style.MetricAffectingSpan.class);
                    if (metricAffectingSpanArr == null || metricAffectingSpanArr.length <= 0) {
                        i27 = 100;
                    } else {
                        spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(metricAffectingSpanArr[0]) - 1, (java.lang.CharSequence) " ");
                        i27++;
                    }
                    this.f328581b = spannableStringBuilder;
                    staticLayout2 = b(spannableStringBuilder, z18, i17, this.f328596q);
                    com.tencent.mars.xlog.Log.i("StaticTextView.StaticLayoutBuilder", "fix from build static layout, fixCount: %s", java.lang.Integer.valueOf(i27));
                    break;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i("StaticTextView.StaticLayoutBuilder", "fix, build static layout error: %s, fixCount: %s", e18.getMessage(), java.lang.Integer.valueOf(i27));
                }
            }
            staticLayout = staticLayout2;
        }
        if (staticLayout == null) {
            java.lang.String charSequence2 = this.f328581b.toString();
            this.f328581b = charSequence2;
            staticLayout = b(charSequence2, z18, i17, this.f328596q);
        }
        mm0.g gVar = new mm0.g(staticLayout);
        gVar.f328604d = this.f328580a;
        gVar.f328605e = this.f328581b;
        gVar.f328603c = this.f328595p;
        gVar.f328602b = this.f328590k;
        gVar.f328607g = this.f328586g;
        gVar.f328608h = this.f328588i;
        gVar.f328606f = this.f328584e;
        gVar.f328609i = this.f328587h;
        gVar.f328610j = this.f328596q;
        mm0.f fVar = f328578s;
        synchronized (fVar.f328600c) {
            int i28 = 0;
            while (true) {
                if (i28 >= fVar.f328599b) {
                    break;
                }
                if (fVar.f328598a[i28] == this) {
                    z17 = true;
                    break;
                }
                i28++;
            }
            if (z17) {
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
            e();
            int i29 = fVar.f328599b;
            mm0.e[] eVarArr = fVar.f328598a;
            if (i29 < eVarArr.length) {
                eVarArr[i29] = this;
                fVar.f328599b = i29 + 1;
            }
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final android.text.StaticLayout b(java.lang.CharSequence charSequence, boolean z17, int i17, int i18) {
        java.lang.Object obj;
        java.lang.reflect.Constructor constructor;
        int i19;
        android.text.TextUtils.TruncateAt truncateAt;
        if (i18 >= 0) {
            return android.text.StaticLayout.Builder.obtain(charSequence, this.f328582c, this.f328583d, this.f328584e, this.f328585f).setAlignment(this.f328586g).setTextDirection(android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(this.f328592m, this.f328593n).setIncludePad(this.f328594o).setEllipsize(this.f328588i).setEllipsizedWidth(i17).setBreakStrategy(i18).setMaxLines(Integer.MAX_VALUE).build();
        }
        if (z17 != 0) {
            return new android.text.StaticLayout(charSequence, this.f328582c, this.f328583d, this.f328584e, this.f328585f, this.f328586g, this.f328593n, this.f328592m, this.f328594o, this.f328588i, i17);
        }
        if (this.f328591l == null) {
            this.f328591l = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        int i27 = this.f328582c;
        int i28 = this.f328583d;
        android.text.TextPaint textPaint = this.f328584e;
        int i29 = this.f328585f;
        android.text.Layout.Alignment alignment = this.f328586g;
        android.text.TextDirectionHeuristic textDirectionHeuristic = this.f328591l;
        float f17 = this.f328593n;
        float f18 = this.f328592m;
        boolean z18 = this.f328594o;
        android.text.TextUtils.TruncateAt truncateAt2 = this.f328588i;
        int i37 = this.f328590k;
        synchronized (om0.a.class) {
            try {
                try {
                    synchronized (om0.a.class) {
                        try {
                            java.lang.Object obj2 = om0.a.f346260b;
                            try {
                                if (obj2 == null) {
                                    try {
                                        try {
                                            try {
                                                obj2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                                om0.a.f346260b = obj2;
                                            } catch (java.lang.NoSuchFieldException e17) {
                                                e = e17;
                                                com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristics.FIRSTSTRONG_LTR not found.", new java.lang.Object[0]);
                                                com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                                throw new java.lang.RuntimeException(e);
                                            }
                                        } catch (java.lang.IllegalAccessException e18) {
                                            e = e18;
                                            com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristics.FIRSTSTRONG_LTR not accessible.", new java.lang.Object[0]);
                                            com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                            throw new java.lang.RuntimeException(e);
                                        }
                                    } catch (java.lang.ClassNotFoundException e19) {
                                        e = e19;
                                        com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristic class not found.", new java.lang.Object[0]);
                                        com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                        throw new java.lang.RuntimeException(e);
                                    } catch (java.lang.Throwable th6) {
                                        e = th6;
                                        com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "Other error.", new java.lang.Object[0]);
                                        com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                        throw new java.lang.RuntimeException(e);
                                    }
                                }
                                obj = obj2;
                                synchronized (om0.a.class) {
                                    constructor = om0.a.f346259a;
                                    if (constructor != null) {
                                        truncateAt = truncateAt2;
                                        i19 = i37;
                                    } else {
                                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                                            truncateAt = truncateAt2;
                                            i19 = i37;
                                        } else {
                                            i19 = i37;
                                            try {
                                                java.lang.Class cls = java.lang.Integer.TYPE;
                                                java.lang.Class cls2 = java.lang.Float.TYPE;
                                                java.lang.reflect.Constructor declaredConstructor = android.text.StaticLayout.class.getDeclaredConstructor(java.lang.CharSequence.class, cls, cls, android.text.TextPaint.class, cls, android.text.Layout.Alignment.class, android.text.TextDirectionHeuristic.class, cls2, cls2, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, cls, cls);
                                                om0.a.f346259a = declaredConstructor;
                                                declaredConstructor.setAccessible(true);
                                                truncateAt = truncateAt2;
                                                e = null;
                                            } catch (java.lang.ClassNotFoundException e27) {
                                                e = e27;
                                                truncateAt = truncateAt2;
                                                com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristic class not found.", new java.lang.Object[0]);
                                            } catch (java.lang.NoSuchMethodException e28) {
                                                e = e28;
                                                truncateAt = truncateAt2;
                                                com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "StaticLayout constructor with max lines not found.", new java.lang.Object[0]);
                                            } catch (java.lang.Throwable th7) {
                                                e = th7;
                                                truncateAt = truncateAt2;
                                                com.tencent.mars.xlog.Log.printErrStackTrace("StaticTextView.StaticLayoutWithMaxLines", e, "Other error.", new java.lang.Object[0]);
                                            }
                                            if (e != null) {
                                                com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "create StaticLayout constructor fail: " + e.getMessage());
                                                com.tencent.mars.xlog.Log.w("StaticTextView.StaticLayoutWithMaxLines", "use builtin StaticLayout.Builder as fallback!");
                                            } else {
                                                constructor = om0.a.f346259a;
                                            }
                                        }
                                        constructor = null;
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                throw th;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                    }
                    if (constructor == null) {
                        return android.text.StaticLayout.Builder.obtain(charSequence, i27, i28, textPaint, i29).setAlignment(alignment).setTextDirection((android.text.TextDirectionHeuristic) obj).setLineSpacing(f18, f17).setIncludePad(z18).setEllipsizedWidth(i17).setEllipsize(truncateAt).setMaxLines(i19).build();
                    }
                    return (android.text.StaticLayout) constructor.newInstance(charSequence, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), textPaint, java.lang.Integer.valueOf(i29), alignment, textDirectionHeuristic, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Boolean.valueOf(z18), truncateAt, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                } catch (java.lang.Exception e29) {
                    e = e29;
                    z17 = "Error creating StaticLayout with max lines: ";
                    throw new java.lang.IllegalStateException(z17 + e.getCause());
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                throw new java.lang.IllegalStateException(z17 + e.getCause());
            }
        }
    }

    public void e() {
        this.f328580a = null;
        this.f328581b = null;
        this.f328582c = 0;
        this.f328583d = 0;
        this.f328584e = new android.text.TextPaint();
        this.f328585f = 0;
        this.f328586g = android.text.Layout.Alignment.ALIGN_NORMAL;
        this.f328587h = 51;
        this.f328588i = null;
        this.f328589j = 0;
        this.f328590k = Integer.MAX_VALUE;
        this.f328591l = null;
        this.f328592m = 0.0f;
        this.f328593n = 1.0f;
        this.f328594o = false;
        this.f328595p = 0;
        this.f328597r = null;
        this.f328596q = -1;
    }
}
