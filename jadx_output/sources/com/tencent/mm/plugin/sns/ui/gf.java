package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes12.dex */
public class gf implements java.util.Comparator {
    public gf(com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI snsChatRoomMemberUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        int i17 = ((com.tencent.mm.plugin.sns.ui.Cif) obj2).f168610b - ((com.tencent.mm.plugin.sns.ui.Cif) obj).f168610b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        return i17;
    }
}
