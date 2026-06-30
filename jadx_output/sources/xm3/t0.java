package xm3;

/* loaded from: classes4.dex */
public class t0 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter implements xm3.m0 {
    public final com.tencent.mm.plugin.mvvmlist.MvvmList I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f455380J;

    public /* synthetic */ t0(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, in5.s sVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(mvvmList, sVar, (i17 & 4) != 0 ? false : z17);
    }

    public void k(xm3.o0 pendingData) {
        boolean z17;
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        if (this.f293109s) {
            for (xm3.b bVar : pendingData.f455366c) {
                int ordinal = bVar.f455287a.ordinal();
                if (ordinal == 0) {
                    int a07 = bVar.f455288b + a0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onInserted pos:" + bVar.f455288b + " fixPos:" + a07 + " count:" + bVar.f455289c);
                    notifyItemRangeInserted(a07, bVar.f455289c);
                } else if (ordinal == 1) {
                    int a08 = bVar.f455288b + a0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onRemoved pos:" + bVar.f455288b + " fixPos:" + a08 + " count:" + bVar.f455289c);
                    notifyItemRangeRemoved(a08, bVar.f455289c);
                } else if (ordinal == 2) {
                    int a09 = bVar.f455290d + a0();
                    int a010 = bVar.f455291e + a0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onMoved fromPos:" + bVar.f455290d + " fromFixPos:" + a09 + " toPos:" + bVar.f455291e + " toFixPos:" + a010);
                    notifyItemMoved(a09, a010);
                } else if (ordinal == 3) {
                    int a011 = bVar.f455288b + a0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onChanged pos:" + bVar.f455288b + " fixPos:" + a011 + " count:" + bVar.f455289c + ' ' + bVar.f455292f);
                    notifyItemRangeChanged(a011, bVar.f455289c, bVar.f455292f);
                }
            }
            java.util.List<xm3.i> list = pendingData.f455367d;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (xm3.i iVar : list) {
                    if (iVar == xm3.i.f455325h || iVar == xm3.i.f455324g || iVar == xm3.i.f455327m) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.I;
                if (mvvmList.f152058e.b() >= 0) {
                    int b17 = mvvmList.f152058e.b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "scrollToPosition pos:" + b17);
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = b0().getLayoutManager();
                    if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        arrayList.add(java.lang.Integer.valueOf(b17));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                    if (layoutManager != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(b17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(layoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.scrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(layoutManager, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter
    public boolean x0() {
        return this.f455380J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(com.tencent.mm.plugin.mvvmlist.MvvmList r3, in5.s r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "mvvmList"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "itemConvertFactory"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter>{ kotlin.collections.TypeAliasesKt.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter> }"
            java.util.ArrayList r1 = r3.f152065o
            kotlin.jvm.internal.o.e(r1, r0)
            r2.<init>(r4, r1, r5)
            r4 = 1
            r2.f455380J = r4
            r2.I = r3
            r3.f152067q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm3.t0.<init>(com.tencent.mm.plugin.mvvmlist.MvvmList, in5.s, boolean):void");
    }

    public /* synthetic */ t0(ym3.f fVar, androidx.lifecycle.y yVar, in5.s sVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(fVar, yVar, sVar, (i17 & 8) != 0 ? false : z17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(ym3.f dataSource, androidx.lifecycle.y lifecycleOwner, in5.s itemConvertFactory, boolean z17) {
        this(new com.tencent.mm.plugin.mvvmlist.MvvmList(dataSource, new xm3.n0(), lifecycleOwner, null, null, 24, null), itemConvertFactory, z17);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
    }
}
