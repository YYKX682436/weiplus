package il4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a */
    public static final il4.l f292142a = new il4.l();

    /* renamed from: b */
    public static final jz5.g f292143b = jz5.h.b(il4.g.f292136d);

    /* renamed from: c */
    public static final jz5.g f292144c = jz5.h.b(il4.h.f292137d);

    /* renamed from: d */
    public static java.lang.Boolean f292145d;

    /* renamed from: e */
    public static java.lang.String f292146e;

    public static final java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n07 == null) {
            return "";
        }
        java.lang.String c17 = n07.c();
        if (c17 == null || c17.length() == 0) {
            c17 = n07.d();
        }
        return c17 == null ? "" : c17;
    }

    public static final java.lang.String e(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        return f(context, i17, true);
    }

    public static final java.lang.String f(android.content.Context context, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = !g(i17) ? context.getString(com.tencent.mm.R.string.jyz) : context.getString(com.tencent.mm.R.string.jyh);
        kotlin.jvm.internal.o.d(string);
        if (!z17) {
            return string;
        }
        return "[" + string + ']';
    }

    public static final boolean g(int i17) {
        if (j(i17)) {
            return true;
        }
        if (i17 == 4) {
            return true;
        }
        if (i17 == 2) {
            return true;
        }
        if (i17 == 100 || i17 == 105) {
            return true;
        }
        return i17 == 101;
    }

    public static final boolean i(int i17) {
        if (!(i17 == 100 || i17 == 105)) {
            if (!(i17 == 102)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(int i17) {
        return i17 == 3;
    }

    public static final boolean k(int i17) {
        if (i17 == 1) {
            return true;
        }
        if (i17 == 102) {
            return true;
        }
        return i17 == 103;
    }

    public static final boolean l(int i17) {
        if (k(i17)) {
            return true;
        }
        return i17 == 7 || i17 == 8;
    }

    public static final boolean m(int i17) {
        bw5.a80 a80Var;
        if (i17 == 5 || i17 == 6) {
            return false;
        }
        switch (i17) {
            case 1:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MUSIC;
                break;
            case 2:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_ARTICLE;
                break;
            case 3:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_ARTICLE_AUDIO;
                break;
            case 4:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_FINDER;
                break;
            case 5:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LIVE;
                break;
            case 6:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_BROADCAST;
                break;
            case 7:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MV_V2;
                break;
            case 8:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MV_BIZ;
                break;
            case 9:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_CHAT_TTS;
                break;
            case 10:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_CHATROOM_TTS;
                break;
            default:
                switch (i17) {
                    case 100:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_FILE;
                        break;
                    case 101:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_WEAPP;
                        break;
                    case 102:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_FILE;
                        break;
                    case 103:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_WEAPP;
                        break;
                    case 104:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_AUDIO_URL;
                        break;
                    case 105:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_RECORD_FILE;
                        break;
                    case 106:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MUSIC_CHORUS_MV;
                        break;
                    default:
                        a80Var = null;
                        break;
                }
        }
        return a80Var != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bc, code lost:
    
        if ((r0 != null && r0.f35022i[1]) == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02cc, code lost:
    
        if (r0 != null) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v31, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v11, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r13v13, types: [fm4.f] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v24, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(il4.e r12, boolean r13, android.content.Context r14, bw5.lp0 r15) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il4.l.p(il4.e, boolean, android.content.Context, bw5.lp0):void");
    }

    public static /* synthetic */ void q(il4.e eVar, boolean z17, android.content.Context context, bw5.lp0 lp0Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            context = null;
        }
        if ((i17 & 8) != 0) {
            lp0Var = null;
        }
        p(eVar, z17, context, lp0Var);
    }

    public final bw5.o50 a(bw5.mb0 simPlayInfo, bw5.xa0 xa0Var) {
        kotlin.jvm.internal.o.g(simPlayInfo, "simPlayInfo");
        bw5.o50 o50Var = new bw5.o50();
        o50Var.k(simPlayInfo.f30151e);
        o50Var.i(simPlayInfo.b());
        o50Var.j(simPlayInfo.f30152f);
        o50Var.f30957e = simPlayInfo.getName();
        boolean[] zArr = o50Var.L1;
        zArr[2] = true;
        o50Var.Q = simPlayInfo.f30159p[6] ? simPlayInfo.f30155i : "";
        zArr[36] = true;
        o50Var.f30960h = simPlayInfo.c();
        zArr[5] = true;
        o50Var.f30972t = simPlayInfo.f30156m;
        zArr[14] = true;
        if (xa0Var != null) {
            o50Var.f30979y = xa0Var;
            zArr[19] = true;
        }
        return o50Var;
    }

    public final bw5.o50 b(java.lang.String simplePlayableInfoBuff, bw5.xa0 xa0Var) {
        kotlin.jvm.internal.o.g(simplePlayableInfoBuff, "simplePlayableInfoBuff");
        try {
            bw5.mb0 parseFrom = new bw5.mb0().parseFrom(android.util.Base64.decode(simplePlayableInfoBuff, 0));
            kotlin.jvm.internal.o.d(parseFrom);
            return a(parseFrom, xa0Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMusicUtils", "tingItemFromListenPlayableInfoBuff ex " + e17.getMessage());
            return null;
        }
    }

    public final java.lang.Object c(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.d50 d50Var = new bw5.d50();
        d50Var.f26328e = str;
        d50Var.f26336p[4] = true;
        byte[] byteArray = d50Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listencategories";
        lVar.f70667d = 6264;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new il4.k(new kotlin.jvm.internal.c0(), nVar), false);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(android.content.Context context) {
        return (context instanceof qk.c9) && ((qk.c9) context).getF109514v();
    }

    public final bw5.mb0 n(bw5.o50 categoryItem) {
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        bw5.mb0 mb0Var = new bw5.mb0();
        mb0Var.f30151e = categoryItem.f30964n;
        boolean[] zArr = mb0Var.f30159p;
        zArr[2] = true;
        mb0Var.f30150d = categoryItem.c();
        zArr[1] = true;
        mb0Var.f30152f = categoryItem.S;
        zArr[3] = true;
        mb0Var.f30153g = categoryItem.getName();
        zArr[4] = true;
        mb0Var.f30155i = categoryItem.L1[36] ? categoryItem.Q : "";
        zArr[6] = true;
        mb0Var.f30154h = categoryItem.d();
        zArr[5] = true;
        mb0Var.f30156m = categoryItem.f30972t;
        zArr[7] = true;
        return mb0Var;
    }

    public final bw5.xa0 o(java.lang.String simplePlayableInfoBuff) {
        kotlin.jvm.internal.o.g(simplePlayableInfoBuff, "simplePlayableInfoBuff");
        try {
            return new bw5.xa0().parseFrom(android.util.Base64.decode(simplePlayableInfoBuff, 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMusicUtils", "recommendInfoFromBuffer ex " + e17.getMessage());
            return null;
        }
    }

    public final bw5.v70 r(bw5.lb0 simPlayInfo, bw5.xa0 xa0Var) {
        kotlin.jvm.internal.o.g(simPlayInfo, "simPlayInfo");
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(simPlayInfo.f29714e);
        v70Var.u(simPlayInfo.getListenId());
        boolean[] zArr = simPlayInfo.f29724r;
        v70Var.x(zArr[3] ? simPlayInfo.f29715f : "");
        v70Var.r(simPlayInfo.f29718i);
        v70Var.p(zArr[4] ? simPlayInfo.f29716g : "");
        v70Var.q(simPlayInfo.b());
        java.lang.String c17 = simPlayInfo.c();
        kotlin.jvm.internal.o.f(c17, "getFinderFeedId(...)");
        if (c17.length() > 0) {
            java.lang.String d17 = simPlayInfo.d();
            kotlin.jvm.internal.o.f(d17, "getFinderNonceId(...)");
            if (d17.length() > 0) {
                bw5.e70 e70Var = new bw5.e70();
                e70Var.e(simPlayInfo.c());
                e70Var.d(simPlayInfo.d());
                v70Var.s(e70Var);
            }
        }
        if (xa0Var != null) {
            v70Var.f34190f = xa0Var;
            v70Var.Q.put(3, java.lang.Boolean.TRUE);
        }
        return v70Var;
    }
}
