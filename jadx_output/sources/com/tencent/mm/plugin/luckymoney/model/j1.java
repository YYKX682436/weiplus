package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.k1 f145348e;

    public j1(com.tencent.mm.plugin.luckymoney.model.k1 k1Var, android.graphics.Bitmap bitmap) {
        this.f145348e = k1Var;
        this.f145347d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.k1 k1Var = this.f145348e;
        android.widget.ImageView imageView = k1Var.f145386f.f145407d;
        if (imageView != null) {
            java.lang.String str = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.j1c);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] loadUrl: %s, oldUrl:%s", k1Var.f145385e, str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(k1Var.f145385e) || !k1Var.f145385e.equals(str)) {
                gb3.i iVar = k1Var.f145386f.f145404a;
                if (iVar != null) {
                    iVar.onComplete(false);
                    return;
                }
                return;
            }
            k1Var.f145386f.f145407d.setImageBitmap(this.f145347d);
            gb3.i iVar2 = k1Var.f145386f.f145404a;
            if (iVar2 != null) {
                iVar2.onComplete(true);
            }
        }
    }
}
