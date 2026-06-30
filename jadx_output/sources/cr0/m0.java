package cr0;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String str) {
        super(0);
        this.f221683d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r7 != false) goto L41;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#onTransactStarted: binder="
            r0.<init>(r1)
            java.lang.String r1 = r12.f221683d
            r0.append(r1)
            java.lang.String r1 = ", from="
            r0.append(r1)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            jz5.g r2 = cr0.u1.f221769j
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "excludingSymbols"
            kotlin.jvm.internal.o.g(r2, r3)
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            kotlin.jvm.internal.o.d(r1)
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L2f:
            if (r5 >= r3) goto Ldd
            r6 = r1[r5]
            kotlin.jvm.internal.o.d(r6)
            boolean r7 = r2.isEmpty()
            r8 = 1
            java.lang.String r9 = "getClassName(...)"
            if (r7 == 0) goto L40
            goto L5f
        L40:
            java.util.Iterator r7 = r2.iterator()
        L44:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L5f
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r6.getClassName()
            kotlin.jvm.internal.o.f(r11, r9)
            boolean r10 = r26.n0.B(r11, r10, r4)
            if (r10 == 0) goto L44
            r7 = r8
            goto L60
        L5f:
            r7 = r4
        L60:
            if (r7 == 0) goto L64
            goto Lcb
        L64:
            java.lang.String r7 = r6.getClassName()
            kotlin.jvm.internal.o.f(r7, r9)
            java.lang.String r9 = "android."
            boolean r9 = r26.i0.y(r7, r9, r4)
            if (r9 != 0) goto L95
            java.lang.String r9 = "androidx."
            boolean r9 = r26.i0.y(r7, r9, r4)
            if (r9 != 0) goto L95
            java.lang.String r9 = "java."
            boolean r9 = r26.i0.y(r7, r9, r4)
            if (r9 != 0) goto L95
            java.lang.String r9 = "dalvik."
            boolean r9 = r26.i0.y(r7, r9, r4)
            if (r9 != 0) goto L95
            java.lang.String r9 = "$Proxy"
            boolean r7 = r26.i0.y(r7, r9, r4)
            if (r7 != 0) goto L95
            r7 = r8
            goto L96
        L95:
            r7 = r4
        L96:
            if (r7 != 0) goto L99
            goto Lcb
        L99:
            java.lang.String r7 = "invokeMethod"
            java.lang.String r9 = "invoke"
            java.lang.String[] r7 = new java.lang.String[]{r7, r9}
            java.util.List r7 = kz5.c0.i(r7)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto Lac
            goto Lc8
        Lac:
            java.util.Iterator r7 = r7.iterator()
        Lb0:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lc8
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r6.getMethodName()
            boolean r9 = kotlin.jvm.internal.o.b(r10, r9)
            if (r9 == 0) goto Lb0
            r7 = r8
            goto Lc9
        Lc8:
            r7 = r4
        Lc9:
            if (r7 == 0) goto Lcc
        Lcb:
            r8 = r4
        Lcc:
            if (r8 != 0) goto Ld2
            int r5 = r5 + 1
            goto L2f
        Ld2:
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            goto Ldf
        Ldd:
            java.lang.String r1 = "<native>"
        Ldf:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.m0.invoke():java.lang.Object");
    }
}
