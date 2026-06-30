package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class s extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.widget.FrameLayout.LayoutParams f209224m = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f209225d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.mmfb.sdk.k f209226e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f209227f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f209228g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.xweb.WebView f209229h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f209230i;

    public s(android.content.Context context, java.lang.String str, com.tencent.mm.ui.mmfb.sdk.k kVar) {
        super(context, android.R.style.Theme.Translucent.NoTitleBar);
        this.f209225d = str;
        this.f209226e = kVar;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(getContext());
        this.f209227f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f209227f.setMessage(getContext().getString(com.tencent.mm.R.string.c8o));
        requestWindowFeature(1);
        this.f209230i = new android.widget.FrameLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f209228g = imageView;
        imageView.setOnClickListener(new com.tencent.mm.ui.mmfb.sdk.p(this));
        this.f209228g.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bhj));
        this.f209228g.setVisibility(4);
        int intrinsicWidth = this.f209228g.getDrawable().getIntrinsicWidth() / 2;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        com.tencent.xweb.WebView webView = new com.tencent.xweb.WebView(getContext(), null);
        this.f209229h = webView;
        webView.setVerticalScrollBarEnabled(false);
        this.f209229h.setHorizontalScrollBarEnabled(false);
        this.f209229h.setWebViewClient(new com.tencent.mm.ui.mmfb.sdk.r(this, null));
        this.f209229h.getSettings().E(true);
        this.f209229h.loadUrl(this.f209225d);
        this.f209229h.setLayoutParams(f209224m);
        this.f209229h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f209229h);
        this.f209230i.addView(linearLayout);
        this.f209230i.addView(this.f209228g, new android.view.ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f209230i, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f209226e.onCancel();
        dismiss();
        return true;
    }
}
