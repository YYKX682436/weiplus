package sg0;

@j95.b
/* loaded from: classes11.dex */
public final class e extends i95.w implements tg0.f1 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f407702d = "";

    public void Ai(android.content.Context context, int i17, int i18, java.util.Map extras) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extras, "extras");
        Ui(i17, i18, tg0.e1.f419062e, extras);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        intent.putExtra("entrance", i18);
        java.util.Map t17 = kz5.c1.t(extras);
        t17.remove("reportInfoFor33399");
        java.lang.Object obj = extras.get("imgPath");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null) {
            if (str.length() > 0) {
                intent.putExtra("image_url", str);
                t17.remove("imgPath");
            }
        }
        java.lang.Object obj2 = extras.get("base64ImageData");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 != null) {
            if (str2.length() > 0) {
                if (r26.n0.L(str2, ";base64,", 0, false, 6, null) >= 0) {
                    str2 = str2.substring(r26.n0.L(str2, ";base64,", 0, false, 6, null) + 8);
                    kotlin.jvm.internal.o.f(str2, "substring(...)");
                }
                byte[] decode = android.util.Base64.decode(str2, 0);
                android.graphics.Bitmap a17 = com.tencent.mm.graphics.e.a(decode, 0, decode.length);
                intent.putExtra("image_url", a17 != null ? zv4.f.f476460a.d(a17, true) : null);
                t17.remove("base64ImageData");
            }
        }
        java.lang.Object obj3 = extras.get("imageUrl");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 != null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(mmecoa\\.qpic\\.cn)|(mmbiz\\.qpic\\.cn)");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            if (compile.matcher(str3).find()) {
                java.util.Map k17 = kz5.c1.k(new jz5.l("dataType", 3), new jz5.l("url", str3));
                com.tencent.mars.xlog.Log.i("MicroMsg.CircleSearch.ReuseImageInfoForMp", "reuse image info, " + str3 + '}');
                t17.put("reuseImageInfo", k17);
            }
            if (!r26.i0.y(str3, "http", false) || str3.length() > 256) {
                t17.remove("imageUrl");
            }
        }
        if (t17.containsKey("reuseImageInfo")) {
            java.lang.Object obj4 = ((java.util.LinkedHashMap) t17).get("reuseImageInfo");
            java.util.Map map = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
            if (map != null) {
                intent.putExtra("reuse_image_info", java.lang.String.valueOf(ri.l0.a(map)));
            }
            t17.remove("reuseImageInfo");
        }
        intent.putExtra("extras", java.lang.String.valueOf(ri.l0.a(t17)));
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUI", "(Landroid/content/Context;IILjava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int Bi(int i17, int i18) {
        if (i18 == 1) {
            return com.tencent.mm.R.raw.icons_filled_image_recognize_logo;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(sg0.c.f407686d, false) ? com.tencent.mm.R.raw.icons_filled_image_recognize_logo : com.tencent.mm.R.raw.icons_filled_search_logo;
    }

    public java.lang.String Di(int i17, int i18) {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491241cg4);
        h62.d dVar = (h62.d) e0Var;
        dVar.getClass();
        java.lang.String bj6 = dVar.bj("clicfg_circle_to_search_business_name", string, true);
        kotlin.jvm.internal.o.f(bj6, "getExpt(...)");
        return bj6;
    }

    public boolean Ni(int i17, int i18) {
        if (com.tencent.mm.plugin.websearch.l2.a(0) >= 80212018 && !su4.r2.l()) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(new sg0.d(i17, i18), 0) == 1;
        }
        return false;
    }

    public void Ri(int i17, int i18, tg0.e1 actionType) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        Ui(i17, i18, actionType, kz5.q0.f314001d);
    }

    public void Ui(int i17, int i18, tg0.e1 actionType, java.util.Map extras) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(extras, "extras");
        java.lang.Object obj = extras.get("searchScene");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int i19 = 0;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue <= 0) {
            intValue = zv4.f.f476460a.a(i17);
        }
        int ordinal = actionType.ordinal();
        if (ordinal == 0) {
            this.f407702d = "";
        } else if (ordinal == 1) {
            java.lang.Object obj2 = extras.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.String str2 = str != null ? str : "";
            if (str2.length() == 0) {
                str2 = su4.r2.f(intValue);
                kotlin.jvm.internal.o.f(str2, "genSessionId(...)");
            }
            this.f407702d = str2;
        }
        com.tencent.mm.autogen.mmdata.rpt.CircleSearchKvReportStruct circleSearchKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.CircleSearchKvReportStruct();
        circleSearchKvReportStruct.f55681d = circleSearchKvReportStruct.b("sessionid", this.f407702d, true);
        circleSearchKvReportStruct.f55682e = intValue;
        circleSearchKvReportStruct.f55683f = i18;
        circleSearchKvReportStruct.f55684g = java.lang.System.currentTimeMillis();
        switch (actionType.ordinal()) {
            case 0:
                i19 = 2001;
                break;
            case 1:
                i19 = 3000;
                break;
            case 2:
                i19 = 2000;
                break;
            case 3:
                i19 = 3224;
                break;
            case 4:
                i19 = 6815;
                break;
            case 5:
                i19 = 6816;
                break;
            case 6:
                i19 = 6823;
                break;
        }
        circleSearchKvReportStruct.f55685h = i19;
        java.lang.Object obj3 = extras.get("reportInfoFor33399");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 != null) {
            circleSearchKvReportStruct.f55686i = circleSearchKvReportStruct.b("action_value", fp.s0.b(str3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), true);
        }
        circleSearchKvReportStruct.k();
        su4.k3.m(circleSearchKvReportStruct);
    }

    public void wi(android.content.Context context, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            Ai(context, i17, i18, kz5.b1.e(new jz5.l("imgPath", str)));
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var.d(com.tencent.mm.R.string.o3w);
        e4Var.c();
    }
}
