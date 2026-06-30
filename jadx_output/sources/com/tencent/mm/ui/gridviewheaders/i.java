package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class i extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208748a;

    public i(com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView) {
        this.f208748a = gridHeadersGridView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        int i17 = com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.L;
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208748a;
        gridHeadersGridView.f208716q = 0;
        gridHeadersGridView.D = null;
        gridHeadersGridView.f208714o = Long.MIN_VALUE;
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        int i17 = com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.L;
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208748a;
        gridHeadersGridView.f208716q = 0;
        gridHeadersGridView.D = null;
        gridHeadersGridView.f208714o = Long.MIN_VALUE;
    }
}
