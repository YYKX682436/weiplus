package zw1;

/* loaded from: classes9.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.q2 f476756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476758f;

    public p2(zw1.q2 q2Var, ww1.a3 a3Var, ww1.b3 b3Var) {
        this.f476756d = q2Var;
        this.f476757e = a3Var;
        this.f476758f = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ww1.b3 b3Var;
        android.widget.RelativeLayout relativeLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeGiftEntranceUIC$setGiftEntranceBtnStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.app.Activity context = this.f476756d.getContext();
        ww1.a3 a3Var = this.f476757e;
        com.tencent.mm.plugin.wallet_core.utils.z1.c(context, a3Var.H.f379816g, null);
        if (a3Var.G && (relativeLayout = (b3Var = this.f476758f).f450153y) != null) {
            relativeLayout.postDelayed(new zw1.o2(b3Var), 1000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeGiftEntranceUIC$setGiftEntranceBtnStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
