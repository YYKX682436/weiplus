package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsCardAdTagListView extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f170842i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170843d;

    /* renamed from: e, reason: collision with root package name */
    public int f170844e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f170845f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f170846g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f170847h;

    public SnsCardAdTagListView(android.content.Context context) {
        super(context);
        this.f170843d = new java.util.ArrayList();
    }

    public void a(java.util.List list) {
        java.lang.String str;
        int a17;
        int a18;
        android.view.View inflate;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        if (list != null) {
            int i17 = 0;
            while (i17 < list.size()) {
                boolean z17 = i17 != 0;
                com.tencent.mm.plugin.sns.storage.k kVar = (com.tencent.mm.plugin.sns.storage.k) list.get(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                if (kVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                } else {
                    java.lang.String str2 = kVar.f166028a;
                    int color = getContext().getResources().getColor(com.tencent.mm.R.color.FG_1);
                    int color2 = getContext().getResources().getColor(com.tencent.mm.R.color.a5d);
                    if (com.tencent.mm.ui.bk.C()) {
                        str = kVar.f166030c;
                        a17 = a84.c0.a(kVar.f166034g, color);
                        a18 = a84.c0.a(kVar.f166032e, color2);
                    } else {
                        str = kVar.f166029b;
                        a17 = a84.c0.a(kVar.f166033f, color);
                        a18 = a84.c0.a(kVar.f166031d, color2);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        android.content.Context context = this.f170846g;
                        if (context != null) {
                            inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f487955ci, (android.view.ViewGroup) null);
                        } else {
                            android.app.Activity activity = this.f170845f;
                            inflate = activity != null ? activity.getLayoutInflater().inflate(com.tencent.mm.R.layout.f487955ci, (android.view.ViewGroup) null) : null;
                        }
                        if (inflate == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCardTagListView", "error in tagview inflate");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                        } else {
                            inflate.getBackground().setColorFilter(a18, android.graphics.PorterDuff.Mode.SRC);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b7l);
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.b7j);
                            weImageView.setVisibility(8);
                            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                            if (z17) {
                                layoutParams.leftMargin = this.f170844e;
                            }
                            textView.setText(str2);
                            textView.setTextColor(a17);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadTagIcon", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                                if (!android.text.TextUtils.equals((java.lang.String) weImageView.getTag(com.tencent.mm.R.id.n1z), str)) {
                                    weImageView.setImageDrawable(null);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    if (android.text.TextUtils.isEmpty(str)) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    } else {
                                        weImageView.hashCode();
                                        weImageView.setTag(com.tencent.mm.R.id.n1z, str);
                                        za4.t0.a(str, false, 41, 0, new com.tencent.mm.plugin.sns.ui.widget.f1(weImageView, str, textView));
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadTagIcon", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                            }
                            addView(inflate, layoutParams);
                            ((java.util.ArrayList) this.f170843d).add(inflate);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                }
                i17++;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public java.lang.String getOriginSnsId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        java.lang.String str = this.f170847h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        return str;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.onMeasure(i17, i18);
        int i19 = 0;
        int i27 = 0;
        while (true) {
            list = this.f170843d;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            if (i19 > 0) {
                i27 += this.f170844e;
            }
            if (i27 >= getMeasuredWidth()) {
                i19--;
                break;
            }
            i27 += ((android.view.View) ((java.util.ArrayList) list).get(i19)).getMeasuredWidth();
            if (i27 >= getMeasuredWidth()) {
                break;
            } else {
                i19++;
            }
        }
        if (i19 >= 0 && i19 < ((java.util.ArrayList) list).size()) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i19);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b7l);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.widget.e1(this, textView, view));
            while (true) {
                i19++;
                if (i19 >= ((java.util.ArrayList) list).size()) {
                    break;
                }
                removeView((android.view.View) ((java.util.ArrayList) list).get(i19));
                ((java.util.ArrayList) list).remove(i19);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.removeAllViews();
        ((java.util.ArrayList) this.f170843d).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setActivityContext(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f170845f = activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setContext(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f170846g = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setOriginSnsId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f170847h = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setTagSpace(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f170844e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public SnsCardAdTagListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170843d = new java.util.ArrayList();
    }

    public SnsCardAdTagListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170843d = new java.util.ArrayList();
    }
}
