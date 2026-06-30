package he5;

/* loaded from: classes9.dex */
public class o implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280961a;

    /* renamed from: b, reason: collision with root package name */
    public android.database.Cursor f280962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280964d;

    /* renamed from: e, reason: collision with root package name */
    public long f280965e;

    /* renamed from: f, reason: collision with root package name */
    public final long f280966f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f280967g;

    public o(java.lang.String str, int i17, int i18) {
        this.f280961a = str;
        this.f280963c = i17;
        this.f280964d = i18;
    }

    @Override // he5.t
    public int a() {
        return this.f280964d;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        try {
            this.f280962b.moveToFirst();
            while (!this.f280962b.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(this.f280962b);
                list.add(f9Var);
                this.f280962b.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgDataSource", e17, "", new java.lang.Object[0]);
        }
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        java.lang.StringBuilder sb6;
        java.lang.String str;
        android.database.Cursor B;
        android.database.Cursor cursor3;
        android.database.Cursor B2;
        boolean z17 = this.f280967g;
        java.lang.String str2 = "";
        java.lang.String str3 = this.f280961a;
        if (z17) {
            st0.e v17 = c01.d9.b().v();
            long j17 = this.f280965e;
            com.tencent.mm.storage.z9 z9Var = (com.tencent.mm.storage.z9) v17;
            z9Var.getClass();
            try {
                sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM message AS MESSAGE INNER JOIN NotifyMessageRecord AS NOTIFY_RECORD ON MESSAGE.msgId = NOTIFY_RECORD.msgId WHERE NOTIFY_RECORD.talker = '");
                com.tencent.mm.sdk.platformtools.t8.n(str3);
                sb6.append(str3);
                sb6.append("'");
                if (j17 > 0) {
                    str = " AND MESSAGE.createTime >= " + j17;
                } else {
                    str = "";
                }
                sb6.append(str);
                long j18 = this.f280966f;
                if (j18 > 0) {
                    str2 = " AND MESSAGE.createTime <= " + j18;
                }
                sb6.append(str2);
                sb6.append(" ORDER BY MESSAGE.createTime DESC ) ORDER BY createTime ASC");
                cursor = null;
            } catch (java.lang.Exception e17) {
                e = e17;
                cursor = null;
            }
            try {
                B = z9Var.f196409d.B(sb6.toString(), null);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e.toString());
                cursor2 = cursor;
                this.f280962b = cursor2;
                oVar.next();
            }
            if (B != null) {
                B.moveToFirst();
                cursor2 = B;
                this.f280962b = cursor2;
            }
            cursor2 = cursor;
            this.f280962b = cursor2;
        } else {
            long j19 = this.f280965e;
            st0.e v18 = c01.d9.b().v();
            int i17 = this.f280963c;
            com.tencent.mm.storage.z9 z9Var2 = (com.tencent.mm.storage.z9) v18;
            z9Var2.getClass();
            try {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM message AS MESSAGE INNER JOIN NotifyMessageRecord AS NOTIFY_RECORD ON MESSAGE.msgId = NOTIFY_RECORD.msgId WHERE NOTIFY_RECORD.talker = '");
                com.tencent.mm.sdk.platformtools.t8.n(str3);
                sb7.append(str3);
                sb7.append("'");
                if (j19 > 0) {
                    str2 = " AND MESSAGE.createTime >= " + j19;
                }
                sb7.append(str2);
                sb7.append(" ORDER BY MESSAGE.createTime DESC LIMIT ");
                sb7.append(i17);
                sb7.append(") ORDER BY createTime ASC");
                B2 = z9Var2.f196409d.B(sb7.toString(), null);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e19.toString());
            }
            if (B2 != null) {
                B2.moveToFirst();
                cursor3 = B2;
                this.f280962b = cursor3;
            }
            cursor3 = null;
            this.f280962b = cursor3;
        }
        oVar.next();
    }

    @Override // he5.t
    public void close() {
        this.f280962b.close();
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }

    public o(java.lang.String str, long j17, long j18, boolean z17) {
        this.f280961a = str;
        this.f280965e = j17;
        this.f280966f = j18;
        this.f280967g = z17;
    }
}
