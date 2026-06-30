package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class c7 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f128978a;

    public c7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f128978a = finderImagePreviewUI;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f128978a.G = bitmap;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.ui.b7(nVar, bitmap));
        }
    }
}
