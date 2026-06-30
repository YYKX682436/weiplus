package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\u0013\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001d\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aB%\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0016\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Landroid/view/View;", "getContentView", "Lbd4/b;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setStateChangeListener", "", "content", "setCustomText", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "q", "Ljz5/g;", "getContentTv", "()Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "contentTv", "r", "getCollapseTv", "collapseTv", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveCommentView extends com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout {
    public static int G = -1;
    public yz5.l A;
    public int B;
    public yz5.p C;
    public int D;
    public bd4.b E;
    public final java.lang.Runnable F;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f169111o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f169112p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g contentTv;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final jz5.g collapseTv;

    /* renamed from: s, reason: collision with root package name */
    public r45.e86 f169115s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f169116t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f169117u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f169118v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f169119w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f169120x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f169121y;

    /* renamed from: z, reason: collision with root package name */
    public final int f169122z;

    public ImproveCommentView(android.content.Context context) {
        super(context);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169111o = string;
        pc4.d dVar = pc4.d.f353410a;
        this.f169112p = dVar.D();
        this.contentTv = jz5.h.b(new bd4.d(this));
        this.collapseTv = jz5.h.b(new bd4.c(this));
        this.f169122z = dVar.q();
        this.B = i65.a.d(getContext(), com.tencent.mm.R.color.f479308vo);
        this.F = new bd4.i(this);
    }

    private final com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView getCollapseTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCollapseTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        java.lang.Object value = this.collapseTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCollapseTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return improveTextView;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView getContentTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        java.lang.Object value = this.contentTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return improveTextView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout
    public android.view.View getContentView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bkp, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return inflate;
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout
    public void i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.model.r6 r6Var, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        java.lang.CharSequence charSequence = this.f169116t;
        if (charSequence == null || (str3 = (java.lang.String) r26.n0.f0(charSequence, new java.lang.String[]{":"}, false, 0, 6, null).get(0)) == null) {
            str3 = "";
        }
        super.i(snsInfo, r6Var, i17, str3 + ": " + str, str2, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final boolean m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContentFold", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        boolean z17 = getCollapseTv().getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContentFold", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        return z17;
    }

    public final void n() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        if (this.f169115s == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            return;
        }
        int i18 = G;
        this.f169118v = i18 <= 0;
        boolean z17 = this.f169112p;
        if (i18 > 0 && (i17 = this.f169122z) > 0) {
            yz5.p pVar = this.C;
            android.text.Layout layout = pVar != null ? (android.text.Layout) pVar.invoke(getContentTv(), java.lang.Integer.valueOf(G)) : null;
            int lineCount = layout != null ? layout.getLineCount() : 0;
            ad4.y yVar = ad4.y.f3210a;
            java.lang.String str = this.f169117u;
            r45.e86 e86Var = this.f169115s;
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentView", "loadContent " + lineCount + " cacheKey " + yVar.a(str, e86Var != null ? java.lang.Integer.valueOf(e86Var.f373132m) : null) + " lineThreshold " + i17 + " contentTvHashCode: " + getContentTv().hashCode() + " userHasSpread: " + this.f169120x);
            if (!z17 ? lineCount <= i17 : this.f169120x || lineCount <= i17 + 1) {
                this.f169119w = true;
                getCollapseTv().setVisibility(0);
                if (z17) {
                    getCollapseTv().setText(getContext().getString(com.tencent.mm.R.string.j_3));
                    getCollapseTv().setOnClickListener(new bd4.e(this));
                } else {
                    getCollapseTv().setOnClickListener(new bd4.f(this));
                }
                getContentTv().setMaxLines(i17);
                o(i17, layout);
                getCollapseTv().getWidth();
                getCollapseTv().getHeight();
                getCollapseTv().getMeasuredWidth();
                getCollapseTv().getMeasuredHeight();
                getContentTv().getMeasuredHeight();
                getContentTv().getHeight();
                post(new bd4.g(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
                return;
            }
        }
        getCollapseTv().setVisibility(8);
        getContentTv().setMaxLines(Integer.MAX_VALUE);
        if (z17 && this.f169120x) {
            p();
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadNormalContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            setCustomText(this.f169116t);
            java.util.Objects.toString(this.f169116t);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadNormalContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void o(int i17, android.text.Layout layout) {
        jz5.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadFoldContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        getCollapseTv().measure(-2, -2);
        int measuredWidth = getCollapseTv().getMeasuredWidth();
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.a2s) + measuredWidth + (measuredWidth / 2) + getContentTv().getCompoundPaddingLeft() + getContentTv().getCompoundPaddingRight();
        ad4.y yVar = ad4.y.f3210a;
        java.lang.String str = this.f169117u;
        r45.e86 e86Var = this.f169115s;
        java.lang.String cacheKeyString = yVar.a(str, e86Var != null ? java.lang.Integer.valueOf(e86Var.f373132m) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentView", "loadFoldContent >> line: " + i17 + " cacheKey: " + cacheKeyString + " contentTvHashCode: " + getContentTv().hashCode() + " width: " + measuredWidth + ", loadWidth:" + G + ", ellipseOffsetWidth: " + h17);
        java.lang.CharSequence charSequence = this.f169116t;
        kotlin.jvm.internal.o.d(charSequence);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView tv6 = getContentTv();
        int i18 = G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldCommentStringWithCache", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        kotlin.jvm.internal.o.g(cacheKeyString, "cacheKeyString");
        kotlin.jvm.internal.o.g(tv6, "tv");
        if (com.tencent.mm.sdk.platformtools.t8.K0(cacheKeyString)) {
            lVar = yVar.d(charSequence, tv6, i18, h17, i17, layout);
            if (!((java.lang.Boolean) lVar.f302834e).booleanValue()) {
                lVar = new jz5.l(charSequence, java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldCommentStringWithCache", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        } else {
            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) yVar.c().get(cacheKeyString);
            if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence2)) {
                jz5.l d17 = yVar.d(charSequence, tv6, i18, h17, i17, layout);
                if (((java.lang.Boolean) d17.f302834e).booleanValue()) {
                    yVar.c().put(cacheKeyString, d17.f302833d);
                    lVar = d17;
                } else {
                    lVar = new jz5.l(charSequence, java.lang.Boolean.FALSE);
                }
            } else {
                kotlin.jvm.internal.o.d(charSequence2);
                lVar = new jz5.l(charSequence2, java.lang.Boolean.TRUE);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldCommentStringWithCache", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        }
        setCustomText((java.lang.CharSequence) lVar.f302833d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadFoldContent getResult >> ");
        sb6.append(cacheKeyString);
        sb6.append(", ");
        java.lang.Object obj = lVar.f302834e;
        sb6.append(((java.lang.Boolean) obj).booleanValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CommentView", sb6.toString());
        if (((java.lang.Boolean) obj).booleanValue()) {
            getContentTv().append("...");
        }
        lVar.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadFoldContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17 && (this.f169118v || G != getContentTv().getWidth())) {
            G = getContentTv().getWidth();
            n();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadSpreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        java.lang.CharSequence charSequence = this.f169116t;
        if (charSequence == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadSpreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            return;
        }
        int length = charSequence.length();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        java.lang.Object[] spans = spannableStringBuilder.getSpans(0, length, com.tencent.mm.pluginsdk.ui.span.z0.class);
        kotlin.jvm.internal.o.f(spans, "getSpans(...)");
        java.util.ArrayList<com.tencent.mm.pluginsdk.ui.span.z0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : spans) {
            if (spannableStringBuilder.getSpanEnd((com.tencent.mm.pluginsdk.ui.span.z0) obj) == length) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<jz5.o> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : arrayList) {
            arrayList2.add(new jz5.o(z0Var, java.lang.Integer.valueOf(spannableStringBuilder.getSpanStart(z0Var)), java.lang.Integer.valueOf(spannableStringBuilder.getSpanFlags(z0Var))));
        }
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) this.f169111o);
        for (jz5.o oVar : arrayList2) {
            com.tencent.mm.pluginsdk.ui.span.z0 z0Var2 = (com.tencent.mm.pluginsdk.ui.span.z0) oVar.f302841d;
            int intValue = ((java.lang.Number) oVar.f302842e).intValue();
            int intValue2 = ((java.lang.Number) oVar.f302843f).intValue();
            spannableStringBuilder.removeSpan(z0Var2);
            spannableStringBuilder.setSpan(z0Var2, intValue, length2, intValue2);
        }
        bd4.h hVar = new bd4.h(this);
        hVar.setNeedDealOverflowOffset(false);
        spannableStringBuilder.setSpan(hVar, length2, spannableStringBuilder.length(), 33);
        setCustomText(spannableStringBuilder);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadSpreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        this.f169119w = true;
        if (this.f169112p) {
            this.f169120x = false;
        }
        getCollapseTv().setVisibility(0);
        getCollapseTv().setText(getContext().getString(com.tencent.mm.R.string.j_3));
        getCollapseTv().setOnClickListener(new bd4.j(this));
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView contentTv = getContentTv();
        int i17 = this.f169122z;
        contentTv.setMaxLines(i17);
        yz5.p pVar = this.C;
        o(i17, pVar != null ? (android.text.Layout) pVar.invoke(getContentTv(), java.lang.Integer.valueOf(G)) : null);
        post(new bd4.k(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        this.f169119w = false;
        if (this.f169112p) {
            this.f169120x = true;
        }
        getCollapseTv().setVisibility(8);
        getContentTv().setMaxLines(Integer.MAX_VALUE);
        p();
        post(new bd4.l(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void s(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCollapseTextColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        getCollapseTv().setTextColor(i17);
        this.B = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCollapseTextColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void setCustomText(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        getContentTv().b(charSequence, this.A);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public final void setStateChangeListener(bd4.b listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.E = listener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
    }

    public ImproveCommentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169111o = string;
        pc4.d dVar = pc4.d.f353410a;
        this.f169112p = dVar.D();
        this.contentTv = jz5.h.b(new bd4.d(this));
        this.collapseTv = jz5.h.b(new bd4.c(this));
        this.f169122z = dVar.q();
        this.B = i65.a.d(getContext(), com.tencent.mm.R.color.f479308vo);
        this.F = new bd4.i(this);
    }

    public ImproveCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.j_2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f169111o = string;
        pc4.d dVar = pc4.d.f353410a;
        this.f169112p = dVar.D();
        this.contentTv = jz5.h.b(new bd4.d(this));
        this.collapseTv = jz5.h.b(new bd4.c(this));
        this.f169122z = dVar.q();
        this.B = i65.a.d(getContext(), com.tencent.mm.R.color.f479308vo);
        this.F = new bd4.i(this);
    }
}
