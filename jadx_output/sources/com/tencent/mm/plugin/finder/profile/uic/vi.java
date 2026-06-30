package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes3.dex */
public final class vi implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124304b;

    public vi(java.lang.String str, android.widget.ImageView imageView) {
        this.f124303a = str;
        this.f124304b = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ui(this.f124304b));
            com.tencent.mars.xlog.Log.i("Finder.ProfileUiStyleUIC", "[handleProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f124303a);
        }
    }
}
