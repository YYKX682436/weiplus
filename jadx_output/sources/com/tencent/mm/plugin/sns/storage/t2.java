package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class t2 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f166142f = {"CREATE INDEX IF NOT EXISTS snsWsFoldGroupIdIndex ON SnsWsFoldGroupDetail ( groupId )"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f166143g = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.s2.f166133r, "SnsWsFoldGroupDetail")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f166145e;

    public t2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.q2.f166106t, "SnsWsFoldGroupDetail", f166142f);
        this.f166145e = new java.util.HashMap();
        this.f166144d = k0Var;
    }

    public boolean D0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        int delete = this.f166144d.delete("SnsWsFoldGroupDetail", "groupId=?", new java.lang.String[]{"" + j17});
        ((java.util.HashMap) this.f166145e).remove(java.lang.Long.valueOf(j17));
        boolean z17 = delete > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z17;
    }

    public com.tencent.mm.plugin.sns.storage.s2 y0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        com.tencent.mm.plugin.sns.storage.s2 s2Var = null;
        android.database.Cursor f17 = this.f166144d.f("select *,rowid from SnsWsFoldGroupDetail  where SnsWsFoldGroupDetail.groupId=" + j17, null, 2);
        if (f17 != null) {
            if (f17.moveToNext()) {
                com.tencent.mm.plugin.sns.storage.s2 s2Var2 = new com.tencent.mm.plugin.sns.storage.s2();
                s2Var2.convertFrom(f17);
                s2Var = s2Var2;
            }
            f17.close();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return s2Var;
    }

    public boolean z0(com.tencent.mm.plugin.sns.storage.s2 s2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        boolean z17 = this.f166144d.m("SnsWsFoldGroupDetail", "groupId", s2Var.convertTo()) > 0;
        try {
            r45.qb6 qb6Var = new r45.qb6();
            java.util.LinkedList linkedList = qb6Var.f383810d;
            qb6Var.parseFrom(s2Var.field_groupStrcut);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                ((java.util.HashMap) this.f166145e).put(java.lang.Long.valueOf(s2Var.field_groupId), linkedList);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsWsFoldDetailStorage", "parse SnsWsGroupStruct fail:%s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z17;
    }
}
