package q4;

/* loaded from: classes13.dex */
public class e extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public final q4.c[] f360010d;

    /* renamed from: e, reason: collision with root package name */
    public final p4.c f360011e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360012f;

    public e(android.content.Context context, java.lang.String str, q4.c[] cVarArr, p4.c cVar) {
        super(context, str, null, cVar.f351745a, new q4.d(cVar, cVarArr));
        this.f360011e = cVar;
        this.f360010d = cVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if ((r2.f360007d == r4) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q4.c a(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            q4.c[] r0 = r3.f360010d
            r1 = 0
            r2 = r0[r1]
            if (r2 == 0) goto L10
            android.database.sqlite.SQLiteDatabase r2 = r2.f360007d
            if (r2 != r4) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L17
        L10:
            q4.c r2 = new q4.c
            r2.<init>(r4)
            r0[r1] = r2
        L17:
            r4 = r0[r1]
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.a(android.database.sqlite.SQLiteDatabase):q4.c");
    }

    public synchronized p4.b b() {
        this.f360012f = false;
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f360012f) {
            return a(writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        this.f360010d[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        this.f360011e.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            q4.c r6 = r5.a(r6)
            p4.c r0 = r5.f360011e
            l4.t r0 = (l4.t) r0
            r0.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r6.f(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6c
            r3 = 0
            if (r2 == 0) goto L20
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = r3
        L21:
            r1.close()
            l4.r r1 = r0.f315759c
            r1.a(r6)
            if (r2 != 0) goto L4a
            l4.s r2 = r1.b(r6)
            boolean r4 = r2.f315756a
            if (r4 == 0) goto L34
            goto L4a
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f315757b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4a:
            r0.c(r6)
            b5.v r1 = (b5.v) r1
            int r6 = androidx.work.impl.WorkDatabase_Impl.f12474s
            androidx.work.impl.WorkDatabase_Impl r6 = r1.f17891b
            java.util.List r0 = r6.f315752g
            if (r0 == 0) goto L6b
            int r0 = r0.size()
        L5b:
            if (r3 >= r0) goto L6b
            java.util.List r1 = r6.f315752g
            java.lang.Object r1 = r1.get(r3)
            l4.n r1 = (l4.n) r1
            r1.getClass()
            int r3 = r3 + 1
            goto L5b
        L6b:
            return
        L6c:
            r6 = move-exception
            r1.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        this.f360012f = true;
        ((l4.t) this.f360011e).b(a(sQLiteDatabase), i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0064  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        this.f360012f = true;
        this.f360011e.b(a(sQLiteDatabase), i17, i18);
    }
}
