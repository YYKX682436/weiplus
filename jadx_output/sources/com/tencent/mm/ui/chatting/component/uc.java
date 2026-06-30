package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class uc implements java.util.Comparator {
    public uc(com.tencent.mm.ui.chatting.component.qc qcVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((rn.c) obj2).field_updatetime, ((rn.c) obj).field_updatetime);
    }
}
