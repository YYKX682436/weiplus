package dv2;

/* loaded from: classes2.dex */
public final class z extends zx2.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f243982l;

    /* renamed from: m, reason: collision with root package name */
    public final int f243983m;

    /* renamed from: n, reason: collision with root package name */
    public final int f243984n;

    /* renamed from: o, reason: collision with root package name */
    public final int f243985o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f243986p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f243987q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f243988r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f243989s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dv2.b0 f243990t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dv2.b0 b0Var, java.lang.String title, int i17, int i18, int i19, java.lang.String contentDescription) {
        super("");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(contentDescription, "contentDescription");
        this.f243990t = b0Var;
        this.f243982l = title;
        this.f243983m = i17;
        this.f243984n = i18;
        this.f243985o = i19;
        this.f243986p = contentDescription;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.ecl;
    }

    @Override // zx2.c, zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        this.f243987q = viewGroup;
        java.lang.String str = this.f243986p;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f477050h = str;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.nvj);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f243988r = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.qqf);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f243989s = (android.widget.TextView) findViewById2;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f243988r;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("titleIcon");
                throw null;
            }
            weImageView.s(this.f243983m, com.tencent.mm.R.color.FG_1);
            java.lang.String str2 = this.f243982l;
            if (str2.length() == 0) {
                android.widget.TextView textView = this.f243989s;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
                textView.setVisibility(8);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f243988r;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("titleIcon");
                    throw null;
                }
                weImageView2.setVisibility(0);
            } else {
                android.widget.TextView textView2 = this.f243989s;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
                textView2.setText(str2);
                android.widget.TextView textView3 = this.f243989s;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
                textView3.setVisibility(0);
                android.widget.TextView textView4 = this.f243989s;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
                textView4.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
                android.widget.TextView textView5 = this.f243989s;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("titleTipsTv");
                    throw null;
                }
                com.tencent.mm.ui.fk.c(textView5);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f243988r;
                if (weImageView3 == null) {
                    kotlin.jvm.internal.o.o("titleIcon");
                    throw null;
                }
                weImageView3.setVisibility(8);
            }
            if (!this.f243990t.isBelongFragment()) {
                return;
            }
            android.widget.TextView textView6 = this.f243989s;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView6.setTextSize(0, viewGroup.getResources().getDimension(com.tencent.mm.R.dimen.f479674cb));
            viewGroup.setPadding(viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.an6);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.d0q);
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (!z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f243988r;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("titleIcon");
                throw null;
            }
            weImageView.s(this.f243983m, com.tencent.mm.R.color.FG_1);
            android.widget.TextView textView = this.f243989s;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView2 = this.f243989s;
            if (textView2 != null) {
                com.tencent.mm.ui.fk.c(textView2);
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTipsTv");
                throw null;
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f243990t.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.getIntent().putExtra("KEY_MIX_SEARCH_MIX_SUB_TAB", this.f243985o);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f243988r;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("titleIcon");
            throw null;
        }
        weImageView2.s(this.f243984n, com.tencent.mm.R.color.a0c);
        android.widget.TextView textView3 = this.f243989s;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
        textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a0c));
        android.widget.TextView textView4 = this.f243989s;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.a(textView4);
        } else {
            kotlin.jvm.internal.o.o("titleTipsTv");
            throw null;
        }
    }

    @Override // zx2.c
    public android.view.View m() {
        if (!(!this.f243990t.isBelongFragment())) {
            return null;
        }
        android.view.View view = this.f243987q;
        return view == null ? this.f477052j : view;
    }

    @Override // zx2.c
    public int[] n() {
        return new int[]{0, 0};
    }

    @Override // zx2.c
    public android.view.View o() {
        if (!(!this.f243990t.isBelongFragment())) {
            return null;
        }
        android.view.View view = this.f243987q;
        return view == null ? this.f477052j : view;
    }
}
