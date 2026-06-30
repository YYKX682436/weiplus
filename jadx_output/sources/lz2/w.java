package lz2;

/* loaded from: classes14.dex */
public class w implements android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog f322357d;

    /* renamed from: e, reason: collision with root package name */
    public pz2.a f322358e;

    /* renamed from: f, reason: collision with root package name */
    public lz2.a f322359f;

    /* renamed from: g, reason: collision with root package name */
    public int f322360g;

    /* renamed from: h, reason: collision with root package name */
    public int f322361h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322362i = false;

    /* renamed from: m, reason: collision with root package name */
    public final pz2.c f322363m = new lz2.t(this);

    public w(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog, lz2.a aVar, android.os.Bundle bundle) {
        this.f322357d = walletFaceIdDialog;
        this.f322359f = aVar;
        if (bundle != null) {
            this.f322360g = bundle.getInt("face_auth_scene");
        }
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "auth cancel");
        lz2.a aVar = this.f322359f;
        if (aVar != null) {
            aVar.onAuthCancel();
            this.f322359f = null;
        }
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "auth fail");
        lz2.a aVar = this.f322359f;
        if (aVar != null) {
            aVar.onAuthFail(i17);
            this.f322359f = null;
        }
        this.f322357d.dismiss();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "req faceid auth");
        pz2.a aVar = this.f322358e;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdDialog", "mgr is null");
            return;
        }
        aVar.userCancel();
        if (!this.f322358e.a1()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletFaceIdDialog", "no faceid enrolled");
            b(-2);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(mz2.d2.IML.f333111d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "no challenge");
            b(-3);
        } else {
            this.f322358e.Q7(this.f322363m, 3000, this.f322360g);
            com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog walletFaceIdDialog = this.f322357d;
            walletFaceIdDialog.f136986d.a(com.tencent.mm.R.drawable.f481458th, new lz2.s(walletFaceIdDialog));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "face id dialog dismiss");
        this.f322358e.userCancel();
        if (this.f322360g == 1) {
            a();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "face id dialog show");
        this.f322358e = (pz2.a) gm0.j1.s(pz2.a.class);
        ju5.n.c().b();
        c();
    }
}
