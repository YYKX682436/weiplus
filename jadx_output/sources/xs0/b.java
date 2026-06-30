package xs0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CaptureRequest.Builder f456292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f456293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f456294c;

    public b(android.hardware.camera2.CaptureRequest.Builder mRequest, java.lang.String mCameraId, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.o.g(mRequest, "mRequest");
        kotlin.jvm.internal.o.g(mCameraId, "mCameraId");
        this.f456292a = mRequest;
        this.f456293b = arrayList;
        this.f456294c = kotlin.jvm.internal.o.b(mCameraId, "0") ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[EDGE_INSN: B:23:0x004d->B:24:0x004d BREAK  A[LOOP:0: B:4:0x000e->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:4:0x000e->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.g(r8, r0)
            r0 = 0
            java.util.ArrayList r1 = r7.f456293b
            if (r1 == 0) goto L53
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            r4 = r2
            xs0.a r4 = (xs0.a) r4
            java.lang.String r5 = r4.f456285a
            boolean r5 = kotlin.jvm.internal.o.b(r5, r8)
            if (r5 == 0) goto L48
            java.lang.Integer r5 = r4.f456286b
            if (r5 == 0) goto L33
            int r5 = r5.intValue()
            int r6 = r7.f456294c
            r5 = r5 & r6
            if (r5 != 0) goto L33
            r5 = r3
            goto L34
        L33:
            r5 = r0
        L34:
            if (r5 != 0) goto L48
            java.lang.Integer r4 = r4.f456291g
            if (r4 == 0) goto L43
            int r4 = r4.intValue()
            r4 = r4 & r9
            if (r4 != 0) goto L43
            r4 = r3
            goto L44
        L43:
            r4 = r0
        L44:
            if (r4 != 0) goto L48
            r4 = r3
            goto L49
        L48:
            r4 = r0
        L49:
            if (r4 == 0) goto Le
            goto L4d
        L4c:
            r2 = 0
        L4d:
            xs0.a r2 = (xs0.a) r2
            if (r2 != 0) goto L52
            goto L53
        L52:
            return r3
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xs0.b.a(java.lang.String, int):boolean");
    }

    public final boolean b(java.lang.String key, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        return c(key, null, z17, null, i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if ((r10 != null ? kotlin.jvm.internal.o.b(r5.f456288d, r10) : true) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r9, java.lang.String r10, boolean r11, java.lang.Object r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            java.util.ArrayList r1 = r8.f456293b
            if (r1 == 0) goto L94
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r1.next()
            r5 = r3
            xs0.a r5 = (xs0.a) r5
            java.lang.String r6 = r5.f456285a
            boolean r6 = kotlin.jvm.internal.o.b(r6, r9)
            if (r6 == 0) goto L53
            java.lang.Integer r6 = r5.f456286b
            if (r6 == 0) goto L33
            int r6 = r6.intValue()
            int r7 = r8.f456294c
            r6 = r6 & r7
            if (r6 != 0) goto L33
            r6 = r4
            goto L34
        L33:
            r6 = r0
        L34:
            if (r6 != 0) goto L53
            java.lang.Integer r6 = r5.f456291g
            if (r6 == 0) goto L43
            int r6 = r6.intValue()
            r6 = r6 & r13
            if (r6 != 0) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r0
        L44:
            if (r6 != 0) goto L53
            if (r10 == 0) goto L4f
            java.lang.String r5 = r5.f456288d
            boolean r5 = kotlin.jvm.internal.o.b(r5, r10)
            goto L50
        L4f:
            r5 = r4
        L50:
            if (r5 == 0) goto L53
            goto L54
        L53:
            r4 = r0
        L54:
            if (r4 == 0) goto Le
            r2.add(r3)
            goto Le
        L5a:
            android.hardware.camera2.CaptureRequest$Builder r9 = r8.f456292a
            if (r12 != 0) goto L7f
            java.util.Iterator r10 = r2.iterator()
        L62:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L93
            java.lang.Object r12 = r10.next()
            xs0.a r12 = (xs0.a) r12
            java.lang.String r13 = "builder"
            kotlin.jvm.internal.o.g(r9, r13)
            kotlin.jvm.internal.o.d(r12)
            java.lang.Object r13 = r12.f456287c
            kotlin.jvm.internal.o.d(r13)
            ws0.b.a(r9, r12, r11, r13)
            goto L62
        L7f:
            java.util.Iterator r10 = r2.iterator()
        L83:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L93
            java.lang.Object r13 = r10.next()
            xs0.a r13 = (xs0.a) r13
            ws0.b.a(r9, r13, r11, r12)
            goto L83
        L93:
            return r4
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xs0.b.c(java.lang.String, java.lang.String, boolean, java.lang.Object, int):boolean");
    }
}
