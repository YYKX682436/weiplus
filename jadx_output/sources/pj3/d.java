package pj3;

/* loaded from: classes7.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f354935d = {l75.n0.getCreateSQLs(pj3.c.f354934z, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )"};

    public d(l75.k0 k0Var) {
        super(k0Var, pj3.c.f354934z, "MultiTalkMember", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a6, code lost:
    
        if (r15 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList D0(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.MultiTalk.storage.MultiTalkMemberStorage"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '"
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r15 = "'"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            android.database.Cursor r15 = r14.rawQuery(r15, r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L21:
            if (r15 == 0) goto La6
            boolean r3 = r15.moveToNext()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r3 == 0) goto La6
            pj3.c r3 = new pj3.c     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r4 = r15.getInt(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_memberUuid = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r4 = 1
            java.lang.String r5 = r15.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_wxGroupId = r5     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r5 = 2
            java.lang.String r6 = r15.getString(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_userName = r6     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r6 = 3
            java.lang.String r7 = r15.getString(r6)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_inviteUserName = r7     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r7 = 4
            long r8 = r15.getLong(r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_memberId = r8     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r8 = 5
            int r9 = r15.getInt(r8)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_status = r9     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r9 = 6
            long r10 = r15.getLong(r9)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r3.field_createTime = r10     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r10 = "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d"
            r11 = 7
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r12 = r3.field_memberUuid     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r1] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r12 = r3.field_wxGroupId     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r4] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = r3.field_userName     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r5] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = r3.field_inviteUserName     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r6] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = r3.field_memberId     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r7] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r4 = r3.field_status     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r8] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            long r4 = r3.field_createTime     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11[r9] = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.tencent.mars.xlog.Log.i(r0, r10, r11)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r2.add(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L21
        L97:
            r0 = move-exception
            goto La2
        L99:
            r1 = move-exception
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L97
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L97
            goto La8
        La2:
            r15.close()
            throw r0
        La6:
            if (r15 == 0) goto Lab
        La8:
            r15.close()
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pj3.d.D0(java.lang.String):java.util.LinkedList");
    }

    public boolean J0(pj3.c cVar) {
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "save. MultiTalkMember is null!");
            return false;
        }
        java.lang.String str = cVar.field_userName;
        android.database.Cursor rawQuery = rawQuery("select * from MultiTalkMember where userName = '" + str + "' and wxGroupId = '" + cVar.field_wxGroupId + "'", new java.lang.String[0]);
        try {
            if (rawQuery.getCount() == 0) {
                boolean insert = insert(cVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + insert + " for userName = " + str);
                return insert;
            }
            boolean update = update(cVar, new java.lang.String[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + update + " for userName = " + str);
            return update;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e17.toString());
            return false;
        } finally {
            rawQuery.close();
        }
    }

    public boolean d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str);
        try {
            super.execSQL("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + str + ",member = " + str2);
        try {
            super.execSQL("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + str + "\" and userName = \"" + str2 + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + str + ",member = " + str2);
            return false;
        }
    }

    public pj3.c z0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor rawQuery = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + str + "' and userName ='" + str2 + "'", new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                try {
                    if (rawQuery.moveToNext()) {
                        pj3.c cVar = new pj3.c();
                        cVar.field_memberUuid = rawQuery.getInt(0);
                        cVar.field_wxGroupId = rawQuery.getString(1);
                        cVar.field_userName = rawQuery.getString(2);
                        cVar.field_inviteUserName = rawQuery.getString(3);
                        cVar.field_memberId = rawQuery.getLong(4);
                        cVar.field_status = rawQuery.getInt(5);
                        cVar.field_createTime = rawQuery.getLong(6);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", java.lang.Long.valueOf(cVar.field_memberUuid), cVar.field_wxGroupId, cVar.field_userName, cVar.field_inviteUserName, java.lang.Long.valueOf(cVar.field_memberId), java.lang.Integer.valueOf(cVar.field_status), java.lang.Long.valueOf(cVar.field_createTime));
                        return cVar;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", e17.toString());
                }
            } finally {
                rawQuery.close();
            }
        }
        if (rawQuery == null) {
            return null;
        }
        return null;
    }
}
