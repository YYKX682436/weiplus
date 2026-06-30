package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.ui.gridviewheaders.q implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f208754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView, com.tencent.mm.ui.gridviewheaders.i iVar) {
        super(gridHeadersGridView, null);
        this.f208755g = gridHeadersGridView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        android.view.View d17;
        java.util.HashSet hashSet;
        int windowAttachCount;
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208755g;
        gridHeadersGridView.getClass();
        com.tencent.mm.ui.gridviewheaders.h hVar = gridHeadersGridView.H;
        if (hVar == null || hVar.getCount() <= 0 || (i17 = this.f208754f) == -1 || i17 >= gridHeadersGridView.H.getCount()) {
            return;
        }
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView2 = this.f208757e;
        boolean z18 = true;
        if (gridHeadersGridView2.hasWindowFocus()) {
            windowAttachCount = gridHeadersGridView2.getWindowAttachCount();
            if (windowAttachCount == this.f208756d) {
                z17 = true;
                if (z17 || (d17 = gridHeadersGridView.d(this.f208754f)) == null) {
                }
                int i18 = this.f208754f;
                if (i18 != -2) {
                    gridHeadersGridView.H.a(gridHeadersGridView.getFirstVisiblePosition() + i18);
                }
                if (gridHeadersGridView.f208722w != null) {
                    gridHeadersGridView.playSoundEffect(0);
                    d17.sendAccessibilityEvent(1);
                    cw1.j3 j3Var = ((cw1.j3$$a) gridHeadersGridView.f208722w).f223037a;
                    j3Var.getClass();
                    cw1.n3 n3Var = (cw1.n3) d17.getTag();
                    int i19 = n3Var.f223178a;
                    java.util.ArrayList arrayList = j3Var.f223026f;
                    long c17 = ((bw1.l) arrayList.get(i19)).c();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailAdapter", "select header position=%d | headerId=%d", java.lang.Integer.valueOf(n3Var.f223178a), java.lang.Long.valueOf(c17));
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    for (int i27 = 0; i27 < arrayList.size(); i27++) {
                        if (((bw1.l) arrayList.get(i27)).c() == c17) {
                            hashSet2.add(java.lang.Integer.valueOf(i27));
                        }
                    }
                    java.util.Iterator it = hashSet2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        hashSet = j3Var.f223024d;
                        if (!hasNext) {
                            break;
                        } else if (!hashSet.remove(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()))) {
                            z18 = false;
                        }
                    }
                    if (!z18) {
                        hashSet.addAll(hashSet2);
                    }
                    j3Var.c();
                    j3Var.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }
}
