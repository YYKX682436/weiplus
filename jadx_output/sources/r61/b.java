package r61;

/* loaded from: classes11.dex */
public class b extends l75.a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f392818f = {"CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG , showhead int  ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f392819d;

    /* renamed from: e, reason: collision with root package name */
    public final r61.c f392820e = new r61.c(this);

    public b(l75.k0 k0Var) {
        this.f392819d = k0Var;
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( addr_upload2 )", null, 2);
        int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        boolean z17 = false;
        boolean z18 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0) {
                java.lang.String string = f17.getString(columnIndex);
                if ("lvbuf".equalsIgnoreCase(string)) {
                    z17 = true;
                } else if ("showhead".equalsIgnoreCase(string)) {
                    z18 = true;
                }
            }
        }
        f17.close();
        if (!z17) {
            k0Var.A("addr_upload2", "Alter table addr_upload2 add lvbuf BLOB ");
        }
        if (z18) {
            return;
        }
        k0Var.A("addr_upload2", "Alter table addr_upload2 add showhead int ");
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f392819d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.tencent.mars.xlog.Log.w("MicroMsg.AddrUploadStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public boolean g(java.util.List list) {
        boolean z17 = false;
        if (list != null && list.size() > 0) {
            com.tencent.mm.sdk.platformtools.i8 i8Var = new com.tencent.mm.sdk.platformtools.i8("MicroMsg.AddrUploadStorage", "delete transaction");
            i8Var.a("begin");
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            l75.k0 k0Var = this.f392819d;
            long F = k0Var.F(valueOf);
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (str != null && str.length() > 0) {
                        if (k0Var.delete("addr_upload2", "id =?", new java.lang.String[]{"" + r61.a.d(str)}) > 0) {
                            b(5, this, str);
                        }
                    }
                }
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddrUploadStorage", e17, "", new java.lang.Object[0]);
            }
            k0Var.w(java.lang.Long.valueOf(F));
            i8Var.a("end");
            i8Var.b();
        }
        return z17;
    }

    public r61.a h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        r61.a aVar = new r61.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.username=\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        android.database.Cursor f17 = this.f392819d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            aVar.b(f17);
        }
        f17.close();
        return aVar;
    }

    public r61.a i(java.lang.String str) {
        r61.a aVar = null;
        if (str != null && str.length() > 0) {
            android.database.Cursor f17 = this.f392819d.f("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.id=" + r61.a.d(str) + "", null, 2);
            if (f17.moveToFirst()) {
                aVar = new r61.a();
                aVar.b(f17);
            }
            f17.close();
        }
        return aVar;
    }

    public int j(java.lang.String str, r61.a aVar) {
        int i17;
        android.content.ContentValues c17 = aVar.c();
        if (c17.size() > 0) {
            i17 = this.f392819d.p("addr_upload2", c17, "id=?", new java.lang.String[]{"" + r61.a.d(str)});
        } else {
            i17 = 0;
        }
        if (i17 > 0) {
            if (aVar.e().equals(str)) {
                b(3, this, str);
            } else {
                b(5, this, str);
                b(2, this, aVar.e());
            }
        }
        return i17;
    }
}
