package et4;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f256616d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f256617e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f256618f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f256619g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f256620h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f256621i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f256622m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f256623n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo f256624o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f256625p;

    /* renamed from: q, reason: collision with root package name */
    public int f256626q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f256627r;

    /* renamed from: s, reason: collision with root package name */
    public int f256628s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f256629t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.m f256630u;

    /* renamed from: v, reason: collision with root package name */
    public et4.h f256631v;

    /* renamed from: w, reason: collision with root package name */
    public final et4.h0 f256632w;

    public i(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.f256620h = new java.util.ArrayList();
        this.f256622m = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        this.f256623n = new com.tencent.mm.plugin.wallet_core.model.Orders();
        this.f256629t = true;
        this.f256632w = new et4.a(this);
        this.f256621i = context;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d8y, null);
        this.f256616d = viewGroup;
        this.f256617e = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.pop);
        this.f256618f = (android.view.ViewGroup) this.f256616d.findViewById(com.tencent.mm.R.id.pom);
        this.f256619g = (android.widget.TextView) this.f256616d.findViewById(com.tencent.mm.R.id.por);
        android.widget.ImageView imageView = this.f256617e;
        int i17 = com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.f180198y0;
        com.tencent.mm.sdk.platformtools.t8.q(imageView, i17, i17, i17, i17);
        this.f256617e.setOnClickListener(new et4.d(this));
        setContentView(this.f256616d);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new et4.b(this));
        setOnDismissListener(new et4.c(this));
        this.f256630u = new com.tencent.mm.plugin.wallet_core.utils.m();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.f256622m == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WcPayCashierBankcardDialog", "pay info is null!!");
            dismiss();
        }
        com.tencent.mm.wallet_core.model.n1.d(7, 0);
    }
}
