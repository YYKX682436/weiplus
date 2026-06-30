package mq3;

/* loaded from: classes12.dex */
public class a extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f330770d;

    /* renamed from: e, reason: collision with root package name */
    public final int f330771e;

    /* renamed from: f, reason: collision with root package name */
    public final long f330772f;

    /* renamed from: g, reason: collision with root package name */
    public int f330773g;

    /* renamed from: h, reason: collision with root package name */
    public final int f330774h;

    public a(mq3.b bVar, java.lang.String str, int i17) {
        this.f330770d = str;
        this.f330771e = i17;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return java.lang.String.format("Priority.UpdateTask[%s][%d][%d][%d][%d]", this.f330770d, java.lang.Integer.valueOf(this.f330771e), java.lang.Long.valueOf(this.f330772f), java.lang.Integer.valueOf(this.f330773g), java.lang.Integer.valueOf(this.f330774h));
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f330770d;
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.endsWith("@stranger") && !str.endsWith("@qqim") && !str.endsWith("@app") && !str.startsWith("fake_") && !c01.e2.G(str)) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageLogic", "filterByUsername %s", str);
            return;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).u2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageLogic", "Hidden %s", str);
            return;
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            this.f330773g = 2;
        } else {
            this.f330773g = 3;
        }
        int i17 = this.f330771e;
        if (i17 == 0) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            mq3.d dVar = nVar.f265534s;
            java.lang.String str2 = this.f330770d;
            long j17 = this.f330773g;
            dVar.getClass();
            long a17 = hq3.a.a();
            boolean a18 = dVar.a(str2, a17, j17);
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = dVar.f330778c;
            sQLiteStatement.bindLong(1, this.f330772f);
            sQLiteStatement.bindString(2, str2);
            sQLiteStatement.bindLong(3, a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "updateOpen chat %s insert %b update %b", str2, java.lang.Boolean.valueOf(a18), java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()));
            return;
        }
        if (i17 == 1) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            mq3.d dVar2 = nVar2.f265534s;
            java.lang.String str3 = this.f330770d;
            long j18 = this.f330773g;
            dVar2.getClass();
            long a19 = hq3.a.a();
            boolean a27 = dVar2.a(str3, a19, j18);
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement2 = dVar2.f330779d;
            sQLiteStatement2.bindString(1, str3);
            sQLiteStatement2.bindLong(2, a19);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "%s chat %s insert %b update %b", "updateSendMsg", str3, java.lang.Boolean.valueOf(a27), java.lang.Integer.valueOf(sQLiteStatement2.executeUpdateDelete()));
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            nVar3.f265534s.a(this.f330770d, hq3.a.a(), this.f330773g);
            return;
        }
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.requireAccountInitialized();
        mq3.d dVar3 = nVar4.f265534s;
        long j19 = this.f330773g;
        dVar3.getClass();
        dVar3.f330776a.d(java.lang.String.format("UPDATE %s SET consumemsgcount = consumemsgcount + ? WHERE chat = ? AND date = ?", "C2CChatUsage"), new java.lang.String[]{java.lang.String.valueOf(this.f330774h), str, java.lang.String.valueOf(j19)});
    }

    public a(mq3.b bVar, java.lang.String str, int i17, int i18) {
        this.f330770d = str;
        this.f330771e = i17;
        this.f330774h = i18;
    }

    public a(mq3.b bVar, java.lang.String str, int i17, long j17) {
        this.f330770d = str;
        this.f330771e = i17;
        this.f330774h = this.f330774h;
        this.f330772f = j17;
    }
}
