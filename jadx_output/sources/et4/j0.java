package et4;

/* loaded from: classes9.dex */
public class j0 extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f256635d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f256636e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f256637f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f256638g;

    public j0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489640d93, null);
        this.f256635d = inflate;
        this.f256637f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ppa);
        this.f256638g = (android.view.ViewGroup) this.f256635d.findViewById(com.tencent.mm.R.id.ppb);
        this.f256636e = (android.widget.TextView) this.f256635d.findViewById(com.tencent.mm.R.id.pgk);
        android.widget.ImageView imageView = this.f256637f;
        int i17 = com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog.f180198y0;
        com.tencent.mm.sdk.platformtools.t8.q(imageView, i17, i17, i17, i17);
        this.f256637f.setOnClickListener(new et4.i0(this));
        setContentView(this.f256635d);
        setCanceledOnTouchOutside(false);
    }
}
