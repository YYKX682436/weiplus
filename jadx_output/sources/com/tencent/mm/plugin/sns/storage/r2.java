package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class r2 extends l75.n0 implements p94.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f166121e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.q2.f166106t, "snsTagInfo2")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166122d;

    public r2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.q2.f166106t, "snsTagInfo2", null);
        this.f166122d = k0Var;
    }

    public com.tencent.mm.plugin.sns.storage.q2 D0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor f17 = this.f166122d.f("select *, rowid from snsTagInfo2 where tagId = ? ", new java.lang.String[]{"" + j17}, 2);
        com.tencent.mm.plugin.sns.storage.q2 q2Var = new com.tencent.mm.plugin.sns.storage.q2();
        if (f17.moveToFirst()) {
            q2Var.convertFrom(f17);
        }
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return q2Var;
    }

    public android.database.Cursor J0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor B = this.f166122d.B("select *, rowid from snsTagInfo2 where tagId > 5", null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return B;
    }

    public java.util.List L0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.storage.q2 D0 = D0(j17);
        java.lang.String str = D0.field_memberList;
        if (str == null || str.equals("")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return arrayList;
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(","));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return P1;
    }

    public boolean P0(java.lang.String str, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.storage.q2 D0 = D0(j17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(D0.field_memberList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        boolean contains = com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(",")).contains(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return contains;
    }

    public boolean W0() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsTagExits", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor J0 = J0();
        if (J0 != null) {
            i17 = J0.getCount();
            J0.close();
        } else {
            i17 = 0;
        }
        boolean z17 = i17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsTagExits", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return z17;
    }

    public boolean b1(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select tagId, tagName, count, rowid from snsTagInfo2 where tagId > 5 AND  tagName  =\"");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("\" AND  tagId != ");
        sb6.append(j17);
        android.database.Cursor f17 = this.f166122d.f(sb6.toString(), null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return moveToFirst;
    }

    public boolean d1(com.tencent.mm.plugin.sns.storage.q2 q2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        long j17 = q2Var.field_tagId;
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor f17 = this.f166122d.f("select *, rowid from snsTagInfo2 where tagId = ? ", new java.lang.String[]{"" + j17}, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        if (moveToFirst) {
            super.replace(q2Var);
        } else {
            super.insert(q2Var);
        }
        doNotify(q2Var.field_tagId + "", 0, q2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return true;
    }

    @Override // l75.n0
    public /* bridge */ /* synthetic */ boolean replace(l75.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        boolean d17 = d1((com.tencent.mm.plugin.sns.storage.q2) f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return d17;
    }

    public int y0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        int delete = this.f166122d.delete("snsTagInfo2", " tagId = ? ", new java.lang.String[]{"" + j17});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return delete;
    }

    public java.util.List z0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor D = this.f166122d.D("snsTagInfo2", new java.lang.String[]{"tagId"}, null, null, null, null, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (D.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(D.getLong(0)));
        }
        D.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return arrayList;
    }
}
