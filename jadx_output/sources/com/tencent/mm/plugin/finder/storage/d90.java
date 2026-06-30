package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d90 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d90 f126635a = new com.tencent.mm.plugin.finder.storage.d90();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f126636b = jz5.h.b(com.tencent.mm.plugin.finder.storage.b90.f126511d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f126637c = jz5.h.b(com.tencent.mm.plugin.finder.storage.c90.f126573d);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        kotlin.jvm.internal.o.g(r7, "tag");
        r0.f317745p = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized lb2.j a(java.lang.String r7, java.lang.Object r8, com.tencent.mm.plugin.finder.storage.l80 r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.o.g(r7, r0)     // Catch: java.lang.Throwable -> Lb8
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.d90.f126636b     // Catch: java.lang.Throwable -> Lb8
            jz5.n r0 = (jz5.n) r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb8
            r1 = 0
            if (r0 == 0) goto Lb6
            int r0 = r7.length()     // Catch: java.lang.Throwable -> Lb8
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 != 0) goto Lb4
            java.util.ArrayList r0 = r6.b()     // Catch: java.lang.Throwable -> Lb8
            boolean r4 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L33
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L33
            goto L4d
        L33:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb8
        L37:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lb8
            lb2.j r4 = (lb2.j) r4     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = r4.f317749d     // Catch: java.lang.Throwable -> Lb8
            boolean r4 = kotlin.jvm.internal.o.b(r4, r7)     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L37
            r0 = r2
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L52
            goto Lb4
        L52:
            lb2.j r0 = new lb2.j     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r8, r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "FinderFakeConfigStore"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r4.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "build fake config "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb8
            r4.append(r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mars.xlog.Log.i(r8, r7)     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto L75
            yz5.l r7 = r9.f127119d     // Catch: java.lang.Throwable -> Lb8
            if (r7 == 0) goto L75
            r0.f317743n = r7     // Catch: java.lang.Throwable -> Lb8
        L75:
            if (r9 == 0) goto L7a
            java.lang.String r7 = r9.f127120e     // Catch: java.lang.Throwable -> Lb8
            goto L7b
        L7a:
            r7 = r1
        L7b:
            if (r7 == 0) goto L85
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Lb8
            if (r8 != 0) goto L84
            goto L85
        L84:
            r2 = r3
        L85:
            if (r2 != 0) goto L8e
            java.lang.String r8 = "tag"
            kotlin.jvm.internal.o.g(r7, r8)     // Catch: java.lang.Throwable -> Lb8
            r0.f317745p = r7     // Catch: java.lang.Throwable -> Lb8
        L8e:
            r0.f317746q = r3     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mm.plugin.finder.storage.d90 r7 = com.tencent.mm.plugin.finder.storage.d90.f126635a     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r7 = r7.b()     // Catch: java.lang.Throwable -> Lb8
            r7.add(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto L9e
            java.lang.String r7 = r9.f127116a     // Catch: java.lang.Throwable -> Lb8
            goto L9f
        L9e:
            r7 = r1
        L9f:
            if (r9 == 0) goto La4
            java.util.List r8 = r9.f127117b     // Catch: java.lang.Throwable -> Lb8
            goto La5
        La4:
            r8 = r1
        La5:
            if (r9 == 0) goto La9
            java.util.List r1 = r9.f127118c     // Catch: java.lang.Throwable -> Lb8
        La9:
            if (r7 == 0) goto Lb2
            if (r8 == 0) goto Lb2
            if (r1 == 0) goto Lb2
            r0.a(r7, r8, r1)     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            monitor-exit(r6)
            return r0
        Lb4:
            monitor-exit(r6)
            return r1
        Lb6:
            monitor-exit(r6)
            return r1
        Lb8:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.d90.a(java.lang.String, java.lang.Object, com.tencent.mm.plugin.finder.storage.l80):lb2.j");
    }

    public final java.util.ArrayList b() {
        return (java.util.ArrayList) ((jz5.n) f126637c).getValue();
    }
}
