package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class l implements java.util.Comparator {
    public l(com.tencent.mm.plugin.performance.watchdogs.j jVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        if (entry2.getValue() == null || entry.getValue() == null) {
            return 0;
        }
        return ((java.lang.Integer) entry2.getValue()).intValue() - ((java.lang.Integer) entry.getValue()).intValue();
    }
}
