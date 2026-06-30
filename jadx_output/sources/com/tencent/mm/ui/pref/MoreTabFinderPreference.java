package com.tencent.mm.ui.pref;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/pref/MoreTabFinderPreference;", "Lcom/tencent/mm/ui/base/preference/NormalIconTipPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MoreTabFinderPreference extends com.tencent.mm.ui.base.preference.NormalIconTipPreference {

    /* renamed from: a2, reason: collision with root package name */
    public int f209519a2;

    /* renamed from: b2, reason: collision with root package name */
    public android.widget.TextView f209520b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f209521c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f209522d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f209523e2;

    /* renamed from: f2, reason: collision with root package name */
    public android.view.View f209524f2;

    public MoreTabFinderPreference(android.content.Context context) {
        super(context, null);
        this.f209519a2 = -1;
    }

    public final java.lang.String i0() {
        r45.ct4 Ri = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ri(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f197770d), 0);
        java.lang.String string = Ri != null ? Ri.getString(1) : null;
        return string == null ? "" : string;
    }

    public final void k0() {
        com.tencent.mars.xlog.Log.i("MoreTabFinderPreference", "[handleClick] mShowingFinderWording:" + this.f209523e2);
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.f03 I0 = nk6.I0("FinderMyTab");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderMyTab");
        if (I0 != null && L0 != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            com.tencent.mm.plugin.finder.extension.reddot.a3[] a3VarArr = com.tencent.mm.plugin.finder.extension.reddot.a3.f105338d;
            ((c61.w8) paVar).Ri("12", L0, I0, 2, "", 0, 0, 0);
        }
        nk6.N("FinderMyTab");
        nk6.N("FinderMentionMyTab");
        android.view.View view = this.W1;
        if (view == null) {
            view = this.f209524f2;
        }
        if (view != null) {
            l0(view, "view_clk");
        }
        if (this.f209523e2) {
            ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f197770d), c01.id.a(), 0);
            b0(8);
            this.f209523e2 = false;
        }
    }

    public final void l0(android.view.View view, java.lang.String eventId) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "wx_profile_finder_entrance");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("if_yesterday_play", java.lang.Integer.valueOf(i0().length() > 0 ? 1 : 0));
        aVar.Cj(eventId, view, linkedHashMap, 25496);
    }

    public final void n0() {
        com.tencent.mars.xlog.Log.i("MoreTabFinderPreference", "[updateFinderWording] mShowingFinderWording:" + this.f209523e2);
        if (this.f209523e2) {
            return;
        }
        java.lang.String i07 = i0();
        boolean z17 = true;
        if (i07.length() > 0) {
            d0(i07, -1, -7566196);
            b0(0);
        } else {
            b0(8);
            z17 = false;
        }
        this.f209523e2 = z17;
    }

    public final void p0(int i17) {
        B(i17);
        android.graphics.drawable.Drawable drawable = this.f197770d.getResources().getDrawable(i17);
        this.U = drawable;
        android.widget.ImageView imageView = this.L1;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void q0() {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int i17 = this.f209519a2;
        if (i17 == -1) {
            return;
        }
        if (i17 != 0) {
            android.widget.ImageView imageView2 = this.L1;
            if (imageView2 == null || (drawable2 = imageView2.getDrawable()) == null) {
                return;
            }
            drawable2.setColorFilter(this.f209519a2, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return;
        }
        android.widget.ImageView imageView3 = this.L1;
        if ((imageView3 != null ? imageView3.getDrawable() : null) == null || (imageView = this.L1) == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    public final void r0(int i17) {
        com.tencent.mars.xlog.Log.i("MoreTabFinderPreference", "[updateLeftCountRedDot] count: " + i17);
        if (i17 > 0) {
            g0(i17 <= 99 ? java.lang.String.valueOf(i17) : "", i17 > 99 ? com.tencent.mm.R.raw.badge_count_more : com.tencent.mm.R.drawable.b8d);
            a0(0);
        } else {
            g0("", -1);
            a0(8);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.NormalIconTipPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.widget.TextView textView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindView] view:");
        sb6.append(view != null ? view.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MoreTabFinderPreference", sb6.toString());
        if (view != null) {
            textView = (android.widget.TextView) view.findViewById(this.V1 ? com.tencent.mm.R.id.o59 : com.tencent.mm.R.id.o5_);
        } else {
            textView = null;
        }
        if (textView != null) {
            ym5.a1.h(textView, new nj5.a(this));
        }
        if (view != null) {
            ym5.a1.h(view, new nj5.b(this));
        }
        super.t(view);
        this.f209524f2 = view;
        this.f209520b2 = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView.setSingleLine(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView.setMaxLines(2);
            textView.setGravity(5);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                textView.setBreakStrategy(2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            textView.setMaxWidth(Integer.MAX_VALUE);
            com.tencent.mm.ui.kk.e(textView, this.f197770d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
            textView.setLayoutParams(marginLayoutParams);
        }
        q0();
    }

    public final void t0(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        L(title);
        android.widget.TextView textView = this.f209520b2;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    public MoreTabFinderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f209519a2 = -1;
    }

    public MoreTabFinderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209519a2 = -1;
    }
}
