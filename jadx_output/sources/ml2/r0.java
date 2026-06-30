package ml2;

@j95.b
/* loaded from: classes3.dex */
public final class r0 extends i95.w implements c50.c1 {
    public static boolean T1 = false;
    public static long U1 = 0;
    public static long V1 = 0;
    public static long W1 = 0;
    public static long X1 = 0;
    public static int Y1 = 0;
    public static int Z1 = 0;

    /* renamed from: a2 */
    public static long f327861a2 = 0;

    /* renamed from: b2 */
    public static java.lang.String f327862b2 = "";

    /* renamed from: c2 */
    public static java.lang.Object f327863c2;
    public int A;
    public int A1;
    public final java.util.ArrayList B;
    public int B1;
    public int C;
    public final java.util.ArrayList C1;
    public int D;
    public boolean D1;
    public int E;
    public boolean E1;
    public int F;
    public ml2.s2 F1;
    public int G;
    public int G1;
    public int H;
    public java.lang.String H1;
    public int I;
    public boolean I1;

    /* renamed from: J */
    public int f327864J;
    public boolean J1;
    public boolean K;
    public ml2.e4 K1;
    public org.json.JSONObject L;
    public boolean L1;
    public java.lang.String M;
    public boolean M1;
    public long N;
    public java.lang.String N1;
    public boolean O1;
    public long P;
    public ml2.e5 P1;
    public long Q;
    public boolean Q1;
    public long R;
    public boolean R1;
    public boolean S;
    public final java.util.HashMap S1;
    public final mm2.a T;
    public final mm2.a U;
    public final mm2.a V;
    public boolean W;
    public java.lang.String X;
    public ml2.v1 Y;
    public boolean Z;

    /* renamed from: d */
    public long f327865d;

    /* renamed from: e */
    public long f327866e;

    /* renamed from: h */
    public long f327869h;

    /* renamed from: i */
    public java.lang.String f327870i;

    /* renamed from: l1 */
    public long f327871l1;

    /* renamed from: n */
    public int f327873n;

    /* renamed from: o */
    public int f327874o;

    /* renamed from: p */
    public int f327875p;

    /* renamed from: p0 */
    public ml2.t3 f327876p0;

    /* renamed from: p1 */
    public long f327877p1;

    /* renamed from: q */
    public long f327878q;

    /* renamed from: r */
    public final java.util.concurrent.ConcurrentHashMap f327879r;

    /* renamed from: s */
    public java.util.Map f327880s;

    /* renamed from: t */
    public java.lang.String f327881t;

    /* renamed from: u */
    public java.lang.String f327882u;

    /* renamed from: v */
    public int f327883v;

    /* renamed from: w */
    public int f327884w;

    /* renamed from: x */
    public int f327885x;

    /* renamed from: x0 */
    public long f327886x0;

    /* renamed from: x1 */
    public int f327887x1;

    /* renamed from: y */
    public int f327888y;

    /* renamed from: y0 */
    public long f327889y0;

    /* renamed from: y1 */
    public boolean f327890y1;

    /* renamed from: z */
    public int f327891z;

    /* renamed from: z1 */
    public boolean f327892z1;

    /* renamed from: f */
    public java.lang.String f327867f = "";

    /* renamed from: g */
    public java.lang.String f327868g = "";

    /* renamed from: m */
    public java.lang.String f327872m = "";

    public r0() {
        ml2.w3 w3Var = ml2.w3.f328182e;
        this.f327879r = new java.util.concurrent.ConcurrentHashMap();
        this.f327880s = new java.util.LinkedHashMap();
        this.f327881t = "";
        this.f327882u = "";
        this.B = new java.util.ArrayList();
        this.M = "";
        this.T = new mm2.a("multiVoice");
        this.U = new mm2.a("singleVoice");
        this.V = new mm2.a("ktvVoice");
        this.X = "";
        this.Y = ml2.v1.f328140e;
        this.f327876p0 = ml2.t3.f328016f;
        this.C1 = new java.util.ArrayList();
        this.F1 = ml2.s2.f327919e;
        this.H1 = "";
        this.K1 = ml2.e4.f327376e;
        this.N1 = "";
        this.P1 = ml2.e5.f327390f;
        this.S1 = new java.util.HashMap();
    }

    public static /* synthetic */ void Bj(ml2.r0 r0Var, ml2.g5 g5Var, dk2.zf zfVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            zfVar = null;
        }
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        r0Var.Aj(g5Var, zfVar, i17);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(98:16|(2:18|(2:20|(95:22|(1:24)(1:337)|25|(1:27)(1:336)|28|(2:31|(6:33|34|(2:37|35)|38|(1:42)|43))|47|(1:49)(1:335)|50|(2:326|(3:328|(1:(1:331)(1:333))(1:334)|332))(2:57|(3:59|(1:(1:62)(1:323))(1:324)|63)(1:325))|64|(1:322)(1:70)|71|(1:321)(1:75)|(1:77)|78|(8:80|(1:82)|83|(1:85)(1:99)|86|(1:88)(1:98)|(1:97)(1:92)|(1:96))|100|101|102|(1:104)(1:318)|(1:106)(4:314|315|316|317)|107|108|109|(1:111)(2:306|(19:308|117|118|119|120|121|122|123|(8:125|(1:127)(1:142)|(1:129)(1:141)|130|(3:135|(1:137)|138)|140|(0)|138)|143|(42:161|(1:296)(1:165)|(1:167)|168|(1:170)|171|(1:175)|176|(1:295)(1:180)|181|(1:294)(4:185|(2:186|(4:188|(1:291)(2:192|(2:194|(1:197)(1:196)))|290|(0)(0))(2:292|293))|198|(5:200|(1:202)|203|(1:205)(1:208)|(1:207)))|209|210|211|(1:213)(1:288)|(1:215)|216|(1:218)(1:286)|219|(1:221)|222|(1:224)|225|(2:227|(3:229|(1:231)|232))(2:280|(3:282|(1:284)|285))|233|(1:235)|236|(1:238)(1:279)|239|(1:241)|242|(1:244)|245|(1:278)(1:249)|(1:251)|252|(1:254)|255|(1:257)(6:263|(4:266|(3:268|269|270)(1:272)|271|264)|273|274|(1:276)|277)|258|(1:260)(1:262)|261)(1:146)|147|(1:149)(1:160)|(1:151)|152|(1:154)(1:159)|(1:156)|157|158))|112|113|114|115|116|117|118|119|120|121|122|123|(0)|143|(0)|161|(1:163)|296|(0)|168|(0)|171|(2:173|175)|176|(1:178)|295|181|(1:183)|294|209|210|211|(0)(0)|(0)|216|(0)(0)|219|(0)|222|(0)|225|(0)(0)|233|(0)|236|(0)(0)|239|(0)|242|(0)|245|(1:247)|278|(0)|252|(0)|255|(0)(0)|258|(0)(0)|261|147|(0)(0)|(0)|152|(0)(0)|(0)|157|158)(2:338|339)))|340|28|(2:31|(0))|47|(0)(0)|50|(0)|326|(0)|64|(1:66)|322|71|(1:73)|321|(0)|78|(0)|100|101|102|(0)(0)|(0)(0)|107|108|109|(0)(0)|112|113|114|115|116|117|118|119|120|121|122|123|(0)|143|(0)|161|(0)|296|(0)|168|(0)|171|(0)|176|(0)|295|181|(0)|294|209|210|211|(0)(0)|(0)|216|(0)(0)|219|(0)|222|(0)|225|(0)(0)|233|(0)|236|(0)(0)|239|(0)|242|(0)|245|(0)|278|(0)|252|(0)|255|(0)(0)|258|(0)(0)|261|147|(0)(0)|(0)|152|(0)(0)|(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0427, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x042b, code lost:
    
        com.tencent.mars.xlog.Log.i(r5, "appendLikeUserName err: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0429, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0398, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x039a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x039b, code lost:
    
        r2 = "toString(...)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03a5, code lost:
    
        r4 = r27;
        r3 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0317 A[Catch: Exception -> 0x03a4, TryCatch #7 {Exception -> 0x03a4, blocks: (B:102:0x030c, B:106:0x0317, B:314:0x0321), top: B:101:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0336 A[Catch: Exception -> 0x039a, TRY_ENTER, TryCatch #3 {Exception -> 0x039a, blocks: (B:111:0x0336, B:112:0x0367, B:306:0x035e), top: B:109:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d5 A[Catch: Exception -> 0x0427, TryCatch #6 {Exception -> 0x0427, blocks: (B:123:0x03cf, B:125:0x03d5, B:129:0x03e0, B:130:0x03ef, B:132:0x040c, B:137:0x0418, B:138:0x041b, B:141:0x03e6), top: B:122:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0418 A[Catch: Exception -> 0x0427, TryCatch #6 {Exception -> 0x0427, blocks: (B:123:0x03cf, B:125:0x03d5, B:129:0x03e0, B:130:0x03ef, B:132:0x040c, B:137:0x0418, B:138:0x041b, B:141:0x03e6), top: B:122:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ab A[LOOP:1: B:186:0x0584->B:196:0x05ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05b2 A[EDGE_INSN: B:197:0x05b2->B:198:0x05b2 BREAK  A[LOOP:1: B:186:0x0584->B:196:0x05ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0637 A[Catch: all -> 0x0641, TRY_LEAVE, TryCatch #1 {all -> 0x0641, blocks: (B:211:0x062a, B:213:0x0637), top: B:210:0x062a }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x035e A[Catch: Exception -> 0x039a, TryCatch #3 {Exception -> 0x039a, blocks: (B:111:0x0336, B:112:0x0367, B:306:0x035e), top: B:109:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0321 A[Catch: Exception -> 0x03a4, TRY_LEAVE, TryCatch #7 {Exception -> 0x03a4, blocks: (B:102:0x030c, B:106:0x0317, B:314:0x0321), top: B:101:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Ck(ml2.r0 r32, android.content.Context r33, ml2.e4 r34, android.os.Bundle r35, boolean r36, java.lang.String r37, int r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 2859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.Ck(ml2.r0, android.content.Context, ml2.e4, android.os.Bundle, boolean, java.lang.String, int, java.lang.Object):void");
    }

    public static void Dj(ml2.r0 r0Var, ml2.f4 action, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, long j17, org.json.JSONObject jSONObject, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z17, java.lang.String str9, int i18, java.lang.Object obj) {
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        st2.h1 h1Var;
        gk2.e eVar;
        java.lang.String str13;
        java.lang.String str14 = (i18 & 2) != 0 ? null : str;
        java.lang.String str15 = (i18 & 4) != 0 ? null : str2;
        java.lang.String str16 = "";
        java.lang.Object canvasid = (i18 & 8) != 0 ? "" : str3;
        java.lang.Object aid = (i18 & 16) != 0 ? "" : str4;
        java.lang.Object uxinfo = (i18 & 32) != 0 ? "" : str5;
        int i19 = (i18 & 64) != 0 ? -1 : i17;
        long j18 = (i18 & 128) != 0 ? -1L : j17;
        org.json.JSONObject jSONObject2 = (i18 & 256) != 0 ? null : jSONObject;
        java.lang.String str17 = (i18 & 512) != 0 ? null : str6;
        java.lang.String str18 = (i18 & 1024) != 0 ? null : str7;
        java.lang.String str19 = (i18 & 2048) != 0 ? null : str8;
        long j19 = j18;
        boolean z18 = (i18 & 4096) != 0 ? false : z17;
        java.lang.String str20 = (i18 & 8192) != 0 ? null : str9;
        r0Var.getClass();
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(canvasid, "canvasid");
        int i27 = i19;
        kotlin.jvm.internal.o.g(aid, "aid");
        java.lang.String str21 = str14;
        kotlin.jvm.internal.o.g(uxinfo, "uxinfo");
        java.lang.String str22 = str15;
        java.lang.String str23 = str17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shop report reportCommerceAction action:");
        sb6.append(action);
        sb6.append(", requestid:");
        if (str20 == null) {
            gk2.e eVar2 = gk2.e.f272471n;
            if (eVar2 != null) {
                str10 = str20;
                str20 = ((mm2.c1) eVar2.a(mm2.c1.class)).P3;
            } else {
                str10 = str20;
                str20 = null;
            }
        } else {
            str10 = str20;
        }
        sb6.append(str20);
        sb6.append(", json:");
        sb6.append(jSONObject2);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", sb6.toString());
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        int ordinal = action.ordinal();
        int i28 = action.f327456d;
        if (ordinal != 0) {
            if (ordinal != 1) {
                boolean z19 = z18;
                if (ordinal == 2) {
                    if (str23 != null) {
                        jSONObject2.put("animate_url", str23);
                    }
                    if (str19 != null) {
                        jSONObject2.put("icon_url", str19);
                    }
                    if (str18 != null) {
                        jSONObject2.put("back_url", str18);
                    }
                    if (z19) {
                        jSONObject2.put("reason_type", 3);
                    }
                } else if (ordinal != 19) {
                    if (ordinal != 26) {
                        if (ordinal != 33) {
                            switch (ordinal) {
                                case 7:
                                case 8:
                                    r0Var.X = "";
                                    jSONObject2.put("type", i28);
                                    jSONObject2.put("canvasid", canvasid);
                                    jSONObject2.put("aid", aid);
                                    jSONObject2.put("uxinfo", uxinfo);
                                    break;
                            }
                        } else {
                            if (str19 != null) {
                                jSONObject2.put("icon_url", str19);
                            }
                            if (str18 != null) {
                                jSONObject2.put("back_url", str18);
                            }
                        }
                    } else if (z19) {
                        jSONObject2.put("reason_type", 3);
                    }
                } else if (str23 != null) {
                    jSONObject2.put("animate_url", str23);
                }
            }
            jSONObject2.put("type", i28);
            jSONObject2.put("canvasid", canvasid);
            jSONObject2.put("aid", aid);
            jSONObject2.put("uxinfo", uxinfo);
        } else {
            if (kotlin.jvm.internal.o.b(str22 == null ? "" : str22, r0Var.X)) {
                return;
            }
            r0Var.X = str22 == null ? "" : str22;
            jSONObject2.put("type", i28);
            jSONObject2.put("canvasid", canvasid);
            jSONObject2.put("aid", aid);
            jSONObject2.put("uxinfo", uxinfo);
        }
        jSONObject2.put("commerceAction", i28);
        if (u46.l.e(str21)) {
            str11 = str21;
        } else {
            str11 = str21;
            jSONObject2.put("session", str11);
        }
        if (u46.l.e(str22)) {
            str12 = str22;
        } else {
            str12 = str22;
            jSONObject2.put("productid", str12);
        }
        jSONObject2.put("clickid", p52.h.f352031p);
        jSONObject2.put("appid", p52.h.f352032q);
        jSONObject2.put("liveid", android.text.TextUtils.isEmpty(p52.h.f352033r) ? java.lang.Long.valueOf(r0Var.f327866e) : p52.h.f352033r);
        jSONObject2.put("shopwindowid", p52.h.f352034s);
        jSONObject2.put("sessionid", p52.h.f352035t);
        if (!jSONObject2.has("couponid") && (eVar = gk2.e.f272471n) != null && (str13 = ((mm2.f6) eVar.a(mm2.f6.class)).D) != null) {
            jSONObject2.put("couponid", str13);
        }
        p52.h.f352031p = "";
        p52.h.f352032q = "";
        p52.h.f352033r = "";
        p52.h.f352034s = "";
        p52.h.f352035t = "";
        if (i27 > 0) {
            jSONObject2.put("advertisement_type", i27);
        }
        if (j19 > 0) {
            jSONObject2.put("advertisement_id", j19);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ga0.class)) == null || (h1Var = ga0Var.f112668r) == null) {
            str16 = null;
        } else {
            r45.xv2 xv2Var = h1Var.n().f431117g;
            java.lang.String string = xv2Var != null ? xv2Var.getString(0) : null;
            if (string != null) {
                str16 = string;
            }
        }
        jSONObject2.put("tab_lv2", str16);
        hj(r0Var, ml2.b4.f327264s, jSONObject2.toString(), 0L, null, null, null, str10, null, 188, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportCommerceAction, action=");
        sb7.append(action.name());
        sb7.append(", shopSessionId=");
        sb7.append(str11);
        sb7.append(", productId=");
        sb7.append(str12);
        sb7.append(" couponId=");
        gk2.e eVar3 = gk2.e.f272471n;
        sb7.append(eVar3 != null ? ((mm2.f6) eVar3.a(mm2.f6.class)).D : null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", sb7.toString());
        if ((action == ml2.f4.f327432f || action == ml2.f4.f327435i || action == ml2.f4.f327437m) && str12 != null) {
            java.util.ArrayList arrayList = r0Var.B;
            if (!arrayList.contains(str12)) {
                arrayList.add(str12);
            }
        }
        if (action == ml2.f4.f327435i || action == ml2.f4.f327434h) {
            r0Var.W = true;
        }
    }

    public static void Fj(ml2.r0 r0Var, ml2.f4 action, cm2.k0 item, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        java.lang.String str2 = (i17 & 4) != 0 ? null : str;
        java.util.Map map2 = (i17 & 8) == 0 ? map : null;
        r0Var.getClass();
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(item, "item");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str3 = item.f43362x;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("couponid", str3);
        jSONObject.put("style", item.f43360v.getInteger(3));
        java.lang.String str4 = item.f43364z;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("discount", str4);
        java.lang.String str5 = item.F;
        jSONObject.put("condi", str5 != null ? str5 : "");
        jSONObject.put("c_type", item.f43363y);
        jSONObject.put("condi_type", item.f43360v.getInteger(14) != 1 ? 0 : 1);
        jSONObject.put("task_type", item.f43360v.getInteger(29));
        if (str2 == null) {
            str2 = "0";
        }
        jSONObject.put("click_result", str2);
        jSONObject.put("click_button_action", item.f43360v.getInteger(21));
        if (map2 != null) {
            for (java.util.Map.Entry entry : map2.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        Dj(r0Var, action, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportCommerceCouponAction json:" + jSONObject);
    }

    public static /* synthetic */ void Lj(ml2.r0 r0Var, ml2.j4 j4Var, java.lang.Boolean bool, com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            bool = null;
        }
        if ((i17 & 4) != 0) {
            eh0Var = com.tencent.mm.plugin.finder.live.plugin.eh0.f112416f;
        }
        r0Var.Kj(j4Var, bool, eh0Var);
    }

    public static void Oj(ml2.r0 r0Var, int i17, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.Integer num3, int i18, java.lang.Object obj) {
        java.lang.Integer num4 = (i18 & 2) != 0 ? null : num;
        java.lang.Integer num5 = (i18 & 4) != 0 ? null : num2;
        java.lang.Boolean bool2 = (i18 & 8) != 0 ? null : bool;
        java.lang.Integer num6 = (i18 & 16) == 0 ? num3 : null;
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (num4 != null) {
            jSONObject.put("audio_switch", num4.intValue());
        }
        if (num5 != null) {
            jSONObject.put("pause_status", num5.intValue());
        }
        if (num6 != null) {
            jSONObject.put("enter_mode", num6.intValue());
        }
        if (bool2 != null) {
            jSONObject.put("pop_window_type", bool2.booleanValue() ? 1 : 2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportFloatWindow21084 json:" + jSONObject);
        hj(r0Var, ml2.b4.f327225e2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public static /* synthetic */ void Rj(ml2.r0 r0Var, int i17, java.lang.String str, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            str = "";
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        r0Var.Qj(i17, str, i18);
    }

    public static /* synthetic */ void Uj(ml2.r0 r0Var, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = -1;
        }
        if ((i19 & 4) != 0) {
            str = null;
        }
        if ((i19 & 8) != 0) {
            str2 = null;
        }
        r0Var.Sj(i17, i18, str, str2);
    }

    public static void dk(ml2.r0 r0Var, int i17, java.util.Map map, int i18, java.lang.Object obj) {
        java.util.Set<java.util.Map.Entry> entrySet;
        java.util.Map map2 = (i18 & 2) != 0 ? null : map;
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (map2 != null && (entrySet = map2.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportInputAction: " + jSONObject);
        hj(r0Var, ml2.b4.R2, t17, 0L, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ek(ml2.r0 r12, ml2.p4 r13, java.lang.String r14, java.lang.String r15, int r16, org.json.JSONObject r17, int r18, java.lang.Object r19) {
        /*
            r0 = r12
            r1 = r13
            r2 = r18 & 4
            java.lang.String r3 = ""
            if (r2 == 0) goto La
            r2 = r3
            goto Lb
        La:
            r2 = r15
        Lb:
            r4 = r18 & 8
            r5 = 0
            if (r4 == 0) goto L12
            r4 = r5
            goto L14
        L12:
            r4 = r16
        L14:
            r6 = r18 & 16
            if (r6 == 0) goto L1a
            r6 = 0
            goto L1c
        L1a:
            r6 = r17
        L1c:
            r12.getClass()
            java.lang.String r7 = "type"
            kotlin.jvm.internal.o.g(r13, r7)
            java.lang.String r8 = "comment"
            kotlin.jvm.internal.o.g(r2, r8)
            int r8 = r13.ordinal()
            if (r8 == 0) goto L72
            r5 = 7
            r9 = 1
            if (r8 == r5) goto L6f
            r5 = 2
            if (r8 == r5) goto L6a
            r2 = 3
            if (r8 == r2) goto L5b
            r2 = 4
            if (r8 == r2) goto L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "reportLettery ERROR: "
            r2.<init>(r5)
            java.lang.String r5 = r13.name()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.mars.xlog.Log.e(r5, r2)
            goto L76
        L55:
            int r2 = r0.f327887x1
            int r2 = r2 + r9
            r0.f327887x1 = r2
            goto L76
        L5b:
            boolean r2 = r0.M1
            if (r2 == 0) goto La8
            java.lang.String r2 = r0.N1
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto La8
            java.lang.String r2 = r0.N1
            goto L77
        L6a:
            r0.M1 = r9
            r0.N1 = r2
            goto L76
        L6f:
            r0.f327890y1 = r9
            goto L76
        L72:
            r0.M1 = r5
            r0.N1 = r3
        L76:
            r2 = r14
        L77:
            if (r6 != 0) goto L7e
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L7e:
            int r1 = r1.f327809d
            r6.put(r7, r1)
            if (r2 != 0) goto L86
            goto L87
        L86:
            r3 = r2
        L87:
            java.lang.String r1 = "result"
            r6.put(r1, r3)
            if (r4 == 0) goto L94
            java.lang.String r1 = "ui_type"
            r6.put(r1, r4)
        L94:
            ml2.b4 r1 = ml2.b4.f327278y
            java.lang.String r2 = r6.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 0
            r0 = r12
            hj(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.ek(ml2.r0, ml2.p4, java.lang.String, java.lang.String, int, org.json.JSONObject, int, java.lang.Object):void");
    }

    public static void hj(ml2.r0 r0Var, ml2.b4 action, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.Object obj) {
        long j18 = (i17 & 4) != 0 ? -1L : j17;
        java.lang.String str7 = (i17 & 8) != 0 ? null : str2;
        java.lang.String str8 = (i17 & 16) != 0 ? "" : str3;
        java.lang.String str9 = (i17 & 32) != 0 ? "" : str4;
        java.lang.String str10 = (i17 & 64) != 0 ? null : str5;
        java.lang.String contextId = (i17 & 128) != 0 ? "" : str6;
        r0Var.getClass();
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        if (r0Var.Y != ml2.v1.f328141f || action == ml2.b4.f327240j3 || action == ml2.b4.J1) {
            r0Var.Di(action, str, j18, str7, str8, str9, str10, contextId);
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report21084, LIVE_STOPPED, do need to report !");
        }
    }

    public static /* synthetic */ void ik(ml2.r0 r0Var, ml2.n4 n4Var, ml2.s2 s2Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            s2Var = ml2.s2.f327919e;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        r0Var.hk(n4Var, s2Var, i17);
    }

    public static void mj(ml2.r0 r0Var, ml2.b4 action, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.Object obj) {
        long j18 = (i17 & 4) != 0 ? -1L : j17;
        java.lang.String str7 = (i17 & 8) != 0 ? null : str2;
        java.lang.String str8 = (i17 & 16) != 0 ? "" : str3;
        java.lang.String str9 = (i17 & 32) != 0 ? "" : str4;
        java.lang.String str10 = (i17 & 64) != 0 ? null : str5;
        java.lang.String contextId = (i17 & 128) != 0 ? "" : str6;
        r0Var.getClass();
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        r0Var.Di(action, str, j18, str7, str8, str9, str10, contextId);
    }

    public static void rj(ml2.r0 r0Var, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        java.lang.String str2 = (i18 & 2) != 0 ? null : str;
        r0Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("button_type", i17);
            if (str2 != null) {
                jSONObject.put("theme_content", str2);
            }
            hj(r0Var, ml2.b4.f327256p0, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void vk(ml2.r0 r0Var, int i17, java.util.Map map, int i18, java.lang.Object obj) {
        java.util.Set<java.util.Map.Entry> entrySet;
        java.util.Map map2 = (i18 & 2) != 0 ? null : map;
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (map2 != null && (entrySet = map2.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportInputAction: " + jSONObject);
        hj(r0Var, ml2.b4.Q2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final java.lang.String Ai(int i17, int i18, java.lang.Integer num, int i19, int i27, int i28) {
        cl0.g gVar = new cl0.g();
        gVar.o("user_type", i27);
        gVar.o("element", i19);
        gVar.o("type", i17);
        gVar.o(ya.b.SOURCE, i18);
        if (num != null) {
            gVar.o("identity", num.intValue());
        }
        gVar.o("display_type", i28);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r2.put("source_type", 1) == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aj(ml2.g5 r16, dk2.zf r17, int r18) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "action"
            kotlin.jvm.internal.o.g(r0, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "type"
            int r0 = r0.f327500d
            r2.put(r3, r0)
            java.lang.String r0 = "comment_display_type"
            r3 = r18
            r2.put(r0, r3)
            boolean r0 = r1 instanceof dk2.fg
            if (r0 == 0) goto L25
            r0 = r1
            dk2.fg r0 = (dk2.fg) r0
            goto L26
        L25:
            r0 = 0
        L26:
            java.lang.String r1 = "source_type"
            if (r0 == 0) goto L44
            jz5.l r0 = r0.q()
            if (r0 == 0) goto L44
            zl2.r4 r3 = zl2.r4.f473950a
            java.lang.Object r4 = r0.f302833d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.f302834e
            com.tencent.mm.protobuf.g r0 = (com.tencent.mm.protobuf.g) r0
            r3.O(r2, r4, r0)
            r0 = 1
            org.json.JSONObject r0 = r2.put(r1, r0)
            if (r0 != 0) goto L48
        L44:
            r0 = 2
            r2.put(r1, r0)
        L48:
            ml2.b4 r4 = ml2.b4.L
            java.lang.String r5 = r2.toString()
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 252(0xfc, float:3.53E-43)
            r14 = 0
            r3 = r15
            hj(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.Aj(ml2.g5, dk2.zf, int):void");
    }

    public final void Ak(int i17, java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportOuterFastCommentAction: " + jSONObject);
        hj(this, ml2.b4.Y2, t17, 0L, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017 A[Catch: Exception -> 0x0012, LOOP:0: B:5:0x0017->B:7:0x001d, LOOP_START, TryCatch #0 {Exception -> 0x0012, blocks: (B:16:0x0007, B:18:0x000d, B:5:0x0017, B:7:0x001d), top: B:15:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map Bi(android.os.Bundle r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 == 0) goto L14
            java.util.Set r1 = r5.keySet()     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L14
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L12
            goto L15
        L12:
            r5 = move-exception
            goto L32
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L49
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L12
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Exception -> L12
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L12
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L12
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L12
            goto L17
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "buildActionResult err:"
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.mars.xlog.Log.w(r1, r5)
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.Bi(android.os.Bundle):java.util.Map");
    }

    public final void Bk(int i17, dk2.ja locMsg) {
        kotlin.jvm.internal.o.g(locMsg, "locMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        r45.ze2 ze2Var = locMsg.f233655k;
        jSONObject2.put("city", ze2Var.getString(2));
        jSONObject2.put("poiName", ze2Var.getString(3));
        jSONObject2.put("poiAddress", ze2Var.getString(4));
        jSONObject2.put("poiClassifyId", ze2Var.getString(5));
        jSONObject.put(ya.b.LOCATION, jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject3, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportInputAction: " + jSONObject);
        hj(this, ml2.b4.D2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void Cj(ml2.g5 action, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", action);
        if (num != null) {
            num.intValue();
            jSONObject.put("notice_type", num.intValue());
        }
        jSONObject.put("user_identity", g92.b.f269769e.k2().getInteger(4));
        hj(this, ml2.b4.L, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(62:1|(1:3)(1:226)|4|(1:6)(1:225)|7|(1:11)|12|(1:224)(1:16)|(1:18)|(1:223)(1:22)|(1:24)(1:222)|25|(8:27|(1:29)|30|(1:32)(1:220)|33|(1:35)(1:219)|(1:218)(1:39)|(1:217))(1:221)|43|(41:47|48|(1:214)(4:52|(2:53|(4:55|(1:211)(2:59|(2:61|(1:64)(1:63)))|210|(0)(0))(2:212|213))|65|(5:67|(1:69)|70|(1:72)(1:75)|(1:74)))|76|77|78|(1:80)(1:207)|(2:82|(1:84))(1:206)|85|(1:87)|88|(1:90)|91|(1:205)(1:95)|96|(1:98)(1:204)|99|(1:203)(1:107)|(1:109)(1:202)|110|(1:112)(1:201)|113|(1:115)(1:200)|(1:(1:198)(1:199))(1:118)|119|(1:196)|123|(1:125)|126|(2:128|(3:130|(1:132)|133))(2:190|(3:192|(1:194)|195))|134|(1:136)(1:189)|137|(3:139|(1:187)|143)(1:188)|144|(1:146)|147|(1:186)(1:151)|(1:153)(1:185)|154|(18:156|(1:158)|159|(1:161)|162|(1:164)|165|(1:167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)(1:183)|180|181)(1:184))|215|48|(1:50)|214|76|77|78|(0)(0)|(0)(0)|85|(0)|88|(0)|91|(1:93)|205|96|(0)(0)|99|(1:101)|203|(0)(0)|110|(0)(0)|113|(0)(0)|(0)|(0)(0)|119|(1:121)|196|123|(0)|126|(0)(0)|134|(0)(0)|137|(0)(0)|144|(0)|147|(1:149)|186|(0)(0)|154|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01e6, code lost:
    
        r6 = new org.json.JSONObject();
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192 A[LOOP:0: B:53:0x0162->B:63:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0 A[EDGE_INSN: B:64:0x01a0->B:65:0x01a0 BREAK  A[LOOP:0: B:53:0x0162->B:63:0x0192], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di(ml2.b4 r24, java.lang.String r25, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.Di(ml2.b4, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void Dk(ml2.d4 action) {
        kotlin.jvm.internal.o.g(action, "action");
        hj(this, ml2.b4.f327268u, java.lang.String.valueOf(action.f327366d), 0L, null, null, null, null, null, 252, null);
    }

    public final void Ej(ml2.f4 action, java.util.List itemList, java.lang.String tlsMessage) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(itemList, "itemList");
        kotlin.jvm.internal.o.g(tlsMessage, "tlsMessage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        java.util.Iterator it = itemList.iterator();
        while (it.hasNext()) {
            cm2.k0 k0Var = (cm2.k0) it.next();
            java.lang.String str = k0Var.f43362x;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(";");
            sb7.append(k0Var.f43360v.getInteger(3));
            sb7.append(";");
            java.lang.String str3 = k0Var.f43364z;
            if (str3 == null) {
                str3 = "";
            }
            sb8.append(str3);
            sb8.append(";");
            java.lang.String str4 = k0Var.F;
            if (str4 != null) {
                str2 = str4;
            }
            sb9.append(str2);
            sb9.append(";");
            sb10.append(k0Var.f43363y);
            sb10.append(";");
            sb11.append(k0Var.f43360v.getInteger(21));
            sb11.append(";");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("couponid", r26.n0.Y(sb6, ";").toString());
        jSONObject.put("style", r26.n0.Y(sb7, ";").toString());
        jSONObject.put("discount", r26.n0.Y(sb8, ";").toString());
        jSONObject.put("condi", r26.n0.Y(sb9, ";").toString());
        jSONObject.put("c_type", r26.n0.Y(sb10, ";").toString());
        jSONObject.put("click_button_action", r26.n0.Y(sb11, ";").toString());
        jSONObject.put("tls_message", tlsMessage);
        Dj(this, action, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportCommerceCouponAction json:" + jSONObject);
    }

    public void Ek(ml2.f5 type, ml2.e5 src, boolean z17, int i17) {
        java.lang.String valueOf;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(src, "src");
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportRedPacket, type=");
        int i18 = type.f327467d;
        sb6.append(i18);
        sb6.append(", src");
        int i19 = src.f327393d;
        sb6.append(i19);
        sb6.append(", inLive=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellLiveVisitorReoprter", sb6.toString());
        switch (type.ordinal()) {
            case 3:
                this.Q1 = z17;
                if (!z17) {
                    return;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!this.Q1) {
                    return;
                }
                break;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i18);
        if (src == ml2.e5.f327389e) {
            valueOf = java.lang.String.valueOf(this.P1.f327393d);
        } else {
            this.P1 = src;
            valueOf = java.lang.String.valueOf(i19);
        }
        jSONObject.put(ya.b.SOURCE, valueOf);
        if (i17 != 0) {
            jSONObject.put("ui_type", i17);
        }
        hj(this, ml2.b4.D, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public void Fk(java.lang.String str, ml2.j5 type, java.util.Map actionResult) {
        int i17;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(actionResult, "actionResult");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (!u46.l.e(str)) {
            jSONObject.put(dm.i4.COL_USERNAME, str);
        }
        jSONObject.put("type", type.f327634d);
        try {
            for (java.lang.String str2 : actionResult.keySet()) {
                jSONObject.put(str2, (java.lang.String) actionResult.get(str2));
            }
        } catch (java.lang.Throwable unused) {
        }
        boolean z17 = false;
        java.lang.String wi6 = c01.e2.S(str) ? wi(this.M, "is_enterprise", 1) : wi(this.M, "is_enterprise", 0);
        if (type == ml2.j5.f327632g) {
            p52.c cVar = p52.h.f352016a;
            p52.h.f352019d = null;
        }
        hj(this, ml2.b4.f327249n, jSONObject.toString(), 0L, null, null, wi6, null, null, 220, null);
        if (type != ml2.j5.f327630e) {
            if (type == ml2.j5.f327631f) {
                this.f327888y++;
                return;
            }
            return;
        }
        if (str != null) {
            i17 = 1;
            if (r26.n0.B(str, "@chatroom", false)) {
                z17 = true;
            }
        } else {
            i17 = 1;
        }
        if (z17) {
            this.A += i17;
        } else {
            this.f327891z += i17;
        }
    }

    public final void Gj(ml2.f4 action, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        if (jSONObject != null) {
            jSONObject.put("commerceAction", action.f327456d);
        }
        hj(this, ml2.b4.f327264s, jSONObject != null ? jSONObject.toString() : null, 0L, jSONObject2 != null ? jSONObject2.toString() : null, null, null, str, null, 180, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "shop report reportCommerceReplayAction, requestId:" + str + ", actionResult:" + jSONObject);
    }

    public final void Gk(java.lang.String userId, int i17, java.lang.String boxId) {
        kotlin.jvm.internal.o.g(userId, "userId");
        kotlin.jvm.internal.o.g(boxId, "boxId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("user_id", userId);
        jSONObject.put("is_group_box", i17);
        jSONObject.put("group_box_number", boxId);
        hj(this, ml2.b4.f327245l3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void Hj(java.lang.String str, ml2.r1 source) {
        kotlin.jvm.internal.o.g(source, "source");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_USERNAME, str == null ? "" : str);
        jSONObject.put(ya.b.SOURCE, source.f327895d);
        hj(this, ml2.b4.f327233h, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        this.F++;
    }

    public final void Hk(ml2.u4 action) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", action.f328114d);
        hj(this, ml2.b4.f327219b3, jSONObject.toString(), 0L, null, null, null, null, null, 244, null);
    }

    public final void Ij(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 > 0) {
            jSONObject.put("type", i17);
        }
        jSONObject.put("barrage_type", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        hj(this, ml2.b4.R1, jSONObject2, 0L, null, null, null, null, null, 252, null);
    }

    public final void Ik(boolean z17, int i17) {
        int i18;
        ml2.q3 q3Var;
        this.J1 = true;
        if (z17) {
            i18 = i17;
        } else {
            this.I1 = true;
            if (i17 == 0) {
                i18 = 2;
            } else {
                if (i17 != 1) {
                    com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwitchScreen err:screenAction=" + i17);
                    return;
                }
                i18 = 1;
            }
        }
        if (i18 != 1) {
            if (i18 != 2) {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwitchScreen err:isAuto=" + z17 + ",screenAction=" + i17);
                return;
            }
            if (!z17) {
                this.f327886x0++;
                q3Var = ml2.q3.f327846e;
            } else if (this.I1) {
                this.I1 = false;
                return;
            } else {
                this.f327889y0++;
                q3Var = ml2.q3.f327847f;
            }
        } else if (!z17) {
            this.f327871l1++;
            q3Var = ml2.q3.f327848g;
        } else if (this.I1) {
            this.I1 = false;
            return;
        } else {
            this.f327877p1++;
            q3Var = ml2.q3.f327849h;
        }
        if (q3Var == ml2.q3.f327849h || q3Var == ml2.q3.f327848g) {
            this.f327876p0 = ml2.t3.f328016f;
        } else {
            ml2.q3 q3Var2 = ml2.q3.f327847f;
            if (q3Var == q3Var2 || q3Var == q3Var2) {
                this.f327876p0 = ml2.t3.f328015e;
            }
        }
        hj(this, ml2.b4.f327272w, java.lang.String.valueOf(q3Var.f327851d), 0L, null, null, null, null, null, 252, null);
        ml2.t3 t3Var = this.f327876p0;
        ml2.t3 t3Var2 = ml2.t3.f328015e;
        if (t3Var == t3Var2) {
            this.f327876p0 = ml2.t3.f328016f;
        } else if (t3Var == ml2.t3.f328016f) {
            this.f327876p0 = t3Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.f292564q == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jj(java.lang.String r6, long r7) {
        /*
            r5 = this;
            java.lang.String r0 = "hashCode"
            kotlin.jvm.internal.o.g(r6, r0)
            im2.t6 r0 = ml2.s0.a()
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.f292564q
            r2 = 1
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct
            r0.<init>()
            java.lang.Class<n30.r> r3 = n30.r.class
            i95.m r3 = i95.n0.c(r3)
            n30.r r3 = (n30.r) r3
            m30.m r3 = (m30.m) r3
            r3.getClass()
            java.lang.String r3 = b52.b.b()
            java.lang.String r4 = ""
            if (r3 != 0) goto L2e
            r3 = r4
        L2e:
            r0.q(r3)
            java.lang.String r3 = "1002"
            r0.r(r3)
            if (r2 == 0) goto L3b
            java.lang.String r4 = "194"
            goto L4e
        L3b:
            java.lang.Class<n30.q> r3 = n30.q.class
            i95.m r3 = i95.n0.c(r3)
            n30.q r3 = (n30.q) r3
            m30.m r3 = (m30.m) r3
            r3.getClass()
            java.lang.String r3 = a52.a.f1584l
            if (r3 != 0) goto L4d
            goto L4e
        L4d:
            r4 = r3
        L4e:
            r0.p(r4)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "is_scan"
            r3.put(r4, r2)
            java.lang.String r7 = pm0.v.u(r7)
            java.lang.String r8 = "liveid"
            r3.put(r8, r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            java.lang.String r8 = ","
            java.lang.String r2 = ";"
            java.lang.String r7 = r26.i0.t(r7, r8, r2, r1)
            r0.s(r7)
            ml2.b1 r7 = ml2.b1.f327211a
            ml2.a1 r8 = new ml2.a1
            r8.<init>(r6, r0)
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.r0.Jj(java.lang.String, long):void");
    }

    public final void Jk(int i17, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("duration", j17);
        hj(this, ml2.b4.f327221c3, jSONObject.toString(), 0L, null, null, null, null, null, 244, null);
    }

    public final void Kj(ml2.j4 type, java.lang.Boolean bool, com.tencent.mm.plugin.finder.live.plugin.eh0 fromScene) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327629d);
        if (bool != null) {
            jSONObject.put("ispaid", !bool.booleanValue() ? 1 : 0);
        }
        jSONObject.put("isgift", fromScene != com.tencent.mm.plugin.finder.live.plugin.eh0.f112417g ? 0 : 1);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, fromScene.f112423d);
        hj(this, ml2.b4.Q, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void Kk(int i17) {
        hj(this, ml2.b4.G, java.lang.String.valueOf(i17), 0L, null, null, null, null, null, 252, null);
    }

    public final void Lk(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("bubble_type", i18);
        hj(this, ml2.b4.Y1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void Mj(boolean z17, ml2.z1 floatType) {
        kotlin.jvm.internal.o.g(floatType, "floatType");
        ml2.z1 z1Var = ml2.z1.f328332f;
        if (floatType == z1Var) {
            this.f327890y1 = false;
        }
        long c17 = c01.id.c();
        if (z17) {
            if (this.S) {
                return;
            }
            long j17 = this.N;
            if (j17 > 0) {
                long j18 = c17 - j17;
                long j19 = this.Q;
                if (j18 <= 0) {
                    j18 = 0;
                }
                this.Q = j19 + j18;
                this.N = 0L;
            }
            this.P = c17;
            this.S = true;
            this.f327885x++;
        } else {
            if (!this.S) {
                return;
            }
            long j27 = this.P;
            if (j27 > 0) {
                long j28 = c17 - j27;
                long j29 = this.R;
                if (j28 <= 0) {
                    j28 = 0;
                }
                this.R = j29 + j28;
                this.P = 0L;
            }
            this.N = c17;
            this.S = false;
        }
        if (floatType == ml2.z1.f328331e) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            if (a52.a.f1586n) {
                floatType = ml2.z1.f328336m;
            } else if (this.W) {
                floatType = ml2.z1.f328335i;
                this.W = false;
            } else {
                floatType = ml2.z1.f328334h;
            }
        } else if (floatType == z1Var) {
            this.W = false;
        }
        if (this.Z) {
            floatType = ml2.z1.f328337n;
            this.Z = false;
        }
        hj(this, ml2.b4.f327246m, java.lang.String.valueOf(floatType.f328340d), 0L, null, null, null, null, null, 252, null);
    }

    public final void Mk(java.lang.String actionResult) {
        kotlin.jvm.internal.o.g(actionResult, "actionResult");
        hj(this, ml2.b4.f327275x0, actionResult, 0L, null, null, null, null, null, 252, null);
    }

    public final com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni(long j17) {
        java.util.HashMap hashMap = this.S1;
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct finderLiveCdnUserEnterLiveTimeCostStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct) hashMap.get(java.lang.Long.valueOf(j17));
        if (finderLiveCdnUserEnterLiveTimeCostStruct != null) {
            return finderLiveCdnUserEnterLiveTimeCostStruct;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct finderLiveCdnUserEnterLiveTimeCostStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct();
        finderLiveCdnUserEnterLiveTimeCostStruct2.f57086e = j17;
        hashMap.put(java.lang.Long.valueOf(j17), finderLiveCdnUserEnterLiveTimeCostStruct2);
        return finderLiveCdnUserEnterLiveTimeCostStruct2;
    }

    public final void Nj(boolean z17, int i17, long j17, int i18, int i19, long j18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_type", i17);
        dk2.ef efVar = dk2.ef.f233372a;
        java.lang.Integer num = dk2.ef.F;
        jSONObject.put("enter_mode", num != null ? num.intValue() : 0);
        jSONObject.put("windows_type", i18);
        jSONObject.put("liveid_type", i19);
        if (i17 == 2 || i17 == 3) {
            jSONObject.put("stay_time", j17);
            jSONObject.put("watch_time", j18 > 0 ? j18 : 0L);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportFloatMode 21084, enterMode=");
        sb6.append(dk2.ef.F);
        sb6.append(" action:");
        sb6.append(z17 ? ml2.b4.f327257p1 : ml2.b4.f327243l1);
        sb6.append(", chnlExtra:");
        sb6.append(jSONObject);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", sb6.toString());
        hj(this, z17 ? ml2.b4.f327257p1 : ml2.b4.f327243l1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void Nk(java.lang.String pagId, java.lang.String pgUdfKv) {
        kotlin.jvm.internal.o.g(pagId, "pagId");
        kotlin.jvm.internal.o.g(pgUdfKv, "pgUdfKv");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderBroadcastPageInStruct.q(b17);
        finderBroadcastPageInStruct.r(pagId);
        finderBroadcastPageInStruct.s(r26.i0.t(pgUdfKv, ",", ";", false));
        finderBroadcastPageInStruct.p(pagId);
        finderBroadcastPageInStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22946, contextid = " + finderBroadcastPageInStruct.f56558i + ", page_id = " + finderBroadcastPageInStruct.f56554e + ", commentScene = " + finderBroadcastPageInStruct.f56563n + ", struct.pg_udf_kv = " + finderBroadcastPageInStruct.f56561l);
    }

    public final void Ok(java.lang.String pagId, java.lang.String pgUdfKv) {
        kotlin.jvm.internal.o.g(pagId, "pagId");
        kotlin.jvm.internal.o.g(pgUdfKv, "pgUdfKv");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderBroadcastPageOutStruct.q(b17);
        finderBroadcastPageOutStruct.r(pagId);
        finderBroadcastPageOutStruct.s(r26.i0.t(pgUdfKv, ",", ";", false));
        finderBroadcastPageOutStruct.p(pagId);
        finderBroadcastPageOutStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22946, contextid = " + finderBroadcastPageOutStruct.f56570i + ", page_id = " + finderBroadcastPageOutStruct.f56566e + ", commentScene = " + finderBroadcastPageOutStruct.f56574m + ", struct.pg_udf_kv = " + finderBroadcastPageOutStruct.f56573l);
    }

    public final void Pj(ml2.a2 action, boolean z17) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("focus_types", z17 ? 2 : 1);
        hj(this, ml2.b4.B, java.lang.String.valueOf(action.f327202d), 0L, jSONObject.toString(), null, null, null, null, 244, null);
    }

    public final void Pk(int i17, int i18, int i19, java.lang.String audienceFinderUsername) {
        int i27;
        kotlin.jvm.internal.o.g(audienceFinderUsername, "audienceFinderUsername");
        cl0.g gVar = new cl0.g();
        int i28 = 3;
        boolean z17 = false;
        if (i19 == 0 || i19 == 1) {
            ml2.k2[] k2VarArr = ml2.k2.f327647d;
            i27 = 3;
        } else if (i19 == 2) {
            ml2.k2[] k2VarArr2 = ml2.k2.f327647d;
            i27 = 2;
        } else if (i19 != 3) {
            i27 = 0;
        } else {
            ml2.k2[] k2VarArr3 = ml2.k2.f327647d;
            i27 = 1;
        }
        if (i18 == 1) {
            ml2.j2[] j2VarArr = ml2.j2.f327610d;
            i28 = 1;
        } else if (i18 == 2) {
            ml2.j2[] j2VarArr2 = ml2.j2.f327610d;
            i28 = 2;
        } else if (i18 != 3) {
            i28 = 0;
        } else {
            ml2.j2[] j2VarArr3 = ml2.j2.f327610d;
        }
        gVar.s("result", java.lang.Integer.valueOf(i17));
        gVar.s("type", java.lang.Integer.valueOf(i27));
        gVar.s(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i28));
        if (!(audienceFinderUsername.length() == 0)) {
            gVar.s("audience_finder_username", audienceFinderUsername);
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null && w0Var.X()) {
                z17 = true;
            }
            gVar.s("operate_role", java.lang.Integer.valueOf(z17 ? 2 : 1));
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            gVar.s("to_operate_role", java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(c1Var != null ? c1Var.f328852o : null, audienceFinderUsername) ? 1 : 2));
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        hj(this, ml2.b4.N, gVar2, 0L, null, null, null, null, null, 252, null);
    }

    public final void Qj(int i17, java.lang.String appid, int i18) {
        kotlin.jvm.internal.o.g(appid, "appid");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i17 == 5 || i17 == 6 || i17 == 7) {
            jSONObject.put("appid", appid);
        }
        if (i17 == 6) {
            jSONObject.put("error", i18);
        }
        hj(this, ml2.b4.f327276x1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportGameRank 21084 type:" + i17 + ", appid:" + appid + ", error:" + i18);
    }

    public final void Qk(ml2.e4 value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (value == ml2.e4.f327376e || this.K1 != ml2.e4.f327379h) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "setquitLiveType " + value);
            this.K1 = value;
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "setquitLiveType " + value + ", but CloseTypeKickedOut");
    }

    public final long Ri(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f327879r;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (l17 != null) {
            return l17.longValue();
        }
        long c17 = c01.id.c();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "LiveKeyReport1# getEnterSessionId not exist, add new, liveId:" + pm0.v.u(j17) + ", enterSessionId:" + c17);
        concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17));
        return c17;
    }

    public final void Rk(org.json.JSONObject chnlExtra) {
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "updateVisitorBaseChnlExtra chnlExtra: " + chnlExtra + " liveVisitorBaseChnlExtra: " + this.L);
        org.json.JSONObject jSONObject = this.L;
        if (jSONObject == null) {
            this.L = chnlExtra;
        } else {
            this.L = bj(chnlExtra, jSONObject);
        }
    }

    public final void Sj(int i17, int i18, java.lang.String str, java.lang.String str2) {
        ml2.b4 b4Var = ml2.b4.E;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i18 > 0) {
            jSONObject.put("money", i18);
        }
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            jSONObject.put("errmsg", str);
        }
        hj(this, b4Var, jSONObject.toString(), 0L, null, null, str2, null, null, 220, null);
    }

    public final void Tj(java.lang.String actionResult) {
        kotlin.jvm.internal.o.g(actionResult, "actionResult");
        hj(this, ml2.b4.E, actionResult, 0L, null, null, null, null, null, 252, null);
    }

    public final java.lang.String Ui(long j17, java.lang.String mScene, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(mScene, "mScene");
        if (com.tencent.mm.sdk.platformtools.t8.K0(mScene) || r26.n0.B(mScene, "temp", false)) {
            str2 = "";
        } else {
            str2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Zi(j17, java.lang.Integer.parseInt(mScene), str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = this.f327881t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSessionBuf error ");
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            sb6.append(b52.b.q(j17));
            sb6.append(" feedId:");
            n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
            long j18 = this.f327869h;
            ((m30.m) rVar).getClass();
            sb6.append(b52.b.q(j18));
            sb6.append(" mScene:");
            sb6.append(mScene);
            sb6.append(" result");
            sb6.append(str2.length());
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellLiveVisitorReoprter", sb6.toString());
        }
        return r26.i0.t(str2, ",", ";", false);
    }

    public final void Vi(long j17, int i17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markHasMicInfo " + j17);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni = Ni(j17);
        Ni.f57086e = j17;
        Ni.f57092k = i17;
    }

    public final void Vj(ml2.d2 type, com.tencent.mm.protobuf.g gVar, int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327354d);
        java.lang.String i18 = gVar != null ? gVar.i() : null;
        if (i18 == null) {
            i18 = "";
        }
        jSONObject.put("extra_info", i18);
        if (i17 != 0) {
            jSONObject.put("ui_type", i17);
        }
        hj(this, ml2.b4.U, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public void Wj(ml2.h5 type, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = type.ordinal();
        if (ordinal == 2) {
            p52.h.f352025j = java.lang.String.valueOf(this.f327878q);
            p52.h.f352026k = currentTimeMillis;
            this.G1 += i17;
        } else if (ordinal == 3 || ordinal == 5) {
            p52.h.f352025j = java.lang.String.valueOf(this.f327878q);
            p52.h.f352026k = currentTimeMillis;
        } else if (ordinal == 6) {
            if (i17 != 0 || this.O1) {
                return;
            } else {
                this.O1 = true;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327543d);
        jSONObject.put("giftid", str);
        jSONObject.put("num", i17);
        hj(this, ml2.b4.f327282z, jSONObject.toString(), currentTimeMillis, null, null, null, null, null, 248, null);
    }

    public void Xj(ml2.h5 type, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327543d);
        jSONObject.put("giftid", str);
        jSONObject.put("num", i17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            if (str2 != null) {
                jSONObject.put("animate_url", str2);
            }
            if (str4 != null) {
                jSONObject.put("icon_url", str4);
            }
            if (str3 != null) {
                jSONObject.put("back_url", str3);
            }
        } else if (ordinal == 2) {
            p52.h.f352025j = java.lang.String.valueOf(this.f327878q);
            p52.h.f352026k = currentTimeMillis;
            this.G1 += i17;
        } else if (ordinal == 3 || ordinal == 5) {
            p52.h.f352025j = java.lang.String.valueOf(this.f327878q);
            p52.h.f352026k = currentTimeMillis;
        } else if (ordinal != 6) {
            if (ordinal == 16) {
                if (str4 != null) {
                    jSONObject.put("icon_url", str4);
                }
                if (str3 != null) {
                    jSONObject.put("back_url", str3);
                }
            } else if (ordinal == 17 && str2 != null) {
                jSONObject.put("animate_url", str2);
            }
        } else if (i17 != 0 || this.O1) {
            return;
        } else {
            this.O1 = true;
        }
        hj(this, ml2.b4.f327282z, jSONObject.toString(), currentTimeMillis, null, null, null, null, null, 248, null);
    }

    public final void Yj(ml2.f2 type, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327428d);
        jSONObject.put("giftid", giftId);
        hj(this, ml2.b4.S, java.lang.String.valueOf(jSONObject), 0L, null, null, null, null, null, 252, null);
    }

    public final void Zi(long j17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markMicLaunched " + j17);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni = Ni(j17);
        Ni.f57086e = j17;
        Ni.f57093l = c01.id.c();
    }

    public final void Zj(ml2.y1 action, long j17, long j18, int i17) {
        java.lang.String q17;
        java.lang.String q18;
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.autogen.mmdata.rpt.FinderAudienceHistoryLiveActionLogStruct finderAudienceHistoryLiveActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAudienceHistoryLiveActionLogStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderAudienceHistoryLiveActionLogStruct.f56510d = finderAudienceHistoryLiveActionLogStruct.b("contextid", b17, true);
        finderAudienceHistoryLiveActionLogStruct.f56511e = action.f328251d;
        if (j17 == -1) {
            q17 = java.lang.String.valueOf(j17);
        } else {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            q17 = b52.b.q(j17);
        }
        finderAudienceHistoryLiveActionLogStruct.f56512f = finderAudienceHistoryLiveActionLogStruct.b("liveid", q17, true);
        if (j18 == -1) {
            q18 = java.lang.String.valueOf(j18);
        } else {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            q18 = b52.b.q(j18);
        }
        finderAudienceHistoryLiveActionLogStruct.f56513g = finderAudienceHistoryLiveActionLogStruct.b("feedid", q18, true);
        finderAudienceHistoryLiveActionLogStruct.f56514h = finderAudienceHistoryLiveActionLogStruct.b(ya.b.INDEX, java.lang.String.valueOf(i17), true);
        finderAudienceHistoryLiveActionLogStruct.f56515i = java.lang.System.currentTimeMillis();
        finderAudienceHistoryLiveActionLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23432, action=" + finderAudienceHistoryLiveActionLogStruct.f56511e + ", liveid=" + finderAudienceHistoryLiveActionLogStruct.f56512f + ", feedid=" + finderAudienceHistoryLiveActionLogStruct.f56513g + ", index=" + finderAudienceHistoryLiveActionLogStruct.f56514h + ", actionts_new=" + finderAudienceHistoryLiveActionLogStruct.f56515i + ", contextid=" + finderAudienceHistoryLiveActionLogStruct.f56510d);
    }

    public final void aj(long j17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markPlayerConnect " + j17);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni = Ni(j17);
        Ni.f57086e = j17;
        if (Ni.f57089h == 0) {
            Ni.f57089h = c01.id.c();
        }
    }

    public final void ak(int i17, int i18, java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", i18);
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportInputAction: " + jSONObject);
        hj(this, ml2.b4.A2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final org.json.JSONObject bj(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        if (jSONObject == null && jSONObject2 != null) {
            return jSONObject2;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return jSONObject;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        return jSONObject2;
    }

    public final void bk(boolean z17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("actionType", z17 ? 2 : 1);
        jSONObject2.put("WxaGameReportInfo", jSONObject);
        hj(this, ml2.b4.K, java.net.URLEncoder.encode(jSONObject2.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), 0L, null, null, null, null, null, 252, null);
    }

    public final void cj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z17, java.lang.String str4, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("content", java.net.URLEncoder.encode(str == null ? "" : str, com.tencent.mapsdk.internal.rv.f51270c));
        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, java.net.URLEncoder.encode(str2 == null ? "" : str2, com.tencent.mapsdk.internal.rv.f51270c));
        if (str3 != null) {
            jSONObject.put("grade", java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c));
        }
        if (z17) {
            jSONObject.put("is_group_box", "1");
        } else {
            jSONObject.put("is_group_box", "0");
        }
        jSONObject.put("group_box_number", str4);
        jSONObject.put("has_emoji", zl2.r4.f473950a.p1(str != null ? str : "") ? 1 : 0);
        jSONObject.put("has_at", ((num != null && num.intValue() == 20034) || (num != null && num.intValue() == 20032)) ? 1 : 0);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSendMsg: " + jSONObject);
        hj(this, ml2.b4.f327227f, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void ck(boolean z17, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exposeClick", z17 ? 2 : 1);
        jSONObject.put("bizuin", str == null ? "" : str);
        jSONObject.put("bizusername", str2 != null ? str2 : "");
        hj(this, ml2.b4.I, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void fj(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "onLiveMicModeChange liveMode: " + i17 + " liveSubMode: " + i18);
        if (i17 == 2) {
            mm2.a aVar = this.V;
            mm2.a aVar2 = this.T;
            mm2.a aVar3 = this.U;
            if (i18 == 1) {
                aVar3.c();
                mm2.a.b(aVar2, false, 1, null);
                mm2.a.b(aVar, false, 1, null);
                return;
            }
            if (i18 != 2) {
                if (i18 == 8) {
                    aVar.c();
                    mm2.a.b(aVar2, false, 1, null);
                    mm2.a.b(aVar3, false, 1, null);
                    return;
                } else if (i18 != 16) {
                    return;
                }
            }
            aVar2.c();
            mm2.a.b(aVar3, false, 1, null);
            mm2.a.b(aVar, false, 1, null);
        }
    }

    public final void fk(int i17, java.lang.String qualificatId) {
        kotlin.jvm.internal.o.g(qualificatId, "qualificatId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("qualificat_id", qualificatId);
        hj(this, ml2.b4.f327220c2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void gk(int i17, boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("emojinum", "1");
        jSONObject.put("is_expo_head_portrait", z17 ? "1" : "0");
        hj(this, ml2.b4.f327230g, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        this.f327884w++;
    }

    public final void hk(ml2.n4 action, ml2.s2 linkeType, int i17) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(linkeType, "linkeType");
        int ordinal = action.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    this.A1++;
                } else {
                    java.util.ArrayList arrayList = this.C1;
                    if (ordinal == 4) {
                        this.E1 = true;
                        this.B1++;
                        if (linkeType != ml2.s2.f327919e) {
                            this.F1 = linkeType;
                        }
                        arrayList.add(nm5.j.d(this.F1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
                    } else if (ordinal == 7 || ordinal == 8) {
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportLinkMic, action=" + action.name() + ", gLinkMicTimeList=" + arrayList.size() + ", activeCloselinkMic=" + this.D1);
                        this.E1 = false;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (-1 >= size) {
                                break;
                            }
                            java.lang.Object obj = arrayList.get(size);
                            kotlin.jvm.internal.o.f(obj, "get(...)");
                            nm5.c cVar = (nm5.c) obj;
                            java.lang.Object a17 = cVar.a(0);
                            int ordinal2 = action.ordinal();
                            if (a17 == (ordinal2 != 7 ? ordinal2 != 8 ? ml2.s2.f327919e : ml2.s2.f327921g : ml2.s2.f327920f)) {
                                java.lang.Object a18 = cVar.a(1);
                                kotlin.jvm.internal.o.f(a18, "$2(...)");
                                if (((java.lang.Number) a18).longValue() > 0 && kotlin.jvm.internal.o.b(cVar.a(2), java.lang.Boolean.FALSE)) {
                                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                                    java.lang.Object a19 = cVar.a(1);
                                    kotlin.jvm.internal.o.f(a19, "$2(...)");
                                    long longValue = (currentTimeMillis - ((java.lang.Number) a19).longValue()) / 1000;
                                    if (longValue >= 0) {
                                        arrayList.set(size, nm5.j.d(cVar.a(0), java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE));
                                        break;
                                    }
                                }
                            }
                            size--;
                        }
                        if (!this.D1) {
                            return;
                        } else {
                            this.D1 = false;
                        }
                    } else if (ordinal == 9) {
                        if (i17 != 0 || this.L1) {
                            return;
                        } else {
                            this.L1 = true;
                        }
                    }
                }
            } else if (this.E1) {
                return;
            }
            hj(this, ml2.b4.A, java.lang.String.valueOf(action.f327764d), 0L, null, null, null, null, null, 252, null);
        }
    }

    public void ij(long j17, long j18, java.lang.String anchorFinderUsername, java.lang.String commentScene, int i17, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct finderAudienceActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderAudienceActionLogStruct.f56487d = finderAudienceActionLogStruct.b("LiveID", b52.b.q(j17), true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderAudienceActionLogStruct.f56488e = finderAudienceActionLogStruct.b("FeedID", b52.b.q(j18), true);
        finderAudienceActionLogStruct.f56489f = finderAudienceActionLogStruct.b("UserName", this.f327867f, true);
        finderAudienceActionLogStruct.f56491h = finderAudienceActionLogStruct.b("CommentScene", commentScene, true);
        finderAudienceActionLogStruct.f56492i = this.f327874o;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderAudienceActionLogStruct.f56493j = finderAudienceActionLogStruct.b("ContextId", b52.b.b(), true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderAudienceActionLogStruct.f56494k = finderAudienceActionLogStruct.b("ClickTabContextId", c17, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderAudienceActionLogStruct.f56495l = finderAudienceActionLogStruct.b("SessionID", Ri, true);
        finderAudienceActionLogStruct.D = finderAudienceActionLogStruct.b("chnl_extra", str2 != null ? r26.i0.t(str2, ",", ";", false) : null, true);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        finderAudienceActionLogStruct.f56507x = context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2 ? 2L : 1L;
        finderAudienceActionLogStruct.f56503t = currentTimeMillis;
        finderAudienceActionLogStruct.f56504u = i17;
        finderAudienceActionLogStruct.f56505v = finderAudienceActionLogStruct.b("ActionResult", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        finderAudienceActionLogStruct.f56506w = ml2.j0.f327583i.e(finderAudienceActionLogStruct.f56491h, this.f327873n);
        finderAudienceActionLogStruct.f56507x = this.f327876p0.f328018d;
        finderAudienceActionLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report21084FromOutside, liveId=" + finderAudienceActionLogStruct.f56487d + ", feedId=" + finderAudienceActionLogStruct.f56488e + ", username=" + finderAudienceActionLogStruct.f56489f + ", topic=" + finderAudienceActionLogStruct.f56490g + ", commentScene=" + finderAudienceActionLogStruct.f56491h + ", isPrivate=" + finderAudienceActionLogStruct.f56492i + ", contextId=" + finderAudienceActionLogStruct.f56493j + ", clickTabContextId=" + finderAudienceActionLogStruct.f56494k + ", sessionId=" + finderAudienceActionLogStruct.f56495l + ", sessionBuffer=" + finderAudienceActionLogStruct.f56496m + ", shopPermit=" + finderAudienceActionLogStruct.f56497n + ", enterSessionId=" + finderAudienceActionLogStruct.f56498o + ", liveTime=" + finderAudienceActionLogStruct.f56499p + ", floatDuration=" + finderAudienceActionLogStruct.f56501r + ", fullDuration=" + finderAudienceActionLogStruct.f56500q + ", enterStatus=" + finderAudienceActionLogStruct.f56502s + ", actionTS=" + finderAudienceActionLogStruct.f56503t + ", action=" + finderAudienceActionLogStruct.f56504u + ", enterIconType=" + finderAudienceActionLogStruct.f56506w + ", pageType=" + finderAudienceActionLogStruct.f56507x + ", adData=" + finderAudienceActionLogStruct.f56508y + ", scenenote=" + finderAudienceActionLogStruct.f56509z + ", identityType=" + finderAudienceActionLogStruct.A + ", request_id=" + finderAudienceActionLogStruct.B + ", actionStyle=" + finderAudienceActionLogStruct.F + ", actionResult=" + finderAudienceActionLogStruct.f56505v + ", couponId=" + finderAudienceActionLogStruct.G + ", chnlExtra=" + finderAudienceActionLogStruct.D);
    }

    public final void jk(int i17, java.lang.String activeId) {
        kotlin.jvm.internal.o.g(activeId, "activeId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("active_id", activeId);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        hj(this, ml2.b4.F1, r26.i0.t(jSONObject2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
    }

    public final void kk(ml2.t1 elementClickId, java.lang.String username, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(elementClickId, "elementClickId");
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        hashMap.put("highlight_txt", str == null ? "" : str);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        zy2.zb.T8(zbVar, elementClickId, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveDataDetailV2Click report23059, elementExposeId=" + elementClickId.f328013d + ", liveid = " + ((java.lang.String) hashMap.get("liveid")));
    }

    public final void lk(ml2.u1 elementExposeId, java.lang.String username, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(elementExposeId, "elementExposeId");
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        hashMap.put("highlight_txt", str == null ? "" : str);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        zy2.zb.I8(zbVar, elementExposeId, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveDataDetailV2Exposed report23057, elementExposeId=" + elementExposeId.f328108d + ", liveid = " + ((java.lang.String) hashMap.get("liveId")));
    }

    public final void mk(ml2.t1 elementClickId, java.lang.String username, long j17, java.util.HashMap hashMap) {
        kotlin.jvm.internal.o.g(elementClickId, "elementClickId");
        kotlin.jvm.internal.o.g(username, "username");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, elementClickId, hashMap, b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndMilestoneCardItemClick report23059, elementClickId=" + elementClickId.f328013d + ", liveid = " + ((java.lang.String) hashMap.get("liveId")));
    }

    public void nj(ml2.i5 action, java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, long j18, int i18, java.lang.String str10) {
        byte[] bArr;
        kotlin.jvm.internal.o.g(action, "action");
        if (ml2.i5.f327574i == action) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            a52.a.f1582j = true;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct finderLiveNoticeLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct();
        finderLiveNoticeLogStruct.f57186d = finderLiveNoticeLogStruct.b("FinderUsrName", str == null ? "" : str, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderLiveNoticeLogStruct.f57187e = finderLiveNoticeLogStruct.b("FinderSessionId", Ri, true);
        finderLiveNoticeLogStruct.f57188f = java.lang.System.currentTimeMillis();
        finderLiveNoticeLogStruct.f57189g = action.f327581d;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveNoticeLogStruct.f57190h = finderLiveNoticeLogStruct.b("EnterLiveId", b52.b.q(j17), true);
        finderLiveNoticeLogStruct.f57191i = i17;
        finderLiveNoticeLogStruct.f57202t = finderLiveNoticeLogStruct.b("sessionBuffer", str10, true);
        finderLiveNoticeLogStruct.f57192j = finderLiveNoticeLogStruct.b("commentscene", str2 == null ? "" : str2, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderLiveNoticeLogStruct.f57193k = finderLiveNoticeLogStruct.b("contextid", b17, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderLiveNoticeLogStruct.f57194l = finderLiveNoticeLogStruct.b("ClickTabContextId", c17, true);
        finderLiveNoticeLogStruct.f57195m = finderLiveNoticeLogStruct.b("AdData", r26.i0.v(p52.h.f352016a.b(finderLiveNoticeLogStruct.f57186d), ",", ";", false, 4, null), true);
        java.lang.String str11 = this.H1;
        finderLiveNoticeLogStruct.f57196n = finderLiveNoticeLogStruct.b("Scenenote", str11 != null ? r26.i0.t(str11, ",", ";", false) : "", true);
        if (str3 != null) {
            if (str3.length() > 0) {
                finderLiveNoticeLogStruct.f57197o = finderLiveNoticeLogStruct.b("ForcePushId", str3, true);
            }
        }
        java.lang.String e17 = so2.o2.f410517f.a().e(j18, str9);
        finderLiveNoticeLogStruct.f57198p = l17 != null ? l17.longValue() : 0L;
        finderLiveNoticeLogStruct.f57199q = finderLiveNoticeLogStruct.b("NotificationId", str5 == null ? "" : str5, true);
        finderLiveNoticeLogStruct.f57200r = finderLiveNoticeLogStruct.b("ReportContent", str4 == null ? "" : str4, true);
        if (str6 != null) {
            bArr = str6.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        finderLiveNoticeLogStruct.f57203u = finderLiveNoticeLogStruct.b("Description", android.util.Base64.encodeToString(bArr, 0), true);
        finderLiveNoticeLogStruct.f57204v = finderLiveNoticeLogStruct.b("Scene", str7 != null ? r26.i0.t(str7, ",", ";", false) : "", true);
        finderLiveNoticeLogStruct.f57206x = finderLiveNoticeLogStruct.b("NoticeID", str8, true);
        finderLiveNoticeLogStruct.f57205w = finderLiveNoticeLogStruct.b("chnlExtra", e17 != null ? r26.i0.t(e17, ",", ";", false) : null, true);
        finderLiveNoticeLogStruct.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report21158, finderUsrName=");
        sb6.append(finderLiveNoticeLogStruct.f57186d);
        sb6.append(", finderSessionId=");
        sb6.append(finderLiveNoticeLogStruct.f57187e);
        sb6.append(", actionTimeMs=");
        sb6.append(finderLiveNoticeLogStruct.f57188f);
        sb6.append(", actionType=");
        sb6.append(finderLiveNoticeLogStruct.f57189g);
        sb6.append(", enterLiveId=");
        sb6.append(finderLiveNoticeLogStruct.f57190h);
        sb6.append(", enterStatus=");
        sb6.append(finderLiveNoticeLogStruct.f57191i);
        sb6.append(", commentscene=");
        sb6.append(finderLiveNoticeLogStruct.f57192j);
        sb6.append(", contextid=");
        sb6.append(finderLiveNoticeLogStruct.f57193k);
        sb6.append(", adData=");
        sb6.append(finderLiveNoticeLogStruct.f57195m);
        sb6.append(", scenenote=");
        sb6.append(finderLiveNoticeLogStruct.f57196n);
        sb6.append(", scene=");
        sb6.append(finderLiveNoticeLogStruct.f57204v);
        sb6.append(", clickTabContextId=");
        sb6.append(finderLiveNoticeLogStruct.f57194l);
        sb6.append(", forcePushId=");
        java.lang.String str12 = finderLiveNoticeLogStruct.f57197o;
        sb6.append(str12 != null ? str12 : "");
        sb6.append(",clickTabContextId=");
        sb6.append(finderLiveNoticeLogStruct.f57194l);
        sb6.append(",notificationId=");
        sb6.append(finderLiveNoticeLogStruct.f57199q);
        sb6.append(",reportContent=");
        sb6.append(finderLiveNoticeLogStruct.f57200r);
        sb6.append(",noticetype=");
        sb6.append(finderLiveNoticeLogStruct.f57198p);
        sb6.append(",chnlExtra=");
        sb6.append(finderLiveNoticeLogStruct.f57205w);
        sb6.append(",description=");
        sb6.append(finderLiveNoticeLogStruct.f57203u);
        sb6.append(", noticeId=");
        sb6.append(finderLiveNoticeLogStruct.f57206x);
        sb6.append(", sessionBuffer=");
        sb6.append(finderLiveNoticeLogStruct.f57202t);
        sb6.append(", ");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", sb6.toString());
    }

    public final void nk(ml2.u1 elementExposeId, java.lang.String username, long j17, java.util.HashMap hashMap) {
        kotlin.jvm.internal.o.g(elementExposeId, "elementExposeId");
        kotlin.jvm.internal.o.g(username, "username");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.I8(zbVar, elementExposeId, hashMap, b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndMilestoneCardItemExposed report23057, elementExposeId=" + elementExposeId.f328108d + ", liveid = " + ((java.lang.String) hashMap.get("liveId")));
    }

    public final void oj(int i17, java.lang.String feedId, java.lang.String liveId) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        com.tencent.mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct enterFinderLiveFromRedDotReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct();
        enterFinderLiveFromRedDotReportStruct.f56096d = 1L;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        enterFinderLiveFromRedDotReportStruct.f56102j = enterFinderLiveFromRedDotReportStruct.b("ContextId", b17, true);
        enterFinderLiveFromRedDotReportStruct.f56097e = i17;
        enterFinderLiveFromRedDotReportStruct.f56098f = enterFinderLiveFromRedDotReportStruct.b("FeedID", feedId, true);
        enterFinderLiveFromRedDotReportStruct.f56099g = enterFinderLiveFromRedDotReportStruct.b("LiveID", liveId, true);
        enterFinderLiveFromRedDotReportStruct.f56100h = enterFinderLiveFromRedDotReportStruct.b("RedDotTipsID", L0 != null ? L0.field_tipsId : null, true);
        if (L0 != null) {
            org.json.JSONObject g17 = pm0.b0.g(L0.W0());
            g17.put("object_id", pm0.v.u(L0.W0().getLong(0)));
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            enterFinderLiveFromRedDotReportStruct.f56103k = enterFinderLiveFromRedDotReportStruct.b("ReportExtInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        enterFinderLiveFromRedDotReportStruct.f56101i = enterFinderLiveFromRedDotReportStruct.b("SessionID", Ri != null ? Ri : "", true);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report " + enterFinderLiveFromRedDotReportStruct.n());
        enterFinderLiveFromRedDotReportStruct.k();
    }

    public final void ok(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put(dm.i4.COL_USERNAME, userName);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.J1, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", username = " + ((java.lang.String) hashMap.get(dm.i4.COL_USERNAME)));
    }

    public final void pj(ml2.c4 action, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int ordinal = action.ordinal();
        if (ordinal == 0) {
            jSONObject.put("type", 1);
        } else if (ordinal == 1) {
            jSONObject.put("type", 2);
            jSONObject.put("username_type", i17);
            jSONObject.put(dm.i4.COL_USERNAME, str);
        } else if (ordinal == 2) {
            jSONObject.put("type", 3);
            jSONObject.put("username_type", i17);
            jSONObject.put(dm.i4.COL_USERNAME, str);
        } else if (ordinal == 3) {
            jSONObject.put("type", 4);
            jSONObject.put("username_type", i17);
            jSONObject.put(dm.i4.COL_USERNAME, str);
        }
        hj(this, ml2.b4.U1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void pk(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put(dm.i4.COL_USERNAME, userName);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.E1, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", username = " + ((java.lang.String) hashMap.get(dm.i4.COL_USERNAME)));
    }

    public final void qj(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("button_type", i17);
            hj(this, ml2.b4.Y, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void qk() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1002");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.H1, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndRecommendLiveMoreExposed report23057, page_id = " + ((java.lang.String) hashMap.get("page_id")) + '}');
    }

    public final void rk(ml2.t1 elementId, java.lang.String finderUsrName, java.lang.String liveId, java.lang.String lotteryId, int i17) {
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(finderUsrName, "finderUsrName");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", finderUsrName);
        hashMap.put("liveId", liveId);
        hashMap.put("lottery_id", lotteryId);
        hashMap.put("source_type", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, elementId, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, LotteryPrivateClicked reportMap = " + hashMap);
    }

    public final void sj(int i17, int i18, int i19) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("model_type", i17);
            jSONObject.put("click_type", i18);
            jSONObject.put("card_index", i19);
            hj(this, ml2.b4.Z, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void sk(ml2.u1 elementId, java.lang.String finderUsrName, java.lang.String liveId, java.lang.String lotteryId, int i17) {
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(finderUsrName, "finderUsrName");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", finderUsrName);
        hashMap.put("liveId", liveId);
        hashMap.put("lottery_id", lotteryId);
        hashMap.put("source_type", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, elementId, hashMap, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, LotteryPrivateExposed reportMap = " + hashMap);
    }

    public final void tj(int i17, java.util.List list, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.METHOD, i17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put((java.lang.String) it.next());
                }
            }
            jSONObject.put("user_list", jSONArray);
            if (str == null || str.length() == 0) {
                jSONObject.put("is_group_box", "0");
            } else {
                jSONObject.put("is_group_box", "1");
                jSONObject.put("group_box_number", str);
            }
            hj(this, ml2.b4.f327242k3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void tk(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("service_type", i17);
        jSONObject.put("commerceAction", 1015);
        hj(this, ml2.b4.f327264s, java.lang.String.valueOf(jSONObject), 0L, null, null, null, null, null, 252, null);
    }

    public final void uj(boolean z17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("jump_type", z17 ? "mmbiz_profile" : "findervideo_profile");
        hj(this, ml2.b4.T, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void uk(org.json.JSONObject action) {
        kotlin.jvm.internal.o.g(action, "action");
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null) {
            int c76 = ((mm2.c1) eVar.a(mm2.c1.class)).c7();
            if (c76 == 1) {
                action.put("house_manager_identity", "2");
            } else if (c76 == 2) {
                action.put("house_manager_identity", "3");
            } else if (c76 == 3) {
                action.put("house_manager_identity", "1");
            }
        }
        java.lang.String jSONObject = action.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        hj(this, ml2.b4.C1, r26.i0.t(jSONObject, ",", ";", false), 0L, null, null, null, null, null, 252, null);
    }

    public final void vj(ml2.g5 action, int i17, java.lang.String boxId, java.lang.String likeComment) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(likeComment, "likeComment");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_group_box", i17);
        jSONObject.put("group_box_number", boxId);
        jSONObject.put("like_comment", likeComment);
        ml2.b4 b4Var = ml2.b4.L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(action);
        sb6.append(';');
        sb6.append(jSONObject);
        hj(this, b4Var, sb6.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final java.lang.String wi(java.lang.String str, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        if (str == null) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put(key, obj);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "append ChatFields err: " + e17.getMessage());
            return str;
        }
    }

    public final void wj(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.String jSONObject = json.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        hj(this, ml2.b4.f327283z1, r26.i0.t(jSONObject, ",", ";", false), 0L, null, null, null, null, null, 252, null);
    }

    public void wk(boolean z17, boolean z18) {
        if (z17) {
            if (z18) {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.B2, null, null, null, null, null, false, 126, null);
                return;
            } else {
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.T8((zy2.zb) c18, ml2.t1.C2, null, null, null, null, null, false, 126, null);
                return;
            }
        }
        if (z18) {
            i95.m c19 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.I8((zy2.zb) c19, ml2.u1.f328086t2, null, null, null, null, null, false, 126, null);
        } else {
            i95.m c27 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            zy2.zb.I8((zy2.zb) c27, ml2.u1.f328089u2, null, null, null, null, null, false, 126, null);
        }
    }

    public final void xj(ml2.n1 result, int i17) {
        kotlin.jvm.internal.o.g(result, "result");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", result.f327731d);
        jSONObject.put("screen_type", i17);
        hj(this, ml2.b4.F, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void xk(java.lang.Integer num, int i17, ml2.s3 event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        boolean z17 = true;
        this.f327876p0 = i17 != 1 ? i17 != 2 ? ml2.t3.f328015e : ml2.t3.f328016f : ml2.t3.f328015e;
        if (this.J1) {
            this.J1 = false;
            return;
        }
        if (num != null && num.intValue() == 0) {
            int ordinal = event.ordinal();
            if (ordinal == 0) {
                z17 = false;
            } else if (ordinal != 1 && ordinal != 2) {
                throw new jz5.j();
            }
            if (z17) {
                hj(this, ml2.b4.f327270v, "", 0L, null, null, null, null, null, 252, null);
            }
        }
    }

    public final void yj(ml2.b4 action, int i17, long j17) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("duration", j17);
        hj(this, action, java.lang.String.valueOf(i17), 0L, jSONObject.toString(), null, null, null, null, 244, null);
    }

    public final void yk(int i17, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (str != null) {
            jSONObject.put("user_username", str);
        }
        if (num != null) {
            jSONObject.put("user_identity", num.intValue());
        }
        if (num2 != null) {
            jSONObject.put("before_user_identity", num2.intValue());
        }
        if (str2 != null) {
            jSONObject.put("before_user_username", str2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        hj(this, ml2.b4.f327228f2, r26.i0.t(jSONObject2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
    }

    public final void zj(ml2.o1 action) {
        kotlin.jvm.internal.o.g(action, "action");
        hj(this, ml2.b4.f327252o, java.lang.String.valueOf(action.f327771d), 0L, null, null, null, null, null, 252, null);
        if (action != ml2.o1.f327768f) {
            this.C++;
        }
    }
}
