package g63;

/* loaded from: classes8.dex */
public final class u implements m33.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269175a;

    public u(g63.f0 f0Var) {
        this.f269175a = f0Var;
    }

    public final void a(m33.d1 d1Var) {
        if (d1Var == null) {
            com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation gameLifeHistoryNode null");
            return;
        }
        if (!d1Var.f323280a) {
            com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation gameLifeNode.hasGameLife false");
            return;
        }
        g63.f0 f0Var = this.f269175a;
        z53.t tVar = f0Var.f269110e;
        tVar.getClass();
        z53.i iVar = new z53.i();
        android.database.Cursor B = tVar.f470268d.B("SELECT *, rowid FROM GameLifeConversation WHERE sessionId='@gamelifehistory'", null);
        try {
            if (B.moveToFirst()) {
                iVar.convertFrom(B);
                vz5.b.a(B, null);
            } else {
                vz5.b.a(B, null);
            }
            int i17 = d1Var.f323281b;
            com.tencent.mars.xlog.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation sysrowid: " + iVar.systemRowid + " old: " + iVar.field_unReadCount + " new: " + i17);
            int i18 = iVar.field_unReadCount;
            if (i18 == Integer.MAX_VALUE) {
                return;
            }
            long j17 = iVar.systemRowid;
            if (j17 > 0 && i17 <= i18) {
                iVar.field_unReadCount = i17;
                z53.t tVar2 = f0Var.f269110e;
                tVar2.update(j17, iVar, false);
                tVar2.doNotify("single", 4, iVar);
                return;
            }
            iVar.field_updateTime = c01.id.c();
            iVar.field_unReadCount = i17;
            iVar.field_sessionId = "@gamelifehistory";
            iVar.field_digest = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.fqd);
            z53.t tVar3 = f0Var.f269110e;
            tVar3.replace(iVar, false);
            tVar3.doNotify("single", iVar.systemRowid <= 0 ? 2 : 1, iVar);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }
}
