package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class Preference implements java.lang.Comparable<com.tencent.mm.ui.base.preference.Preference> {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public android.text.TextUtils.TruncateAt E;
    public final boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final int f197769J;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f197770d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.q0 f197771e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r0 f197772f;

    /* renamed from: g, reason: collision with root package name */
    public final int f197773g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f197774h;

    /* renamed from: i, reason: collision with root package name */
    public int f197775i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f197776m;

    /* renamed from: n, reason: collision with root package name */
    public int f197777n;

    /* renamed from: o, reason: collision with root package name */
    public final int f197778o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f197779p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f197780q;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Bundle f197781r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f197782s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197783t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f197784u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197785v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f197786w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f197787x;

    /* renamed from: y, reason: collision with root package name */
    public int f197788y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f197789z;

    /* loaded from: classes13.dex */
    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.base.preference.Preference.BaseSavedState> CREATOR = new com.tencent.mm.ui.base.preference.p0();

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f197773g = Integer.MAX_VALUE;
        this.f197778o = 0;
        this.f197782s = true;
        this.f197783t = true;
        this.f197785v = true;
        this.f197787x = true;
        this.f197788y = -1;
        this.f197789z = null;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = true;
        this.G = com.tencent.mm.R.layout.byv;
        this.I = false;
        this.f197769J = 0;
        this.K = 0;
        this.f197770d = context;
        this.f197769J = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479875ho);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447202t, i17, 0);
        for (int indexCount = obtainStyledAttributes.getIndexCount(); indexCount >= 0; indexCount--) {
            int index = obtainStyledAttributes.getIndex(indexCount);
            if (index == 4) {
                this.f197777n = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 5) {
                this.f197778o = obtainStyledAttributes.getColor(index, 0);
            } else if (index == 6) {
                this.f197780q = obtainStyledAttributes.getString(index);
            } else if (index == 13) {
                this.f197775i = obtainStyledAttributes.getResourceId(index, 0);
                this.f197774h = obtainStyledAttributes.getString(index);
                int i18 = this.f197775i;
                if (i18 != 0) {
                    this.f197774h = context.getString(i18);
                }
            } else if (index == 12) {
                this.f197776m = obtainStyledAttributes.getString(index);
                int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                if (resourceId != 0) {
                    this.f197776m = context.getString(resourceId);
                }
            } else if (index == 8) {
                this.f197773g = obtainStyledAttributes.getInt(index, this.f197773g);
            } else if (index == 3) {
                obtainStyledAttributes.getString(index);
            } else if (index == 7) {
                this.G = obtainStyledAttributes.getResourceId(index, this.G);
            } else if (index == 14) {
                this.H = obtainStyledAttributes.getResourceId(index, this.H);
            } else if (index == 2) {
                this.f197782s = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 10) {
                this.f197783t = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 9) {
                this.f197785v = obtainStyledAttributes.getBoolean(index, this.f197785v);
            } else if (index == 1) {
                this.f197786w = obtainStyledAttributes.getString(index);
            } else if (index != 0 && index == 11) {
                this.F = obtainStyledAttributes.getBoolean(index, this.F);
            }
        }
        obtainStyledAttributes.recycle();
        getClass().getName().startsWith("android.preference");
    }

    private void A(android.view.View view, boolean z17) {
        view.setEnabled(z17);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                A(viewGroup.getChildAt(childCount), z17);
            }
        }
    }

    public void B(int i17) {
        this.f197777n = i17;
        android.graphics.drawable.Drawable drawable = this.f197770d.getResources().getDrawable(i17);
        if ((drawable != null || this.f197779p == null) && (drawable == null || this.f197779p == drawable)) {
            return;
        }
        this.f197779p = drawable;
        s();
    }

    public void C(java.lang.String str) {
        this.f197780q = str;
        if (!this.f197784u || (!android.text.TextUtils.isEmpty(str))) {
            return;
        }
        if (this.f197780q == null) {
            throw new java.lang.IllegalStateException("Preference does not have a key assigned.");
        }
        this.f197784u = true;
    }

    public void D(com.tencent.mm.ui.base.preference.q0 q0Var) {
        this.f197771e = q0Var;
    }

    public void E(int i17) {
        this.A = i17;
        android.widget.ImageView imageView = this.f197789z;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    public void G(int i17) {
        H(this.f197770d.getString(i17));
    }

    public void H(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.f197776m == null) && (charSequence == null || charSequence.equals(this.f197776m))) {
            return;
        }
        this.f197776m = charSequence;
        s();
    }

    public void I(int i17) {
        this.f197788y = i17;
    }

    public void J(int i17) {
        L(this.f197770d.getString(i17));
        this.f197775i = i17;
    }

    public void L(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.f197774h == null) && (charSequence == null || charSequence.equals(this.f197774h))) {
            return;
        }
        this.f197775i = 0;
        this.f197774h = charSequence;
        s();
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.ui.base.preference.Preference preference2 = preference;
        int i17 = this.f197773g;
        if (i17 != Integer.MAX_VALUE || (i17 == Integer.MAX_VALUE && preference2.f197773g != Integer.MAX_VALUE)) {
            return i17 - preference2.f197773g;
        }
        java.lang.CharSequence charSequence = this.f197774h;
        if (charSequence == null) {
            return 1;
        }
        java.lang.CharSequence charSequence2 = preference2.f197774h;
        if (charSequence2 == null) {
            return -1;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i18 = length < length2 ? length : length2;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i18) {
            int i28 = i19 + 1;
            int i29 = i27 + 1;
            int lowerCase = java.lang.Character.toLowerCase(charSequence.charAt(i19)) - java.lang.Character.toLowerCase(charSequence2.charAt(i27));
            if (lowerCase != 0) {
                return lowerCase;
            }
            i19 = i28;
            i27 = i29;
        }
        return length - length2;
    }

    public android.os.Bundle i() {
        if (this.f197781r == null) {
            this.f197781r = new android.os.Bundle();
        }
        return this.f197781r;
    }

    public java.lang.String j() {
        return this.f197780q;
    }

    public int k() {
        return this.G;
    }

    public java.lang.String l() {
        java.lang.CharSequence charSequence = this.f197776m;
        return charSequence != null ? charSequence.toString() : "";
    }

    public int m() {
        return this.K;
    }

    public java.lang.CharSequence n() {
        return this.f197776m;
    }

    public java.lang.CharSequence o() {
        return this.f197774h;
    }

    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = u(viewGroup);
        }
        t(view);
        return view;
    }

    public boolean r() {
        return this.f197782s && this.f197787x;
    }

    public void s() {
    }

    public void t(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.cgi);
        android.content.Context context = this.f197770d;
        if (findViewById != null) {
            int i17 = this.f197769J;
            if (i17 > 0) {
                findViewById.setMinimumHeight((int) (i17 * i65.a.A(context)));
            }
            if (this.I) {
                findViewById.setPadding(0, findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            java.lang.CharSequence o17 = o();
            if (o17 == null || !(o17 instanceof android.text.Spannable)) {
                textView.setMovementMethod(null);
            } else {
                if (this.C) {
                    textView.setClickable(true);
                }
                if (textView.isClickable()) {
                    textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
            }
            textView.setText(o17);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.summary);
        if (textView2 != null) {
            if (!android.text.TextUtils.isEmpty(n())) {
                if (textView2.getVisibility() != 0) {
                    textView2.setVisibility(0);
                }
                if (this.B) {
                    textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    textView2.setClickable(true);
                    textView2.setText(n(), android.widget.TextView.BufferType.SPANNABLE);
                } else {
                    textView2.setText(n());
                }
                int i18 = this.f197788y;
                if (i18 != -1) {
                    textView2.setTextColor(i18);
                }
                if (this.D) {
                    textView2.setSingleLine();
                }
                android.text.TextUtils.TruncateAt truncateAt = this.E;
                if (truncateAt != null) {
                    textView2.setEllipsize(truncateAt);
                }
            } else if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        if (imageView != null) {
            if (this.f197777n != 0 || this.f197779p != null) {
                if (this.f197779p == null) {
                    this.f197779p = context.getResources().getDrawable(this.f197777n);
                }
                android.graphics.drawable.Drawable drawable = this.f197779p;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    int i19 = this.f197778o;
                    if (i19 != 0) {
                        imageView.getDrawable().setColorFilter(i19, android.graphics.PorterDuff.Mode.SRC_ATOP);
                    }
                }
            }
            imageView.setVisibility(this.f197779p == null ? 8 : 0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38);
        this.f197789z = imageView2;
        if (imageView2 != null) {
            imageView2.setVisibility(this.A);
        }
        if (this.F) {
            A(view, r());
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.CharSequence o17 = o();
        if (!android.text.TextUtils.isEmpty(o17)) {
            sb6.append(o17);
            sb6.append(' ');
        }
        java.lang.CharSequence n17 = n();
        if (!android.text.TextUtils.isEmpty(n17)) {
            sb6.append(n17);
            sb6.append(' ');
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
        }
        return sb6.toString();
    }

    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(this.f197770d);
        android.view.View inflate = b17.inflate(this.G, viewGroup, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i17 = this.H;
            if (i17 != 0) {
                b17.inflate(i17, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return inflate;
    }

    public void w(boolean z17) {
        if (this.f197782s != z17) {
            this.f197782s = z17;
            s();
        }
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.preferenceStyle);
    }

    public Preference(android.content.Context context) {
        this(context, null);
    }
}
