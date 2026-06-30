package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class q2 extends dm.xa {

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f166106t = dm.xa.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.q2.class);

    @Override // dm.xa, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        super.convertFrom(cursor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
    }

    @Override // dm.xa, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        return f166106t;
    }

    public void t0(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMemberList", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
        this.field_memberList = "";
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.field_memberList += ((r45.du5) it.next()).f372756d + ",";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMemberList", "com.tencent.mm.plugin.sns.storage.SnsTagInfo");
    }
}
