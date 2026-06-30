package q4;

/* loaded from: classes13.dex */
public class d implements android.database.DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4.c f360008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q4.c[] f360009b;

    public d(p4.c cVar, q4.c[] cVarArr) {
        this.f360008a = cVar;
        this.f360009b = cVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if ((r2.f360007d == r4) == false) goto L9;
     */
    @Override // android.database.DatabaseErrorHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            q4.c[] r0 = r3.f360009b
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
            p4.c r0 = r3.f360008a
            r0.getClass()
            android.database.sqlite.SQLiteDatabase r1 = r4.f360007d
            r1.getPath()
            android.database.sqlite.SQLiteDatabase r1 = r4.f360007d
            boolean r2 = r1.isOpen()
            if (r2 != 0) goto L33
            java.lang.String r4 = r1.getPath()
            r0.a(r4)
            goto L82
        L33:
            r2 = 0
            java.util.List r2 = r1.getAttachedDbs()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
            goto L3b
        L39:
            r4 = move-exception
            goto L3f
        L3b:
            r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L61
            goto L61
        L3f:
            if (r2 == 0) goto L59
            java.util.Iterator r1 = r2.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            r0.a(r2)
            goto L45
        L59:
            java.lang.String r1 = r1.getPath()
            r0.a(r1)
        L60:
            throw r4
        L61:
            if (r2 == 0) goto L7b
            java.util.Iterator r4 = r2.iterator()
        L67:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r4.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            r0.a(r1)
            goto L67
        L7b:
            java.lang.String r4 = r1.getPath()
            r0.a(r4)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.d.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
