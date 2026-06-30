package z53;

/* loaded from: classes8.dex */
public final class t extends l75.n0 implements n60.j {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470267e = {l75.n0.getCreateSQLs(z53.i.I, "GameLifeConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l75.k0 db6) {
        super(db6, z53.i.I, "GameLifeConversation", dm.n5.f238680r);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = z53.i.I;
        this.f470268d = db6;
        add(((t53.m0) i95.n0.c(t53.m0.class)).f415805p);
    }

    public final java.util.List Ca(int i17, int i18) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f470268d.B("select *, rowid from GameLifeConversation ORDER BY updateTime DESC limit " + i18 + " offset " + i17, null);
        try {
            if (B.moveToFirst()) {
                while (!B.isAfterLast()) {
                    z53.i iVar = new z53.i();
                    iVar.convertFrom(B);
                    linkedList.add(iVar);
                    B.moveToNext();
                }
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("GameLife.ConversationStorage", "[query] offset=" + i17 + " pageCount=" + i18 + " list size=" + linkedList.size());
            return linkedList;
        } finally {
        }
    }

    public final z53.i D0() {
        android.database.Cursor B = this.f470268d.B("SELECT *, rowid FROM GameLifeConversation WHERE unReadCount>0 ORDER BY updateTime DESC LIMIT 1", null);
        try {
            if (!B.moveToFirst() || B.isAfterLast()) {
                vz5.b.a(B, null);
                return null;
            }
            z53.i iVar = new z53.i();
            iVar.convertFrom(B);
            vz5.b.a(B, null);
            return iVar;
        } finally {
        }
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        z53.i iVar = (z53.i) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(iVar != null ? z53.u.a(iVar) : null);
        com.tencent.mars.xlog.Log.i("GameLife.ConversationStorage", sb6.toString());
        return super.replace(iVar);
    }

    public final boolean y0(java.lang.String sessionId) {
        boolean z17;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (com.tencent.mm.storage.z3.a4(sessionId)) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check sessionId failed");
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        z53.i z07 = z0(sessionId);
        int i17 = z07.field_unReadCount;
        z07.field_unReadCount = 0;
        z07.field_digestFlag = 0L;
        z07.field_digestPrefix = null;
        boolean update = update(z07.systemRowid, z07, false);
        doNotify("single", 4, z07);
        com.tencent.mars.xlog.Log.i("GameLife.ConversationStorage", "[clearUnreadCount] ret=" + update + ' ' + i17 + " => " + z07.field_unReadCount + " sessionId=" + sessionId);
        return update;
    }

    public final z53.i z0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f470268d.B("select *, rowid from GameLifeConversation where sessionId = '" + sessionId + "' ", null);
        z53.i iVar = new z53.i();
        iVar.field_sessionId = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                iVar.convertFrom(B);
            }
            B.close();
        }
        return iVar;
    }
}
