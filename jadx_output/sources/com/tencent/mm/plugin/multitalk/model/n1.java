package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class n1 implements java.util.Comparator {
    public n1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = (com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj2;
        int i17 = ((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj).f71614f;
        if (i17 == 10 && multiTalkGroupMember.f71614f == 10) {
            return 0;
        }
        if (i17 == 10) {
            return -1;
        }
        return i17 == 10 ? 1 : 0;
    }
}
