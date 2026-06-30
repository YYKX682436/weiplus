package wq1;

/* loaded from: classes8.dex */
public class c extends androidx.appcompat.app.i0 implements wq1.d {

    /* renamed from: f, reason: collision with root package name */
    public final r45.sn f448502f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f448503g;

    /* renamed from: h, reason: collision with root package name */
    public xq1.f f448504h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.box.webview.BoxWebView f448505i;

    /* renamed from: m, reason: collision with root package name */
    public xq1.b f448506m;

    public c(android.content.Context context, r45.sn snVar) {
        super(context, com.tencent.mm.R.style.f494076dr);
        this.f448502f = snVar;
    }

    @Override // wq1.d
    public com.tencent.mm.plugin.box.webview.BoxWebView c() {
        return this.f448505i;
    }

    @Override // wq1.d
    public void h() {
    }

    @Override // wq1.d
    public xq1.g o() {
        return this.f448506m;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
        getWindow().addFlags(67108864);
        getWindow().setDimAmount(0.5f);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488239nz, (android.view.ViewGroup) null, false);
        inflate.setOnTouchListener(new wq1.a(this));
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f448503g = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.f487699pi0);
        this.f448506m = new xq1.b(this);
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = new com.tencent.mm.plugin.box.webview.BoxWebView(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f448505i = boxWebView;
        this.f448504h = new xq1.f(this);
        xq1.a aVar = new xq1.a();
        xq1.b bVar = this.f448506m;
        r45.sn snVar = this.f448502f;
        boxWebView.J0(aVar, new xq1.c(snVar, bVar));
        this.f448505i.addJavascriptInterface(this.f448504h, "boxJSApi");
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxHomeUI", "start to load url %s", snVar.f385852f);
        this.f448505i.loadUrl(snVar.f385852f);
        this.f448503g.addView(this.f448505i);
        setCancelable(true);
        setOnDismissListener(new wq1.b(this));
        getWindow().setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        sq1.a.a(1);
    }

    @Override // wq1.d
    public xq1.f u() {
        return this.f448504h;
    }
}
