package db2;

/* loaded from: classes2.dex */
public final class t2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f228164t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.eg2 f228165u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f228166v;

    /* renamed from: w, reason: collision with root package name */
    public final long f228167w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f228168x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, byte[] bArr, int i17) {
        super(null, null, 3, null);
        byte[] byteArray;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        this.f228164t = finderItem;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        this.f228166v = feedObject;
        this.f228167w = finderItem.getLocalId();
        java.lang.String clientId = finderItem.getClientId();
        this.f228168x = clientId;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermemberqaoprqa";
        lVar.f70667d = 7945;
        r45.eg2 eg2Var = new r45.eg2();
        this.f228165u = eg2Var;
        eg2Var.f373439q = clientId;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feedObject.getObjectDesc();
        if (objectDesc != null && (byteArray = objectDesc.toByteArray()) != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
            try {
                finderObjectDesc.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                finderObjectDesc = null;
            }
            if (finderObjectDesc != null) {
                r45.eg2 eg2Var2 = this.f228165u;
                mv2.f0.f331561a.b("Cgi.FinderMemberQAOprQA", finderObjectDesc, this.f228166v, this.f228164t);
                eg2Var2.f373430e = finderObjectDesc;
            }
        }
        if (com.tencent.mm.storage.z3.S3(this.f228164t.field_username)) {
            r45.eg2 eg2Var3 = this.f228165u;
            eg2Var3.f373441s = 2;
            eg2Var3.f373431f = this.f228164t.field_username;
        } else {
            r45.eg2 eg2Var4 = this.f228165u;
            eg2Var4.f373441s = 1;
            eg2Var4.f373431f = this.f228164t.field_postinfo.getString(20);
        }
        this.f228165u.f373433h = this.f228166v.getRefObjectId();
        this.f228165u.f373432g = this.f228164t.field_postinfo.getString(19);
        this.f228165u.f373429d = db2.t4.f228171a.a(7945);
        r45.eg2 eg2Var5 = this.f228165u;
        eg2Var5.f373438p = i17;
        eg2Var5.f373442t |= 2;
        eg2Var5.f373440r = java.lang.System.currentTimeMillis();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        fo3.s sVar = fo3.s.INSTANCE;
        cu5Var.d(sVar.Ci("ce_feed_publish"));
        k57Var.f378395e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.h());
        k57Var.f378396f = cu5Var2;
        r45.kv0 kv0Var = this.f228165u.f373429d;
        if (kv0Var != null) {
            kv0Var.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
        }
        w04.l.INSTANCE.b(540999699);
        lVar.f70664a = this.f228165u;
        r45.fg2 fg2Var = new r45.fg2();
        fg2Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = fg2Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = fg2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postRequest detail: clientId ");
        sb6.append(this.f228168x);
        sb6.append("  draftId:");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc2 = this.f228165u.f373430e;
        sb6.append(finderObjectDesc2 != null ? java.lang.Long.valueOf(finderObjectDesc2.getDraftObjectId()) : null);
        sb6.append(", mediaFeature:");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(" content: ");
        java.lang.Object obj = this.f228165u.f373430e;
        sb6.append(pm0.b0.g(obj != null ? obj : ""));
        sb6.append(" refId: ");
        sb6.append(this.f228165u.f373433h);
        sb6.append(" localId:");
        sb6.append(this.f228164t.getLocalId());
        sb6.append(" originalFlag:");
        sb6.append(this.f228166v.getOriginalFlag());
        sb6.append(" opr_type: ");
        sb6.append(this.f228165u.f373438p);
        sb6.append(" memberProviderUsername: ");
        sb6.append(this.f228165u.f373432g);
        com.tencent.mars.xlog.Log.i("Cgi.FinderMemberQAOprQA", sb6.toString());
        p(lVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r19, int r20, java.lang.String r21, com.tencent.mm.protobuf.f r22, com.tencent.mm.modelbase.m1 r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r45.fg2 r3 = (r45.fg2) r3
            java.lang.String r4 = "resp"
            kotlin.jvm.internal.o.g(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "errType %d, errCode %d, errMsg %s, localId %s localId:"
            r4.<init>(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r0.f228164t
            long r6 = r5.getLocalId()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            long r8 = r0.f228167w
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            r11 = r21
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r11, r10}
            java.lang.String r7 = "Cgi.FinderMemberQAOprQA"
            com.tencent.mars.xlog.Log.i(r7, r4, r6)
            r4 = 0
            if (r1 != 0) goto L4d
            if (r2 != 0) goto L4d
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r3.f374306d
            mv2.f0 r2 = mv2.f0.f331561a
            java.lang.String r3 = ""
            r2.q(r5, r1, r3, r4)
            goto Lb5
        L4d:
            jx3.f r10 = jx3.f.INSTANCE
            r11 = 1279(0x4ff, double:6.32E-321)
            r13 = 6
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            com.tencent.mm.plugin.finder.report.t4 r3 = com.tencent.mm.plugin.finder.report.t4.f125365a
            boolean r6 = r5.isLongVideo()
            r3.f(r6)
            r6 = 1
            r7 = 4
            if (r1 != r7) goto L7d
            r10 = -5002(0xffffffffffffec76, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -5001(0xffffffffffffec77, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -4065(0xfffffffffffff01f, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -4059(0xfffffffffffff025, float:NaN)
            if (r2 == r10) goto L7b
            switch(r2) {
                case -4007: goto L7b;
                case -4006: goto L7b;
                case -4005: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L7d
        L7b:
            r10 = r4
            goto L7e
        L7d:
            r10 = r6
        L7e:
            r11 = -4013(0xfffffffffffff053, float:NaN)
            if (r2 != r11) goto L83
            r4 = r6
        L83:
            if (r1 == r7) goto L89
            if (r10 == 0) goto L89
            if (r4 == 0) goto Lb5
        L89:
            cu2.t r1 = cu2.u.f222441a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f(r8)
            if (r6 == 0) goto Lae
            if (r10 == 0) goto L9d
            if (r4 == 0) goto L99
            r6.setPostFailedAndNoAuth()
            goto La7
        L99:
            r6.setPostFailed()
            goto La7
        L9d:
            boolean r4 = r5.isLongVideo()
            r3.g(r4)
            r6.setPostFailedAndNotRetry(r2)
        La7:
            int r2 = r6.field_localFlag
            r5.field_localFlag = r2
            r1.l(r6)
        Lae:
            boolean r1 = r5.isLongVideo()
            r3.e(r1)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t2.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }
}
