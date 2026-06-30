package f80;

/* loaded from: classes12.dex */
public abstract class j extends w65.e {
    public j(java.lang.String key, f80.f params) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(params, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x03cb, code lost:
    
        if (r2 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02a5, code lost:
    
        if (r3 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d2, code lost:
    
        if (com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(r6, bm5.f0.f22563h, r3, "", "")) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02d4, code lost:
    
        ((j70.e) ((k70.y) i95.n0.c(r18))).getClass();
        r1.f316809j.put("down_msg_gen_hd", java.lang.Integer.valueOf(m11.b1.Di().z0(r6, com.tencent.mm.R.drawable.bzt, 0, -1) ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02fa, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r22) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02fc, code lost:
    
        r7.f322651s = 1;
        r7.I = true;
        ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).nj(r6, 1);
        ((j70.e) ((k70.y) i95.n0.c(r18))).getClass();
        r16 = "downloadThumb ";
        m11.b1.Di().F4(java.lang.Long.valueOf(r7.f322633a), r7);
        ((j70.e) ((k70.y) i95.n0.c(r18))).getClass();
        m11.b1.Di().doNotify();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02ac, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02aa, code lost:
    
        if (r3 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00db, code lost:
    
        if (r8 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object n(f80.j r27, java.lang.String r28, oi3.f r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.j.n(f80.j, java.lang.String, oi3.f, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(f80.j r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof f80.h
            if (r0 == 0) goto L13
            r0 = r7
            f80.h r0 = (f80.h) r0
            int r1 = r0.f260106h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260106h = r1
            goto L18
        L13:
            f80.h r0 = new f80.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f260104f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f260106h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f260103e
            f80.f r6 = (f80.f) r6
            java.lang.Object r0 = r0.f260102d
            f80.j r0 = (f80.j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L67
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            f80.b r7 = (f80.b) r7
            f80.f r7 = r7.f260078i
            boolean r2 = r7 instanceof f80.d
            if (r2 == 0) goto L78
            r2 = r7
            f80.d r2 = (f80.d) r2
            xs.z0 r4 = r2.f260085d
            if (r4 != 0) goto L6f
            java.lang.Class<xs.a1> r4 = xs.a1.class
            i95.m r4 = i95.n0.c(r4)
            xs.a1 r4 = (xs.a1) r4
            oi3.f r2 = r2.f260082a
            r0.f260102d = r6
            r0.f260103e = r7
            r0.f260106h = r3
            v70.a r4 = (v70.a) r4
            java.lang.Object r0 = r4.Zi(r2, r0)
            if (r0 != r1) goto L63
            return r1
        L63:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L67:
            r4 = r7
            xs.z0 r4 = (xs.z0) r4
            f80.d r6 = (f80.d) r6
            r6.f260085d = r4
            r6 = r0
        L6f:
            java.lang.String r7 = r4.f456281a
            java.lang.String r0 = r4.f456282b
            byte[] r6 = r6.r(r7, r0)
            goto L86
        L78:
            boolean r0 = r7 instanceof f80.e
            if (r0 == 0) goto L87
            f80.e r7 = (f80.e) r7
            java.lang.String r7 = r7.f260086a
            java.lang.String r0 = ""
            byte[] r6 = r6.r(r7, r0)
        L86:
            return r6
        L87:
            jz5.j r6 = new jz5.j
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.j.o(f80.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5 A[PHI: r12
  0x00b5: PHI (r12v10 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:18:0x00b2, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p(f80.j r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.j.p(f80.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public byte[] r(java.lang.String thumbPath, java.lang.String hdThumbPath) {
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(hdThumbPath, "hdThumbPath");
        if ((!r26.n0.N(hdThumbPath)) && com.tencent.mm.vfs.w6.j(hdThumbPath)) {
            return com.tencent.mm.vfs.w6.N(hdThumbPath, 0, -1);
        }
        if ((!r26.n0.N(thumbPath)) && com.tencent.mm.vfs.w6.j(thumbPath)) {
            return com.tencent.mm.vfs.w6.N(thumbPath, 0, -1);
        }
        return null;
    }
}
