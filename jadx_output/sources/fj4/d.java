package fj4;

/* loaded from: classes11.dex */
public final class d implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f263234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f263235e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f263236f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f263237g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f263238h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f263239i = new java.util.HashMap();

    public final java.util.ArrayList a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        arrayList.add(list.get(0));
        if (list.size() == 1) {
            return arrayList;
        }
        int size = list.size();
        for (int i17 = 1; i17 < size; i17++) {
            fj4.c cVar = (fj4.c) list.get(i17);
            java.lang.String str = cVar.f263230g;
            int parseInt = str != null ? java.lang.Integer.parseInt(str) : 0;
            java.lang.String str2 = ((fj4.c) list.get(i17 - 1)).f263230g;
            for (int max = java.lang.Math.max(((str2 != null ? java.lang.Integer.parseInt(str2) : 0) - parseInt) - 1, 0); max > 0; max--) {
                fj4.c cVar2 = new fj4.c(null);
                cVar2.f263230g = java.lang.String.valueOf(parseInt + max);
                arrayList.add(cVar2);
            }
            arrayList.add(cVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.HistoryItem", "fillList: resultList.size:" + arrayList.size());
        return arrayList;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
