package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class s implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129787b;

    public s(java.lang.String str, com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129786a = str;
        this.f129787b = finderActivityDescUI;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.r(this.f129787b));
            com.tencent.mm.plugin.finder.ui.f fVar = com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.f128488x1;
            com.tencent.mars.xlog.Log.i("Finder.FinderActivityDescUI", "[handleActivityProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f129786a);
        }
    }
}
