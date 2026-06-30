package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class x0 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f153372d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f153373e;

    /* renamed from: f, reason: collision with root package name */
    public wq3.u f153374f;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        wq3.u uVar = this.f153374f;
        if (uVar == null || com.tencent.mm.sdk.platformtools.t8.K0(uVar.f448607b) || !str.equals(this.f153374f.f448607b)) {
            return;
        }
        this.f153372d.post(new com.tencent.mm.plugin.product.ui.w0(this, bitmap));
    }
}
