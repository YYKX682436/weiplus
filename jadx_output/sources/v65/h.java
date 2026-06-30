package v65;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f433573a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f433574b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f433575c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f433576d;

    public h(int i17, yz5.a timeTick) {
        kotlin.jvm.internal.o.g(timeTick, "timeTick");
        this.f433573a = i17;
        this.f433574b = timeTick;
        this.f433575c = jz5.h.b(v65.d.f433555d);
        this.f433576d = kotlinx.coroutines.sync.l.a(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[Catch: all -> 0x0092, LOOP:0: B:12:0x0072->B:14:0x0078, LOOP_END, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x005d, B:12:0x0072, B:14:0x0078, B:16:0x0088), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v65.c
            if (r0 == 0) goto L13
            r0 = r6
            v65.c r0 = (v65.c) r0
            int r1 = r0.f433554i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433554i = r1
            goto L18
        L13:
            v65.c r0 = new v65.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f433552g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433554i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r1 = r0.f433551f
            kotlinx.coroutines.sync.d r1 = (kotlinx.coroutines.sync.d) r1
            java.lang.Object r2 = r0.f433550e
            kotlin.jvm.internal.h0 r2 = (kotlin.jvm.internal.h0) r2
            java.lang.Object r0 = r0.f433549d
            v65.h r0 = (v65.h) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5d
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.h0 r2 = new kotlin.jvm.internal.h0
            r2.<init>()
            kz5.p0 r6 = kz5.p0.f313996d
            r2.f310123d = r6
            kotlinx.coroutines.sync.d r6 = r5.f433576d
            r0.f433549d = r5
            r0.f433550e = r2
            r0.f433551f = r6
            r0.f433554i = r4
            kotlinx.coroutines.sync.k r6 = (kotlinx.coroutines.sync.k) r6
            java.lang.Object r0 = r6.b(r3, r0)
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            r1 = r6
        L5d:
            java.util.concurrent.ConcurrentHashMap r6 = r0.b()     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L92
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L92
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L72:
            boolean r4 = r6.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L88
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L92
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L92
            r0.add(r4)     // Catch: java.lang.Throwable -> L92
            goto L72
        L88:
            r2.f310123d = r0     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r3)
            java.lang.Object r6 = r2.f310123d
            return r6
        L92:
            r6 = move-exception
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v65.h.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.concurrent.ConcurrentHashMap b() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f433575c).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v65.e
            if (r0 == 0) goto L13
            r0 = r7
            v65.e r0 = (v65.e) r0
            int r1 = r0.f433561i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433561i = r1
            goto L18
        L13:
            v65.e r0 = new v65.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f433559g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433561i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r6 = r0.f433558f
            kotlinx.coroutines.sync.d r6 = (kotlinx.coroutines.sync.d) r6
            java.lang.Object r1 = r0.f433557e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f433556d
            v65.h r0 = (v65.h) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            r6 = r1
            goto L55
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.d r7 = r5.f433576d
            r0.f433556d = r5
            r0.f433557e = r6
            r0.f433558f = r7
            r0.f433561i = r4
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            java.lang.Object r0 = r7.b(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            java.util.concurrent.ConcurrentHashMap r1 = r0.b()     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L79
            java.util.concurrent.ConcurrentHashMap r1 = r0.b()     // Catch: java.lang.Throwable -> L84
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L84
            int r2 = r0.f433573a     // Catch: java.lang.Throwable -> L84
            if (r1 > r2) goto L79
            java.util.concurrent.ConcurrentHashMap r1 = r0.b()     // Catch: java.lang.Throwable -> L84
            yz5.a r0 = r0.f433574b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L84
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> L84
            goto L7a
        L79:
            r4 = 0
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r3)
            return r6
        L84:
            r6 = move-exception
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v65.h.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0055, B:13:0x006d, B:14:0x0074), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v65.f
            if (r0 == 0) goto L13
            r0 = r8
            v65.f r0 = (v65.f) r0
            int r1 = r0.f433567i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433567i = r1
            goto L18
        L13:
            v65.f r0 = new v65.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f433565g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433567i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r7 = r0.f433564f
            kotlinx.coroutines.sync.d r7 = (kotlinx.coroutines.sync.d) r7
            java.lang.Object r1 = r0.f433563e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f433562d
            v65.h r0 = (v65.h) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r1
            goto L55
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.d r8 = r6.f433576d
            r0.f433562d = r6
            r0.f433563e = r7
            r0.f433564f = r8
            r0.f433567i = r4
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            java.lang.Object r0 = r8.b(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r6
        L55:
            yz5.a r1 = r0.f433574b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L84
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L84
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.ConcurrentHashMap r0 = r0.b()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r7 = r0.remove(r7)     // Catch: java.lang.Throwable -> L84
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L84
            if (r7 != 0) goto L74
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L84
            r4 = -1
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L84
        L74:
            long r4 = r7.longValue()     // Catch: java.lang.Throwable -> L84
            long r1 = r1 - r4
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L84
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            r8.d(r3)
            return r7
        L84:
            r7 = move-exception
            kotlinx.coroutines.sync.k r8 = (kotlinx.coroutines.sync.k) r8
            r8.d(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v65.h.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof v65.g
            if (r0 == 0) goto L13
            r0 = r9
            v65.g r0 = (v65.g) r0
            int r1 = r0.f433572h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433572h = r1
            goto L18
        L13:
            v65.g r0 = new v65.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f433570f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f433572h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            long r7 = r0.f433569e
            java.lang.Object r2 = r0.f433568d
            v65.h r2 = (v65.h) r2
            kotlin.ResultKt.throwOnFailure(r9)
        L2f:
            r9 = r2
            goto L47
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            long r7 = r0.f433569e
            java.lang.Object r2 = r0.f433568d
            v65.h r2 = (v65.h) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L57
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r6
        L47:
            r0.f433568d = r9
            r0.f433569e = r7
            r0.f433572h = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L54
            return r1
        L54:
            r5 = r2
            r2 = r9
            r9 = r5
        L57:
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r4
            if (r9 == 0) goto L6d
            r0.f433568d = r2
            r0.f433569e = r7
            r0.f433572h = r3
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r7, r0)
            if (r9 != r1) goto L2f
            return r1
        L6d:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v65.h.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
