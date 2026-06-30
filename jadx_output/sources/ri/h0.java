package ri;

/* loaded from: classes12.dex */
public class h0 {
    public final java.lang.String a() {
        java.lang.String str = (java.lang.String) com.tencent.mm.app.MMBugReportContents.f53230k.f53727q.c(false);
        return str != null ? str.replace(',', ';') : "";
    }

    public final int b(java.lang.String str) {
        if (str.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            return 1033;
        }
        if (str.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools")) {
            return 1187;
        }
        if (str.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.x2.f193072b + ":push")) {
            return 1189;
        }
        if (str.startsWith(com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand")) {
            return 1190;
        }
        return com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX;
    }

    public final int c(java.lang.String str) {
        if (str.endsWith("SnsTimeLineUI")) {
            return 0;
        }
        if (str.endsWith("ChattingUIFragment") || str.endsWith("ChattingUI")) {
            return 20;
        }
        if (str.endsWith("MainUI")) {
            return 40;
        }
        if (str.endsWith("FinderHomeUI") || str.endsWith("FinderHomeAffinityUI")) {
            return 100;
        }
        if (str.endsWith("FinderProfileUI")) {
            return 120;
        }
        if (str.endsWith("FinderTimelineLbsUI")) {
            return 140;
        }
        return str.endsWith("AddressUI") ? 160 : -1;
    }

    public final int d(java.lang.String str) {
        if (str.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            return 1192;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sb6.append(":tools");
        return str.equalsIgnoreCase(sb6.toString()) ? com.tencent.mm.plugin.appbrand.jsapi.profile.r.CTRL_INDEX : com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX;
    }
}
