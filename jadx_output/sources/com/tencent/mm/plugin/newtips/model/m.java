package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class m implements java.util.Comparator {
    public m(com.tencent.mm.plugin.newtips.model.p pVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) obj;
        com.tencent.mm.plugin.newtips.model.k kVar2 = (com.tencent.mm.plugin.newtips.model.k) obj2;
        int i17 = kVar.field_priority;
        int i18 = kVar2.field_priority;
        return i17 != i18 ? i17 - i18 : java.lang.Long.compare(kVar.field_beginShowTime, kVar2.field_beginShowTime);
    }
}
