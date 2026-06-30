package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class e6 implements java.util.Comparator {
    public e6(com.tencent.mm.ui.chatting.component.b5 b5Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.storage.f9) obj).getCreateTime(), ((com.tencent.mm.storage.f9) obj2).getCreateTime());
    }
}
