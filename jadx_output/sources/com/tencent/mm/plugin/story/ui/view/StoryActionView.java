package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryActionView;", "Landroid/widget/RelativeLayout;", "Lif4/a;", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, "Ljz5/f0;", "setup", "Lkotlin/Function1;", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lyz5/l;", "getOnActionClicked", "()Lyz5/l;", "setOnActionClicked", "(Lyz5/l;)V", "onActionClicked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rf4/p", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryActionView extends android.widget.RelativeLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.l onActionClicked;

    /* renamed from: d, reason: collision with root package name */
    public final float f171904d;

    /* renamed from: e, reason: collision with root package name */
    public final float f171905e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f171907g;

    /* renamed from: h, reason: collision with root package name */
    public final int f171908h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f171909i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f171910m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f171911n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f171912o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f171913p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f171914q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f171915r;

    /* renamed from: s, reason: collision with root package name */
    public int f171916s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f171917t;

    /* renamed from: u, reason: collision with root package name */
    public float f171918u;

    /* renamed from: v, reason: collision with root package name */
    public int f171919v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f171920w;

    /* renamed from: x, reason: collision with root package name */
    public int f171921x;

    /* renamed from: y, reason: collision with root package name */
    public if4.a f171922y;

    /* renamed from: z, reason: collision with root package name */
    public final rf4.p f171923z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryActionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f171904d = com.tencent.mm.ui.zk.a(context, 17);
        this.f171905e = com.tencent.mm.ui.zk.a(context, 14);
        this.f171906f = android.graphics.Color.parseColor("#FFFFFFFF");
        this.f171907g = android.graphics.Color.parseColor("#7FFFFFFF");
        this.f171908h = 1;
        this.f171909i = "  ";
        this.f171910m = " ";
        this.f171918u = -1.0f;
        this.f171919v = -1;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489538cw0, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.njm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f171911n = textView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.njk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f171912o = textView2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nlb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView storyCommentBubbleView = (com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.njo);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f171913p = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.njn);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f171914q = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.njl);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.nlc);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        pm0.v.c((android.widget.TextView) findViewById7);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.b4d);
        drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(context, 8), com.tencent.mm.ui.zk.a(context, 8));
        this.f171923z = new rf4.p(drawable, 1);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.tencent.mm.ui.zk.a(context, 48);
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = com.tencent.mm.ui.zk.a(context, 48) + com.tencent.mm.ui.bl.c(context);
        android.view.ViewGroup.LayoutParams layoutParams3 = findViewById5.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).topMargin = com.tencent.mm.ui.zk.a(context, 48);
        android.view.ViewGroup.LayoutParams layoutParams4 = findViewById5.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = com.tencent.mm.ui.zk.a(context, 48) + com.tencent.mm.ui.bl.c(context);
        storyCommentBubbleView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_chats, -1));
        textView.setOnClickListener(new rf4.m(this));
        textView2.setOnClickListener(new rf4.n(this));
        storyCommentBubbleView.setOnClickListener(new rf4.o(this));
    }

    public final void a(android.widget.TextView textView) {
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(textView.getCurrentTextColor(), this.f171906f);
        ofArgb.setEvaluator(new android.animation.ArgbEvaluator());
        ofArgb.addUpdateListener(new rf4.q(textView));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(textView.getTextSize(), this.f171904d);
        ofFloat.addUpdateListener(new rf4.r(textView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofArgb, ofFloat);
        animatorSet.start();
    }

    public final void b(android.widget.TextView textView) {
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(textView.getCurrentTextColor(), this.f171906f);
        ofArgb.setEvaluator(new android.animation.ArgbEvaluator());
        ofArgb.addUpdateListener(new rf4.s(textView));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(textView.getTextSize(), this.f171905e);
        ofFloat.addUpdateListener(new rf4.t(textView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofArgb, ofFloat);
        animatorSet.start();
    }

    public final void c(android.widget.TextView textView) {
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(textView.getCurrentTextColor(), this.f171907g);
        ofArgb.setEvaluator(new android.animation.ArgbEvaluator());
        ofArgb.addUpdateListener(new rf4.u(textView));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(textView.getTextSize(), this.f171905e);
        ofFloat.addUpdateListener(new rf4.v(textView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofArgb, ofFloat);
        animatorSet.start();
    }

    public final void d(boolean z17, android.widget.TextView textView) {
        java.lang.CharSequence text = textView.getText();
        if (text == null) {
            text = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(text);
        boolean z18 = true;
        if (!z17) {
            rf4.p[] pVarArr = (rf4.p[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rf4.p.class);
            if (pVarArr != null) {
                if (!(pVarArr.length == 0)) {
                    z18 = false;
                }
            }
            if (z18) {
                return;
            }
            spannableStringBuilder.removeSpan(rf4.p.class);
            textView.setText(r26.n0.u0(spannableStringBuilder));
            return;
        }
        rf4.p[] pVarArr2 = (rf4.p[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rf4.p.class);
        if (pVarArr2 != null) {
            if (!(pVarArr2.length == 0)) {
                z18 = false;
            }
        }
        if (z18) {
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) this.f171909i);
            java.lang.String str = this.f171910m;
            append.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(this.f171923z, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
        }
    }

    public final void e(if4.a comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        if (this.f171915r) {
            java.util.LinkedList linkedList = comment.f291240h;
            boolean z17 = linkedList == null || linkedList.isEmpty();
            android.widget.TextView textView = this.f171912o;
            if (z17) {
                textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmr));
                return;
            }
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.jmp);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(linkedList.size())}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        }
    }

    public final yz5.l getOnActionClicked() {
        return this.onActionClicked;
    }

    public final void setOnActionClicked(yz5.l lVar) {
        this.onActionClicked = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setup(if4.a r28) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.story.ui.view.StoryActionView.setup(if4.a):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryActionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
