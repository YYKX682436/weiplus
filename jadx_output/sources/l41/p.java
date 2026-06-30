package l41;

/* loaded from: classes8.dex */
public final class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f315890d;

    /* renamed from: e, reason: collision with root package name */
    public int f315891e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315892f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315893g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315894h;

    public p(j41.j0 openIMKefuOpContactRequest, r45.s4 addContactContext) {
        kotlin.jvm.internal.o.g(openIMKefuOpContactRequest, "openIMKefuOpContactRequest");
        kotlin.jvm.internal.o.g(addContactContext, "addContactContext");
        this.f315892f = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.t4();
        lVar.f70665b = new r45.u4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addopenimkefucontact";
        lVar.f70667d = 6849;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315894h = a17;
        java.lang.String str = openIMKefuOpContactRequest.f297647a;
        java.lang.String str2 = str != null ? str : "";
        this.f315892f = str2;
        r45.t4 t4Var = (r45.t4) a17.f70710a.f70684a;
        if (t4Var != null) {
            t4Var.f386126d = str2;
        }
        if (t4Var != null) {
            t4Var.f386127e = addContactContext;
        }
        byte[] bArr = openIMKefuOpContactRequest.f297651e;
        if (bArr != null) {
            if ((!(bArr.length == 0)) && t4Var != null) {
                t4Var.f386128f = com.tencent.mm.protobuf.g.b(bArr);
            }
        }
        if (t4Var != null) {
            t4Var.f386129g = openIMKefuOpContactRequest.f297652f;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addOpenImKefuContact username: ");
        sb6.append(str2);
        sb6.append(", url: ");
        sb6.append(addContactContext.f385486d);
        sb6.append(", ticket: ");
        sb6.append(addContactContext.f385488f);
        sb6.append(", scene: ");
        r45.l05 l05Var = addContactContext.f385489g;
        sb6.append(l05Var != null ? java.lang.Integer.valueOf(l05Var.f379059d) : null);
        sb6.append(", entityId: ");
        r45.l05 l05Var2 = addContactContext.f385489g;
        sb6.append(l05Var2 != null ? l05Var2.f379060e : null);
        sb6.append(" spamContext:");
        sb6.append(bArr);
        sb6.append(", finder_context:");
        sb6.append(t4Var != null ? t4Var.f386129g : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAddOpenIMKefuContact", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[addKefuContact] finderContext:");
        sb7.append(t4Var != null ? t4Var.f386129g : null);
        com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", sb7.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315893g = u0Var;
        return dispatch(sVar, this.f315894h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6849;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r5, int r6, int r7, java.lang.String r8, com.tencent.mm.network.v0 r9, byte[] r10) {
        /*
            r4 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "addOpenImKefuContact onGYNetEnd errType: "
            r5.<init>(r9)
            r5.append(r6)
            java.lang.String r9 = ", errCode: "
            r5.append(r9)
            r5.append(r7)
            java.lang.String r9 = ", errMsg: "
            r5.append(r9)
            r5.append(r8)
            java.lang.String r9 = ", type: 6849"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "MicroMsg.NetSceneAddOpenIMKefuContact"
            com.tencent.mars.xlog.Log.i(r9, r5)
            if (r6 != 0) goto L9e
            if (r7 == 0) goto L2e
            goto L9e
        L2e:
            r5 = 0
            com.tencent.mm.modelbase.o r10 = r4.f315894h
            if (r10 == 0) goto L38
            com.tencent.mm.modelbase.n r10 = r10.f70711b
            com.tencent.mm.protobuf.f r10 = r10.f70700a
            goto L39
        L38:
            r10 = r5
        L39:
            r45.u4 r10 = (r45.u4) r10
            r0 = 0
            if (r10 == 0) goto L6e
            r45.k05 r1 = r10.f387003e
            if (r1 == 0) goto L6e
            java.lang.String r1 = r1.f378271d
            if (r1 == 0) goto L6e
            int r2 = r1.length()
            if (r2 <= 0) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = r0
        L4f:
            if (r2 == 0) goto L52
            goto L53
        L52:
            r1 = r5
        L53:
            if (r1 == 0) goto L6e
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            com.tencent.mm.storage.u3 r3 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            r2.x(r3, r1)
            java.lang.String r2 = "NetSceneAddOpenIMKefuContact encUserName = "
            java.lang.String r1 = r2.concat(r1)
            com.tencent.mars.xlog.Log.i(r9, r1)
            jz5.f0 r1 = jz5.f0.f302826a
            goto L6f
        L6e:
            r1 = r5
        L6f:
            if (r1 != 0) goto L83
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            r1.x(r2, r5)
            java.lang.String r5 = "NetSceneAddOpenIMKefuContact encUserName is empty"
            com.tencent.mars.xlog.Log.i(r9, r5)
        L83:
            if (r10 == 0) goto L88
            int r5 = r10.f387002d
            goto L89
        L88:
            r5 = r0
        L89:
            r4.f315890d = r5
            if (r10 == 0) goto L93
            r45.k05 r5 = r10.f387003e
            if (r5 == 0) goto L93
            int r0 = r5.f378272e
        L93:
            r4.f315891e = r0
            com.tencent.mm.modelbase.u0 r5 = r4.f315893g
            kotlin.jvm.internal.o.d(r5)
            r5.onSceneEnd(r6, r7, r8, r4)
            return
        L9e:
            com.tencent.mm.modelbase.u0 r5 = r4.f315893g
            kotlin.jvm.internal.o.d(r5)
            r5.onSceneEnd(r6, r7, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.p.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
