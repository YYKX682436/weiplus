package com.tencent.mm.ui.chatting.atsomeone;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/chatting/atsomeone/AtSomeoneLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lcom/tencent/mm/ui/chatting/atsomeone/b;", "", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lym3/b;", "searchDataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lym3/b;Lxm3/n0;Landroidx/lifecycle/y;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AtSomeoneLiveList extends com.tencent.mm.plugin.mvvmlist.MMSearchLiveList<com.tencent.mm.ui.chatting.atsomeone.b, java.lang.String> {
    public final java.util.ArrayList C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtSomeoneLiveList(ym3.f dataSource, ym3.b searchDataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner) {
        super(dataSource, searchDataSource, config, lifecycleOwner);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(searchDataSource, "searchDataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.C = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.lang.String c() {
        return "MicroMsg.Mvvm.AtSomeoneLiveList";
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
            com.tencent.mm.ui.chatting.atsomeone.b bVar = (com.tencent.mm.ui.chatting.atsomeone.b) it.next();
            if (bVar.f198469f == 2) {
                java.lang.String str2 = bVar.f198473m;
                if (kotlin.jvm.internal.o.b(str2, str)) {
                    bVar.f198471h = false;
                } else {
                    bVar.f198471h = true;
                    arrayList.add(str2);
                    str = str2;
                }
            } else {
                bVar.f198471h = false;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it6 = snapshotList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((com.tencent.mm.ui.chatting.atsomeone.b) ((com.tencent.mm.ui.chatting.atsomeone.b) it6.next()).y0());
        }
        return arrayList2;
    }
}
