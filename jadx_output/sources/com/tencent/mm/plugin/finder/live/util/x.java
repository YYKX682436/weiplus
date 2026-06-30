package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.x f115742a = new com.tencent.mm.plugin.finder.live.util.x();

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r11, java.util.Map r12) {
        /*
            r10 = this;
            java.lang.String r0 = "toUsers"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "newChnlExtra"
            kotlin.jvm.internal.o.g(r12, r0)
            gk2.e r0 = gk2.e.f272471n
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L42
            ae2.b2 r0 = ae2.b2.f3461a
            jz5.g r0 = ae2.b2.f3486t
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L2a
            r0 = r1
            goto L2b
        L2a:
            r0 = r2
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "local enable:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.BoxCommon"
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r0 != r1) goto L42
            r0 = r1
            goto L43
        L42:
            r0 = r2
        L43:
            if (r0 == 0) goto Ld0
            gk2.e r0 = gk2.e.f272471n
            if (r0 == 0) goto Ld0
            java.lang.Class<mm2.e0> r3 = mm2.e0.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            mm2.e0 r0 = (mm2.e0) r0
            androidx.lifecycle.j0 r3 = r0.f328970m
            java.lang.Object r3 = r3.getValue()
            r45.qm1 r3 = (r45.qm1) r3
            if (r3 == 0) goto L61
            java.lang.String r3 = r3.getString(r1)
            if (r3 != 0) goto L63
        L61:
            java.lang.String r3 = ""
        L63:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r11.iterator()
        L6c:
            boolean r5 = r11.hasNext()
            r6 = 2
            if (r5 == 0) goto L87
            java.lang.Object r5 = r11.next()
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "@chatroom"
            r9 = 0
            boolean r6 = r26.i0.o(r7, r8, r2, r6, r9)
            if (r6 == 0) goto L6c
            r4.add(r5)
            goto L6c
        L87:
            java.lang.Object r11 = kz5.n0.k0(r4)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Ld0
            androidx.lifecycle.j0 r0 = r0.f328970m
            java.lang.Object r0 = r0.getValue()
            r45.qm1 r0 = (r45.qm1) r0
            if (r0 == 0) goto La3
            int r0 = r0.getInteger(r2)
            int r4 = qs5.v.f366472a
            if (r0 != r6) goto La3
            r0 = r1
            goto La4
        La3:
            r0 = r2
        La4:
            if (r0 != 0) goto Lab
            java.lang.String r0 = "group_box_number"
            r12.put(r0, r3)
        Lab:
            int r0 = r11.length()
            if (r0 != 0) goto Lb2
            goto Lb3
        Lb2:
            r1 = r2
        Lb3:
            if (r1 == 0) goto Lb6
            goto Lc4
        Lb6:
            java.lang.Class<qy.i> r0 = qy.i.class
            i95.m r0 = i95.n0.c(r0)
            qy.i r0 = (qy.i) r0
            py.a r0 = (py.a) r0
            int r2 = r0.wi(r11)
        Lc4:
            java.lang.String r11 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "group_users_number"
            java.lang.Object r11 = r12.put(r0, r11)
            java.lang.String r11 = (java.lang.String) r11
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.x.a(java.util.List, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r0 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.ch1 b(r45.ch1 r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "likeMsg"
            kotlin.jvm.internal.o.g(r10, r0)
            r0 = 8
            com.tencent.mm.protobuf.f r0 = r10.getCustom(r0)
            r8 = r0
            r45.qm1 r8 = (r45.qm1) r8
            r0 = 0
            if (r8 == 0) goto L58
            r1 = 1
            java.lang.String r2 = r8.getString(r1)
            r3 = 0
            if (r2 == 0) goto L22
            int r2 = r2.length()
            if (r2 != 0) goto L20
            goto L22
        L20:
            r2 = r3
            goto L23
        L22:
            r2 = r1
        L23:
            if (r2 == 0) goto L26
            goto L58
        L26:
            r2 = 12
            long r4 = r10.getLong(r2)
            r2 = 14
            java.lang.String r2 = r10.getString(r2)
            if (r2 == 0) goto L40
            int r6 = r2.length()
            if (r6 <= 0) goto L3b
            r3 = r1
        L3b:
            if (r3 == 0) goto L3e
            r0 = r2
        L3e:
            if (r0 != 0) goto L45
        L40:
            r0 = 2
            java.lang.String r0 = r10.getString(r0)
        L45:
            int r10 = r10.getInteger(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1 = r9
            r2 = r4
            r4 = r0
            r5 = r10
            r6 = r11
            r7 = r12
            r45.ch1 r10 = r1.c(r2, r4, r5, r6, r7, r8)
            return r10
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.x.b(r45.ch1, int, int):r45.ch1");
    }

    public final r45.ch1 c(long j17, java.lang.String str, java.lang.Integer num, int i17, int i18, r45.qm1 qm1Var) {
        int i19 = (num != null && num.intValue() == 20124) ? 1 : (num != null && num.intValue() == 20002) ? 2 : 0;
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20062);
        r45.zi1 zi1Var = new r45.zi1();
        zi1Var.f392083d = j17;
        zi1Var.f392084e = qm1Var;
        zi1Var.f392085f = i18;
        zi1Var.f392086g = i17;
        zi1Var.f392089m = str;
        zi1Var.f392090n = i19;
        int i27 = qs5.u.f366471a;
        if (i18 == 1) {
            zi1Var.f392086g = i17 + 1;
        } else if (i18 == 2) {
            zi1Var.f392086g = i17 - 1;
        }
        zi1Var.f392086g = java.lang.Math.max(0, zi1Var.f392086g);
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(zi1Var.toByteArray()));
        ch1Var.set(13, f115742a.f(qm1Var != null ? qm1Var.getString(1) : null));
        ch1Var.set(8, qm1Var);
        ch1Var.set(2, zl2.q4.f473933a.m());
        ch1Var.set(3, java.lang.Long.valueOf(j17));
        return ch1Var;
    }

    public final r45.ch1 d(r45.qm1 boxId, java.lang.String content) {
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(content, "content");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20057);
        r45.th1 th1Var = new r45.th1();
        th1Var.f386424d = content;
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(th1Var.toByteArray()));
        ch1Var.set(13, f115742a.f(boxId.getString(1)));
        ch1Var.set(8, boxId);
        ch1Var.set(2, zl2.q4.f473933a.m());
        return ch1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x018d, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007a A[Catch: all -> 0x01fc, Exception -> 0x01fe, TryCatch #5 {Exception -> 0x01fe, all -> 0x01fc, blocks: (B:5:0x0045, B:8:0x0050, B:10:0x00af, B:12:0x00b9, B:16:0x00c2, B:28:0x00f6, B:31:0x012a, B:86:0x005a, B:88:0x0064, B:90:0x006a, B:96:0x007a, B:98:0x0082, B:99:0x0088), top: B:4:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.x.e(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public final r45.xn1 f(java.lang.String str) {
        java.lang.String l17;
        r45.xn1 xn1Var = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(c01.z1.r());
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (l17 = ((mm2.c1) eVar.a(mm2.c1.class)).B7()) == null) {
            l17 = c01.z1.l();
        }
        finderContact.setNickname(l17);
        finderContact.setHeadUrl("");
        xn1Var.set(0, finderContact);
        return xn1Var;
    }

    public final boolean g(java.lang.String str) {
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.storage.z3.R4(str) && ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(str)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxUtil", "isChatRoomDismiss " + str + ", " + z17);
        return z17;
    }

    public final boolean h(java.lang.String str) {
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.storage.z3.R4(str) && !c01.v1.x(str, false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxUtil", "isNotInChatRoom " + str + ", " + z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005f, code lost:
    
        if (r0 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(dk2.zf r12, boolean r13, gk2.e r14, android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.x.i(dk2.zf, boolean, gk2.e, android.content.Context):void");
    }

    public final void j(boolean z17, dk2.cg cgVar) {
        if (z17) {
            cgVar.w(java.lang.Math.max(1, cgVar.s() + 1));
        } else {
            cgVar.w(java.lang.Math.max(0, cgVar.s() - 1));
        }
        cgVar.d(z17);
        cgVar.B(true);
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxUtil", "updateLikeMsg msg:" + cgVar.hashCode() + ",likeCount:" + cgVar.s() + ",selfLike:" + cgVar.o() + '!');
        }
    }
}
