package te5;

@j95.b
/* loaded from: classes9.dex */
public final class y extends i95.w implements ct.t2 {
    public z01.b0 wi(android.content.Context context, l15.c recordMsg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.lang.String j17;
        java.lang.String l17;
        v05.b k17;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recordMsg, "recordMsg");
        s15.w wVar = new s15.w();
        v05.b k18 = recordMsg.k();
        java.lang.String str3 = "";
        if (k18 == null || (str = k18.getString(k18.f432315e + 44)) == null) {
            str = "";
        }
        wVar.fromXml(str);
        int i17 = wVar.f303423d;
        java.lang.String obj = r26.n0.u0(wVar.getString(i17 + 0)).toString();
        if (r26.n0.N(obj) && ((k17 = recordMsg.k()) == null || (string2 = k17.getString(k17.f368365d + 2)) == null || (obj = r26.n0.u0(string2).toString()) == null)) {
            obj = "";
        }
        if (r26.n0.N(obj)) {
            java.lang.String str4 = "";
            java.lang.String str5 = str4;
            boolean z17 = false;
            for (s15.h hVar : wVar.j()) {
                s15.i p17 = hVar.p();
                if (p17 != null && (l17 = p17.l()) != null) {
                    if (!(!r26.n0.N(l17))) {
                        l17 = null;
                    }
                    if (l17 != null) {
                        obj = context.getString(com.tencent.mm.R.string.f490884n82);
                        kotlin.jvm.internal.o.f(obj, "getString(...)");
                        z17 = true;
                    }
                }
                s15.i p18 = hVar.p();
                if (p18 != null && (j17 = p18.j()) != null) {
                    if (!(!r26.n0.N(j17))) {
                        j17 = null;
                    }
                    if (j17 != null) {
                        if (r26.n0.N(str4)) {
                            str4 = hVar.getSourceName();
                        } else if (!kotlin.jvm.internal.o.b(str4, hVar.getSourceName())) {
                            str5 = hVar.getSourceName();
                        }
                    }
                }
            }
            if ((!r26.n0.N(str4)) && (!r26.n0.N(str5)) && !z17) {
                obj = context.getString(com.tencent.mm.R.string.f490885n83, str4);
                kotlin.jvm.internal.o.f(obj, "getString(...)");
            } else if ((!r26.n0.N(str4)) && (!r26.n0.N(str5)) && !kotlin.jvm.internal.o.b(str4, str5) && !z17) {
                obj = context.getString(com.tencent.mm.R.string.f490883n81, str4, str5);
                kotlin.jvm.internal.o.f(obj, "getString(...)");
            }
        }
        java.lang.String obj2 = r26.n0.u0(wVar.getString(i17 + 1)).toString();
        java.lang.String str6 = r26.n0.N(obj2) ^ true ? obj2 : null;
        if (str6 != null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&lt;");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(str6).replaceAll("<");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("&gt;");
            kotlin.jvm.internal.o.f(compile2, "compile(...)");
            str2 = compile2.matcher(replaceAll).replaceAll(">");
            kotlin.jvm.internal.o.f(str2, "replaceAll(...)");
            if (str2.length() > 100) {
                ((com.tencent.mm.feature.emoji.o0) ((com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class))).getClass();
                boolean z18 = com.tencent.mm.smiley.q0.f193336d;
                str2 = str2.substring(0, com.tencent.mm.smiley.l0.f193307a.h(str2, 0, 100));
                kotlin.jvm.internal.o.f(str2, "substring(...)");
            }
        } else {
            v05.b k19 = recordMsg.k();
            if (k19 != null && (string = k19.getString(k19.f368365d + 3)) != null) {
                str3 = string;
            }
            str2 = str3;
        }
        z01.b0 b0Var = new z01.b0();
        b0Var.f468952d = obj;
        b0Var.f468953e = str2;
        return b0Var;
    }
}
