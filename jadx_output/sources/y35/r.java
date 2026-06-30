package y35;

/* loaded from: classes11.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f459232a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f459233b;

    /* renamed from: c, reason: collision with root package name */
    public int f459234c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459235d;

    /* renamed from: e, reason: collision with root package name */
    public long f459236e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f459237f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459238g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459240i;

    /* renamed from: j, reason: collision with root package name */
    public r45.dz3 f459241j;

    public static y35.r a(android.content.Context context, long j17, boolean z17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i18) {
        y35.r rVar = new y35.r();
        rVar.f459236e = j17;
        rVar.f459237f = !z17;
        if (i17 == 0) {
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + str);
                return null;
            }
            rVar.f459232a = str3;
            rVar.f459235d = str4;
            if (i18 == 4) {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.b1s);
            } else if (i18 == 10 || i18 == 11) {
                com.tencent.mm.autogen.events.FMsgGetNameEvent fMsgGetNameEvent = new com.tencent.mm.autogen.events.FMsgGetNameEvent();
                am.l9 l9Var = fMsgGetNameEvent.f54229g;
                l9Var.f7230a = str5;
                l9Var.f7231b = str6;
                fMsgGetNameEvent.e();
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str8 = fMsgGetNameEvent.f54230h.f7330a;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr[0] = str8 != null ? str8 : "";
                rVar.f459233b = context.getString(com.tencent.mm.R.string.b1v, objArr);
            } else if (i18 == 31) {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.f490858b24);
            } else if (i18 != 32) {
                switch (i18) {
                    case 58:
                    case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                    case 60:
                        com.tencent.mm.storage.y8.i(str2);
                        rVar.f459233b = context.getString(com.tencent.mm.R.string.b1t);
                        break;
                    default:
                        rVar.f459233b = context.getString(com.tencent.mm.R.string.b1x);
                        break;
                }
            } else {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.b1y);
            }
        } else if (z17) {
            com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str2);
            rVar.f459239h = f17.H;
            rVar.f459240i = f17.I;
            rVar.f459232a = str3;
            rVar.f459235d = str4;
            if (str7 == null || str7.trim().equals("")) {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.hbd);
            } else {
                rVar.f459233b = str7;
            }
        } else if (i17 == 1 || i17 == 2 || i17 == 3) {
            boolean b17 = com.tencent.mm.sdk.platformtools.aa.b(str2, "msg", null);
            if (b17) {
                com.tencent.mm.storage.e9 f18 = com.tencent.mm.storage.e9.f(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.FMessageProvider", "fmsgTalker = %s, verifygetusernmae = %s, fmsgType = %s, fmsgContent = %s", str, f18.f193859a, java.lang.Integer.valueOf(i17), str2);
                rVar.f459235d = f18.f193861c;
                java.lang.String str9 = f18.f193864f;
                if (str9 == null || com.tencent.mm.sdk.platformtools.t8.K0(str9.trim())) {
                    rVar.f459233b = "";
                    com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "fmsgContent = %s", str2);
                } else {
                    rVar.f459233b = f18.f193864f;
                }
                rVar.f459239h = f18.H;
                rVar.f459240i = f18.I;
                rVar.f459232a = str;
            } else {
                rVar.f459232a = str;
                rVar.f459233b = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.FMessageProvider", "fmsgTalker = %s, fmsgType = %s, fmsgContent = %s, isStartMsgXml = %s.", str, java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(b17));
            }
        } else {
            rVar.f459232a = str;
            rVar.f459233b = str2;
        }
        return rVar;
    }

    public static y35.r b(android.content.Context context, com.tencent.mm.storage.m7 m7Var) {
        return a(context, m7Var.field_fmsgSysRowId, m7Var.field_fmsgIsSend % 2 == 0, m7Var.field_talker, m7Var.field_fmsgContent, m7Var.field_fmsgType, m7Var.field_contentFromUsername, m7Var.field_contentNickname, m7Var.field_contentPhoneNumMD5, m7Var.field_contentFullPhoneNumMD5, m7Var.field_contentVerifyContent, m7Var.field_addScene);
    }

    public static y35.r c(android.content.Context context, com.tencent.mm.storage.p7 p7Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.dz3 dz3Var;
        int i17;
        java.lang.String str5;
        long j17 = p7Var.systemRowid;
        boolean u07 = p7Var.u0();
        java.lang.String str6 = p7Var.field_talker;
        java.lang.String str7 = p7Var.field_msgContent;
        int i18 = p7Var.field_type;
        java.lang.String str8 = null;
        if (i18 == 0) {
            com.tencent.mm.storage.y8 i19 = com.tencent.mm.storage.y8.i(str7);
            str5 = i19.f196358a;
            str = i19.f196359b;
            str2 = i19.f196365h;
            str3 = i19.f196366i;
            str4 = null;
            dz3Var = null;
            i17 = i19.f196364g;
        } else {
            r45.dz3 g17 = str7 != null ? com.tencent.mm.storage.e9.g(com.tencent.mm.sdk.platformtools.aa.d(str7, "msg", null)) : null;
            if (u07) {
                com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(str7);
                java.lang.String str9 = f17.f193859a;
                java.lang.String str10 = f17.f193861c;
                str4 = f17.f193864f;
                dz3Var = g17;
                i17 = 0;
                str5 = str9;
                str2 = null;
                str8 = f17.C == 1 ? f17.E : null;
                str = str10;
                str3 = null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                dz3Var = g17;
                i17 = 0;
                str5 = null;
            }
        }
        y35.r a17 = a(context, j17, u07, str6, str7, i18, str5, str, str2, str3, str4, i17);
        a17.f459238g = str8;
        a17.f459241j = dz3Var;
        return a17;
    }

    public static y35.r d(android.content.Context context, com.tencent.mm.storage.pa paVar) {
        java.lang.String str = paVar.field_talker;
        int i17 = paVar.field_scene;
        y35.r rVar = new y35.r();
        rVar.f459236e = paVar.systemRowid;
        int i18 = paVar.field_isSend;
        rVar.f459237f = i18 == 1;
        rVar.f459232a = paVar.field_sayhiuser;
        rVar.f459234c = i17;
        if (i18 == 1) {
            rVar.f459233b = paVar.field_content;
        } else {
            com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(paVar.field_content);
            java.lang.String str2 = f17.f193864f;
            if (str2 == null || str2.trim().equals("")) {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.f490860b26);
            } else {
                rVar.f459233b = f17.f193864f;
            }
            rVar.f459235d = f17.f193861c;
        }
        return rVar;
    }

    public static y35.r e(android.content.Context context, dm.f7 f7Var) {
        java.lang.String str = f7Var.field_sayhiuser;
        int i17 = f7Var.field_scene;
        y35.r rVar = new y35.r();
        rVar.f459236e = f7Var.systemRowid;
        int i18 = f7Var.field_isSend;
        rVar.f459237f = i18 == 1;
        rVar.f459232a = str;
        rVar.f459234c = i17;
        if (i18 == 1) {
            rVar.f459233b = f7Var.field_content;
        } else {
            com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(f7Var.field_content);
            java.lang.String str2 = f17.f193864f;
            if (str2 == null || str2.trim().equals("")) {
                rVar.f459233b = context.getString(com.tencent.mm.R.string.f490860b26);
            } else {
                rVar.f459233b = f17.f193864f;
            }
            rVar.f459235d = f17.f193861c;
        }
        return rVar;
    }

    public static com.tencent.mm.storage.z3 f(com.tencent.mm.storage.p7 p7Var) {
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        if (p7Var == null) {
            return z3Var;
        }
        if (p7Var.field_type != 0) {
            com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(p7Var.field_msgContent);
            com.tencent.mm.storage.z3 z3Var2 = new com.tencent.mm.storage.z3();
            z3Var2.X1(f17.f193859a);
            z3Var2.k1(f17.f193860b);
            z3Var2.M1(f17.f193861c);
            z3Var2.R1(f17.f193863e);
            z3Var2.S1(f17.f193862d);
            z3Var2.g3(f17.f193873o);
            z3Var2.h3(f17.f193874p);
            z3Var2.b3(f17.d());
            z3Var2.L2(f17.a());
            return z3Var2;
        }
        com.tencent.mm.storage.y8 i17 = com.tencent.mm.storage.y8.i(p7Var.field_msgContent);
        com.tencent.mm.storage.z3 z3Var3 = new com.tencent.mm.storage.z3();
        z3Var3.X1(i17.f196358a);
        z3Var3.k1(i17.f196360c);
        z3Var3.M1(i17.c());
        z3Var3.R1(i17.f196362e);
        z3Var3.S1(i17.f196361d);
        z3Var3.g3(i17.f196372o);
        z3Var3.b3(i17.f());
        z3Var3.L2(i17.b());
        z3Var3.h3(i17.f196373p);
        z3Var3.Z1(i17.f196374q);
        z3Var3.o3(i17.f196375r);
        z3Var3.C2(i17.f196382y);
        return z3Var3;
    }

    public static y35.r[] g(android.content.Context context, com.tencent.mm.storage.p7[] p7VarArr) {
        com.tencent.mm.storage.p7 p7Var;
        if (p7VarArr != null && p7VarArr.length != 0 && (p7Var = p7VarArr[0]) != null) {
            java.lang.String str = p7Var.field_talker;
        }
        if (p7VarArr == null || p7VarArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "convert fmsg fail, fmsgList is null");
            return null;
        }
        int length = p7VarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = c(context, p7VarArr[i17]);
        }
        return rVarArr;
    }

    public static y35.r[] h(android.content.Context context, com.tencent.mm.storage.pa[] paVarArr) {
        com.tencent.mm.storage.pa paVar;
        if (paVarArr != null && paVarArr.length != 0 && (paVar = paVarArr[0]) != null) {
            java.lang.String str = paVar.field_sayhiuser;
        }
        if (paVarArr == null || paVarArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "convert shake fail, shakeList is null");
            return null;
        }
        int length = paVarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = d(context, paVarArr[i17]);
        }
        return rVarArr;
    }

    public static y35.r[] i(android.content.Context context, dm.f7[] f7VarArr) {
        dm.f7 f7Var;
        if (f7VarArr != null && f7VarArr.length != 0 && (f7Var = f7VarArr[0]) != null) {
            java.lang.String str = f7Var.field_sayhiuser;
        }
        if (f7VarArr == null || f7VarArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageProvider", "convert lbs fail, lbsList is null");
            return null;
        }
        int length = f7VarArr.length;
        y35.r[] rVarArr = new y35.r[length];
        for (int i17 = 0; i17 < length; i17++) {
            rVarArr[(length - i17) - 1] = e(context, f7VarArr[i17]);
        }
        return rVarArr;
    }

    public static void l(java.lang.String str, int i17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageProviderKt", "tryToAddSayHiMsg called with: userName = " + str + ", addScene = " + i17 + " source:" + source);
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new y35.s(str, i17, null), 2, null);
        }
    }

    public r45.v60 j() {
        java.util.LinkedList linkedList;
        r45.dz3 dz3Var = this.f459241j;
        if (dz3Var == null || (linkedList = dz3Var.f372869e) == null || linkedList.isEmpty()) {
            return null;
        }
        return (r45.v60) this.f459241j.f372869e.get(0);
    }

    public boolean k() {
        java.util.LinkedList linkedList;
        r45.dz3 dz3Var = this.f459241j;
        return (dz3Var == null || (linkedList = dz3Var.f372869e) == null || linkedList.isEmpty()) ? false : true;
    }
}
