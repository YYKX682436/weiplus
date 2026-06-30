package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.k f180861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f180862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l f180863f;

    public d(com.tencent.mm.plugin.wallet_core.utils.m mVar, at4.k kVar, android.widget.ImageView imageView, com.tencent.mm.plugin.wallet_core.utils.l lVar) {
        this.f180861d = kVar;
        this.f180862e = imageView;
        this.f180863f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        at4.k kVar = this.f180861d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(kVar.f13880c);
        android.widget.ImageView imageView = this.f180862e;
        if (K0) {
            int i17 = kVar.f13883f;
            if (i17 > 0) {
                imageView.setImageResource(i17);
                return;
            }
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(kVar.f13880c);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(c1Var));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this.f180863f);
    }
}
