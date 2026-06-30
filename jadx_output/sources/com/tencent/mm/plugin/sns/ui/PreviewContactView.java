package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes2.dex */
public class PreviewContactView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f166576d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TableLayout f166577e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f166578f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f166579g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f166580h;

    /* renamed from: i, reason: collision with root package name */
    public int f166581i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f166582m;

    public PreviewContactView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166578f = new java.util.ArrayList();
        this.f166579g = new java.util.HashMap();
        this.f166580h = new java.util.HashMap();
        this.f166581i = 5;
        this.f166582m = false;
        this.f166576d = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f166577e = (android.widget.TableLayout) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ct8, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.cgi);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    private android.widget.TextView getEllipsizeTV() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        android.widget.TextView textView = new android.widget.TextView(this.f166576d);
        android.widget.TextView textView2 = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.a5m);
        if (textView2 != null) {
            textView.setTextSize(0, textView2.getTextSize());
        }
        textView.setText("...");
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        return textView;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.f166582m) {
            setList(this.f166578f);
            this.f166582m = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setImageClick(com.tencent.mm.plugin.sns.ui.y7 y7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setLineNum(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f166581i = i17;
        setList(this.f166578f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    public void setList(java.util.List<java.lang.String> list) {
        int i17;
        int width;
        java.util.List<java.lang.String> list2 = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        if (list2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        this.f166578f = list2;
        if (this.f166577e.getChildCount() > 0) {
            this.f166577e.removeAllViews();
        }
        if (list.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        int size = list.size();
        int i18 = 0;
        int i19 = 0;
        int i27 = -1;
        while (i18 < size) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            java.util.HashMap hashMap = (java.util.HashMap) this.f166580h;
            android.widget.TableRow tableRow = (android.widget.TableRow) hashMap.get(java.lang.Integer.valueOf(i19));
            android.content.Context context = this.f166576d;
            if (tableRow == null) {
                tableRow = new android.widget.TableRow(context);
                hashMap.put(java.lang.Integer.valueOf(i19), tableRow);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            tableRow.removeAllViews();
            int i28 = 0;
            while (i28 < this.f166581i && i18 < size) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                java.util.HashMap hashMap2 = (java.util.HashMap) this.f166579g;
                android.view.View view = (android.view.View) hashMap2.get(java.lang.Integer.valueOf(i18));
                if (view == null) {
                    view = android.view.View.inflate(context, com.tencent.mm.R.layout.ct7, null);
                    hashMap2.put(java.lang.Integer.valueOf(i18), view);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                java.lang.String str = list2.get(i18);
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hjz);
                imageView.setBackgroundDrawable(null);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
                view.setTag(0);
                view.setClickable(false);
                if (i27 == -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                    if (view.getWidth() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        i17 = size;
                        width = -1;
                    } else {
                        this.f166582m = true;
                        android.widget.TextView ellipsizeTV = getEllipsizeTV();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        android.graphics.Rect rect = new android.graphics.Rect();
                        i17 = size;
                        ellipsizeTV.getPaint().getTextBounds("...", 0, 3, rect);
                        int width2 = rect.width();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        width = getWidth() / view.getWidth();
                        if (width == 5) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        } else {
                            if ((getWidth() - (view.getWidth() * width)) - width2 < 0) {
                                width--;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        }
                    }
                    i27 = width;
                } else {
                    i17 = size;
                }
                if (i28 == i27) {
                    tableRow.addView(getEllipsizeTV());
                    i18 = i17;
                } else {
                    tableRow.addView(view);
                }
                i28++;
                i18++;
                list2 = list;
                size = i17;
            }
            this.f166577e.addView(tableRow);
            i19++;
            list2 = list;
            size = size;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }
}
