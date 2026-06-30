package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class q extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195229e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.p.f195208r, "BackupTempMoveTime")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195230d;

    public q(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.p.f195208r, "BackupTempMoveTime", null);
        this.f195230d = k0Var;
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        return super.update(j17, (com.tencent.mm.storage.p) f0Var);
    }

    public void y0(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.util.LinkedList linkedList4) {
        java.util.Iterator it;
        java.util.Iterator it6;
        boolean z17;
        if (getCount() <= 0) {
            linkedList3.addAll(linkedList);
            linkedList4.addAll(linkedList2);
            return;
        }
        java.util.Iterator it7 = linkedList2.iterator();
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            java.lang.String str = (java.lang.String) it8.next();
            if (it7.hasNext()) {
                long longValue = ((java.lang.Long) it7.next()).longValue();
                if (!it7.hasNext()) {
                    break;
                }
                long longValue2 = ((java.lang.Long) it7.next()).longValue();
                if (longValue2 == 0) {
                    longValue2 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                }
                java.util.LinkedList linkedList5 = new java.util.LinkedList();
                android.database.Cursor B = this.f195230d.B("SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + str + "\" ", null);
                if (B == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", str);
                    linkedList5 = null;
                } else {
                    while (B.moveToNext()) {
                        com.tencent.mm.storage.p pVar = new com.tencent.mm.storage.p();
                        pVar.convertFrom(B);
                        r45.cd cdVar = new r45.cd();
                        cdVar.f371477d = pVar.field_startTime;
                        cdVar.f371478e = pVar.field_endTime;
                        linkedList5.add(cdVar);
                    }
                    B.close();
                }
                if (linkedList5 == null || linkedList5.size() <= 0 || longValue2 < ((r45.cd) linkedList5.getFirst()).f371477d || longValue > ((r45.cd) linkedList5.getLast()).f371478e) {
                    it = it8;
                    it6 = it7;
                    linkedList3.add(str);
                    linkedList4.add(java.lang.Long.valueOf(longValue));
                    linkedList4.add(java.lang.Long.valueOf(longValue2));
                } else {
                    int i17 = 0;
                    long j17 = longValue;
                    boolean z18 = false;
                    while (i17 < linkedList5.size() && j17 <= longValue2) {
                        r45.cd cdVar2 = (r45.cd) linkedList5.get(i17);
                        long j18 = cdVar2.f371478e;
                        if (j17 > j18) {
                            it = it8;
                            it6 = it7;
                        } else {
                            it = it8;
                            it6 = it7;
                            if (j17 < cdVar2.f371477d) {
                                linkedList3.add(str);
                                linkedList4.add(java.lang.Long.valueOf(j17));
                                long j19 = cdVar2.f371477d;
                                if (longValue2 < j19) {
                                    linkedList4.add(java.lang.Long.valueOf(longValue2));
                                    j17 = cdVar2.f371477d;
                                    z18 = true;
                                    break;
                                } else {
                                    linkedList4.add(java.lang.Long.valueOf(j19));
                                    j17 = cdVar2.f371478e;
                                    z18 = true;
                                }
                            } else {
                                j17 = j18;
                            }
                        }
                        i17++;
                        it7 = it6;
                        it8 = it;
                    }
                    it = it8;
                    it6 = it7;
                    if (j17 <= longValue2) {
                        linkedList3.add(str);
                        linkedList4.add(java.lang.Long.valueOf(j17));
                        linkedList4.add(java.lang.Long.valueOf(longValue2));
                        z17 = true;
                    } else {
                        z17 = z18;
                    }
                    if (!z17) {
                        linkedList3.add(str);
                        linkedList4.add(java.lang.Long.valueOf(j17));
                        linkedList4.add(java.lang.Long.valueOf(longValue2));
                    }
                }
            } else {
                it = it8;
                it6 = it7;
            }
            it7 = it6;
            it8 = it;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupTempMoveTimeStorage", "getSessionRequestTimeInteval, resultSession size:%s, resultTimeInterval:%s", java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(linkedList4.size()));
    }
}
