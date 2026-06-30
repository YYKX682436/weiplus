package dy;

/* loaded from: classes5.dex */
public final class d extends android.widget.FrameLayout implements cy.g {

    /* renamed from: d, reason: collision with root package name */
    public final cy.i f244530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Double f244531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Double f244532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f244533g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f244534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f244535i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f244536m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f244537n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f244538o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, cy.i sceneCtx) {
        super(context);
        java.lang.String b17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sceneCtx, "sceneCtx");
        this.f244530d = sceneCtx;
        this.f244533g = "";
        this.f244534h = "";
        this.f244535i = "";
        java.lang.Object obj = sceneCtx.f224670b.get("isDark");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.util.Map map = sceneCtx.f224669a;
        java.lang.Object obj2 = map.get("latitude");
        java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        this.f244531e = number != null ? java.lang.Double.valueOf(number.doubleValue()) : null;
        java.lang.Object obj3 = map.get("longitude");
        java.lang.Number number2 = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
        this.f244532f = number2 != null ? java.lang.Double.valueOf(number2.doubleValue()) : null;
        java.lang.Object obj4 = map.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        this.f244533g = str == null ? "" : str;
        java.lang.Object obj5 = map.get("address");
        java.lang.String str2 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        this.f244534h = str2 == null ? "" : str2;
        java.lang.Object obj6 = map.get("poiName");
        java.lang.String str3 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        this.f244535i = str3 != null ? str3 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotMapSceneView", "applyPayload(init) itemId=" + sceneCtx.f224672d + " lat=" + this.f244531e + " lng=" + this.f244532f + " title='" + this.f244533g + "' address='" + this.f244534h + "' poiName='" + this.f244535i + '\'');
        int parseColor = android.graphics.Color.parseColor(booleanValue ? "#FF242424" : "#FFF3F5F7");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(android.util.TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()));
        gradientDrawable.setColor(parseColor);
        setBackground(gradientDrawable);
        setClipChildren(true);
        setClipToPadding(true);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        linearLayout.setPadding(a(12), a(10), a(12), a(10));
        int parseColor2 = booleanValue ? -1 : android.graphics.Color.parseColor("#FF222222");
        int parseColor3 = android.graphics.Color.parseColor(booleanValue ? "#FFB0B0B0" : "#FF666666");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextColor(parseColor2);
        textView.setTextSize(2, 15.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f244537n = textView;
        linearLayout.addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(parseColor3);
        textView2.setTextSize(2, 12.0f);
        textView2.setMaxLines(2);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a(2);
        textView2.setLayoutParams(layoutParams);
        this.f244538o = textView2;
        linearLayout.addView(textView2);
        android.view.View cVar = new dy.c(context, booleanValue);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        layoutParams2.topMargin = a(8);
        cVar.setLayoutParams(layoutParams2);
        linearLayout.addView(cVar);
        java.lang.String str4 = this.f244533g;
        if (str4.length() == 0) {
            str4 = this.f244535i;
            if (str4.length() == 0) {
                str4 = "map card";
            }
        }
        android.widget.TextView textView3 = this.f244537n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleView");
            throw null;
        }
        textView3.setText(str4);
        android.widget.TextView textView4 = this.f244538o;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("subtitleView");
            throw null;
        }
        if (this.f244534h.length() > 0) {
            if ((this.f244535i.length() > 0) && !kotlin.jvm.internal.o.b(this.f244534h, this.f244535i)) {
                b17 = this.f244535i + " · " + this.f244534h;
                textView4.setText(b17);
                addView(linearLayout);
                setClickable(true);
                setLongClickable(false);
                setOnClickListener(new dy.b(this, context));
            }
        }
        if (this.f244534h.length() > 0) {
            b17 = this.f244534h;
        } else {
            if (!(this.f244535i.length() > 0) || kotlin.jvm.internal.o.b(this.f244535i, str4)) {
                b17 = b();
                if (b17 == null) {
                    b17 = "unknown location";
                }
            } else {
                b17 = this.f244535i;
            }
        }
        textView4.setText(b17);
        addView(linearLayout);
        setClickable(true);
        setLongClickable(false);
        setOnClickListener(new dy.b(this, context));
    }

    public final int a(int i17) {
        return (int) android.util.TypedValue.applyDimension(1, i17, getResources().getDisplayMetrics());
    }

    public final java.lang.String b() {
        java.lang.Double d17 = this.f244531e;
        if (d17 != null) {
            double doubleValue = d17.doubleValue();
            java.lang.Double d18 = this.f244532f;
            if (d18 != null) {
                java.lang.String format = java.lang.String.format("%.4f, %.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue), java.lang.Double.valueOf(d18.doubleValue())}, 2));
                kotlin.jvm.internal.o.f(format, "format(...)");
                return format;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        cy.i iVar = this.f244530d;
        super.onAttachedToWindow();
        if (this.f244536m) {
            return;
        }
        this.f244536m = true;
        try {
            iVar.f224671c.getClass();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)).getValue());
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotMapSceneView", "ready report failed: " + m524exceptionOrNullimpl);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotMapSceneView", "ready reported itemId=" + iVar.f224672d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotMapSceneView", "ready report threw: " + th6);
        }
    }
}
