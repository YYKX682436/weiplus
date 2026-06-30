package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.fts.train.e eVar = (com.tencent.mm.plugin.fts.train.e) obj;
        com.tencent.mm.plugin.fts.train.e eVar2 = (com.tencent.mm.plugin.fts.train.e) obj2;
        double d17 = eVar.f137814c;
        double d18 = eVar2.f137814c;
        if (d17 > d18) {
            return -1;
        }
        if (d17 < d18) {
            return 1;
        }
        return java.lang.Integer.compare(eVar.f137812a, eVar2.f137812a);
    }
}
