package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public class h implements java.util.Comparator {
    public h(com.tencent.mm.sdk.event.i iVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.sdk.event.IListener) ((fm5.b) obj2).f264184e).getPriority() - ((com.tencent.mm.sdk.event.IListener) ((fm5.b) obj).f264184e).getPriority();
    }
}
