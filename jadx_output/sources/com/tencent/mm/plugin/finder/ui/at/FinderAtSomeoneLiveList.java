package com.tencent.mm.plugin.finder.ui.at;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/at/FinderAtSomeoneLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lcom/tencent/mm/plugin/finder/ui/at/t;", "", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lym3/b;", "searchDataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lym3/b;Lxm3/n0;Landroidx/lifecycle/y;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderAtSomeoneLiveList extends com.tencent.mm.plugin.mvvmlist.MMSearchLiveList<com.tencent.mm.plugin.finder.ui.at.t, java.lang.String> {
    public final java.util.ArrayList C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderAtSomeoneLiveList(ym3.f dataSource, ym3.b searchDataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner) {
        super(dataSource, searchDataSource, config, lifecycleOwner);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(searchDataSource, "searchDataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.C = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.lang.String c() {
        return "MicroMsg.Mvvm.MvvmList";
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.util.List e(java.util.List snapshotList) {
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        kz5.g0.s(snapshotList);
        java.util.ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.add("🔍");
        java.util.Iterator it = snapshotList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.ui.at.t tVar = (com.tencent.mm.plugin.finder.ui.at.t) it.next();
            int i17 = tVar.f128903f;
            if (i17 == 1) {
                if (kotlin.jvm.internal.o.b(tVar.f128908n, str)) {
                    tVar.f128906i = false;
                } else {
                    tVar.f128906i = true;
                    str = tVar.f128908n;
                    arrayList.add(str);
                }
            } else if (i17 != 0) {
                tVar.f128906i = false;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f128908n) || kotlin.jvm.internal.o.b(tVar.f128908n, str)) {
                tVar.f128906i = false;
            } else {
                tVar.f128906i = true;
                str = tVar.f128908n;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it6 = snapshotList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((com.tencent.mm.plugin.finder.ui.at.t) ((com.tencent.mm.plugin.finder.ui.at.t) it6.next()).y0());
        }
        return arrayList2;
    }
}
