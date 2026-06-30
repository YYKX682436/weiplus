package za2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final za2.b f470884a = new za2.b();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(za2.b r7, android.app.Activity r8) {
        /*
            java.lang.String r0 = "_mAdded"
            r7.getClass()
            android.view.Window r1 = r8.getWindow()
            if (r1 != 0) goto Ld
            goto L8d
        Ld:
            android.view.Window r1 = r8.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "PhoneWindowLeakFixed"
            if (r1 == 0) goto L68
            java.util.HashMap r3 = za2.c.f470885a
            java.lang.String r3 = "mAdded"
            r4 = 0
            java.util.HashMap r5 = za2.c.f470885a     // Catch: java.lang.Exception -> L52
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L52
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Exception -> L52
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Exception -> L52
            if (r6 != 0) goto L49
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L52
            java.lang.reflect.Field r3 = r6.getDeclaredField(r3)     // Catch: java.lang.Exception -> L45
            r6 = 1
            r3.setAccessible(r6)     // Catch: java.lang.Exception -> L45
            r6 = r3
            goto L46
        L45:
            r6 = r4
        L46:
            r5.put(r0, r6)     // Catch: java.lang.Exception -> L52
        L49:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Exception -> L52
            if (r6 == 0) goto L52
            java.lang.Object r0 = r6.get(r1)     // Catch: java.lang.Exception -> L52
            goto L53
        L52:
            r0 = r4
        L53:
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L5a
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L5a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.b(r4, r0)
            if (r0 == 0) goto L68
            java.lang.String r7 = "fixPhoneWindowMemoryLeak, viewRootImpl is added, ignore"
            com.tencent.mars.xlog.Log.i(r2, r7)
            goto L8d
        L68:
            java.lang.String r0 = "mContext"
            r7.c(r8, r0)
            java.lang.String r0 = "mOnWindowDismissedCallback"
            r7.c(r8, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "fixPhoneWindowMemoryLeak complete, "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: za2.b.a(za2.b, android.app.Activity):void");
    }

    public final void b(android.app.Activity activity) {
        kn0.p pVar;
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f272471n;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        if (((java.lang.Number) ae2.in.f3856q7.r()).intValue() == 1) {
            co0.b c17 = co0.b.f43709e2.c(j17);
            if ((c17 == null || (pVar = c17.D) == null || !pVar.f()) ? false : true) {
                return;
            }
            java.lang.String str = android.os.Build.MANUFACTURER;
            boolean z17 = r26.i0.p("xiaomi", str, true) || r26.i0.p("huawei", str, true) || r26.i0.p("redmi", str, true) || r26.i0.p("samsung", str, true);
            if (!z17 || activity == null) {
                return;
            }
            pm0.v.V(30000L, new za2.a(new java.lang.ref.WeakReference(activity), z17, j17));
        }
    }

    public final void c(android.app.Activity activity, java.lang.String fieldName) {
        java.lang.reflect.Field field;
        try {
            android.view.Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            java.util.HashMap hashMap = za2.c.f470885a;
            kotlin.jvm.internal.o.g(fieldName, "fieldName");
            java.util.HashMap hashMap2 = za2.c.f470885a;
            java.lang.String concat = "android.view.Window_".concat(fieldName);
            java.lang.Object obj = hashMap2.get(concat);
            java.lang.Object obj2 = obj;
            if (obj == null) {
                try {
                    java.lang.reflect.Field declaredField = java.lang.Class.forName("android.view.Window").getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (java.lang.Exception unused) {
                    field = null;
                }
                hashMap2.put(concat, field);
                obj2 = field;
            }
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) obj2;
            if ((field2 != null ? field2.get(window) : null) != activity || field2 == null) {
                return;
            }
            field2.set(window, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PhoneWindowLeakFixed_" + fieldName, "reset window field fail, " + e17);
        }
    }
}
