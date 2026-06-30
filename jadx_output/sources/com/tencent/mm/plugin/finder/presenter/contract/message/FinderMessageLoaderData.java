package com.tencent.mm.plugin.finder.presenter.contract.message;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData;", "Lir2/a;", "Lso2/i;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMessageLoaderData extends ir2.a {

    /* renamed from: k, reason: collision with root package name */
    public long f123279k;

    /* renamed from: l, reason: collision with root package name */
    public r45.qk4 f123280l;

    /* renamed from: m, reason: collision with root package name */
    public r45.tl6 f123281m;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData.Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMessageLoaderData(java.util.List feeds, boolean z17) {
        super(feeds, false, null, z17, 6, null);
        kotlin.jvm.internal.o.g(feeds, "feeds");
    }

    @Override // ir2.a, ir2.e1
    public void b(java.util.List dataList) {
        int i17;
        dm.pd pdVar;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        dataList.size();
        boolean isEmpty = dataList.isEmpty();
        java.util.List list = this.f294129a;
        if (isEmpty) {
            dataList.addAll(list);
            return;
        }
        kz5.n0.k0(dataList);
        java.util.Iterator it = kz5.n0.x0(list).iterator();
        while (true) {
            int i18 = -1;
            if (!it.hasNext()) {
                break;
            }
            so2.i iVar = (so2.i) it.next();
            java.util.Iterator it6 = dataList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                dm.pd pdVar2 = ((so2.i) it6.next()).f410411d;
                long j17 = pdVar2.field_id;
                dm.pd pdVar3 = iVar.f410411d;
                if (j17 == pdVar3.field_id && pdVar2.field_createTime == pdVar3.field_createTime) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 == -1) {
                dm.pd pdVar4 = iVar.f410411d;
                if (pdVar4.field_type == 10 && !com.tencent.mm.sdk.platformtools.t8.K0(pdVar4.field_clientMsgId)) {
                    java.util.Iterator it7 = dataList.iterator();
                    int i27 = 0;
                    while (true) {
                        boolean hasNext = it7.hasNext();
                        pdVar = iVar.f410411d;
                        if (!hasNext) {
                            break;
                        }
                        if (kotlin.jvm.internal.o.b(((so2.i) it7.next()).f410411d.field_clientMsgId, pdVar.field_clientMsgId)) {
                            i18 = i27;
                            break;
                        }
                        i27++;
                    }
                    if (i18 >= 0) {
                        dataList.remove(i18);
                        com.tencent.mars.xlog.Log.i("Finder.MessageLoaderData", "remove same clientMsgId, " + pdVar.field_clientMsgId);
                    }
                }
                dataList.add(iVar);
            } else {
                dataList.set(i19, iVar);
            }
        }
        kz5.g0.t(dataList, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData$sortMentionList$comparator$1
            @Override // java.util.Comparator
            public int compare(java.lang.Object obj, java.lang.Object obj2) {
                dm.pd pdVar5 = ((so2.i) obj).f410411d;
                int i28 = pdVar5.field_createTime;
                dm.pd pdVar6 = ((so2.i) obj2).f410411d;
                int i29 = pdVar6.field_createTime;
                return i28 == i29 ? kotlin.jvm.internal.o.j(pdVar6.field_id, pdVar5.field_id) : kotlin.jvm.internal.o.i(i29, i28);
            }
        });
        com.tencent.mars.xlog.Log.i("Finder.MessageLoaderData", "increment size " + list.size());
        if (!list.isEmpty()) {
            long j18 = this.f123279k;
            if (j18 > 0) {
                java.util.ListIterator listIterator = dataList.listIterator(dataList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((so2.i) listIterator.previous()).f410411d.field_id == j18) {
                            i17 = listIterator.nextIndex();
                            break;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("Finder.MessageLoaderData", "unread index " + i17 + ", dataList size " + dataList.size());
                if (i17 != -1) {
                    if (i17 >= 0) {
                        int i28 = 0;
                        while (true) {
                            ((so2.i) dataList.get(i28)).f410412e = false;
                            if (i28 == i17) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                    }
                    if (i17 != kz5.c0.h(dataList)) {
                        ((so2.i) dataList.get(i17)).f410412e = true;
                    }
                }
            }
        }
    }
}
