package uj3;

/* loaded from: classes14.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj3.b f428384a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f428385b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f428386c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f428387d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f428388e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428389f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428390g;

    /* renamed from: h, reason: collision with root package name */
    public int f428391h;

    /* renamed from: i, reason: collision with root package name */
    public int f428392i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f428393j;

    public y0(uj3.b statusManager) {
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428384a = statusManager;
        this.f428391h = -1;
        this.f428392i = -1;
    }

    public final void a() {
        android.widget.FrameLayout frameLayout = this.f428386c;
        if (frameLayout != null) {
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.mbu);
            this.f428385b = textView;
            if (textView != null) {
                textView.setVisibility(4);
            }
            android.widget.FrameLayout frameLayout2 = this.f428386c;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(4);
            }
            this.f428389f = (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout.findViewById(com.tencent.mm.R.id.mbx);
            this.f428390g = (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout.findViewById(com.tencent.mm.R.id.mbz);
            this.f428387d = (android.widget.FrameLayout) frameLayout.findViewById(com.tencent.mm.R.id.mby);
            this.f428388e = (android.widget.FrameLayout) frameLayout.findViewById(com.tencent.mm.R.id.f486747mc0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f428389f;
            if (weImageView != null) {
                weImageView.setRotation(180.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428389f;
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(com.tencent.mm.ui.uk.e(frameLayout.getContext(), com.tencent.mm.R.raw.icons_filled_arrow, b(true)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f428389f;
            if (weImageView3 != null) {
                weImageView3.setIconColor(frameLayout.getContext().getResources().getColor(b(true)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f428390g;
            if (weImageView4 != null) {
                weImageView4.setImageDrawable(com.tencent.mm.ui.uk.e(frameLayout.getContext(), com.tencent.mm.R.raw.icons_filled_arrow, b(false)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f428390g;
            if (weImageView5 != null) {
                weImageView5.setIconColor(frameLayout.getContext().getResources().getColor(b(false)));
            }
            android.widget.FrameLayout frameLayout3 = this.f428387d;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(new uj3.w0(this));
            }
            android.widget.FrameLayout frameLayout4 = this.f428388e;
            if (frameLayout4 != null) {
                frameLayout4.setOnClickListener(new uj3.x0(this));
            }
            java.lang.String str = this.f428393j;
            if (str != null) {
                e(str);
            }
        }
    }

    public final int b(boolean z17) {
        if (z17) {
            if (this.f428391h == 0) {
                return com.tencent.mm.R.color.f479210sy;
            }
        } else if (this.f428391h == this.f428392i - 1) {
            return com.tencent.mm.R.color.f479210sy;
        }
        return com.tencent.mm.R.color.f478553an;
    }

    public final android.view.View c(android.content.Context context, android.widget.FrameLayout viewGroup) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        if (this.f428384a.c()) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3q, viewGroup);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f428386c = (android.widget.FrameLayout) inflate;
            a();
        } else {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3p, viewGroup);
            kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f428386c = (android.widget.FrameLayout) inflate2;
            a();
        }
        return this.f428386c;
    }

    public final void d() {
        android.widget.TextView textView = this.f428385b;
        if (textView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f428389f;
            if (weImageView != null) {
                weImageView.setIconColor(textView.getContext().getResources().getColor(b(true)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428390g;
            if (weImageView2 != null) {
                weImageView2.setIconColor(textView.getContext().getResources().getColor(b(false)));
            }
        }
    }

    public final void e(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        android.widget.TextView textView = this.f428385b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f428386c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        this.f428393j = str;
        android.widget.TextView textView2 = this.f428385b;
        if (textView2 != null) {
            textView2.setText(str);
        }
        android.widget.TextView textView3 = this.f428385b;
        if (textView3 != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f428389f;
            if (weImageView != null) {
                weImageView.setIconColor(textView3.getContext().getResources().getColor(b(true)));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428390g;
            if (weImageView2 != null) {
                weImageView2.setIconColor(textView3.getContext().getResources().getColor(b(false)));
            }
        }
    }
}
