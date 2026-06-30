package qb;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final android.net.Uri f361137c = android.net.Uri.parse("content://com.oplus.fantasywindow.fantasywindowprovider/").buildUpon().appendPath("t_server").build();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f361138a;

    /* renamed from: b, reason: collision with root package name */
    public qb.b f361139b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #6 {Exception -> 0x0045, blocks: (B:9:0x0041, B:51:0x003a, B:48:0x003d, B:47:0x0035), top: B:5:0x001d, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.f361138a = r0
            r8.f361139b = r0
            r8.f361138a = r9
            android.content.Context r9 = r8.f361138a
            java.lang.String r3 = "provide_function = \"parallelwindow\""
            r6 = 1
            r7 = 0
            android.content.ContentResolver r0 = r9.getContentResolver()     // Catch: java.lang.Exception -> L47
            android.net.Uri r1 = qb.a.f361137c     // Catch: java.lang.Exception -> L47
            r2 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L3e
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3e
            java.lang.String r1 = "service_name"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L30
            r0.getString(r1)     // Catch: java.lang.Throwable -> L30
            r2 = r6
            goto L3f
        L30:
            r1 = move-exception
            r2 = r6
            goto L35
        L33:
            r1 = move-exception
            r2 = r7
        L35:
            r0.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Exception -> L45
        L3d:
            throw r1     // Catch: java.lang.Exception -> L45
        L3e:
            r2 = r7
        L3f:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.lang.Exception -> L45
            goto L4c
        L45:
            r0 = move-exception
            goto L49
        L47:
            r0 = move-exception
            r2 = r7
        L49:
            r0.getMessage()
        L4c:
            if (r2 == 0) goto Lb4
            qb.b r0 = r8.f361139b
            if (r0 != 0) goto Lb4
            qb.b r0 = new qb.b
            r0.<init>(r9)
            r8.f361139b = r0
            java.lang.Object r9 = r0.f361140a
            java.lang.String r1 = "com.oplus.compactwindow.OplusCompactWindowManager"
            if (r9 != 0) goto L7b
            java.lang.Class r9 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = "getInstance"
            java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r2 = r9.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L77
            r2.setAccessible(r6)     // Catch: java.lang.Exception -> L77
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L77
            java.lang.Object r9 = r2.invoke(r9, r3)     // Catch: java.lang.Exception -> L77
            r0.f361140a = r9     // Catch: java.lang.Exception -> L77
            goto L7b
        L77:
            r9 = move-exception
            r9.toString()
        L7b:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.reflect.Method r2 = r0.f361141b
            if (r2 != 0) goto La4
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = "invokeSync"
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> La0
            r3[r7] = r9     // Catch: java.lang.Exception -> La0
            r3[r6] = r9     // Catch: java.lang.Exception -> La0
            r4 = 2
            r3[r4] = r9     // Catch: java.lang.Exception -> La0
            java.lang.Class<android.os.Bundle> r9 = android.os.Bundle.class
            r4 = 3
            r3[r4] = r9     // Catch: java.lang.Exception -> La0
            java.lang.reflect.Method r9 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> La0
            r0.f361141b = r9     // Catch: java.lang.Exception -> La0
            r9.setAccessible(r6)     // Catch: java.lang.Exception -> La0
            goto La4
        La0:
            r9 = move-exception
            r9.toString()
        La4:
            java.lang.Object r9 = r0.f361140a
            if (r9 == 0) goto Lad
            java.lang.reflect.Method r9 = r0.f361141b
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r6 = r7
        Lae:
            r0.f361142c = r6
            qb.b r9 = r8.f361139b
            boolean r9 = r9.f361142c
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.a.<init>(android.content.Context):void");
    }

    public rb.a a(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle) {
        java.lang.Exception e17;
        if (str == null || str2 == null) {
            return new rb.a(522, new android.os.Bundle());
        }
        qb.b bVar = this.f361139b;
        java.lang.String packageName = this.f361138a.getPackageName();
        bVar.getClass();
        java.lang.String str3 = jSONObject == null ? new java.lang.String() : jSONObject.toString();
        boolean z17 = bVar.f361142c;
        int i17 = uc1.x1.CTRL_INDEX;
        if (!z17) {
            rb.a aVar = new rb.a();
            aVar.f393558a = uc1.x1.CTRL_INDEX;
            aVar.f393559b = new android.os.Bundle();
            return aVar;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            java.lang.Object invoke = bVar.f361141b.invoke(bVar.f361140a, packageName, str2, str3, bundle);
            int i18 = 0;
            if (invoke != null && (invoke instanceof android.os.Bundle)) {
                android.os.Bundle bundle3 = (android.os.Bundle) invoke;
                try {
                    i18 = bundle3.getInt("result", 0);
                    bundle2 = bundle3;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    bundle2 = bundle3;
                    e17.toString();
                    rb.a aVar2 = new rb.a();
                    aVar2.f393558a = i17;
                    aVar2.f393559b = new android.os.Bundle(bundle2);
                    return aVar2;
                }
            }
            i17 = i18;
        } catch (java.lang.Exception e19) {
            e17 = e19;
        }
        rb.a aVar22 = new rb.a();
        aVar22.f393558a = i17;
        aVar22.f393559b = new android.os.Bundle(bundle2);
        return aVar22;
    }
}
