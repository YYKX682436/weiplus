package eo2;

/* loaded from: classes2.dex */
public final class l extends w92.a {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f255583m;

    /* renamed from: n, reason: collision with root package name */
    public final int f255584n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f255585o;

    /* renamed from: p, reason: collision with root package name */
    public int f255586p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f255587q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f255588r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, int i17, java.lang.String title, boolean z17, int i18, int i19, int i27, boolean z18) {
        super(i17, title, z17, i18, i19);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(title, "title");
        this.f255583m = context;
        this.f255584n = i27;
        this.f255585o = z18;
    }

    @Override // w92.a, zx2.k, zx2.i
    public int a() {
        return this.f255584n;
    }

    @Override // w92.a, zx2.i
    public int[] b() {
        return new int[]{0, 0};
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.widget.TextView textView;
        super.c(viewGroup);
        android.widget.TextView textView2 = this.f477052j;
        if (textView2 != null) {
            textView2.setIncludeFontPadding(false);
        }
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f487201nv5);
            if (findViewById != null) {
                findViewById.setPadding(this.f255586p, findViewById.getPaddingTop(), this.f255586p, findViewById.getPaddingBottom());
            }
            android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nuu);
            this.f255588r = textView3;
            if (textView3 != null) {
                textView3.setTextSize(1, 12.0f);
            }
            java.lang.String str = this.f255587q;
            if (!(str == null || str.length() == 0) && (textView = this.f255588r) != null) {
                textView.setText(this.f255587q);
            }
            if (this.f255585o) {
                android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.r8v);
                com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = findViewById2 instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById2 : null;
                if (roundCornerRelativeLayout == null || (viewTreeObserver = roundCornerRelativeLayout.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnGlobalLayoutListener(new eo2.k(roundCornerRelativeLayout, roundCornerRelativeLayout));
            }
        }
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (this.f255585o) {
            android.view.View findViewById = tabView.findViewById(com.tencent.mm.R.id.r8v);
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = findViewById instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getHeight() / 2.0f);
            }
            if (z17) {
                if (roundCornerRelativeLayout != null) {
                    roundCornerRelativeLayout.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478490b));
                }
            } else if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a9e));
            }
        }
        if (z17 || (textView = this.f255588r) == null) {
            return;
        }
        textView.setText("");
    }
}
