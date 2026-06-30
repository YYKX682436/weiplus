package zr2;

/* loaded from: classes2.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f475191b;

    public i(int i17, java.util.LinkedList linkedList) {
        this.f475190a = i17;
        this.f475191b = linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0027, B:16:0x002d, B:17:0x0031, B:19:0x0037, B:20:0x0043, B:22:0x004a, B:24:0x0057, B:29:0x0063, B:31:0x0069, B:34:0x0071, B:45:0x0088, B:48:0x0094, B:40:0x0082), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[Catch: all -> 0x00a1, LOOP:1: B:20:0x0043->B:40:0x0082, LOOP_END, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0027, B:16:0x002d, B:17:0x0031, B:19:0x0037, B:20:0x0043, B:22:0x004a, B:24:0x0057, B:29:0x0063, B:31:0x0069, B:34:0x0071, B:45:0x0088, B:48:0x0094, B:40:0x0082), top: B:11:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081 A[SYNTHETIC] */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.modelbase.f r12 = (com.tencent.mm.modelbase.f) r12
            int r0 = r12.f70615a
            if (r0 != 0) goto La6
            int r0 = r12.f70616b
            if (r0 != 0) goto La6
            com.tencent.mm.protobuf.f r0 = r12.f70618d
            if (r0 == 0) goto La6
            zr2.b r0 = zr2.d.f475180b
            int r1 = r11.f475190a
            r2 = 1
            zr2.d r0 = r0.a(r1, r2)
            if (r0 == 0) goto La4
            java.util.LinkedList r1 = r11.f475191b
            monitor-enter(r0)
            java.lang.String r3 = "objectIds"
            kotlin.jvm.internal.o.g(r1, r3)     // Catch: java.lang.Throwable -> La1
            com.tencent.mm.protobuf.f r12 = r12.f70618d     // Catch: java.lang.Throwable -> La1
            r45.sv0 r12 = (r45.sv0) r12     // Catch: java.lang.Throwable -> La1
            if (r12 == 0) goto L9d
            java.util.LinkedList r12 = r12.getList(r2)     // Catch: java.lang.Throwable -> La1
            if (r12 == 0) goto L9d
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> La1
        L31:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> La1
            com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.mm.protocal.protobuf.FinderObject) r3     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> La1
            r5 = 0
            r6 = r5
        L43:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> La1
            r8 = -1
            if (r7 == 0) goto L85
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> La1
            r45.rv0 r7 = (r45.rv0) r7     // Catch: java.lang.Throwable -> La1
            r9 = 2
            java.lang.String r10 = r7.getString(r9)     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L60
            int r10 = r10.length()     // Catch: java.lang.Throwable -> La1
            if (r10 != 0) goto L5e
            goto L60
        L5e:
            r10 = r5
            goto L61
        L60:
            r10 = r2
        L61:
            if (r10 != 0) goto L7e
            java.lang.String r10 = r3.getObjectNonceId()     // Catch: java.lang.Throwable -> La1
            if (r10 == 0) goto L79
            java.lang.String r7 = r7.getString(r9)     // Catch: java.lang.Throwable -> La1
            if (r7 != 0) goto L71
            java.lang.String r7 = ""
        L71:
            boolean r7 = r26.i0.y(r10, r7, r5)     // Catch: java.lang.Throwable -> La1
            if (r7 != r2) goto L79
            r7 = r2
            goto L7a
        L79:
            r7 = r5
        L7a:
            if (r7 == 0) goto L7e
            r7 = r2
            goto L7f
        L7e:
            r7 = r5
        L7f:
            if (r7 == 0) goto L82
            goto L86
        L82:
            int r6 = r6 + 1
            goto L43
        L85:
            r6 = r8
        L86:
            if (r6 == r8) goto L31
            java.lang.Object r4 = r1.get(r6)     // Catch: java.lang.Throwable -> La1
            r45.rv0 r4 = (r45.rv0) r4     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L31
            android.util.LruCache r5 = r0.f475182a     // Catch: java.lang.Throwable -> La1
            java.lang.Object r3 = r5.put(r4, r3)     // Catch: java.lang.Throwable -> La1
            com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.mm.protocal.protobuf.FinderObject) r3     // Catch: java.lang.Throwable -> La1
            goto L31
        L9d:
            monitor-exit(r0)
            jz5.f0 r12 = jz5.f0.f302826a
            goto Laf
        La1:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        La4:
            r12 = 0
            goto Laf
        La6:
            java.lang.String r12 = "FinderSearchRelPreLoader"
            java.lang.String r0 = "get feed error"
            com.tencent.mars.xlog.Log.e(r12, r0)
            jz5.f0 r12 = jz5.f0.f302826a
        Laf:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zr2.i.call(java.lang.Object):java.lang.Object");
    }
}
