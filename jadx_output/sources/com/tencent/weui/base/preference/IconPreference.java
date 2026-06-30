package com.tencent.weui.base.preference;

/* loaded from: classes3.dex */
public class IconPreference extends android.preference.Preference {
    public android.view.View A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.ImageView F;
    public final int G;
    public final android.content.Context H;
    public final int I;

    /* renamed from: d, reason: collision with root package name */
    public final int f220107d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f220108e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f220109f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f220110g;

    /* renamed from: h, reason: collision with root package name */
    public final int f220111h;

    /* renamed from: i, reason: collision with root package name */
    public final int f220112i;

    /* renamed from: m, reason: collision with root package name */
    public final int f220113m;

    /* renamed from: n, reason: collision with root package name */
    public final int f220114n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f220115o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f220116p;

    /* renamed from: q, reason: collision with root package name */
    public final int f220117q;

    /* renamed from: r, reason: collision with root package name */
    public final int f220118r;

    /* renamed from: s, reason: collision with root package name */
    public final int f220119s;

    /* renamed from: t, reason: collision with root package name */
    public final int f220120t;

    /* renamed from: u, reason: collision with root package name */
    public final int f220121u;

    /* renamed from: v, reason: collision with root package name */
    public final int f220122v;

    /* renamed from: w, reason: collision with root package name */
    public final int f220123w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f220124x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f220125y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f220126z;

    public IconPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        this.F = imageView;
        if (imageView != null) {
            android.graphics.drawable.Drawable drawable = this.f220109f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                this.F.setVisibility(0);
            } else if (getIcon() != null) {
                android.widget.ImageView imageView2 = this.F;
                android.graphics.drawable.Drawable icon = getIcon();
                this.f220109f = icon;
                imageView2.setImageDrawable(icon);
                this.F.setVisibility(0);
            } else {
                this.F.setVisibility(8);
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jlx);
        linearLayout.setMinimumHeight(view.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479923j2));
        int i17 = this.G;
        if (i17 != -1) {
            linearLayout.setMinimumHeight(i17);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o58);
        this.E = textView;
        android.content.Context context = this.H;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.E.setVisibility(this.f220112i);
            this.E.setText(this.f220110g);
            int i18 = this.f220111h;
            if (i18 != -1) {
                this.E.setBackgroundDrawable(context.getResources().getDrawable(i18));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o5_);
        this.D = textView2;
        if (textView2 != null) {
            textView2.setVisibility(this.f220118r);
            this.D.setText(this.f220116p);
            int i19 = this.f220117q;
            if (i19 != -1) {
                this.D.setBackgroundDrawable(context.getResources().getDrawable(i19));
            }
            int i27 = this.f220119s;
            if (i27 != -1) {
                this.D.setTextColor(i27);
            }
            this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.o4r);
        this.f220124x = imageView3;
        imageView3.setVisibility(this.f220113m);
        int i28 = this.I;
        if (i28 != -1) {
            this.f220124x.setImageResource(i28);
        }
        this.f220108e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h_s);
        this.f220125y = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.m4_);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m3q);
        this.A = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f220123w));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.m47);
        this.f220126z = findViewById2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(this.f220122v));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38)).setVisibility(0);
        int i29 = this.f220107d;
        if (i29 != -1) {
            this.f220108e.setImageResource(i29);
        }
        this.f220108e.setVisibility(this.f220120t);
        this.f220125y.setVisibility(this.f220121u);
        this.B = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.C = textView3;
        if (textView3 != null) {
            textView3.setVisibility(this.f220114n);
            this.C.setText(this.f220115o);
            this.C.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
        }
        android.widget.TextView textView4 = this.B;
        if (textView4 != null) {
            textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        view.setEnabled(true);
    }

    @Override // android.preference.Preference
    public android.view.View onCreateView(android.view.ViewGroup viewGroup) {
        android.view.View onCreateView = super.onCreateView(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) onCreateView.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c_h, viewGroup2);
        return onCreateView;
    }

    public IconPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220107d = -1;
        this.f220108e = null;
        this.f220110g = "";
        this.f220111h = -1;
        this.f220112i = 8;
        this.f220113m = 8;
        this.f220114n = 8;
        this.f220115o = "";
        this.f220116p = "";
        this.f220117q = -1;
        this.f220118r = 8;
        this.f220119s = -1;
        this.f220120t = 8;
        this.f220121u = 8;
        this.f220122v = 8;
        this.f220123w = 8;
        this.f220124x = null;
        this.f220125y = null;
        this.f220126z = null;
        this.A = null;
        this.G = -1;
        this.I = -1;
        this.H = context;
        setLayoutResource(com.tencent.mm.R.layout.byv);
    }
}
