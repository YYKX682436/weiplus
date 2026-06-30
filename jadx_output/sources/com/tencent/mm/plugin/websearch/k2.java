package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public abstract class k2 {
    public static final int a(int i17, int i18) {
        if (i18 <= 0) {
            return i17;
        }
        boolean z17 = i18 == 1;
        int i19 = i17 != 73 ? i17 != 79 ? i17 != 80 ? i17 : z17 ? 251 : 252 : z17 ? com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX : 250 : z17 ? 247 : 248;
        com.tencent.mars.xlog.Log.i("MicroMsg.TagSearchStyleHelper", "mapScene: " + i17 + " -> " + i19 + ", tagSearchStyle=" + i18);
        return i19;
    }
}
