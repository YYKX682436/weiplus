package sn1;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a */
    public static final sn1.z f410116a = new sn1.z();

    public static /* synthetic */ java.lang.Object b(sn1.z zVar, int i17, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.protobuf.f fVar2, yz5.p pVar, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            pVar = null;
        }
        return zVar.a(i17, str, fVar, fVar2, pVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, java.lang.String r6, com.tencent.mm.protobuf.f r7, com.tencent.mm.protobuf.f r8, yz5.p r9, kotlin.coroutines.Continuation r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof sn1.k
            if (r0 == 0) goto L13
            r0 = r10
            sn1.k r0 = (sn1.k) r0
            int r1 = r0.f410043h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410043h = r1
            goto L18
        L13:
            sn1.k r0 = new sn1.k
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f410041f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f410043h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.f410039d
            java.lang.Object r6 = r0.f410040e
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.modelbase.l r10 = new com.tencent.mm.modelbase.l
            r10.<init>()
            r10.f70667d = r5
            r10.f70666c = r6
            r10.f70664a = r7
            r10.f70665b = r8
            com.tencent.mm.modelbase.o r7 = r10.a()
            com.tencent.mm.modelbase.i r8 = new com.tencent.mm.modelbase.i
            r8.<init>()
            r8.p(r7)
            if (r9 == 0) goto L56
            r9.invoke(r7, r8)
        L56:
            r0.f410040e = r6
            r0.f410039d = r5
            r0.f410043h = r3
            java.lang.Object r10 = rm0.h.b(r8, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            com.tencent.mm.modelbase.f r10 = (com.tencent.mm.modelbase.f) r10
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "funcId="
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = ", uri="
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ", errType="
            r7.append(r5)
            int r5 = r10.f70615a
            r7.append(r5)
            java.lang.String r5 = ", errCode="
            r7.append(r5)
            int r5 = r10.f70616b
            r7.append(r5)
            java.lang.String r5 = ", errMsg="
            r7.append(r5)
            java.lang.String r5 = r10.f70617c
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "MM.Backup.BackupCgiHelper"
            com.tencent.mars.xlog.Log.i(r6, r5)
            sn1.j r5 = new sn1.j
            com.tencent.mm.protobuf.f r6 = r10.f70618d
            int r7 = r10.f70615a
            int r8 = r10.f70616b
            java.lang.String r9 = r10.f70617c
            if (r9 != 0) goto Lac
            java.lang.String r9 = ""
        Lac:
            r5.<init>(r6, r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sn1.z.a(int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.protobuf.f, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(bw5.n2 r9, byte[] r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof sn1.l
            if (r0 == 0) goto L13
            r0 = r11
            sn1.l r0 = (sn1.l) r0
            int r1 = r0.f410052f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410052f = r1
            goto L18
        L13:
            sn1.l r0 = new sn1.l
            r0.<init>(r8, r11)
        L18:
            r7 = r0
            java.lang.Object r11 = r7.f410050d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f410052f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            kotlin.ResultKt.throwOnFailure(r11)
            goto L4d
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline"
            bw5.p2 r5 = new bw5.p2
            r5.<init>()
            sn1.n r6 = new sn1.n
            r6.<init>(r10)
            r7.f410052f = r2
            r1 = r8
            r2 = r11
            r4 = r9
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L4d
            return r0
        L4d:
            sn1.j r11 = (sn1.j) r11
            sn1.j r9 = new sn1.j
            com.tencent.mm.protobuf.f r10 = r11.f410031a
            int r0 = r11.f410032b
            int r1 = r11.f410033c
            java.lang.String r11 = r11.f410034d
            r9.<init>(r10, r0, r1, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sn1.z.c(bw5.n2, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.LinkedList r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof sn1.q
            if (r0 == 0) goto L13
            r0 = r14
            sn1.q r0 = (sn1.q) r0
            int r1 = r0.f410076f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410076f = r1
            goto L18
        L13:
            sn1.q r0 = new sn1.q
            r0.<init>(r11, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.f410074d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f410076f
            r10 = 3
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r14)
            goto L88
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = 704(0x2c0, float:9.87E-43)
            java.lang.String r3 = "/cgi-bin/micromsg-bin/bakchatcreateqrcode"
            bw5.o2 r4 = new bw5.o2
            r4.<init>()
            int r1 = r12.size()
            r4.f30898d = r1
            boolean[] r1 = r4.f30907p
            r5 = 2
            r1[r5] = r2
            r4.f30899e = r12
            r1[r10] = r2
            java.lang.String r12 = wo.w0.m()
            r4.f30900f = r12
            r12 = 4
            r1[r12] = r2
            gm0.m r12 = gm0.j1.b()
            java.lang.String r12 = r12.k()
            r4.f30901g = r12
            r12 = 5
            r1[r12] = r2
            r8 = 0
            r4.f30903i = r8
            r12 = 7
            r1[r12] = r2
            r4.f30904m = r13
            r12 = 8
            r1[r12] = r2
            r4.f30902h = r5
            r12 = 6
            r1[r12] = r2
            bw5.q2 r5 = new bw5.q2
            r5.<init>()
            r6 = 0
            r8 = 16
            r9 = 0
            r7.f410076f = r2
            r1 = r11
            r2 = r14
            java.lang.Object r14 = b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L88
            return r0
        L88:
            sn1.j r14 = (sn1.j) r14
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[getBackupQrcodeOnline] qrcodeUrl:"
            r12.<init>(r13)
            com.tencent.mm.protobuf.f r13 = r14.f410031a
            bw5.q2 r13 = (bw5.q2) r13
            if (r13 == 0) goto La3
            boolean[] r0 = r13.f31906p
            boolean r0 = r0[r10]
            if (r0 == 0) goto La0
            java.lang.String r13 = r13.f31899f
            goto La4
        La0:
            java.lang.String r13 = ""
            goto La4
        La3:
            r13 = 0
        La4:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "MM.Backup.BackupCgiHelper"
            com.tencent.mars.xlog.Log.i(r13, r12)
            sn1.j r12 = new sn1.j
            com.tencent.mm.protobuf.f r13 = r14.f410031a
            int r0 = r14.f410032b
            int r1 = r14.f410033c
            java.lang.String r14 = r14.f410034d
            r12.<init>(r13, r0, r1, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: sn1.z.d(java.util.LinkedList, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof sn1.t
            if (r0 == 0) goto L13
            r0 = r13
            sn1.t r0 = (sn1.t) r0
            int r1 = r0.f410099f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410099f = r1
            goto L18
        L13:
            sn1.t r0 = new sn1.t
            r0.<init>(r11, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.f410097d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f410099f
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r13)
            goto L57
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 595(0x253, float:8.34E-43)
            java.lang.String r3 = "/cgi-bin/micromsg-bin/getconnectinfo"
            bw5.r10 r4 = new bw5.r10
            r4.<init>()
            r4.f32366d = r12
            boolean[] r12 = r4.f32367e
            r12[r10] = r2
            bw5.s10 r5 = new bw5.s10
            r5.<init>()
            r6 = 0
            r8 = 16
            r9 = 0
            r7.f410099f = r2
            r1 = r11
            r2 = r13
            java.lang.Object r13 = b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L57
            return r0
        L57:
            sn1.j r13 = (sn1.j) r13
            com.tencent.mm.protobuf.f r12 = r13.f410031a
            bw5.s10 r12 = (bw5.s10) r12
            if (r12 == 0) goto Lc6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "id:"
            r0.<init>(r1)
            boolean[] r1 = r12.f32765w
            boolean r2 = r1[r10]
            java.lang.String r3 = ""
            if (r2 == 0) goto L71
            java.lang.String r2 = r12.f32749d
            goto L72
        L71:
            r2 = r3
        L72:
            r0.append(r2)
            java.lang.String r2 = "  hello:"
            r0.append(r2)
            r2 = 4
            boolean r2 = r1[r2]
            if (r2 == 0) goto L82
            java.lang.String r2 = r12.f32751f
            goto L83
        L82:
            r2 = r3
        L83:
            r0.append(r2)
            java.lang.String r2 = ", ok:"
            r0.append(r2)
            r2 = 5
            boolean r2 = r1[r2]
            if (r2 == 0) goto L93
            java.lang.String r2 = r12.f32752g
            goto L94
        L93:
            r2 = r3
        L94:
            r0.append(r2)
            java.lang.String r2 = ", PCName:"
            r0.append(r2)
            r2 = 10
            boolean r1 = r1[r2]
            if (r1 == 0) goto La4
            java.lang.String r3 = r12.f32757o
        La4:
            r0.append(r3)
            java.lang.String r1 = ", PCAcctName:"
            r0.append(r1)
            java.lang.String r1 = r12.b()
            r0.append(r1)
            java.lang.String r1 = ", scene:"
            r0.append(r1)
            int r12 = r12.f32760r
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "MM.Backup.BackupCgiHelper"
            com.tencent.mars.xlog.Log.i(r0, r12)
        Lc6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sn1.z.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof sn1.w
            if (r0 == 0) goto L13
            r0 = r12
            sn1.w r0 = (sn1.w) r0
            int r1 = r0.f410110g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410110g = r1
            goto L18
        L13:
            sn1.w r0 = new sn1.w
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.f410108e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f410110g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r11 = r7.f410107d
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L5d
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = 13107(0x3333, float:1.8367E-41)
            java.lang.String r3 = "/cgi-bin/micromsg-bin/migratemsgdecryptkey"
            bw5.td0 r4 = new bw5.td0
            r4.<init>()
            r4.f33406e = r11
            r1 = 2
            boolean[] r5 = r4.f33407f
            r5[r1] = r2
            bw5.ud0 r5 = new bw5.ud0
            r5.<init>()
            r6 = 0
            r8 = 16
            r9 = 0
            r7.f410107d = r11
            r7.f410110g = r2
            r1 = r10
            r2 = r12
            java.lang.Object r12 = b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            sn1.j r12 = (sn1.j) r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[getMigrateMsgDecryptKey] qrcodeUrl:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MM.Backup.BackupCgiHelper"
            com.tencent.mars.xlog.Log.i(r0, r11)
            sn1.j r11 = new sn1.j
            com.tencent.mm.protobuf.f r0 = r12.f410031a
            int r1 = r12.f410033c
            java.lang.String r2 = r12.f410034d
            int r12 = r12.f410032b
            r11.<init>(r0, r12, r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sn1.z.f(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
