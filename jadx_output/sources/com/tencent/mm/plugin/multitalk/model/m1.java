package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class m1 implements java.util.Comparator {
    public m1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj).f71616h;
        int i18 = ((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj2).f71616h;
        if (i17 > i18) {
            return -1;
        }
        return i17 < i18 ? 1 : 0;
    }
}
