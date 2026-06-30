package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208753d;

    public l(com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView) {
        this.f208753d = gridHeadersGridView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208753d;
        if (gridHeadersGridView.f208705J == 0) {
            gridHeadersGridView.f208705J = 1;
            android.view.View d17 = gridHeadersGridView.d(gridHeadersGridView.I);
            if (d17 == null || d17.hasFocusable()) {
                return;
            }
            d17.setPressed(true);
            gridHeadersGridView.setPressed(true);
            gridHeadersGridView.refreshDrawableState();
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            if (!gridHeadersGridView.isLongClickable()) {
                gridHeadersGridView.f208705J = 2;
                return;
            }
            if (gridHeadersGridView.f208706d == null) {
                gridHeadersGridView.f208706d = new com.tencent.mm.ui.gridviewheaders.k(gridHeadersGridView, null);
            }
            com.tencent.mm.ui.gridviewheaders.k kVar = gridHeadersGridView.f208706d;
            kVar.f208756d = kVar.f208757e.getWindowAttachCount();
            gridHeadersGridView.f208708f.postDelayed(gridHeadersGridView.f208706d, longPressTimeout);
        }
    }
}
