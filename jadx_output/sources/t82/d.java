package t82;

/* loaded from: classes11.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f416383d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f416384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f416383d = new java.util.ArrayList();
        this.f416384e = new java.util.ArrayList();
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[clearAllSelectFavItemInfo] clear all select favItemInfos");
        this.f416383d.clear();
        this.f416384e.clear();
    }

    public final o72.r2 P6(int i17) {
        return com.tencent.mm.plugin.fav.ui.h3.f101128c.a().b(i17);
    }

    public final int Q6() {
        com.tencent.mm.plugin.fav.ui.h3 a17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getTotalSize] favIdList size = ");
        java.util.ArrayList arrayList = a17.f101131b;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", sb6.toString());
        return arrayList.size();
    }

    public final java.util.List R6() {
        java.util.ArrayList arrayList = this.f416384e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public final java.util.List S6() {
        java.util.ArrayList arrayList = this.f416383d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public final void T6(int i17) {
        o72.r2 b17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().b(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] position = " + i17);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] favItemInfo = null");
            return;
        }
        java.util.ArrayList arrayList = this.f416383d;
        if (!arrayList.contains(b17)) {
            arrayList.add(b17);
            this.f416384e.add(java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[selectFavItemInfo] error, select second time of same favItemInfo = " + b17.field_localId);
        }
    }

    public final void U6(int i17) {
        o72.r2 b17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().b(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] position = " + i17);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] favItemInfo = null");
            return;
        }
        java.util.ArrayList arrayList = this.f416383d;
        if (arrayList.contains(b17)) {
            arrayList.remove(b17);
            this.f416384e.remove(java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] error, select second time of same favItemInfo = " + b17.field_localId);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.fav.ui.h3 a17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a();
        a17.f101130a.clear();
        a17.f101131b.clear();
    }
}
