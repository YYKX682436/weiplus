package db2;

/* loaded from: classes2.dex */
public final class u extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.nv0 f228184t;

    public /* synthetic */ u(java.util.List list, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.util.List list2, r45.vg0 vg0Var, int i27, java.lang.String str3, r45.fr0 fr0Var, java.lang.Integer num, java.lang.String str4, r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, r45.pl2 pl2Var, r45.tj2 tj2Var, int i28, kotlin.jvm.internal.i iVar) {
        this(list, (i28 & 2) != 0 ? 0 : i17, (i28 & 4) != 0 ? 0 : i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? "" : str, (i28 & 32) != 0 ? "" : str2, (i28 & 64) != 0 ? null : list2, (i28 & 128) != 0 ? null : vg0Var, (i28 & 256) != 0 ? 0 : i27, (i28 & 512) != 0 ? null : str3, (i28 & 1024) != 0 ? null : fr0Var, (i28 & 2048) != 0 ? null : num, (i28 & 4096) != 0 ? "" : str4, qt2Var, (i28 & 16384) != 0 ? null : gVar, (32768 & i28) != 0 ? null : pl2Var, (i28 & 65536) != 0 ? null : tj2Var);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ov0 resp = (r45.ov0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderBatchGetObjectAsyncLoadInfo", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127863oc).getValue()).r()).booleanValue()) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.setJumpinfo_type(2);
            com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
            html5Info.setUrl("https://www.gov.sg/pofma");
            html5Info.setStyle(2);
            finderJumpInfo.setHtml5_info(html5Info);
            finderJumpInfo.setBusiness_type(70);
            r45.wf6 wf6Var = new r45.wf6();
            r45.wy3 wy3Var = new r45.wy3();
            wy3Var.set(0, "http://dldir1.qq.com/weixin/checkresupdate/icons_finder_music_Bold_new_413f42ee4bb94c6bb54bbba07c1925e8.png");
            wy3Var.set(1, "作者提示:内容由人工智能技术生成");
            wf6Var.set(37, wy3Var);
            wf6Var.set(1, 1);
            wf6Var.set(2, 29);
            finderJumpInfo.getStyle().add(wf6Var);
            java.util.LinkedList list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject_async_info_map(...)");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((r45.dl2) it.next()).getList(11).add(finderJumpInfo);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.util.List r21, int r22, int r23, int r24, java.lang.String r25, java.lang.String r26, java.util.List r27, r45.vg0 r28, int r29, java.lang.String r30, r45.fr0 r31, java.lang.Integer r32, java.lang.String r33, r45.qt2 r34, com.tencent.mm.protobuf.g r35, r45.pl2 r36, r45.tj2 r37) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.u.<init>(java.util.List, int, int, int, java.lang.String, java.lang.String, java.util.List, r45.vg0, int, java.lang.String, r45.fr0, java.lang.Integer, java.lang.String, r45.qt2, com.tencent.mm.protobuf.g, r45.pl2, r45.tj2):void");
    }

    public /* synthetic */ u(java.util.List list, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, int i19, kotlin.jvm.internal.i iVar) {
        this(list, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) == 0 ? i18 : 0, (i19 & 8) != 0 ? "" : str, (i19 & 16) == 0 ? str2 : "", (i19 & 32) != 0 ? null : qt2Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.util.List r23, int r24, int r25, java.lang.String r26, java.lang.String r27, r45.qt2 r28) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "objectIds"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.String r1 = "finderUserName"
            r7 = r26
            kotlin.jvm.internal.o.g(r7, r1)
            java.lang.String r1 = "uxInfo"
            r8 = r27
            kotlin.jvm.internal.o.g(r8, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kz5.d0.q(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r23.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            jz5.l r1 = (jz5.l) r1
            r45.in2 r2 = new r45.in2
            r2.<init>()
            java.lang.Object r4 = r1.f302833d
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r6 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.set(r6, r4)
            java.lang.Object r1 = r1.f302834e
            java.lang.String r1 = (java.lang.String) r1
            r4 = 1
            r2.set(r4, r1)
            r3.add(r2)
            goto L26
        L53:
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 122816(0x1dfc0, float:1.72102E-40)
            r21 = 0
            r2 = r22
            r4 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r16 = r28
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.u.<init>(java.util.List, int, int, java.lang.String, java.lang.String, r45.qt2):void");
    }
}
