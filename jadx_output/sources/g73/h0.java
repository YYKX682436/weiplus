package g73;

/* loaded from: classes15.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str) {
        super(0);
        this.f269274d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            g73.n r0 = g73.o0.f269321q
            r0.getClass()
            java.lang.String r1 = r9.f269274d
            java.lang.String r2 = "message"
            kotlin.jvm.internal.o.g(r1, r2)
            java.lang.String r2 = "receive handoff request:"
            java.lang.String r2 = r2.concat(r1)
            java.lang.String r3 = "HandOff.RequestProcessor"
            com.tencent.mars.xlog.Log.i(r3, r2)
            f73.c r2 = new f73.c
            r2.<init>()
            r3 = 0
            r4 = 0
            java.nio.charset.Charset r5 = r26.c.f368865a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            byte[] r1 = r1.getBytes(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            java.lang.String r5 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r1, r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r5 = "newPullParser(...)"
            kotlin.jvm.internal.o.f(r1, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r5 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r1.setFeature(r5, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r1.setInput(r6, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r1.nextTag()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r2.a(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r6.close()
            goto L61
        L49:
            r0 = move-exception
            goto Ldb
        L4c:
            r1 = move-exception
            r4 = r6
            goto L53
        L4f:
            r0 = move-exception
            goto Lda
        L52:
            r1 = move-exception
        L53:
            java.lang.String r5 = "MicroMsg.BaseXmlContent"
            java.lang.String r6 = "safeParse error"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4f
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r1, r6, r3)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L61
            r4.close()
        L61:
            e73.k r1 = r2.f260053a
            java.util.Collection r2 = r1.f249953b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.handoff.model.HandOff r3 = (com.tencent.mm.plugin.handoff.model.HandOff) r3
            int r5 = r1.f249952a
            java.util.Map r6 = r0.f269306a
            java.util.Map r7 = r0.f269307b
            java.util.Map r8 = r0.f269308c
            if (r5 == r4) goto La8
            r4 = 2
            if (r5 == r4) goto L86
            goto L6b
        L86:
            java.lang.String r4 = r3.getId()
            boolean r4 = r8.containsKey(r4)
            if (r4 != 0) goto L99
            java.lang.String r4 = r3.getId()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r8.put(r4, r5)
        L99:
            java.lang.String r4 = r3.getId()
            r6.remove(r4)
            java.lang.String r4 = r3.getId()
            r7.put(r4, r3)
            goto L6b
        La8:
            java.lang.String r4 = r3.getId()
            boolean r4 = r8.containsKey(r4)
            if (r4 != 0) goto Lbb
            java.lang.String r4 = r3.getId()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r8.put(r4, r5)
        Lbb:
            java.lang.String r4 = r3.getId()
            r7.remove(r4)
            java.lang.String r4 = r3.getId()
            r6.put(r4, r3)
            goto L6b
        Lca:
            g73.m r0 = r0.f269309d
            boolean r1 = r0.hasMessages(r4)
            if (r1 != 0) goto Ld7
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.sendEmptyMessageDelayed(r4, r1)
        Ld7:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        Lda:
            r6 = r4
        Ldb:
            if (r6 == 0) goto Le0
            r6.close()
        Le0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g73.h0.invoke():java.lang.Object");
    }
}
