package cq1;

/* loaded from: classes8.dex */
public final class d0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f221333d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f221334e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221335f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f221336g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.Dialog f221337h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver f221338i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f221339m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f221340n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f221341o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f221342p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f221343q;

    /* renamed from: r, reason: collision with root package name */
    public int f221344r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f221345s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f221346t;

    /* renamed from: u, reason: collision with root package name */
    public cq1.v f221347u;

    /* renamed from: v, reason: collision with root package name */
    public cq1.w f221348v;

    public d0(android.content.Context mContext, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f221333d = mContext;
        this.f221334e = z17;
        this.f221335f = "LaunchMpBottomSheet";
        if (mContext instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) mContext).getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f221339m = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f221337h = new com.tencent.mm.ui.widget.dialog.c(mContext);
        android.view.View inflate = android.view.View.inflate(mContext, com.tencent.mm.R.layout.ehl, null);
        this.f221336g = inflate;
        this.f221345s = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.b0h) : null;
        android.view.View view = this.f221336g;
        this.f221346t = view != null ? view.findViewById(com.tencent.mm.R.id.f483482b02) : null;
        android.view.View view2 = this.f221336g;
        this.f221340n = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.t3f) : null;
        android.view.View view3 = this.f221336g;
        this.f221341o = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.f483483sm0) : null;
        android.view.View view4 = this.f221336g;
        this.f221342p = view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.sm9) : null;
        if (i17 == 0) {
            android.widget.TextView textView = this.f221340n;
            if (textView != null) {
                textView.setText(mContext.getString(com.tencent.mm.R.string.nab));
            }
            android.widget.TextView textView2 = this.f221342p;
            if (textView2 != null) {
                textView2.setText(mContext.getString(com.tencent.mm.R.string.nah));
            }
        } else if (i17 == 1) {
            android.widget.TextView textView3 = this.f221340n;
            if (textView3 != null) {
                textView3.setText(mContext.getString(com.tencent.mm.R.string.nac));
            }
            android.widget.TextView textView4 = this.f221342p;
            if (textView4 != null) {
                textView4.setText(mContext.getString(com.tencent.mm.R.string.nag));
            }
        } else if (i17 == 2) {
            android.widget.TextView textView5 = this.f221340n;
            if (textView5 != null) {
                textView5.setText(mContext.getString(com.tencent.mm.R.string.na8));
            }
            android.widget.TextView textView6 = this.f221342p;
            if (textView6 != null) {
                textView6.setText(mContext.getString(com.tencent.mm.R.string.nag));
            }
        } else if (i17 == 3) {
            if (z17) {
                android.widget.TextView textView7 = this.f221340n;
                if (textView7 != null) {
                    textView7.setText(mContext.getString(com.tencent.mm.R.string.nav));
                }
                android.widget.TextView textView8 = this.f221342p;
                if (textView8 != null) {
                    textView8.setText(mContext.getString(com.tencent.mm.R.string.nai));
                }
            } else {
                android.widget.TextView textView9 = this.f221340n;
                if (textView9 != null) {
                    textView9.setText(mContext.getString(com.tencent.mm.R.string.naa));
                }
                android.widget.TextView textView10 = this.f221342p;
                if (textView10 != null) {
                    textView10.setText(mContext.getString(com.tencent.mm.R.string.nae));
                }
            }
        }
        if (z17) {
            android.widget.TextView textView11 = this.f221341o;
            if (textView11 != null) {
                textView11.setText(mContext.getString(com.tencent.mm.R.string.na6));
            }
            android.view.View view5 = this.f221345s;
            if (view5 != null) {
                view5.setOnClickListener(new cq1.x(this));
            }
        } else {
            android.widget.TextView textView12 = this.f221341o;
            if (textView12 != null) {
                textView12.setText(mContext.getString(com.tencent.mm.R.string.na7));
            }
            android.widget.TextView textView13 = this.f221342p;
            if (textView13 != null) {
                textView13.setText(mContext.getString(com.tencent.mm.R.string.nae));
            }
            android.view.View view6 = this.f221345s;
            if (view6 != null) {
                view6.setOnClickListener(new cq1.y(this));
            }
        }
        android.widget.TextView textView14 = this.f221341o;
        android.text.TextPaint paint = textView14 != null ? textView14.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        if (paint != null) {
            paint.setStrokeWidth(0.8f);
        }
        android.widget.TextView textView15 = this.f221342p;
        android.text.TextPaint paint2 = textView15 != null ? textView15.getPaint() : null;
        if (paint2 != null) {
            paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        android.view.View view7 = this.f221346t;
        if (view7 != null) {
            view7.setOnClickListener(new cq1.z(this));
        }
        this.f221343q = a();
        android.app.Dialog dialog = this.f221337h;
        kotlin.jvm.internal.o.e(dialog, "null cannot be cast to non-null type com.tencent.mm.ui.widget.dialog.CustomSheetDialog");
        android.view.View view8 = this.f221336g;
        kotlin.jvm.internal.o.d(view8);
        ((com.tencent.mm.ui.widget.dialog.c) dialog).setContentView(view8);
        android.app.Dialog dialog2 = this.f221337h;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new cq1.a0(this));
        }
    }

    public final boolean a() {
        android.content.Context context = this.f221333d;
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public final void b() {
        android.app.Dialog dialog = this.f221337h;
        android.content.Context context = this.f221333d;
        java.lang.String str = this.f221335f;
        com.tencent.mars.xlog.Log.i(str, "tryHide mBottomSheetDialog:%s, mContext:%s", dialog, context);
        android.app.Dialog dialog2 = this.f221337h;
        if (dialog2 != null) {
            if (!(context instanceof android.app.Activity)) {
                kotlin.jvm.internal.o.d(dialog2);
                dialog2.dismiss();
                return;
            }
            com.tencent.mars.xlog.Log.i(str, " cannot dismiss !");
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            android.app.Dialog dialog3 = this.f221337h;
            kotlin.jvm.internal.o.d(dialog3);
            dialog3.dismiss();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f221337h;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f221339m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f221337h;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f221343q == a()) {
                    int i17 = this.f221344r;
                    android.content.Context context = this.f221333d;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
