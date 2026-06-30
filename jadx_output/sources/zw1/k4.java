package zw1;

/* loaded from: classes15.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f476690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476692g;

    public k4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17, ww1.b3 b3Var) {
        this.f476692g = walletCollectQrCodeUI;
        this.f476689d = a3Var;
        this.f476690e = i17;
        this.f476691f = b3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476692g;
        ww1.a3 collectMchDataModel = this.f476689d;
        double d17 = collectMchDataModel.f450101k;
        java.lang.String str = collectMchDataModel.f450103m;
        boolean z17 = collectMchDataModel.f450105o;
        java.lang.String str2 = collectMchDataModel.f450104n;
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        boolean w76 = walletCollectQrCodeUI.w7(d17, str, z17, str2);
        java.util.LinkedList linkedList = collectMchDataModel.V;
        java.lang.Long valueOf = java.lang.Long.valueOf(collectMchDataModel.U);
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f476692g;
        r45.bj4 t76 = walletCollectQrCodeUI2.t7(linkedList, valueOf);
        java.lang.String shop_name = "";
        java.lang.String str3 = t76 != null ? t76.f370806f : "";
        boolean z18 = collectMchDataModel.T;
        int i18 = this.f476690e;
        if (!z18 || i18 != 2) {
            str3 = collectMchDataModel.R;
        }
        if (w76) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(collectMchDataModel.f450099i)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
                return;
            }
            collectMchDataModel.f450111u = walletCollectQrCodeUI2.d7(i18, collectMchDataModel.f450099i, str3, collectMchDataModel.f450106p);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(collectMchDataModel.f450088a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : qrcode_url null");
                return;
            }
            collectMchDataModel.f450111u = walletCollectQrCodeUI2.d7(i18, collectMchDataModel.f450088a, str3, collectMchDataModel.f450094d);
        }
        android.graphics.Bitmap bitmap = collectMchDataModel.f450111u;
        ww1.b3 collectMchViewModel = this.f476691f;
        if (bitmap != null && !bitmap.isRecycled()) {
            collectMchViewModel.f450149u.setImageBitmap(null);
            collectMchViewModel.f450149u.setImageBitmap(collectMchDataModel.f450111u);
        }
        collectMchViewModel.f450149u.setOnLongClickListener(new zw1.j4(this));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) collectMchViewModel.f450146r.getLayoutParams();
        int i19 = 0;
        if (collectMchDataModel.f450101k > 0.0d) {
            collectMchViewModel.f450144p.setVisibility(0);
            collectMchViewModel.f450145q.setPrefix(walletCollectQrCodeUI2.n7(i18));
            collectMchViewModel.f450145q.setText(com.tencent.mm.wallet_core.ui.r1.o(collectMchDataModel.f450101k));
            layoutParams.topMargin = i65.a.b(walletCollectQrCodeUI2.getContext(), 8);
        } else {
            collectMchViewModel.f450144p.setVisibility(8);
            layoutParams.topMargin = i65.a.b(walletCollectQrCodeUI2.getContext(), 16);
        }
        collectMchViewModel.f450146r.setLayoutParams(layoutParams);
        walletCollectQrCodeUI2.E7(i18, collectMchViewModel.f450146r);
        walletCollectQrCodeUI2.F7(i18, collectMchViewModel.f450147s);
        if (i18 != 2 || !collectMchDataModel.T) {
            collectMchViewModel.f450141m.setVisibility(8);
            collectMchViewModel.f450140l.setVisibility(0);
            collectMchViewModel.f450140l.setText(walletCollectQrCodeUI2.u7(i18));
            return;
        }
        collectMchViewModel.f450140l.setVisibility(8);
        collectMchViewModel.f450141m.setVisibility(0);
        androidx.appcompat.app.AppCompatActivity activity = walletCollectQrCodeUI2.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        zw1.t2 t2Var = (zw1.t2) pf5.z.f353948a.a(activity).a(zw1.t2.class);
        t2Var.getClass();
        kotlin.jvm.internal.o.g(collectMchDataModel, "collectMchDataModel");
        kotlin.jvm.internal.o.g(collectMchViewModel, "collectMchViewModel");
        ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "refreshMultiShopChangeBtn");
        java.util.LinkedList linkedList2 = collectMchDataModel.V;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            ot5.g.a("MicroMsg.WalletCollectQrCodeMultiShopUIC", "collectMchDataModel.shop_list is empty!");
            return;
        }
        android.widget.TextView textView = collectMchViewModel.f450143o;
        java.util.LinkedList shop_list = collectMchDataModel.V;
        kotlin.jvm.internal.o.f(shop_list, "shop_list");
        long j17 = collectMchDataModel.U;
        int size = shop_list.size();
        while (true) {
            if (i19 >= size) {
                break;
            }
            if (j17 == ((r45.bj4) shop_list.get(i19)).f370804d) {
                shop_name = ((r45.bj4) shop_list.get(i19)).f370805e;
                kotlin.jvm.internal.o.f(shop_name, "shop_name");
                break;
            }
            i19++;
        }
        textView.setText(shop_name);
        collectMchViewModel.f450142n.setOnClickListener(new zw1.s2(t2Var, collectMchDataModel, collectMchViewModel));
    }
}
