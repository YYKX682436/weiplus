package pj3;

/* loaded from: classes13.dex */
public class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f354933d = {l75.n0.getCreateSQLs(p21.j.F, "MultiTalkInfo"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkInfo_key  on MultiTalkInfo  (  wxGroupId )"};

    static {
        new pj3.a();
    }

    public b(l75.k0 k0Var) {
        super(k0Var, p21.j.F, "MultiTalkInfo", null);
    }

    public boolean d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete id = %s", str);
        try {
            super.execSQL("MultiTalkInfo", "delete from MultiTalkInfo where wxGroupId = \"" + str + "\"");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    public p21.j y0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTaklInfo for wxGroupId = %s", str);
        android.database.Cursor rawQuery = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, inviteUserName,memberCount,createTime,state,ilinkRoomId from MultiTalkInfo where wxGroupId = '" + str + "'", new java.lang.String[0]);
        try {
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToNext()) {
                        p21.j jVar = new p21.j();
                        jVar.field_wxGroupId = rawQuery.getString(0);
                        jVar.field_groupId = rawQuery.getString(1);
                        jVar.field_roomId = rawQuery.getInt(2);
                        jVar.field_roomKey = rawQuery.getLong(3);
                        jVar.field_routeId = rawQuery.getInt(4);
                        jVar.field_inviteUserName = rawQuery.getString(5);
                        jVar.field_memberCount = rawQuery.getInt(6);
                        jVar.field_createTime = rawQuery.getLong(7);
                        jVar.field_state = rawQuery.getInt(8);
                        jVar.field_ilinkRoomId = rawQuery.getLong(9);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d,inviteUser=%s,memberCount=%d, createTime=%d,field_state=%d, ilinkroomid=%d", jVar.field_wxGroupId, jVar.field_groupId, java.lang.Integer.valueOf(jVar.field_roomId), java.lang.Long.valueOf(jVar.field_roomKey), java.lang.Integer.valueOf(jVar.field_routeId), jVar.field_inviteUserName, java.lang.Integer.valueOf(jVar.field_memberCount), java.lang.Long.valueOf(jVar.field_createTime), java.lang.Integer.valueOf(jVar.field_state), java.lang.Long.valueOf(jVar.field_ilinkRoomId));
                        return jVar;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo error! " + e17.toString());
                    rawQuery.close();
                    return null;
                }
            }
            return rawQuery != null ? null : null;
        } finally {
            rawQuery.close();
        }
    }
}
