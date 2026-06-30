package t82;

/* loaded from: classes12.dex */
public final class j implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t82.r f416392b;

    public j(java.util.List list, t82.r rVar) {
        this.f416391a = list;
        this.f416392b = rVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.util.Iterator it = this.f416391a.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] positiveClick remove favItemInfo = " + ((o72.r2) it.next()).field_id);
            }
            t82.r rVar = this.f416392b;
            java.util.List S6 = rVar.Q6().S6();
            java.util.List R6 = rVar.Q6().R6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleMoreFooterDelete] selectItems size = ");
            java.util.ArrayList arrayList = (java.util.ArrayList) S6;
            sb6.append(arrayList.size());
            sb6.append(", selectIndexs size = ");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) R6;
            sb6.append(arrayList2.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[handleMoreFooterDelete] selectItem field_id = ");
            sb7.append(((o72.r2) arrayList.get(0)).field_id);
            sb7.append(", selectItem index = ");
            sb7.append(((java.lang.Number) arrayList2.get(0)).intValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", sb7.toString());
            if (arrayList2.isEmpty() || arrayList.isEmpty() || arrayList2.size() != arrayList.size()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] selectIndex size or selectItem size error, undo delete");
                rVar.f416405f.invoke(14);
                return;
            }
            int size = arrayList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] removeFavItemInfoList selectItem field_id = " + ((o72.r2) arrayList.get(i17)).field_id + ", selectItem index = " + ((java.lang.Number) arrayList2.get(i17)).intValue());
            }
            t82.d Q6 = rVar.Q6();
            com.tencent.mm.plugin.fav.ui.ec.a(Q6.getContext(), Q6.S6(), new t82.b(Q6, new t82.i(rVar)), 25, null);
        }
    }
}
