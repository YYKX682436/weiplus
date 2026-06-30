package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class o7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129589f;

    public o7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f129587d = finderImagePreviewUI;
        this.f129588e = str;
        this.f129589f = bitmap;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129587d;
        if (itemId == finderImagePreviewUI.f128585t) {
            java.lang.String path = new mn2.q3(this.f129588e, com.tencent.mm.plugin.finder.storage.y90.V).getPath();
            com.tencent.mm.sdk.platformtools.x.D0(this.f129589f, 100, android.graphics.Bitmap.CompressFormat.JPEG, path, true);
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(finderImagePreviewUI, path, new com.tencent.mm.plugin.finder.ui.n7(finderImagePreviewUI));
        }
    }
}
