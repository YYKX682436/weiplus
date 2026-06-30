package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class CollapsibleTextView extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f166253y = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f166254d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f166255e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView f166256f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsTextView f166257g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f166258h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f166259i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f166260m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f166261n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f166262o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f166263p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f166264q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f166265r;

    /* renamed from: s, reason: collision with root package name */
    public int f166266s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ns f166267t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.a f166268u;

    /* renamed from: v, reason: collision with root package name */
    public int f166269v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View.OnClickListener f166270w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f166271x;

    public CollapsibleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166254d = false;
        this.f166259i = true;
        this.f166262o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f166266s = 0;
        this.f166271x = new com.tencent.mm.plugin.sns.ui.s1(this);
        this.f166255e = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166260m = this.f166255e.getString(com.tencent.mm.R.string.j_3);
        this.f166261n = this.f166255e.getString(com.tencent.mm.R.string.j_2);
        if (ld4.a.f318105a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setPadding(0, -3, 0, 0);
            setOrientation(1);
            com.tencent.mm.plugin.sns.ui.SnsTextView snsTextView = new com.tencent.mm.plugin.sns.ui.SnsTextView(this.f166255e);
            this.f166257g = snsTextView;
            snsTextView.setId(com.tencent.mm.R.id.cuu);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            int b17 = i65.a.b(this.f166255e, 1);
            layoutParams.topMargin = b17;
            layoutParams.gravity = 16;
            int i17 = b17 * 2;
            int i18 = b17 * 3;
            this.f166257g.setPadding(i17, i18, i17, i18);
            this.f166257g.setMaxLines(1);
            this.f166257g.setTextColor(i65.a.d(this.f166255e, com.tencent.mm.R.color.a0c));
            this.f166257g.setTextSize(0, i65.a.p(this.f166255e, com.tencent.mm.R.dimen.f479897ia));
            this.f166257g.setBackground(i65.a.i(this.f166255e, com.tencent.mm.R.drawable.f482127b26));
            addView(this.f166257g, layoutParams);
            com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView snsPostDescPreloadTextView = new com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView(this.f166255e);
            this.f166256f = snsPostDescPreloadTextView;
            snsPostDescPreloadTextView.setId(com.tencent.mm.R.id.cut);
            this.f166256f.setBackground(i65.a.i(this.f166255e, com.tencent.mm.R.drawable.b2i));
            this.f166256f.setTextColor(i65.a.d(this.f166255e, com.tencent.mm.R.color.a0c));
            this.f166256f.f68481d.k(0, i65.a.p(this.f166255e, com.tencent.mm.R.dimen.f479897ia));
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = b17;
            layoutParams2.gravity = 16;
            addView(this.f166256f, layoutParams2);
            android.widget.TextView textView = new android.widget.TextView(this.f166255e);
            this.f166258h = textView;
            textView.setId(com.tencent.mm.R.id.cup);
            this.f166258h.setBackground(i65.a.i(this.f166255e, com.tencent.mm.R.drawable.b1h));
            this.f166258h.setGravity(17);
            this.f166258h.setMaxLines(1);
            this.f166258h.setTextColor(i65.a.d(this.f166255e, com.tencent.mm.R.color.f479308vo));
            this.f166258h.setTextSize(0, i65.a.p(this.f166255e, com.tencent.mm.R.dimen.f479897ia));
            this.f166257g.setTextSize(0, i65.a.p(this.f166255e, com.tencent.mm.R.dimen.f479897ia));
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = b17 * 4;
            addView(this.f166258h, layoutParams3);
            this.f166258h.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        } else {
            android.view.View inflate = com.tencent.mm.ui.id.b(this.f166255e).inflate(com.tencent.mm.R.layout.f488627yx, this);
            inflate.setPadding(0, -3, 0, 0);
            this.f166256f = (com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView) inflate.findViewById(com.tencent.mm.R.id.cut);
            this.f166258h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cup);
            this.f166257g = (com.tencent.mm.plugin.sns.ui.SnsTextView) inflate.findViewById(com.tencent.mm.R.id.cuu);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void c(int i17, java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.util.HashMap hashMap, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.ui.bs bsVar, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166255e = bsVar.f168042h;
        this.f166263p = hashMap;
        this.f166254d = z17;
        this.f166264q = str;
        this.f166265r = str2;
        this.f166266s = i17;
        this.f166256f.setCollapseibleMap(hashMap);
        this.f166256f.setIsAd(z17);
        this.f166260m = this.f166255e.getString(com.tencent.mm.R.string.j_3);
        this.f166261n = this.f166255e.getString(com.tencent.mm.R.string.j_2);
        this.f166257g.setOriginText(str3);
        com.tencent.mm.plugin.sns.ui.go goVar = new com.tencent.mm.plugin.sns.ui.go(this.f166265r, this.f166264q, false, false, 1);
        goVar.f168450f = this.f166267t.f170051w;
        if (i17 == 0) {
            this.f166256f.setText(charSequence);
            this.f166257g.setVisibility(8);
            this.f166258h.setVisibility(0);
            this.f166256f.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.span.y0 y0Var = new com.tencent.mm.pluginsdk.ui.span.y0(this.f166255e);
            y0Var.f191311q = new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.sns.ui.CollapsibleTextView$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    int i18 = com.tencent.mm.plugin.sns.ui.CollapsibleTextView.f166253y;
                    com.tencent.mm.plugin.sns.ui.CollapsibleTextView collapsibleTextView = com.tencent.mm.plugin.sns.ui.CollapsibleTextView.this;
                    collapsibleTextView.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", collapsibleTextView, array);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", collapsibleTextView, array2);
                    collapsibleTextView.f166256f.performLongClick();
                    yj0.a.i(false, collapsibleTextView, "com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    yj0.a.i(false, collapsibleTextView, "com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
            };
            com.tencent.mm.pluginsdk.ui.span.a aVar = this.f166268u;
            int i18 = this.f166269v;
            y0Var.f191308n = aVar;
            y0Var.f191309o = i18;
            y0Var.f191310p = 30;
            y0Var.f191314t = new com.tencent.mm.plugin.sns.ui.r1(this);
            this.f166256f.setOnTouchListener(y0Var);
            this.f166256f.setTag(goVar);
            if (hashMap.get(str) == null) {
                this.f166259i = false;
                this.f166258h.setVisibility(8);
                this.f166256f.setMaxLines(8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f166259i = true;
            int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
            if (intValue == 0) {
                this.f166258h.setVisibility(8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            } else {
                if (intValue == 1) {
                    this.f166256f.setMaxLines(6);
                    this.f166258h.setVisibility(0);
                    this.f166258h.setText(this.f166260m);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    return;
                }
                if (intValue == 2) {
                    this.f166256f.setMaxLines(Integer.MAX_VALUE);
                    this.f166258h.setVisibility(0);
                    this.f166258h.setText(this.f166261n);
                }
            }
        } else {
            this.f166257g.setText(charSequence, bufferType);
            this.f166257g.setTag(goVar);
            this.f166257g.setVisibility(0);
            this.f166258h.setVisibility(8);
            this.f166256f.setVisibility(8);
            this.f166257g.setOnClickListener(bsVar.f168039e.H);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public int getSpreadHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        com.tencent.mars.xlog.Log.i("MicroMsg.CollapsibleTextView", "count:" + this.f166256f.getLineCount() + "  height:" + this.f166256f.getLineHeight());
        int lineCount = (this.f166256f.getLineCount() + (-7)) * this.f166256f.getLineHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        return lineCount;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f166266s == 0 && !this.f166254d) {
            if (this.f166259i) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f166259i = true;
            if (this.f166256f.getLineCount() <= 7) {
                this.f166263p.put(this.f166264q, 0);
            } else {
                this.f166263p.put(this.f166264q, 1);
                this.f166262o.post(this.f166271x);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166258h.setClickable(z17);
        this.f166257g.setClickable(z17);
        this.f166256f.setClickable(z17);
        super.setClickable(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setContentTextColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166256f.setTextColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    @Override // android.view.View
    public void setLongClickable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166258h.setLongClickable(z17);
        this.f166257g.setLongClickable(z17);
        this.f166256f.setLongClickable(z17);
        super.setLongClickable(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setOnNormalClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnNormalClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f166270w = onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnNormalClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setOpClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        android.widget.TextView textView = this.f166258h;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        setOnClickListener(onClickListener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setShrinkOrSpreadListener(com.tencent.mm.plugin.sns.ui.widget.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView snsPostDescPreloadTextView = this.f166256f;
        if (snsPostDescPreloadTextView != null) {
            snsPostDescPreloadTextView.setShrinkOrSpreadListener(g3Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }
}
