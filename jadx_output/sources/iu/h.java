package iu;

/* loaded from: classes12.dex */
public abstract class h implements gu.f {

    /* renamed from: a, reason: collision with root package name */
    public static final iu.a f294687a = new iu.a(null);

    public static /* synthetic */ void e(iu.h hVar, java.lang.String str, s15.h hVar2, oi3.g gVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyData");
        }
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        hVar.d(str, hVar2, gVar, i17);
    }

    public static /* synthetic */ void g(iu.h hVar, java.lang.String str, s15.h hVar2, oi3.g gVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyThumbImg");
        }
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        hVar.f(str, hVar2, gVar, i17);
    }

    @Override // gu.f
    public java.lang.Object a(gu.j jVar, kotlin.coroutines.Continuation continuation) {
        return new qi3.f0(0);
    }

    @Override // gu.f
    public java.lang.Object b(gu.j jVar, kotlin.coroutines.Continuation continuation) {
        return new qi3.i0(0);
    }

    public final void c(s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 9, "");
        recordDataItem.set(i17 + 8, "");
        recordDataItem.set(i17 + 5, "");
        recordDataItem.set(i17 + 4, "");
        recordDataItem.h1("");
        recordDataItem.j1("");
        recordDataItem.l1("");
        recordDataItem.i1("");
        recordDataItem.set(i17 + 7, 0L);
        recordDataItem.set(i17 + 6, "");
        recordDataItem.c1("");
        recordDataItem.set(i17 + 11, 0L);
        recordDataItem.set(i17 + 10, "");
        recordDataItem.D0("");
    }

    public final void d(java.lang.String str, s15.h recordDataItem, oi3.g simpleMsgInfo, int i17) {
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        if (r26.n0.N(recordDataItem.getString(recordDataItem.f303422d + 3))) {
            throw new java.lang.UnsupportedOperationException("dataId is blank, put in fillRecordDataItemAfterInsertDB");
        }
        int i18 = simpleMsgInfo.f345617d;
        long j17 = simpleMsgInfo.getLong(i18 + 0);
        long j18 = simpleMsgInfo.getLong(i18 + 1);
        java.lang.String msgTalker = simpleMsgInfo.getString(i18 + 3);
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        java.lang.String fj6 = ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).fj(recordDataItem, msgTalker, j17, j18, i17);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i(m(), "copyDataImg not exist from:" + str);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str, fj6, 1);
            if (aj6 == 0) {
                com.tencent.mars.xlog.Log.i(m(), "copyData success hevc to jpg from:" + str + " to:" + fj6);
            } else {
                com.tencent.mars.xlog.Log.i(m(), "copyData fail hevc to jpg ret:" + aj6 + " from:" + str + " to:" + fj6);
            }
        } else {
            long d17 = com.tencent.mm.vfs.w6.d(str, fj6, true);
            if (d17 <= 0) {
                com.tencent.mars.xlog.Log.i(m(), "copyData fail from:" + str + " to:" + fj6);
            } else {
                com.tencent.mars.xlog.Log.i(m(), "copyData success length:" + d17 + " from:" + str + " to:" + fj6);
            }
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(fj6, 19, null, null);
        m();
    }

    public final void f(java.lang.String str, s15.h recordDataItem, oi3.g simpleMsgInfo, int i17) {
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i18 = recordDataItem.f303422d + 3;
        if (r26.n0.N(recordDataItem.getString(i18))) {
            throw new java.lang.UnsupportedOperationException("dataId is blank, put in fillRecordDataItemAfterInsertDB");
        }
        int i19 = simpleMsgInfo.f345617d;
        long j17 = simpleMsgInfo.getLong(i19 + 0);
        long j18 = simpleMsgInfo.getLong(i19 + 1);
        java.lang.String msgTalker = simpleMsgInfo.getString(i19 + 3);
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
        java.lang.String G = bt3.g2.G(recordDataItem.getString(i18), msgTalker, j17, j18, i17);
        kotlin.jvm.internal.o.f(G, "getThumbPath(...)");
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i(m(), "copyThumbImg not exist from:" + str);
            return;
        }
        long d17 = com.tencent.mm.vfs.w6.d(str, G, true);
        if (d17 == 0) {
            com.tencent.mars.xlog.Log.i(m(), "copyThumbImg fail from:" + str + " to:" + G);
        } else {
            com.tencent.mars.xlog.Log.i(m(), "copyThumbImg success length:" + d17 + " from:" + str + " to:" + G);
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(G, 19, null, null);
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gu.j r23, int r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.h(gu.j, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gu.j r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof iu.c
            if (r0 == 0) goto L13
            r0 = r9
            iu.c r0 = (iu.c) r0
            int r1 = r0.f294658f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294658f = r1
            goto L18
        L13:
            iu.c r0 = new iu.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f294656d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f294658f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r9)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            qi3.b0 r2 = r7.f275607a
            java.lang.String r2 = r2.id()
            r9.append(r2)
            java.lang.String r2 = "_down_data_"
            r9.append(r2)
            s15.h r2 = r7.f275609c
            int r4 = r2.f303422d
            int r4 = r4 + 3
            java.lang.String r4 = r2.getString(r4)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            tt.h r4 = new tt.h
            zu.b r5 = zu.b.f475635e
            r4.<init>(r9, r5, r2, r8)
            oi3.e r7 = r7.f275610d
            r4.f421768e = r7
            r4.f421769f = r3
            tt.a r7 = tt.f.f421757f
            tt.f r7 = r7.a()
            r0.f294658f = r3
            java.lang.Object r9 = r7.T6(r4, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            tt.i r9 = (tt.i) r9
            tt.g r7 = r9.f421773a
            tt.g r8 = tt.g.f421758d
            if (r7 != r8) goto L7b
            goto L7c
        L7b:
            r3 = 0
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.i(gu.j, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gu.j r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof iu.d
            if (r0 == 0) goto L13
            r0 = r9
            iu.d r0 = (iu.d) r0
            int r1 = r0.f294661f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294661f = r1
            goto L18
        L13:
            iu.d r0 = new iu.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f294659d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f294661f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r9)
            goto L73
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            qi3.b0 r2 = r7.f275607a
            java.lang.String r2 = r2.id()
            r9.append(r2)
            java.lang.String r2 = "_down_thumb_"
            r9.append(r2)
            s15.h r2 = r7.f275609c
            int r4 = r2.f303422d
            int r4 = r4 + 3
            java.lang.String r4 = r2.getString(r4)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            tt.h r4 = new tt.h
            zu.b r5 = zu.b.f475634d
            r4.<init>(r9, r5, r2, r8)
            oi3.e r7 = r7.f275610d
            r4.f421768e = r7
            r7 = 4
            r4.f421769f = r7
            tt.a r7 = tt.f.f421757f
            tt.f r7 = r7.a()
            r0.f294661f = r3
            java.lang.Object r9 = r7.T6(r4, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            tt.i r9 = (tt.i) r9
            tt.g r7 = r9.f421773a
            tt.g r8 = tt.g.f421758d
            if (r7 != r8) goto L7c
            goto L7d
        L7c:
            r3 = 0
        L7d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.j(gu.j, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String k(oi3.g recordMsgInfo, s15.h dataItem, int i17) {
        kotlin.jvm.internal.o.g(recordMsgInfo, "recordMsgInfo");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o());
        sb6.append('/');
        sb6.append(recordMsgInfo.getLong(recordMsgInfo.f345617d + 0));
        sb6.append('/');
        sb6.append(i17);
        sb6.append('_');
        byte[] bytes = dataItem.getString(dataItem.f303422d + 3).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_t.jpg");
        return sb6.toString();
    }

    public final java.lang.String l(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo instanceof oi3.e ? ((oi3.e) simpleMsgInfo).j() : "";
    }

    public java.lang.String m() {
        return "MicroMsg.AppMsg.BaseRecordSendApi";
    }

    public final java.lang.String n(oi3.g recordMsgInfo, s15.h dataItem, int i17) {
        kotlin.jvm.internal.o.g(recordMsgInfo, "recordMsgInfo");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o());
        sb6.append('/');
        sb6.append(recordMsgInfo.getLong(recordMsgInfo.f345617d + 0));
        sb6.append('/');
        sb6.append(i17);
        sb6.append('_');
        byte[] bytes = dataItem.getString(dataItem.f303422d + 3).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_t.jpg");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gu.j r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.o(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(gu.j r26, java.lang.String r27, int r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.p(gu.j, java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gu.j r26, java.lang.String r27, boolean r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.q(gu.j, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
