package lo0;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320045a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f320046b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f320047c;

    /* renamed from: d, reason: collision with root package name */
    public final int f320048d;

    public m(org.json.JSONObject itemGroupJson, java.util.Map groupedItems) {
        kotlin.jvm.internal.o.g(itemGroupJson, "itemGroupJson");
        kotlin.jvm.internal.o.g(groupedItems, "groupedItems");
        java.lang.String optString = itemGroupJson.optString(dm.i4.COL_ID);
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            java.lang.String optString2 = itemGroupJson.optString("displayName");
            kotlin.jvm.internal.o.d(optString2);
            if (!(optString2.length() == 0)) {
                int optInt = itemGroupJson.optInt("order");
                java.util.List list = (java.util.List) groupedItems.get(optString);
                if (list == null) {
                    list = null;
                } else if (list.size() > 1) {
                    kz5.g0.t(list, new lo0.l());
                }
                this.f320045a = optString;
                this.f320046b = optString2;
                this.f320047c = list == null ? kz5.p0.f313996d : list;
                this.f320048d = optInt;
                return;
            }
            throw new lo0.u("Item group display name is empty. ".concat(optString));
        }
        throw new lo0.u("Item group ID is empty.");
    }

    public m(lo0.m mVar, java.util.Map badges) {
        this.f320045a = mVar.f320045a;
        this.f320046b = mVar.f320046b;
        java.util.List<lo0.k> list = mVar.f320047c;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.k kVar : list) {
            kVar.getClass();
            kotlin.jvm.internal.o.g(badges, "badges");
            arrayList.add(new lo0.k(kVar, badges));
        }
        this.f320047c = arrayList;
        this.f320048d = mVar.f320048d;
    }
}
