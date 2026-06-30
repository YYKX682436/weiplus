package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.snackbar.SnackContainer f212472a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f212473b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.snackbar.h f212474c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f212475d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f212476e = new com.tencent.mm.ui.widget.snackbar.c(this);

    public i(android.app.Activity activity, int i17) {
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activity.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        layoutInflater.inflate(com.tencent.mm.R.layout.coa, viewGroup);
        a(viewGroup, layoutInflater.inflate(com.tencent.mm.R.layout.cob, viewGroup, false), i17, activity);
    }

    public final void a(android.view.ViewGroup viewGroup, android.view.View view, int i17, android.content.Context context) {
        if (viewGroup == null) {
            return;
        }
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = (com.tencent.mm.ui.widget.snackbar.SnackContainer) viewGroup.findViewById(com.tencent.mm.R.id.n19);
        this.f212472a = snackContainer;
        if (snackContainer == null) {
            this.f212472a = new com.tencent.mm.ui.widget.snackbar.SnackContainer(viewGroup);
        }
        this.f212473b = view;
        if (i17 == 36) {
            this.f212472a.setOnTouchListener(new com.tencent.mm.ui.widget.snackbar.e(this));
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n18)).setOnClickListener(this.f212476e);
        boolean f17 = com.tencent.mm.ui.bl.f(context);
        int c17 = com.tencent.mm.ui.bl.c(context);
        com.tencent.mm.ui.yk.c("MicroMsg.SnackBar", "snackbar:isNavBarVisibility : %B,navBarHeightd:%d", java.lang.Boolean.valueOf(f17), java.lang.Integer.valueOf(c17));
        int i18 = ((android.app.Activity) context).getWindow().getAttributes().flags;
        boolean z17 = i18 == (((-134217729) & i18) | 134217728);
        com.tencent.mm.ui.yk.c("MicroMsg.SnackBar", "snackbar:isNavBarTranslucent : %B", java.lang.Boolean.valueOf(z17));
        if (z17 && f17) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.n17);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = c17;
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public i(android.content.Context context, android.view.View view, int i17) {
        if (view == null && (context instanceof android.app.Activity)) {
            view = ((android.app.Activity) context).findViewById(android.R.id.content);
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        layoutInflater.inflate(com.tencent.mm.R.layout.coa, viewGroup);
        a(viewGroup, layoutInflater.inflate(com.tencent.mm.R.layout.cob, viewGroup, false), i17, context);
    }
}
