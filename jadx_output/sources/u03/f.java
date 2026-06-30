package u03;

/* loaded from: classes10.dex */
public final class f implements u03.d {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // u03.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(byte[] r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r18
            com.tencent.mm.protocal.protobuf.FinderObject r1 = new com.tencent.mm.protocal.protobuf.FinderObject
            r1.<init>()
            java.lang.String r2 = ""
            r3 = 0
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            r1.parseFrom(r0)     // Catch: java.lang.Exception -> L11
            goto L1d
        L11:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "safeParser"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r1)
        L1c:
            r1 = r3
        L1d:
            java.lang.String r0 = "MicroMsg.NewLifeVideoCdnTaskFactory"
            if (r1 != 0) goto L27
            java.lang.String r1 = "media pb is null"
            com.tencent.mars.xlog.Log.i(r0, r1)
            return r3
        L27:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r1.getObjectDesc()
            if (r4 == 0) goto L3a
            java.util.LinkedList r4 = r4.getMedia()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r4.getFirst()
            com.tencent.mm.protocal.protobuf.FinderMedia r4 = (com.tencent.mm.protocal.protobuf.FinderMedia) r4
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != 0) goto L43
            java.lang.String r1 = "finder media is null"
            com.tencent.mars.xlog.Log.w(r0, r1)
            return r3
        L43:
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r5 = i95.n0.c(r0)
            zy2.b6 r5 = (zy2.b6) r5
            c61.l7 r5 = (c61.l7) r5
            dk4.a r5 = r5.sj(r1)
            if (r5 == 0) goto Lae
            ck4.c r6 = ck4.c.f42548a
            java.lang.String r3 = r5.f234482s
            if (r3 != 0) goto L5b
            r7 = r2
            goto L5c
        L5b:
            r7 = r3
        L5c:
            java.lang.String r3 = r5.f234484u
            if (r3 != 0) goto L62
            r8 = r2
            goto L63
        L62:
            r8 = r3
        L63:
            java.lang.String r3 = r5.f234483t
            if (r3 != 0) goto L69
            r9 = r2
            goto L6a
        L69:
            r9 = r3
        L6a:
            int r10 = r5.f234464a
            java.lang.String r3 = r5.f234465b
            if (r3 != 0) goto L73
            java.lang.String r3 = "xV2"
        L73:
            r11 = r3
            java.lang.String r3 = r5.f234466c
            if (r3 != 0) goto L7a
            r12 = r2
            goto L7b
        L7a:
            r12 = r3
        L7b:
            java.lang.String r3 = r5.f234467d
            if (r3 != 0) goto L81
            r13 = r2
            goto L82
        L81:
            r13 = r3
        L82:
            java.lang.String r2 = r5.f234481r
            if (r2 != 0) goto La6
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            long r1 = r1.getId()
            c61.l7 r0 = (c61.l7) r0
            r0.getClass()
            ds2.h r0 = ds2.h.f242866a
            r45.mb4 r3 = bu2.z.i(r4)
            r4 = 0
            mn2.g4 r0 = r0.c(r1, r3, r4)
            java.lang.String r0 = r0.g()
            r14 = r0
            goto La7
        La6:
            r14 = r2
        La7:
            r15 = 0
            java.lang.String r16 = "MicroMsg.NewLifeVideoCdnTaskFactory"
            ck4.b r3 = r6.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u03.f.a(byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u03.d
    public u03.a b() {
        return u03.a.f423459h;
    }
}
