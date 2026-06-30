package sx4;

/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx4.v f413660a;

    public u(sx4.v vVar) {
        this.f413660a = vVar;
    }

    public void a() {
        java.lang.String str;
        sx4.v vVar = this.f413660a;
        if (vVar.f413663c == 0) {
            return;
        }
        vVar.f413661a = java.lang.System.currentTimeMillis() - vVar.f413663c;
        if (vVar.f413664d != 0) {
            vVar.f413662b += java.lang.System.currentTimeMillis() - vVar.f413664d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), stayTime:%sms, foregroundTime:%sms", java.lang.Integer.valueOf(vVar.hashCode()), java.lang.Long.valueOf(vVar.f413661a), java.lang.Long.valueOf(vVar.f413662b));
        android.os.Bundle bundle = vVar.f413665e;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "report game page time fail. ReportData is null");
            return;
        }
        java.lang.String string = bundle.getString("game_page_report_format_data");
        java.lang.String string2 = vVar.f413665e.getString("game_page_report_tabs_format_data");
        java.lang.String str2 = "__FOREGROUNDTIME__";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            java.lang.String replace = string.replace("__ALLSTAYTIME__", java.lang.String.valueOf(vVar.f413661a / 1000)).replace("__FOREGROUNDTIME__", java.lang.String.valueOf(vVar.f413662b / 1000));
            vVar.f413665e.putString("game_page_report_format_data", replace);
            com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportFormatData:%s", java.lang.Integer.valueOf(vVar.hashCode()), replace);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                return;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(.*?\\)").matcher(string2);
            while (matcher.find()) {
                try {
                    java.lang.String group = matcher.group();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (group == null) {
                        group = "";
                    }
                    java.lang.String replace2 = group.replace("(", "").replace(")", "").replace(" ", "");
                    if (replace2.contains("__ALLSTAYTIME__")) {
                        str = str2;
                        java.lang.String replace3 = replace2.replace("__ALLSTAYTIME__", java.lang.String.valueOf(vVar.f413661a / 1000));
                        java.lang.String[] split = replace3.split("\\+");
                        if (split.length == 2) {
                            replace3 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(split[0]) + com.tencent.mm.sdk.platformtools.t8.E1(split[1]));
                        }
                        string2 = string2.replace(group, replace3);
                    } else {
                        str = str2;
                        if (group.contains(str)) {
                            java.lang.String replace4 = replace2.replace(str, java.lang.String.valueOf(vVar.f413662b / 1000));
                            java.lang.String[] split2 = replace4.split("\\+");
                            if (split2.length == 2) {
                                replace4 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(split2[0]) + com.tencent.mm.sdk.platformtools.t8.E1(split2[1]));
                            }
                            string2 = string2.replace(group, replace4);
                        }
                    }
                    str2 = str;
                } catch (java.lang.NumberFormatException e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "matchTimeMark, err:%s", e17.getMessage());
                    string2 = null;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                return;
            }
            vVar.f413665e.putString("game_page_report_tabs_format_data", string2);
            com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportTabsFormatdata:%s", java.lang.Integer.valueOf(vVar.hashCode()), string2);
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            sx4.v.a(vVar.f413665e);
        } else {
            vVar.b(vVar.f413665e);
        }
        vVar.f413665e = null;
    }

    public void b() {
        sx4.v vVar = this.f413660a;
        if (vVar.f413664d != 0) {
            vVar.f413662b += java.lang.System.currentTimeMillis() - vVar.f413664d;
        }
    }

    public void c(android.os.Bundle bundle) {
        sx4.v vVar = this.f413660a;
        vVar.f413665e = bundle;
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "setGamePageReportData");
        if (bundle == null || !bundle.getBoolean("game_page_report_time_begin")) {
            return;
        }
        vVar.f413662b = 0L;
        vVar.f413663c = java.lang.System.currentTimeMillis();
        vVar.f413664d = java.lang.System.currentTimeMillis();
    }

    public void d() {
        sx4.v vVar = this.f413660a;
        if (vVar.f413664d != 0) {
            vVar.f413664d = java.lang.System.currentTimeMillis();
        }
    }
}
