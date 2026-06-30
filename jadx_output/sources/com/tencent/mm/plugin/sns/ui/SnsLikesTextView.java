package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsLikesTextView extends android.widget.RelativeLayout implements com.tencent.mm.plugin.sns.ui.ks {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f167239z = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f167241e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f167242f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f167243g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f167244h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskTextView f167245i;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f167246m;

    /* renamed from: n, reason: collision with root package name */
    public int f167247n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167248o;

    /* renamed from: p, reason: collision with root package name */
    public int f167249p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.q1 f167250q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pointers.PBool f167251r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f167252s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f167253t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ns f167254u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f167255v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f167256w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.drawable.Drawable f167257x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f167258y;

    public SnsLikesTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.Integer num = (java.lang.Integer) this.f167252s.get(this.f167240d);
        if (num != null) {
            int intValue = num.intValue();
            android.text.SpannableStringBuilder spannableStringBuilder = this.f167246m;
            if (intValue == 0) {
                int lineCount = this.f167245i.getLayout().getLineCount();
                this.f167244h.setVisibility(8);
                if (lineCount > this.f167247n && (baseViewHolder = this.f167253t) != null) {
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.R(baseViewHolder.f169272h, this.f167254u, spannableStringBuilder.toString(), spannableStringBuilder.toString(), lineCount, lineCount, false, this.f167253t.f169262c, this.f167247n);
                }
            } else if (intValue == 1) {
                int lineCount2 = this.f167245i.getLayout().getLineCount();
                int max = java.lang.Math.max(java.lang.Math.min(this.f167247n, lineCount2), 0);
                java.lang.CharSequence subSequence = spannableStringBuilder.subSequence(0, this.f167245i.getLayout().getLineVisibleEnd(max - 1));
                int lastIndexOf = subSequence.toString().lastIndexOf(",");
                android.text.SpannableStringBuilder spannableStringBuilder2 = (lastIndexOf <= 0 || lastIndexOf >= subSequence.length()) ? new android.text.SpannableStringBuilder(subSequence) : new android.text.SpannableStringBuilder(subSequence.subSequence(0, lastIndexOf));
                java.lang.String spannableStringBuilder3 = spannableStringBuilder2.toString();
                spannableStringBuilder2.append((java.lang.CharSequence) ",...");
                this.f167245i.setText(spannableStringBuilder2, android.widget.TextView.BufferType.SPANNABLE);
                this.f167244h.setVisibility(0);
                this.f167242f.setText(getContext().getString(com.tencent.mm.R.string.jca));
                this.f167243g.setRotation(90.0f);
                this.f167243g.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_arrow, getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo)));
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder2 = this.f167253t;
                if (baseViewHolder2 != null) {
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.R(baseViewHolder2.f169272h, this.f167254u, spannableStringBuilder3, spannableStringBuilder.toString(), max, lineCount2, true, this.f167253t.f169262c, this.f167247n);
                }
            } else if (intValue == 2) {
                int lineCount3 = this.f167245i.getLayout().getLineCount();
                this.f167245i.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                this.f167244h.setVisibility(0);
                this.f167243g.setRotation(-90.0f);
                this.f167243g.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_arrow, getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo)));
                this.f167242f.setText(getContext().getString(com.tencent.mm.R.string.jc_));
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder3 = this.f167253t;
                if (baseViewHolder3 != null) {
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.R(baseViewHolder3.f169272h, this.f167254u, spannableStringBuilder.toString(), spannableStringBuilder.toString(), lineCount3, lineCount3, false, this.f167253t.f169262c, this.f167247n);
                }
            } else if (intValue == 3) {
                int lineCount4 = this.f167245i.getLayout().getLineCount();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(4, null);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = getContext();
                float textSize = this.f167245i.getTextSize();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize);
                int max2 = java.lang.Math.max(java.lang.Math.min(this.f167247n, lineCount4), 0);
                java.lang.CharSequence subSequence2 = spannableStringBuilder.subSequence(0, this.f167245i.getLayout().getLineVisibleEnd(max2 - 1));
                int lastIndexOf2 = subSequence2.toString().lastIndexOf(",");
                android.text.SpannableStringBuilder spannableStringBuilder4 = (lastIndexOf2 <= 0 || lastIndexOf2 >= subSequence2.length()) ? new android.text.SpannableStringBuilder(subSequence2) : new android.text.SpannableStringBuilder(subSequence2.subSequence(0, lastIndexOf2));
                j17.setSpan(new com.tencent.mm.pluginsdk.ui.span.d1(getContext(), str, new com.tencent.mm.plugin.sns.ui.bl(this, str), this.f167249p == 10 ? 3 : 2), 0, j17.length(), 33);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(spannableStringBuilder4.toString());
                spannableStringBuilder4.append((java.lang.CharSequence) ",...").append((java.lang.CharSequence) ",").append((java.lang.CharSequence) j17);
                this.f167245i.setText(spannableStringBuilder4, android.widget.TextView.BufferType.SPANNABLE);
                this.f167244h.setVisibility(0);
                this.f167242f.setText(getContext().getString(com.tencent.mm.R.string.jca));
                this.f167243g.setRotation(90.0f);
                this.f167243g.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_arrow, getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo)));
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder4 = this.f167253t;
                if (baseViewHolder4 != null) {
                    com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                    android.view.View view = baseViewHolder4.f169272h;
                    com.tencent.mm.plugin.sns.ui.ns nsVar = this.f167254u;
                    sb6.append(",");
                    sb6.append((java.lang.CharSequence) j17);
                    s0Var.R(view, nsVar, sb6.toString(), spannableStringBuilder.toString(), max2, lineCount4, true, this.f167253t.f169262c, this.f167247n);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShrinkMode", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x042a A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:12:0x0062, B:14:0x0070, B:18:0x00c1, B:21:0x00c9, B:23:0x018b, B:24:0x00e9, B:28:0x011b, B:30:0x011f, B:32:0x0125, B:34:0x013a, B:36:0x0177, B:39:0x012c, B:40:0x0134, B:44:0x01a1, B:45:0x01c0, B:47:0x01e8, B:49:0x01ec, B:51:0x01f2, B:53:0x020c, B:55:0x021c, B:56:0x0226, B:59:0x0230, B:61:0x0254, B:63:0x025a, B:65:0x0278, B:67:0x0282, B:69:0x02a2, B:71:0x0289, B:73:0x0293, B:75:0x029d, B:76:0x02b6, B:79:0x02c8, B:84:0x030a, B:86:0x030e, B:88:0x0316, B:93:0x032c, B:95:0x040a, B:96:0x0350, B:99:0x0365, B:101:0x036d, B:102:0x0385, B:104:0x039b, B:106:0x03a1, B:108:0x03b1, B:110:0x03b7, B:112:0x03cb, B:114:0x03d1, B:115:0x03d3, B:116:0x03dc, B:117:0x0403, B:123:0x0418, B:125:0x042a, B:127:0x0430, B:129:0x0438, B:132:0x0449, B:133:0x0450, B:142:0x02dd, B:143:0x01b1, B:145:0x0077, B:147:0x007d, B:149:0x008e, B:152:0x0094, B:154:0x00ae), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(hm5.c r28, int r29, com.tencent.mm.plugin.sns.ui.bs r30, java.lang.String r31, int r32, boolean r33, com.tencent.mm.pointers.PBool r34, com.tencent.mm.plugin.sns.ui.ns r35, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r36) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsLikesTextView.b(hm5.c, int, com.tencent.mm.plugin.sns.ui.bs, java.lang.String, int, boolean, com.tencent.mm.pointers.PBool, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ks
    public java.lang.String getKey() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.String str = this.f167240d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        return str;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.HashMap hashMap;
        com.tencent.mm.pointers.PBool pBool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        int lineCount = this.f167245i.getLineCount();
        int i28 = this.f167247n;
        if (i28 > 0 && lineCount > i28 && (pBool = this.f167251r) != null) {
            pBool.value = true;
        }
        if (i28 > 0 && (hashMap = this.f167252s) != null) {
            if (this.f167241e) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                return;
            }
            this.f167241e = true;
            if (hashMap.get(this.f167240d) == null) {
                if (!this.f167248o) {
                    this.f167252s.put(this.f167240d, 0);
                } else if (lineCount <= this.f167247n) {
                    this.f167252s.put(this.f167240d, 0);
                } else {
                    this.f167252s.put(this.f167240d, 1);
                }
            }
            post(this.f167258y);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setClickableCallBack(com.tencent.mm.plugin.sns.ui.q1 q1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f167250q = q1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickableCallBack", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setCollapseibleLikeMap(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        this.f167252s = hashMap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapseibleLikeMap", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setLikeTvTag(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        com.tencent.mm.plugin.sns.ui.MaskTextView maskTextView = this.f167245i;
        if (maskTextView != null) {
            maskTextView.setTag(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikeTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setLikedTextTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        com.tencent.mm.plugin.sns.ui.MaskTextView maskTextView = this.f167245i;
        if (maskTextView != null) {
            maskTextView.setOnTouchListener(onTouchListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedTextTouchListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setOpClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.widget.LinearLayout linearLayout = this.f167244h;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public void setOpTvTag(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.widget.LinearLayout linearLayout = this.f167244h;
        if (linearLayout != null) {
            linearLayout.setTag(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpTvTag", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }

    public SnsLikesTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f167240d = null;
        this.f167241e = true;
        this.f167242f = null;
        this.f167243g = null;
        this.f167244h = null;
        this.f167245i = null;
        this.f167246m = new android.text.SpannableStringBuilder(" ");
        this.f167247n = 0;
        this.f167248o = false;
        this.f167249p = 0;
        this.f167250q = null;
        this.f167251r = null;
        this.f167252s = null;
        this.f167253t = null;
        this.f167254u = null;
        this.f167258y = new com.tencent.mm.plugin.sns.ui.dl(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.csd, this);
        this.f167242f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n9u);
        this.f167243g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n9s);
        this.f167244h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.n9t);
        this.f167245i = (com.tencent.mm.plugin.sns.ui.MaskTextView) findViewById(com.tencent.mm.R.id.n9v);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
    }
}
