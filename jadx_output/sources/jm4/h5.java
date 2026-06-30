package jm4;

/* loaded from: classes11.dex */
public abstract class h5 {

    /* renamed from: a, reason: collision with root package name */
    public static cv.y0 f300391a;

    public static final void a(byte[] tingBypassBuffer, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(tingBypassBuffer, "tingBypassBuffer");
        com.tencent.mm.protobuf.g h17 = pm0.b0.h(tingBypassBuffer);
        if (h17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y.f280114e.s(h17, z17, new jm4.d5(lVar));
        }
    }

    public static final void b(java.lang.String[] listenId, boolean z17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : listenId) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.field_id = str;
            multiTaskInfo.field_type = z17 ? 23 : 24;
            if (((com.tencent.mm.plugin.multitask.p1) l0Var).Ri(multiTaskInfo)) {
                arrayList.add(str);
            }
        }
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "containsInStar check " + arrayList.size());
        if (lVar != null) {
            lVar.invoke(arrayList.toArray(new java.lang.String[0]));
        }
    }

    public static final void c(yz5.l lVar) {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int u27 = com.tencent.mm.plugin.finder.storage.t70.f127590a.u2();
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(u27 == 2 ? 2L : 3L));
        }
    }

    public static final void d(java.lang.String sourceId, yz5.l lVar) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        if (lVar != null) {
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            lVar.invoke(java.lang.Boolean.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId) != null));
        }
    }

    public static final void e(byte[] itemData, long j17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(itemData);
        jm4.s3[] s3VarArr = jm4.s3.f300428d;
        long j18 = 0;
        kl4.a aVar2 = kl4.b.f308882a;
        if (j17 == j18) {
            kotlin.jvm.internal.o.d(parseFrom);
            aVar2.a(parseFrom, 13);
            return;
        }
        jm4.s3[] s3VarArr2 = jm4.s3.f300428d;
        if (j17 == 1) {
            kotlin.jvm.internal.o.d(parseFrom);
            aVar2.a(parseFrom, 14);
        }
    }

    public static final void f(long j17, java.lang.String paramsJson, yz5.a aVar) {
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        java.util.Map e17 = paramsJson.length() > 0 ? d75.b.e(new org.json.JSONObject(paramsJson), jm4.f5.f300383d) : null;
        jz5.g gVar = rk4.u4.f397010a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEventHelper", "onTingCommonEvent event: " + j17);
        jz5.g gVar2 = rk4.u4.f397010a;
        int i17 = (int) j17;
        if (((java.util.Map) ((jz5.n) gVar2).getValue()).containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mm.autogen.events.TingCategoryChangeEvent tingCategoryChangeEvent = new com.tencent.mm.autogen.events.TingCategoryChangeEvent();
            java.lang.Integer num = (java.lang.Integer) ((java.util.Map) ((jz5.n) gVar2).getValue()).get(java.lang.Integer.valueOf(i17));
            int intValue = num != null ? num.intValue() : 0;
            am.yy yyVar = tingCategoryChangeEvent.f54893g;
            yyVar.f8491a = intValue;
            if (e17 != null) {
                try {
                    java.lang.Object obj = e17.get("categoryItem");
                    if (obj instanceof byte[]) {
                        yyVar.f8494d = new bw5.o50().parseFrom((byte[]) obj);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TingEventHelper", "onCategoryEvent exp=" + e18);
                }
                java.lang.Object obj2 = e17.get("isLike");
                if (obj2 instanceof java.lang.Boolean) {
                    yyVar.f8492b = ((java.lang.Boolean) obj2).booleanValue();
                }
                java.lang.Object obj3 = e17.get("isPublic");
                if (obj3 instanceof java.lang.Boolean) {
                    yyVar.f8493c = ((java.lang.Boolean) obj3).booleanValue();
                }
            }
            tingCategoryChangeEvent.b(android.os.Looper.getMainLooper());
        }
    }

    public static final void g(long j17, long j18, yz5.a aVar) {
        km4.l lVar = km4.l.f309296a;
        int i17 = (int) j17;
        if (com.tencent.pigeon.ting.TingPreloadMiniProgramType.NATIVE_MINI_PROGRAM.ordinal() == i17) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.R);
        } else if (com.tencent.pigeon.ting.TingPreloadMiniProgramType.MINI_PROGRAM.ordinal() == i17) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.R);
        } else if (com.tencent.pigeon.ting.TingPreloadMiniProgramType.MINI_GAME.ordinal() == i17) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.R);
        }
    }

    public static final void h(java.lang.String localFilePath, yz5.l lVar) {
        kotlin.jvm.internal.o.g(localFilePath, "localFilePath");
        if (localFilePath.length() == 0) {
            if (lVar != null) {
                bw5.xo0 xo0Var = new bw5.xo0();
                xo0Var.f35212d = 99991;
                xo0Var.f35215g[1] = true;
                byte[] byteArray = xo0Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                lVar.invoke(byteArray);
                return;
            }
            return;
        }
        jm4.g5 g5Var = new jm4.g5(lVar);
        if (localFilePath.length() == 0) {
            g5Var.a(-1, false, "", null);
            return;
        }
        hf0.b bVar = new hf0.b(g5Var);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_TingAudioUploader";
        mVar.f241787f = bVar;
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(localFilePath.getBytes());
        mVar.field_fullpath = localFilePath;
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_fileType = 20305;
        mVar.field_appType = 252;
        mVar.Z = 8;
        mVar.field_bzScene = 2;
        mVar.A = 600;
        mVar.B = 180;
        mVar.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
