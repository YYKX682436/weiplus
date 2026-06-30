package ui3;

/* loaded from: classes5.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f428109e = {l75.n0.getCreateSQLs(ui3.b.f428113x, "MsgQuote")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f428110f = {"CREATE INDEX IF NOT EXISTS quotedMsgSvrIdIndex ON MsgQuote ( quotedMsgSvrId )", "CREATE INDEX IF NOT EXISTS quotedMsgLocalIdTalkerIndex ON MsgQuote ( msgId,quotedMsgTalker ) "};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f428111g = {"CREATE INDEX IF NOT EXISTS quotedMsgSvrIdTalkerIndex ON MsgQuote ( quotedMsgSvrId,quotedMsgTalker ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f428112d;

    public a(l75.k0 k0Var, java.lang.String[] strArr) {
        super(k0Var, ui3.b.f428113x, "MsgQuote", strArr);
        this.f428112d = k0Var;
        qt0.b.f366491a.b(new qt0.e(k0Var, f428111g, "MsgQuote", null, 0));
    }

    public ui3.b D0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgSvrId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "quotedMsgSvrId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.convertFrom(E);
                bVar.field_quotedMsgTalker = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "quotedMsgSvrId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.convertFrom(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insert(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.field_quotedMsgTalker)) {
            bVar.field_quotedMsgTalker = "";
        }
        pt0.p.G6(bVar.field_quotedMsgId, bVar.field_quotedMsgTalker);
        pt0.p.G6(bVar.field_msgId, bVar.field_quotedMsgTalker);
        bVar.field_status = 0;
        return super.insert(bVar);
    }

    public boolean L0(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.field_quotedMsgTalker)) {
            bVar.field_quotedMsgTalker = "";
        }
        pt0.p.G6(bVar.field_quotedMsgId, bVar.field_quotedMsgTalker);
        pt0.p.G6(bVar.field_msgId, bVar.field_quotedMsgTalker);
        return super.insert(bVar);
    }

    public boolean P0(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.field_quotedMsgTalker)) {
            bVar.field_quotedMsgTalker = "";
        }
        return update(bVar.systemRowid, bVar);
    }

    public ui3.b y0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "getMsgQuteByMsgId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "msgId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.convertFrom(E);
                bVar.field_quotedMsgTalker = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "msgId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.convertFrom(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }

    public ui3.b z0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "quotedMsgId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.convertFrom(E);
                bVar.field_quotedMsgTalker = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f428112d.E("MsgQuote", ui3.b.f428113x.f316954c, "quotedMsgId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.convertFrom(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }
}
