package yx1;

/* loaded from: classes13.dex */
public class f implements vx1.f {
    @Override // vx1.f
    public boolean a(int i17) {
        return i17 < 26;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004c  */
    @Override // vx1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r11 = this;
            java.lang.String r0 = "sService"
            java.lang.Class<dp.a> r1 = dp.a.class
            java.lang.String r2 = "MicroMsg.ToastBadTokenFix"
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.String r6 = "getService"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            java.lang.reflect.Method r6 = r1.getDeclaredMethod(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            r6.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            r6.invoke(r3, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            java.lang.reflect.Field r6 = r1.getDeclaredField(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            r6.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L38 java.lang.NoSuchFieldException -> L41
            goto L4a
        L26:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r6)
            goto L49
        L2f:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r6)
            goto L49
        L38:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r6)
            goto L49
        L41:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r6)
        L49:
            r6 = r3
        L4a:
            if (r6 == 0) goto Lbc
            java.lang.Object r7 = yx1.e.f467826a
            if (r7 != 0) goto L88
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Exception -> L7e
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> L7e
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Exception -> L7e
            java.lang.Class[] r8 = r8.getInterfaces()     // Catch: java.lang.Exception -> L7e
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7e
            r10 = 25
            if (r9 != r10) goto L72
            yx1.c r9 = new yx1.c     // Catch: java.lang.Exception -> L7e
            r9.<init>(r6)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r6 = java.lang.reflect.Proxy.newProxyInstance(r7, r8, r9)     // Catch: java.lang.Exception -> L7e
            yx1.e.f467826a = r6     // Catch: java.lang.Exception -> L7e
            goto L88
        L72:
            yx1.d r9 = new yx1.d     // Catch: java.lang.Exception -> L7e
            r9.<init>(r6)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r6 = java.lang.reflect.Proxy.newProxyInstance(r7, r8, r9)     // Catch: java.lang.Exception -> L7e
            yx1.e.f467826a = r6     // Catch: java.lang.Exception -> L7e
            goto L88
        L7e:
            r6 = move-exception
            java.lang.String r7 = "MicroMsg.ProxyNotificationManager"
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r7, r6)
        L88:
            java.lang.Object r6 = yx1.e.f467826a
            if (r6 != 0) goto L92
            java.lang.String r0 = "INotificationManagerInvocationHandler.getProxy null"
            com.tencent.mars.xlog.Log.e(r2, r0)
            return r5
        L92:
            java.lang.String r7 = "INotificationManagerInvocationHandler.getProxy succ"
            com.tencent.mars.xlog.Log.i(r2, r7)
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.IllegalAccessException -> Lab java.lang.NoSuchFieldException -> Lb4
            r0.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> Lab java.lang.NoSuchFieldException -> Lb4
            tx1.a.a(r0)     // Catch: java.lang.IllegalAccessException -> Lab java.lang.NoSuchFieldException -> Lb4
            r0.set(r3, r6)     // Catch: java.lang.IllegalAccessException -> Lab java.lang.NoSuchFieldException -> Lb4
            java.lang.String r0 = "replace succ"
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.IllegalAccessException -> Lab java.lang.NoSuchFieldException -> Lb4
            return r4
        Lab:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r0)
            goto Lbc
        Lb4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r0)
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx1.f.b():boolean");
    }
}
