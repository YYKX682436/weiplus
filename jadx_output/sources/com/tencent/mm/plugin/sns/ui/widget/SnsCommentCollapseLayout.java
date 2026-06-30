package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsCommentCollapseLayout extends android.widget.RelativeLayout implements bi4.j0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f170849q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView f170850d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView f170851e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f170852f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f170853g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f170854h;

    /* renamed from: i, reason: collision with root package name */
    public int f170855i;

    /* renamed from: m, reason: collision with root package name */
    public final int f170856m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f170857n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f170858o;

    /* renamed from: p, reason: collision with root package name */
    public final int f170859p;

    public SnsCommentCollapseLayout(android.content.Context context) {
        super(context);
        this.f170850d = null;
        this.f170851e = null;
        this.f170852f = null;
        this.f170853g = null;
        this.f170854h = null;
        this.f170855i = 0;
        pc4.d dVar = pc4.d.f353410a;
        this.f170856m = dVar.q();
        this.f170857n = dVar.D();
        this.f170858o = context.getString(com.tencent.mm.R.string.j_2);
        this.f170859p = context.getResources().getColor(com.tencent.mm.R.color.f479308vo);
        e();
    }

    public static /* synthetic */ android.widget.TextView b(com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        android.widget.TextView textView = snsCommentCollapseLayout.f170852f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return textView;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView c(com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = snsCommentCollapseLayout.f170850d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsComment2LinePreloadTextView;
    }

    public static void d(com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout) {
        java.lang.CharSequence charSequence;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentCollapseLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToSpreadMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentCollapseLayout.f170850d.setVisibility(8);
        snsCommentCollapseLayout.f170851e.setVisibility(0);
        snsCommentCollapseLayout.f170852f.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView snsCommentPreloadTextView = snsCommentCollapseLayout.f170851e;
        java.lang.CharSequence charSequence2 = snsCommentCollapseLayout.f170853g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        if (charSequence2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            charSequence = "";
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) snsCommentCollapseLayout.f170858o);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.sns.ui.widget.l1(snsCommentCollapseLayout), length, spannableStringBuilder.length(), 33);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            charSequence = spannableStringBuilder;
        }
        snsCommentPreloadTextView.setText(charSequence);
        snsCommentCollapseLayout.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToSpreadMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    @Override // bi4.j0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.invalidate();
        this.f170851e.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cqz, (android.view.ViewGroup) this, true);
        this.f170850d = (com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView) findViewById(com.tencent.mm.R.id.n77);
        this.f170851e = (com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView) findViewById(com.tencent.mm.R.id.n79);
        this.f170850d.setGravity(16);
        this.f170851e.setGravity(16);
        this.f170852f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n78);
        this.f170855i = i65.a.b(getContext(), 22);
        if (this.f170857n) {
            this.f170852f.setText(com.tencent.mm.R.string.j_3);
        }
        setOnTouchListener(new com.tencent.mm.plugin.sns.ui.widget.i1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void f(int i17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.f68481d.k(i17, f17);
        this.f170851e.f68481d.k(i17, f17);
        this.f170852f.setTextSize(i17, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToNormalMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170852f.setVisibility(4);
        this.f170851e.setText(this.f170853g);
        int lineCount = this.f170851e.getLineCount();
        boolean z17 = this.f170857n;
        int i17 = this.f170856m;
        boolean z18 = true;
        if (!z17 ? i17 <= 0 || lineCount <= i17 : i17 <= 0 || lineCount <= i17 + 1) {
            z18 = false;
        }
        if (z18) {
            this.f170851e.setText("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            this.f170852f.setVisibility(4);
            post(new com.tencent.mm.plugin.sns.ui.widget.k1(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        } else {
            this.f170851e.setVisibility(0);
            this.f170850d.setVisibility(8);
            invalidate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToNormalMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView get2LineCommentTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get2LineCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = this.f170850d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get2LineCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsComment2LinePreloadTextView;
    }

    public java.lang.CharSequence getContent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        java.lang.CharSequence charSequence = this.f170853g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return charSequence;
    }

    public com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView getNormalCommentTv() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView snsCommentPreloadTextView = this.f170851e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsCommentPreloadTextView;
    }

    @Override // bi4.j0
    public android.view.View getView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return this;
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGravity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.setGravity(i17);
        this.f170851e.setGravity(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGravity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setOpClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        if (this.f170857n) {
            this.f170852f.setOnClickListener(new com.tencent.mm.plugin.sns.ui.widget.m1(this));
        } else {
            this.f170852f.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setPressTouchListener(com.tencent.mm.pluginsdk.ui.span.y0 y0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPressTouchListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.setOnTouchListener(y0Var);
        this.f170851e.setOnTouchListener(y0Var);
        y0Var.f191311q = new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$$a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.f170849q;
                com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout snsCommentCollapseLayout = com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.this;
                snsCommentCollapseLayout.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", snsCommentCollapseLayout, array);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setPressTouchListener$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", snsCommentCollapseLayout, array2);
                if (view.getTag(com.tencent.mm.R.id.ohu) != null) {
                    snsCommentCollapseLayout.setTag(com.tencent.mm.R.id.ohu, view.getTag(com.tencent.mm.R.id.ohu));
                }
                boolean performLongClick = snsCommentCollapseLayout.performLongClick();
                yj0.a.i(performLongClick, snsCommentCollapseLayout, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setPressTouchListener$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                yj0.a.i(performLongClick, snsCommentCollapseLayout, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return performLongClick;
            }
        };
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPressTouchListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    @Override // android.view.View
    public void setTag(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        super.setTag(obj);
        com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = this.f170850d;
        if (snsComment2LinePreloadTextView != null) {
            snsComment2LinePreloadTextView.setTag(obj);
        }
        com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView snsCommentPreloadTextView = this.f170851e;
        if (snsCommentPreloadTextView != null) {
            snsCommentPreloadTextView.setTag(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setTextColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.setTextColor(i17);
        this.f170851e.setTextColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setTextSize(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f170850d.setTextSize(f17);
        this.f170851e.setTextSize(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public SnsCommentCollapseLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170850d = null;
        this.f170851e = null;
        this.f170852f = null;
        this.f170853g = null;
        this.f170854h = null;
        this.f170855i = 0;
        pc4.d dVar = pc4.d.f353410a;
        this.f170856m = dVar.q();
        this.f170857n = dVar.D();
        this.f170858o = context.getString(com.tencent.mm.R.string.j_2);
        this.f170859p = context.getResources().getColor(com.tencent.mm.R.color.f479308vo);
        e();
    }

    public SnsCommentCollapseLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170850d = null;
        this.f170851e = null;
        this.f170852f = null;
        this.f170853g = null;
        this.f170854h = null;
        this.f170855i = 0;
        pc4.d dVar = pc4.d.f353410a;
        this.f170856m = dVar.q();
        this.f170857n = dVar.D();
        this.f170858o = context.getString(com.tencent.mm.R.string.j_2);
        this.f170859p = context.getResources().getColor(com.tencent.mm.R.color.f479308vo);
        e();
    }
}
