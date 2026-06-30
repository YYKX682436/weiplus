package jk5;

/* loaded from: classes13.dex */
public class o extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.widget.FrameLayout.LayoutParams f300181m = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f300182d;

    /* renamed from: e, reason: collision with root package name */
    public final jk5.l f300183e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f300184f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f300185g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.xweb.WebView f300186h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f300187i;

    public o(android.content.Context context, java.lang.String str, jk5.l lVar) {
        super(context, android.R.style.Theme.Translucent.NoTitleBar);
        this.f300182d = str;
        this.f300183e = lVar;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(getContext());
        this.f300184f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f300184f.setMessage(getContext().getString(com.tencent.mm.R.string.f493409k23));
        requestWindowFeature(1);
        this.f300187i = new android.widget.FrameLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f300185g = imageView;
        imageView.setOnClickListener(new jk5.k(this));
        this.f300185g.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bhj));
        this.f300185g.setVisibility(4);
        int intrinsicWidth = this.f300185g.getDrawable().getIntrinsicWidth() / 2;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        com.tencent.xweb.WebView webView = new com.tencent.xweb.WebView(getContext(), null);
        this.f300186h = webView;
        webView.setVerticalScrollBarEnabled(false);
        this.f300186h.setHorizontalScrollBarEnabled(false);
        this.f300186h.setWebViewClient(new jk5.n(this, null));
        this.f300186h.getSettings().E(true);
        this.f300186h.loadUrl(this.f300182d);
        this.f300186h.setLayoutParams(f300181m);
        this.f300186h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f300186h);
        this.f300187i.addView(linearLayout);
        this.f300187i.addView(this.f300185g, new android.view.ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f300187i, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        ((jk5.j) this.f300183e).c();
        dismiss();
        return true;
    }
}
