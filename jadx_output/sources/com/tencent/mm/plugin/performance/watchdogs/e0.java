package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class e0 implements java.util.Comparator {
    public e0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((java.lang.Long) ((java.util.Map.Entry) obj2).getValue()).longValue(), ((java.lang.Long) ((java.util.Map.Entry) obj).getValue()).longValue());
    }
}
