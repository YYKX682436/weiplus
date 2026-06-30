package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes12.dex */
public class k extends com.tencent.mm.ui.gridviewheaders.q implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView, com.tencent.mm.ui.gridviewheaders.i iVar) {
        super(gridHeadersGridView, null);
        this.f208752f = gridHeadersGridView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208752f;
        if (gridHeadersGridView.d(gridHeadersGridView.I) != null) {
            int i17 = gridHeadersGridView.I;
            if (i17 != -2) {
                gridHeadersGridView.H.a(gridHeadersGridView.getFirstVisiblePosition() + i17);
            }
            com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView2 = this.f208757e;
            if (gridHeadersGridView2.hasWindowFocus()) {
                gridHeadersGridView2.getWindowAttachCount();
                int i18 = this.f208756d;
            }
            gridHeadersGridView.f208705J = 2;
        }
    }
}
