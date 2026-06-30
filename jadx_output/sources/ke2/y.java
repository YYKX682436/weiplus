package ke2;

/* loaded from: classes3.dex */
public final class y extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f307000t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.gv1 f307001u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r7, int r8, boolean r9, java.lang.String r10, boolean r11, r45.b63 r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            r6 = this;
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto L6
            r9 = r0
        L6:
            r14 = r13 & 8
            r1 = 0
            if (r14 == 0) goto Lc
            r10 = r1
        Lc:
            r14 = r13 & 16
            if (r14 == 0) goto L11
            r11 = r0
        L11:
            r13 = r13 & 32
            if (r13 == 0) goto L16
            r12 = r1
        L16:
            java.lang.String r13 = "appid"
            kotlin.jvm.internal.o.g(r7, r13)
            r13 = 2
            r6.<init>(r1, r1, r13, r1)
            java.lang.String r14 = "Finder.CgiFinderLiveGetUserGameConfig"
            r6.f307000t = r14
            r45.gv1 r1 = new r45.gv1
            r1.<init>()
            r6.f307001u = r1
            db2.t4 r2 = db2.t4.f228171a
            r3 = 5274(0x149a, float:7.39E-42)
            r45.kv0 r2 = r2.a(r3)
            r4 = 1
            r1.set(r4, r2)
            r45.qt2 r2 = r6.f16135n
            java.lang.String r2 = xy2.c.f(r2)
            r1.set(r13, r2)
            r13 = 3
            r1.set(r13, r7)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r2 = 4
            r1.set(r2, r13)
            com.tencent.mm.plugin.finder.assist.b3 r13 = com.tencent.mm.plugin.finder.assist.b3.f102022a
            r45.rm0 r13 = r13.f()
            r2 = 5
            r1.set(r2, r13)
            r13 = 10
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r1.set(r13, r9)
            r45.ap1 r9 = new r45.ap1
            r9.<init>()
            java.lang.Class<oe0.x> r13 = oe0.x.class
            i95.m r13 = i95.n0.c(r13)
            oe0.x r13 = (oe0.x) r13
            ne0.r r13 = (ne0.r) r13
            r13.getClass()
            rg4.a r13 = rg4.b.f395246a
            java.lang.String r13 = r13.b()
            java.lang.String r2 = "getFinderLiveGameAppVersion version:"
            java.lang.String r2 = r2.concat(r13)
            java.lang.String r5 = "MicroMsg.MagicLiveCardOuterService"
            com.tencent.mars.xlog.Log.i(r5, r2)
            r9.set(r0, r13)
            r13 = 11
            r1.set(r13, r9)
            r45.l45 r9 = new r45.l45
            r9.<init>()
            r9.set(r4, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            r9.set(r0, r10)
            r10 = 12
            r1.set(r10, r9)
            r9 = 13
            r1.set(r9, r12)
            com.tencent.mm.modelbase.l r9 = new com.tencent.mm.modelbase.l
            r9.<init>()
            r9.f70664a = r1
            r45.hv1 r10 = new r45.hv1
            r10.<init>()
            r45.ie r11 = new r45.ie
            r11.<init>()
            r10.set(r0, r11)
            com.tencent.mm.protobuf.f r11 = r10.getCustom(r0)
            r45.ie r11 = (r45.ie) r11
            if (r11 != 0) goto Lbf
            goto Lc6
        Lbf:
            r45.du5 r12 = new r45.du5
            r12.<init>()
            r11.f376960e = r12
        Lc6:
            r9.f70665b = r10
            java.lang.String r10 = "/cgi-bin/micromsg-bin/finderlivegetusergameconfig"
            r9.f70666c = r10
            r9.f70667d = r3
            com.tencent.mm.modelbase.o r9 = r9.a()
            r6.p(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "init "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = ", "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.tencent.mars.xlog.Log.i(r14, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke2.y.<init>(java.lang.String, int, boolean, java.lang.String, boolean, r45.b63, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.z73 z73Var;
        r45.z73 z73Var2;
        r45.hv1 resp = (r45.hv1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" resp=");
        sb6.append(pm0.b0.g(resp));
        sb6.append(" canshow3d=");
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getGame_user_info_list(...)");
        r45.n73 n73Var = (r45.n73) kz5.n0.Z(list);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        sb6.append((n73Var == null || (z73Var2 = (r45.z73) n73Var.getCustom(5)) == null) ? null : java.lang.Boolean.valueOf(z73Var2.getBoolean(17)));
        sb6.append(" 3dInfo=");
        java.util.LinkedList list2 = resp.getList(1);
        kotlin.jvm.internal.o.f(list2, "getGame_user_info_list(...)");
        r45.n73 n73Var2 = (r45.n73) kz5.n0.Z(list2);
        if (n73Var2 != null && (z73Var = (r45.z73) n73Var2.getCustom(5)) != null) {
            finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) z73Var.getCustom(18);
        }
        sb6.append(finderJumpInfo);
        com.tencent.mars.xlog.Log.i(this.f307000t, sb6.toString());
    }
}
