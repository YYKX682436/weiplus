package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsPostDescPreloadTextView extends com.tencent.mm.kiss.widget.textview.PLTextView {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f170895r = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f170896f;

    /* renamed from: g, reason: collision with root package name */
    public int f170897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f170898h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f170899i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f170900m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.g3 f170901n;

    /* renamed from: o, reason: collision with root package name */
    public final int f170902o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f170903p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.f3 f170904q;

    public SnsPostDescPreloadTextView(android.content.Context context) {
        super(context);
        this.f170896f = true;
        this.f170897g = 0;
        this.f170898h = false;
        this.f170899i = false;
        this.f170900m = false;
        this.f170901n = null;
        this.f170902o = android.view.ViewConfiguration.getLongPressTimeout();
        this.f170904q = new com.tencent.mm.plugin.sns.ui.widget.f3(this);
    }

    private int getPostDescWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        int i17 = this.f170897g;
        if (i17 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
            return i17;
        }
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        int e17 = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return e17;
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public nm0.a b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f170896f = true;
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        nm0.a c17 = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return c17;
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void g(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView
    public void h(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        if (charSequence != null) {
            f(charSequence, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.PLTextView, com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        int actionMasked = motionEvent.getActionMasked();
        com.tencent.mm.plugin.sns.ui.widget.f3 f3Var = this.f170904q;
        if (actionMasked == 0) {
            this.f170899i = true;
            postDelayed(f3Var, this.f170902o);
        } else if (actionMasked == 1) {
            if (!this.f170898h && this.f170899i && !this.f170900m) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                if (getTag() instanceof com.tencent.mm.plugin.sns.ui.go) {
                    com.tencent.mm.plugin.sns.ui.go goVar = (com.tencent.mm.plugin.sns.ui.go) getTag();
                    if (goVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: SnsPostDescInfo null");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                    } else {
                        java.util.Map map = this.f170903p;
                        if (map != null) {
                            java.lang.String str = goVar.f168446b;
                            if (!map.containsKey(str) || !((java.lang.Integer) this.f170903p.get(str)).equals(0)) {
                                if (this.f170903p.containsKey(str) && ((java.lang.Integer) this.f170903p.get(str)).equals(1)) {
                                    this.f170903p.put(str, 2);
                                    com.tencent.mm.plugin.sns.ui.widget.g3 g3Var = this.f170901n;
                                    if (g3Var != null) {
                                        g3Var.a();
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                                } else {
                                    this.f170903p.put(str, 1);
                                    com.tencent.mm.plugin.sns.ui.widget.g3 g3Var2 = this.f170901n;
                                    if (g3Var2 != null) {
                                        g3Var2.b();
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: collapseibleMap error");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: skip");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                }
            }
            this.f170898h = false;
            this.f170899i = false;
            removeCallbacks(f3Var);
        } else if (actionMasked == 3) {
            this.f170898h = false;
            this.f170899i = false;
            removeCallbacks(f3Var);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return onTouchEvent;
    }

    public void setCollapseibleMap(java.util.Map<java.lang.String, java.lang.Integer> map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollapseibleMap", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f170903p = map;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapseibleMap", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void setIsAd(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f170900m = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    @Override // com.tencent.mm.kiss.widget.textview.StaticTextView
    public void setMaxLines(int i17) {
        int postDescWidth;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        if (getText() == null) {
            super.setMaxLines(i17);
        }
        boolean z17 = false;
        if (i17 < 7) {
            if (this.f170896f) {
                com.tencent.mm.plugin.sns.ui.widget.h3.a();
                setConfig(com.tencent.mm.plugin.sns.ui.widget.h3.f171151e.d());
                this.f170896f = false;
                z17 = true;
            }
        } else if (!this.f170896f) {
            com.tencent.mm.plugin.sns.ui.widget.h3.a();
            setConfig(com.tencent.mm.plugin.sns.ui.widget.h3.f171151e.c());
            this.f170896f = true;
            z17 = true;
        }
        if (z17) {
            mm0.g b17 = mm0.c.f328575b.b(getConfig(), getText());
            if (b17 == null && (postDescWidth = getPostDescWidth()) > 0) {
                b17 = mm0.e.d(getText(), postDescWidth, getConfig()).a();
            }
            if (b17 != null) {
                setTextLayout(b17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxLines", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void setShrinkOrSpreadListener(com.tencent.mm.plugin.sns.ui.widget.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f170901n = g3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void setSpecialWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpecialWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f170897g = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpecialWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public SnsPostDescPreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170896f = true;
        this.f170897g = 0;
        this.f170898h = false;
        this.f170899i = false;
        this.f170900m = false;
        this.f170901n = null;
        this.f170902o = android.view.ViewConfiguration.getLongPressTimeout();
        this.f170904q = new com.tencent.mm.plugin.sns.ui.widget.f3(this);
    }

    public SnsPostDescPreloadTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170896f = true;
        this.f170897g = 0;
        this.f170898h = false;
        this.f170899i = false;
        this.f170900m = false;
        this.f170901n = null;
        this.f170902o = android.view.ViewConfiguration.getLongPressTimeout();
        this.f170904q = new com.tencent.mm.plugin.sns.ui.widget.f3(this);
    }
}
