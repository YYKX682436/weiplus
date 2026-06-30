package kh;

/* loaded from: classes10.dex */
public final class y3 implements java.lang.reflect.InvocationHandler {

    /* renamed from: d, reason: collision with root package name */
    public static final kh.w3 f307954d = new kh.w3(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307955a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f307956b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f307957c;

    public y3(java.lang.String str, java.lang.Object obj, java.lang.String str2, kotlin.jvm.internal.i iVar) {
        this.f307955a = str;
        this.f307956b = obj;
        this.f307957c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.String r7 = "method"
            kotlin.jvm.internal.o.g(r8, r7)
            r7 = 0
            r0 = 1
            r1 = 0
            java.lang.String r2 = r6.f307957c
            if (r2 == 0) goto L19
            int r3 = r2.length()     // Catch: java.lang.Exception -> L30
            if (r3 <= 0) goto L14
            r3 = r0
            goto L15
        L14:
            r3 = r1
        L15:
            if (r3 != r0) goto L19
            r3 = r0
            goto L1a
        L19:
            r3 = r1
        L1a:
            kh.t3 r4 = kh.t3.f307922f     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r2 = r7
        L20:
            java.lang.Object r3 = r6.f307956b     // Catch: java.lang.Exception -> L30
            int r3 = r3.hashCode()     // Catch: java.lang.Exception -> L30
            kh.x3 r5 = new kh.x3     // Catch: java.lang.Exception -> L30
            r5.<init>(r9, r8, r6)     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = r4.h(r2, r3, r5)     // Catch: java.lang.Exception -> L30
            return r7
        L30:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "proxyAnimatorCallbackErr: "
            r3.<init>(r4)
            java.lang.String r4 = r2.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "Matrix.battery.TraversalTracker"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r2, r3, r4)
            boolean r3 = kh.k1.f307838n
            boolean r3 = kh.k1.f307838n
            if (r3 == 0) goto L86
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "ListenerProxy"
            r3[r1] = r4
            java.lang.String r8 = r8.getName()
            r3[r0] = r8
            if (r9 == 0) goto L7d
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = r9.length
            r8.<init>(r4)
            int r4 = r9.length
        L66:
            if (r1 >= r4) goto L78
            r5 = r9[r1]
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r8.add(r5)
            int r1 = r1 + 1
            goto L66
        L78:
            java.lang.String r8 = r8.toString()
            goto L7e
        L7d:
            r8 = r7
        L7e:
            r9 = 2
            r3[r9] = r8
            java.lang.String r8 = "errTrackTraversal"
            ap.a.a(r0, r8, r2, r7, r3)
        L86:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.y3.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
