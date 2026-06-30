package ku4;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.t f312533d = new ku4.t();

    public t() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x001a, B:8:0x0020, B:15:0x002b, B:16:0x0045, B:18:0x0049, B:20:0x004d, B:21:0x0052, B:29:0x003b), top: B:3:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x005a, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x001a, B:8:0x0020, B:15:0x002b, B:16:0x0045, B:18:0x0049, B:20:0x004d, B:21:0x0052, B:29:0x003b), top: B:3:0x0008, inners: #0 }] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            ku4.z r1 = ku4.z.f312539a
            monitor-enter(r1)
            com.tencent.mm.sdk.platformtools.o4 r2 = r1.f()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "<get-mmkv>(...)"
            kotlin.jvm.internal.o.f(r2, r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "KPrefetcherBizAppIds"
            boolean r4 = r2.f(r3)     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            if (r4 == 0) goto L44
            byte[] r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L44
            int r3 = r2.length     // Catch: java.lang.Throwable -> L5a
            r4 = 1
            r6 = 0
            if (r3 != 0) goto L27
            r3 = r4
            goto L28
        L27:
            r3 = r6
        L28:
            r3 = r3 ^ r4
            if (r3 == 0) goto L44
            java.lang.Class<r45.wb5> r3 = r45.wb5.class
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5a
            r4 = r3
            com.tencent.mm.protobuf.f r4 = (com.tencent.mm.protobuf.f) r4     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5a
            r4.parseFrom(r2)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5a
            com.tencent.mm.protobuf.f r3 = (com.tencent.mm.protobuf.f) r3     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5a
            goto L45
        L3a:
            r2 = move-exception
            java.lang.String r3 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r4 = "decode ProtoBuffer"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L5a
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r2, r4, r6)     // Catch: java.lang.Throwable -> L5a
        L44:
            r3 = r5
        L45:
            r45.wb5 r3 = (r45.wb5) r3     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L4b
            java.util.LinkedList r5 = r3.f389037d     // Catch: java.lang.Throwable -> L5a
        L4b:
            if (r5 != 0) goto L52
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.lang.Throwable -> L5a
        L52:
            r5.size()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)
            r0.addAll(r5)
            return r0
        L5a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ku4.t.invoke():java.lang.Object");
    }
}
