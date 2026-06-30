package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public class e implements java.util.Comparator {
    public e(com.tencent.mm.sdk.event.d dVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.sdk.event.n) obj2).getPriority() - ((com.tencent.mm.sdk.event.n) obj).getPriority();
    }
}
