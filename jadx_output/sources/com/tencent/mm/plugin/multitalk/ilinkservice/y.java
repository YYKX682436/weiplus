package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class y implements java.util.Comparator {
    public y(com.tencent.mm.plugin.multitalk.ilinkservice.z zVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((com.tencent.mm.plugin.multitalk.ilinkservice.w) obj).f149840a;
        int i18 = ((com.tencent.mm.plugin.multitalk.ilinkservice.w) obj2).f149840a;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
