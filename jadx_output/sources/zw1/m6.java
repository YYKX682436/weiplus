package zw1;

/* loaded from: classes8.dex */
public final class m6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476731f;

    public m6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17) {
        this.f476729d = walletCollectQrCodeUI;
        this.f476730e = a3Var;
        this.f476731f = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.hk5 hk5Var;
        java.util.LinkedList linkedList;
        int i17 = this.f476731f;
        ww1.a3 a3Var = this.f476730e;
        int i18 = 0;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476729d;
        if (g4Var != null) {
            ((db5.h4) g4Var.f(0, walletCollectQrCodeUI.getString(com.tencent.mm.R.string.b_7))).f228382z = new zw1.k6(walletCollectQrCodeUI, a3Var, i17);
        }
        if (a3Var == null || (hk5Var = a3Var.f450093c0) == null || (linkedList = hk5Var.f376248e) == null) {
            return;
        }
        for (java.lang.Object obj : linkedList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.vk4 vk4Var = (r45.vk4) obj;
            if (g4Var != null) {
                ((db5.h4) g4Var.f(i19, vk4Var != null ? vk4Var.f388318e : null)).f228382z = new zw1.l6(vk4Var, walletCollectQrCodeUI, i17);
            }
            i18 = i19;
        }
    }
}
