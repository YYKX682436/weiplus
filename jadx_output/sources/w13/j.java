package w13;

/* loaded from: classes12.dex */
public class j extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442220r;

    @Override // o13.a
    public boolean C() {
        return !i(-111, 2);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-111L, 2L);
            ((com.tencent.mm.plugin.fts.o) this.f342198f).q(-201L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        }
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", r(), r()));
        ((com.tencent.mm.plugin.fts.o) this.f342198f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_talker ON %s(talker);", r(), r()));
        this.f442220r = ((com.tencent.mm.plugin.fts.o) this.f342198f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, talker) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", r()));
    }

    @Override // o13.a
    public boolean G() {
        this.f442220r.close();
        super.G();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(int r12, int r13, long r14, java.lang.String r16, long r17, java.lang.String r19, java.lang.String r20) {
        /*
            r11 = this;
            r1 = r11
            r9 = r16
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r19)
            if (r0 == 0) goto La
            return
        La:
            java.lang.Class<o13.z> r0 = o13.z.class
            i95.m r0 = i95.n0.c(r0)
            o13.z r0 = (o13.z) r0
            r2 = r0
            com.tencent.mm.plugin.fts.d0 r2 = (com.tencent.mm.plugin.fts.d0) r2
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r19
            r2.tj(r3, r4, r5, r7, r8)
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f342199g     // Catch: com.tencent.wcdb.database.SQLiteException -> L6b
            r2 = 1
            r3 = r19
            r0.bindString(r2, r3)     // Catch: com.tencent.wcdb.database.SQLiteException -> L6b
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f342199g     // Catch: com.tencent.wcdb.database.SQLiteException -> L6b
            r0.execute()     // Catch: com.tencent.wcdb.database.SQLiteException -> L6b
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L6b
            r3 = r12
            long r4 = (long) r3
            r0.bindLong(r2, r4)     // Catch: com.tencent.wcdb.database.SQLiteException -> L69
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L69
            r2 = 2
            r4 = r13
            long r5 = (long) r4
            r0.bindLong(r2, r5)     // Catch: com.tencent.wcdb.database.SQLiteException -> L67
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L67
            r2 = 3
            r5 = r14
            r0.bindLong(r2, r14)     // Catch: com.tencent.wcdb.database.SQLiteException -> L65
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L65
            r2 = 4
            r0.bindString(r2, r9)     // Catch: com.tencent.wcdb.database.SQLiteException -> L65
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L65
            r2 = 5
            r7 = r17
            r0.bindLong(r2, r7)     // Catch: com.tencent.wcdb.database.SQLiteException -> L63
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L63
            java.lang.String r2 = ""
            if (r20 != 0) goto L57
            goto L59
        L57:
            r2 = r20
        L59:
            r10 = 6
            r0.bindString(r10, r2)     // Catch: com.tencent.wcdb.database.SQLiteException -> L63
            com.tencent.wcdb.database.SQLiteStatement r0 = r1.f442220r     // Catch: com.tencent.wcdb.database.SQLiteException -> L63
            r0.execute()     // Catch: com.tencent.wcdb.database.SQLiteException -> L63
            return
        L63:
            r0 = move-exception
            goto L71
        L65:
            r0 = move-exception
            goto L6f
        L67:
            r0 = move-exception
            goto L6e
        L69:
            r0 = move-exception
            goto L6d
        L6b:
            r0 = move-exception
            r3 = r12
        L6d:
            r4 = r13
        L6e:
            r5 = r14
        L6f:
            r7 = r17
        L71:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r9, r5}
            java.lang.String r3 = "Failed inserting index: 0x%x, %d, %d, %s, %d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "MicroMsg.FTS.FTS5ServiceNotifyStorage"
            com.tencent.mars.xlog.Log.e(r3, r2)
            com.tencent.wcdb.database.SQLiteStatement r2 = r1.f342206q
            java.lang.String r2 = r2.simpleQueryForString()
            if (r2 == 0) goto La7
            int r4 = r2.length()
            if (r4 <= 0) goto La7
            java.lang.String r4 = ">> "
            java.lang.String r2 = r4.concat(r2)
            com.tencent.mars.xlog.Log.e(r3, r2)
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w13.j.N(int, int, long, java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public android.database.Cursor O(p13.r rVar, java.lang.String str) {
        java.lang.String f17 = rVar.f();
        java.lang.String r17 = r();
        java.lang.String o17 = o();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT ");
        sb6.append(r17);
        sb6.append(".docid, type, subtype, entity_id, aux_index, timestamp, talker FROM ");
        sb6.append(r17);
        sb6.append(" JOIN ");
        sb6.append(o17);
        sb6.append(" ON (");
        sb6.append(r17);
        sb6.append(".docid = ");
        sb6.append(o17);
        sb6.append(".rowid) WHERE ");
        sb6.append(o17);
        sb6.append(" MATCH '");
        sb6.append(f17);
        sb6.append("' AND aux_index = 'notifymessage' AND status >= 0 ");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            sb6.append("AND talker = ? ");
        }
        sb6.append("ORDER BY timestamp desc;");
        return ((com.tencent.mm.plugin.fts.o) this.f342198f).o(sb6.toString(), !com.tencent.mm.sdk.platformtools.t8.K0(str) ? new java.lang.String[]{str} : null);
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5NotifyServiceStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX;
    }

    @Override // o13.u
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, talker TEXT);", r());
    }

    @Override // o13.a
    public java.lang.String t() {
        return "ServiceNotify";
    }
}
