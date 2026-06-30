package ej4;

/* loaded from: classes11.dex */
public final class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final pj4.g2 f253324d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253325e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253326f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.p f253327g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f253328h = "";

    public b(pj4.g2 g2Var) {
        java.lang.Long l17;
        java.lang.Long l18;
        java.lang.String str;
        pj4.b0 b0Var;
        pj4.b0 b0Var2;
        pj4.o0 o0Var;
        java.util.LinkedList linkedList;
        pj4.b0 b0Var3;
        pj4.b0 b0Var4;
        pj4.o0 o0Var2;
        pj4.c0 c0Var;
        java.util.LinkedList linkedList2;
        pj4.b0 b0Var5;
        pj4.b0 b0Var6;
        pj4.b0 b0Var7;
        pj4.b0 b0Var8;
        pj4.b0 b0Var9;
        pj4.o0 o0Var3;
        java.util.LinkedList linkedList3;
        pj4.j0 j0Var;
        pj4.b0 b0Var10;
        pj4.b0 b0Var11;
        pj4.o0 o0Var4;
        java.util.LinkedList linkedList4;
        pj4.j0 j0Var2;
        java.lang.String str2;
        pj4.b0 b0Var12;
        pj4.o0 o0Var5;
        pj4.c0 c0Var2;
        java.util.LinkedList linkedList5;
        pj4.j0 j0Var3;
        java.lang.String str3;
        this.f253324d = g2Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5293;
        lVar.f70666c = "/cgi-bin/micromsg-bin/modtextstatus";
        lVar.f70664a = new pj4.o();
        lVar.f70665b = new pj4.p();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253326f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusReq");
        pj4.o oVar = (pj4.o) fVar;
        int c17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigStatusSetBusiBufMaxByteSize());
        boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusBusiBufSwitch()) == 1;
        boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigStatusDeleteBusiBuf()) == 1;
        if (g2Var == null || (b0Var12 = g2Var.f355062d) == null || (o0Var5 = b0Var12.f354975g) == null || (c0Var2 = o0Var5.f355221o) == null || (linkedList5 = c0Var2.f355009m) == null || (j0Var3 = (pj4.j0) kz5.n0.a0(linkedList5, 0)) == null || (str3 = j0Var3.f355141f) == null) {
            l17 = null;
        } else {
            kotlin.jvm.internal.o.f(str3.getBytes(r26.c.f368865a), "getBytes(...)");
            l17 = java.lang.Long.valueOf(r11.length);
        }
        if (g2Var == null || (b0Var11 = g2Var.f355062d) == null || (o0Var4 = b0Var11.f354975g) == null || (linkedList4 = o0Var4.f355216g) == null || (j0Var2 = (pj4.j0) kz5.n0.a0(linkedList4, 0)) == null || (str2 = j0Var2.f355141f) == null) {
            l18 = null;
        } else {
            kotlin.jvm.internal.o.f(str2.getBytes(r26.c.f368865a), "getBytes(...)");
            l18 = java.lang.Long.valueOf(r12.length);
        }
        byte[] encode = android.util.Base64.encode((g2Var == null || (b0Var10 = g2Var.f355062d) == null) ? null : b0Var10.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        java.lang.String str4 = new java.lang.String(encode, UTF_8);
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = str4.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        long length = bytes.length;
        if (length >= c17 || z18 || z17) {
            if (g2Var != null && (b0Var4 = g2Var.f355062d) != null && (o0Var2 = b0Var4.f354975g) != null && (c0Var = o0Var2.f355221o) != null && (linkedList2 = c0Var.f355009m) != null) {
                I(linkedList2);
            }
            byte[] encode2 = android.util.Base64.encode((g2Var == null || (b0Var3 = g2Var.f355062d) == null) ? null : b0Var3.toByteArray(), 2);
            kotlin.jvm.internal.o.f(encode2, "encode(...)");
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_82, "UTF_8");
            str = "";
            java.lang.String str5 = new java.lang.String(encode2, UTF_82);
            byte[] bytes2 = str5.getBytes(charset);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            if (bytes2.length >= c17 || z18 || z17) {
                if (g2Var != null && (b0Var2 = g2Var.f355062d) != null && (o0Var = b0Var2.f354975g) != null && (linkedList = o0Var.f355216g) != null) {
                    I(linkedList);
                }
                byte[] encode3 = android.util.Base64.encode((g2Var == null || (b0Var = g2Var.f355062d) == null) ? null : b0Var.toByteArray(), 2);
                kotlin.jvm.internal.o.f(encode3, "encode(...)");
                java.nio.charset.Charset UTF_83 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_83, "UTF_8");
                str4 = new java.lang.String(encode3, UTF_83);
            } else {
                str4 = str5;
            }
        } else {
            str = "";
        }
        byte[] bytes3 = str4.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
        long length2 = bytes3.length;
        java.lang.String str6 = (g2Var == null || (b0Var9 = g2Var.f355062d) == null || (o0Var3 = b0Var9.f354975g) == null || (linkedList3 = o0Var3.f355216g) == null || (j0Var = (pj4.j0) kz5.n0.a0(linkedList3, 0)) == null) ? null : j0Var.f355139d;
        java.lang.Long valueOf = java.lang.Long.valueOf(length);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(length2);
        com.tencent.mm.autogen.mmdata.rpt.TextStatePublishExtInfoSizeStruct textStatePublishExtInfoSizeStruct = new com.tencent.mm.autogen.mmdata.rpt.TextStatePublishExtInfoSizeStruct();
        textStatePublishExtInfoSizeStruct.f61142d = valueOf != null ? valueOf.longValue() : 0L;
        textStatePublishExtInfoSizeStruct.f61143e = valueOf2 != null ? valueOf2.longValue() : 0L;
        textStatePublishExtInfoSizeStruct.f61145g = l17 != null ? l17.longValue() : 0L;
        textStatePublishExtInfoSizeStruct.f61146h = l18 != null ? l18.longValue() : 0L;
        textStatePublishExtInfoSizeStruct.f61144f = textStatePublishExtInfoSizeStruct.b("StatusJumpInfoType", str6 == null ? str : str6, true);
        java.lang.String n17 = textStatePublishExtInfoSizeStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", 29359, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        oVar.f355208d = str4;
        java.lang.Integer valueOf3 = (g2Var == null || (b0Var8 = g2Var.f355062d) == null) ? null : java.lang.Integer.valueOf(b0Var8.f354980o);
        if ((valueOf3 == null || valueOf3.intValue() != 2) && (valueOf3 == null || valueOf3.intValue() != 1)) {
            if (valueOf3 != null && valueOf3.intValue() == 3) {
                oVar.f355212h = g2Var.f355076u;
            } else if (valueOf3 != null && valueOf3.intValue() == 4) {
                oVar.f355209e = g2Var.f355063e;
            }
        }
        oVar.f355210f = g2Var != null ? g2Var.f355073r : null;
        oVar.f355211g = g2Var != null ? g2Var.f355075t : 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rowId:");
        sb6.append(g2Var != null ? java.lang.Long.valueOf(g2Var.f355069n) : null);
        sb6.append(" text:");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1((g2Var == null || (b0Var7 = g2Var.f355062d) == null) ? null : b0Var7.f354971J));
        sb6.append(" statusId:");
        sb6.append(oVar.f355210f);
        sb6.append(" option:");
        sb6.append((g2Var == null || (b0Var6 = g2Var.f355062d) == null) ? null : java.lang.Long.valueOf(b0Var6.f354986u));
        sb6.append(" request.mod_status_option = :");
        sb6.append(oVar.f355211g);
        sb6.append(" extInfo:");
        sb6.append((g2Var == null || (b0Var5 = g2Var.f355062d) == null) ? null : bk4.l.b(b0Var5));
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", sb6.toString());
    }

    public final void H(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.j0 j0Var = (pj4.j0) it.next();
                if (bi4.e.d(j0Var.f355139d) && com.tencent.mm.sdk.platformtools.t8.K0(j0Var.f355141f)) {
                    j0Var.f355141f = this.f253328h;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "addBusiBuf: " + this.f253328h.length());
                }
            }
        }
    }

    public final void I(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.j0 j0Var = (pj4.j0) it.next();
                if (bi4.e.d(j0Var.f355139d) && !com.tencent.mm.sdk.platformtools.t8.K0(j0Var.f355141f)) {
                    java.lang.String busiBuf = j0Var.f355141f;
                    kotlin.jvm.internal.o.f(busiBuf, "busiBuf");
                    this.f253328h = busiBuf;
                    j0Var.f355141f = "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "clearBusiBuf: " + this.f253328h.length());
                }
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253325e = callback;
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusPostError()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "isPostForceError: result:%s", java.lang.Boolean.valueOf(z17));
        } else {
            z17 = false;
        }
        if (!z17) {
            return dispatch(dispatcher, this.f253326f, this);
        }
        onGYNetEnd(5293, -1, -1, "", this.f253326f, null);
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5293;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        pj4.r rVar;
        java.lang.String str2;
        pj4.c0 c0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253326f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusResp");
            pj4.p pVar = (pj4.p) fVar;
            this.f253327g = pVar;
            java.lang.String str3 = pVar.f355233d;
            java.lang.String str4 = pVar.f355234e;
            boolean z17 = true;
            if (!(str3 == null || str3.length() == 0)) {
                if (str4 != null && str4.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    pj4.b0 b0Var = new pj4.b0();
                    b0Var.parseFrom(android.util.Base64.decode(pVar.f355234e, 0));
                    pj4.o0 o0Var = b0Var.f354975g;
                    if (o0Var != null && (linkedList2 = o0Var.f355216g) != null) {
                        H(linkedList2);
                    }
                    pj4.o0 o0Var2 = b0Var.f354975g;
                    if (o0Var2 != null && (c0Var = o0Var2.f355221o) != null && (linkedList = c0Var.f355009m) != null) {
                        H(linkedList);
                    }
                    pj4.p pVar2 = this.f253327g;
                    jz5.f0 f0Var = null;
                    if (pVar2 == null || (str2 = pVar2.f355235f) == null) {
                        rVar = null;
                    } else {
                        com.tencent.mm.protobuf.f parseFrom = new pj4.r().parseFrom(android.util.Base64.decode(str2, 0));
                        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                        rVar = (pj4.r) parseFrom;
                    }
                    ai4.m0 m0Var = ai4.m0.f5173a;
                    java.lang.String a17 = bk4.k1.a();
                    kotlin.jvm.internal.o.d(str3);
                    ai4.b.g(m0Var, a17, str3, b0Var, 4, null, 0L, 0.0f, null, rVar, false, 752, null);
                    pj4.g2 g2Var = this.f253324d;
                    if (g2Var != null) {
                        java.lang.String str5 = g2Var.f355072q;
                        pj4.o0 o0Var3 = b0Var.f354975g;
                        java.lang.String str6 = o0Var3 != null ? o0Var3.f355213d : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = pVar.f355233d;
                        if (str5 != null) {
                            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str5), pj4.h2.class, new qj4.o(str5, 1L, str6, str7));
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                        }
                        oj4.j.f345815a.e(g2Var.f355062d.f354982q);
                    }
                    if (g2Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.NetSceneModTextStatus", "onSceneEnd mod statusId:" + pVar.f355233d + ", this is deleted");
                    }
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253325e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
