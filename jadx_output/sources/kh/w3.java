package kh;

/* loaded from: classes10.dex */
public final class w3 {
    public w3(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L18
            java.lang.Class r1 = r5.getClass()
            boolean r1 = java.lang.reflect.Proxy.isProxyClass(r1)
            if (r1 == 0) goto L18
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r5)
            boolean r2 = r1 instanceof kh.y3
            if (r2 == 0) goto L18
            kh.y3 r1 = (kh.y3) r1
            goto L19
        L18:
            r1 = r0
        L19:
            r2 = 64
            if (r1 != 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r5 == 0) goto L2d
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            goto L2e
        L2d:
            r3 = r0
        L2e:
            r1.append(r3)
            r1.append(r2)
            if (r5 == 0) goto L3e
            int r5 = r5.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L3e:
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            return r5
        L46:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r1.f307955a
            r5.append(r0)
            r5.append(r2)
            int r0 = r1.hashCode()
            r5.append(r0)
            r0 = 40
            r5.append(r0)
            java.lang.Object r0 = r1.f307956b
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            r5.append(r1)
            r5.append(r2)
            int r0 = r0.hashCode()
            r5.append(r0)
            r0 = 41
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.w3.a(java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.Object r6, java.lang.Class r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "proxyClass"
            kotlin.jvm.internal.o.g(r7, r0)
            if (r6 == 0) goto L6b
            java.lang.Class r0 = r6.getClass()
            boolean r0 = java.lang.reflect.Proxy.isProxyClass(r0)
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r6)
            boolean r2 = r0 instanceof kh.y3
            if (r2 == 0) goto L22
            kh.y3 r0 = (kh.y3) r0
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 != 0) goto L6b
            java.lang.ClassLoader r0 = r7.getClassLoader()
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            r2[r3] = r7
            kh.y3 r3 = new kh.y3
            if (r8 != 0) goto L37
            java.lang.String r8 = r7.getName()
        L37:
            r3.<init>(r5, r6, r8, r1)
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r0, r2, r3)
            kh.k4 r8 = kh.k4.f307844a
            boolean r5 = r8.d(r5)
            if (r5 == 0) goto L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "wrapListener: "
            r5.<init>(r8)
            java.lang.String r6 = r4.a(r6)
            r5.append(r6)
            java.lang.String r6 = " >> "
            r5.append(r6)
            java.lang.String r6 = r4.a(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Matrix.battery.TraversalTracker"
            com.tencent.mars.xlog.Log.i(r6, r5)
        L6a:
            return r7
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.w3.b(java.lang.String, java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }
}
