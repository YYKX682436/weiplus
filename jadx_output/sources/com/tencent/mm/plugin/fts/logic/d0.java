package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class d0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137489n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f137490o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137491p;

    public d0(com.tencent.mm.plugin.fts.logic.l lVar, int[] iArr) {
        this.f137491p = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "MarkAllContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137491p;
        java.util.ArrayList arrayList = (java.util.ArrayList) lVar.f137588g.A(o13.d.f342225k, 1);
        this.f137489n = arrayList.size();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.d dVar = (p13.d) it.next();
            java.lang.String str = dVar.f351072b;
            if (!lVar.f137591m.containsKey(str)) {
                java.util.List list = (java.util.List) hashMap.get(str);
                if (list == null) {
                    list = new java.util.ArrayList(16);
                    hashMap.put(str, list);
                }
                list.add(java.lang.Long.valueOf(dVar.f351071a));
            }
        }
        lVar.f137591m.putAll(hashMap);
        this.f137490o = hashMap.size();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{touched: %d users: %d}", java.lang.Integer.valueOf(this.f137489n), java.lang.Integer.valueOf(this.f137490o));
    }
}
