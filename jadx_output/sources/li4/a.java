package li4;

/* loaded from: classes11.dex */
public final class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f318784e = {l75.n0.getCreateSQLs(hi4.a.f281539x1, "TextStatusConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f318785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.k0 db6) {
        super(db6, hi4.a.f281539x1, "TextStatusConversation", rj4.c.C);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hi4.a.f281539x1;
        this.f318785d = db6;
        db6.A("TextStatusConversation", "CREATE INDEX IF NOT EXISTS TextStatusConversation_type_scene_index ON TextStatusConversation(scene,type)");
    }

    public static int J0(li4.a aVar, int i17, int i18, java.lang.Object obj) {
        java.lang.String str;
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        aVar.getClass();
        if (i17 < 0) {
            str = "select sum(unReadCount) from TextStatusConversation";
        } else {
            str = "select sum(unReadCount) from TextStatusConversation where updateTime > " + (i17 * 1000);
        }
        android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = aVar.f318785d.B(str, null);
        try {
            int i19 = 0;
            if (B.moveToFirst() && !B.isAfterLast()) {
                i19 = B.getInt(0);
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[getUnreadCount] count=" + i19);
            return i19;
        } finally {
        }
    }

    public final int D0() {
        int J0 = J0(this, 0, 1, null);
        ni4.x xVar = ni4.x.f337776d;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return J0 - (num != null ? num.intValue() : 0);
    }

    public final java.util.List L0(int i17, int i18, int[] iArr, int i19) {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (iArr != null) {
            java.lang.String str2 = "(";
            int i27 = 0;
            for (int i28 : iArr) {
                i27++;
                if (i28 != 100) {
                    str2 = str2 + "type=" + i28;
                    if (i27 < iArr.length) {
                        str2 = str2 + " or ";
                    }
                }
            }
            str = "select *, rowid from TextStatusConversation WHERE scene=" + i19 + " and " + r26.n0.Z(str2, " or ").concat(")") + "  ORDER BY placedFlag DESC, updateTime DESC limit " + i18 + " offset " + i17;
        } else {
            str = "select *, rowid from TextStatusConversation ORDER BY placedFlag DESC, updateTime DESC limit " + i18 + " offset " + i17;
        }
        android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = this.f318785d.B(str, null);
        try {
            if (B.moveToFirst()) {
                while (!B.isAfterLast()) {
                    hi4.a aVar = new hi4.a();
                    aVar.convertFrom(B);
                    aVar.t0();
                    linkedList.add(aVar);
                    B.moveToNext();
                }
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[query] offset=" + i17 + " pageCount=" + i18 + " type=" + iArr + " list size=" + linkedList.size() + ", scene=" + i19);
            return linkedList;
        } finally {
        }
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var, boolean z17) {
        java.lang.String str;
        hi4.a aVar = (hi4.a) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        if (aVar != null) {
            str = "sessionId=" + aVar.field_sessionId + " placedFlag=" + aVar.field_placedFlag + " unReadCount=" + aVar.field_unReadCount + " status=" + aVar.field_status + " updateTime=" + aVar.field_updateTime + " digest=" + aVar.field_digest + " digestType=" + aVar.field_digestType + " lastMsgID=" + aVar.field_lastMsgID + " unReadCount=" + aVar.field_unReadCount + "content=" + aVar.field_content + " isSend=" + aVar.field_isSend + " editingMsg=" + aVar.field_editingMsg + " systemRowId=" + aVar.systemRowid + " type=" + aVar.field_type;
        } else {
            str = null;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", sb6.toString());
        boolean z18 = false;
        if (aVar != null) {
            android.content.ContentValues convertTo = aVar.convertTo();
            java.lang.String field_sessionId = aVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            android.os.SystemClock.uptimeMillis();
            l75.k0 k0Var = this.f318785d;
            android.database.Cursor B = k0Var.B("select *, rowid from TextStatusConversation where sessionId = '" + field_sessionId + "' ", null);
            try {
                boolean z19 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z19) {
                    if (k0Var.p(getTableName(), convertTo, "sessionId = ?", new java.lang.String[]{"" + aVar.field_sessionId}) > 0) {
                        z18 = true;
                    }
                } else {
                    z18 = super.insertNotify(aVar, false);
                }
                if (z18 && z17) {
                    doNotify(aVar.field_sessionId);
                }
            } finally {
            }
        }
        return z18;
    }

    public final boolean y0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (sessionId.length() == 0) {
            return false;
        }
        hi4.a z07 = z0(sessionId);
        int i17 = z07.field_unReadCount;
        z07.field_unReadCount = 0;
        z07.field_readStatus = 1;
        z07.field_isRedDot = 0;
        boolean update = update(z07.systemRowid, z07);
        doNotify(z07.field_sessionId, 5, z07);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationStorage", "[clearUnreadCount] ret=" + update + ' ' + i17 + " => " + z07.field_unReadCount + " sessionId=" + sessionId);
        return update;
    }

    public final hi4.a z0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f318785d.B("select *, rowid from TextStatusConversation where sessionId = '" + sessionId + "' ", null);
        hi4.a aVar = new hi4.a();
        aVar.field_sessionId = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                aVar.convertFrom(B);
            }
            B.close();
        }
        return aVar;
    }
}
