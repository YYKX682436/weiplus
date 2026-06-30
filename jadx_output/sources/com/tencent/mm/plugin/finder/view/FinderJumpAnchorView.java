package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B%\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b)\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderJumpAnchorView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setTitle", "", "color", "setTitleColor", "", "below", "setBelow", "", "d", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "titleView", "value", "getLoading", "()Z", "setLoading", "(Z)V", "loading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderJumpAnchorView extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f131165i = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f131167e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView titleView;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f131169g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f131170h;

    public FinderJumpAnchorView(android.content.Context context) {
        super(context);
        this.animationDuration = 400L;
        b(null);
    }

    public static void c(com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if (finderJumpAnchorView.getVisibility() == 0) {
            return;
        }
        finderJumpAnchorView.setVisibility(0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(hc2.f1.t(finderJumpAnchorView), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(finderJumpAnchorView.animationDuration);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(finderJumpAnchorView.getContext(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.finder.view.rc(aVar));
        finderJumpAnchorView.startAnimation(translateAnimation);
    }

    public final void a(yz5.a aVar) {
        if (getVisibility() != 0) {
            return;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, getWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(this.animationDuration);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(getContext(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.finder.view.qc(aVar, this));
        startAnimation(translateAnimation);
    }

    public final void b(android.util.AttributeSet attributeSet) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        setVisibility(8);
        setOrientation(0);
        setGravity(16);
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn);
        setPadding(f17, f17, getPaddingRight(), f17);
        setClipToPadding(false);
        setClipChildren(false);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e7s, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u86);
        this.f131167e = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(new com.tencent.mm.plugin.finder.view.pc(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478491c), 0.0f, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479644bj), b3.l.getColor(getContext(), com.tencent.mm.R.color.FG_3), i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9)));
        }
        android.view.View view = this.f131167e;
        this.titleView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hq6) : null;
        android.view.View view2 = this.f131167e;
        this.f131169g = view2 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.rse) : null;
        android.view.View view3 = this.f131167e;
        this.f131170h = view3 != null ? (android.widget.ProgressBar) view3.findViewById(com.tencent.mm.R.id.f485460hq5) : null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b92.w2.f18549f);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            java.lang.String string = obtainStyledAttributes.getString(0);
            int color = obtainStyledAttributes.getColor(1, -1);
            this.animationDuration = obtainStyledAttributes.getInt(2, (int) this.animationDuration);
            obtainStyledAttributes.recycle();
            if (string != null && (textView2 = this.titleView) != null) {
                textView2.setText(string);
            }
            if (color == -1 || (textView = this.titleView) == null) {
                return;
            }
            textView.setTextColor(color);
        }
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getLoading() {
        android.widget.ProgressBar progressBar = this.f131170h;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public final android.widget.TextView getTitleView() {
        return this.titleView;
    }

    public final void setAnimationDuration(long j17) {
        this.animationDuration = j17;
    }

    public final void setBelow(boolean z17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131169g;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(z17 ? 180.0f : 0.0f);
    }

    public final void setLoading(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f131169g;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            android.widget.ProgressBar progressBar = this.f131170h;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(0);
            return;
        }
        android.widget.ProgressBar progressBar2 = this.f131170h;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f131169g;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setVisibility(0);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        jz5.f0 f0Var;
        android.view.View view = this.f131167e;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setTitle(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setTitleColor(int i17) {
        android.widget.TextView textView = this.titleView;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public final void setTitleView(android.widget.TextView textView) {
        this.titleView = textView;
    }

    public FinderJumpAnchorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationDuration = 400L;
        b(attributeSet);
    }

    public FinderJumpAnchorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.animationDuration = 400L;
        b(attributeSet);
    }
}
