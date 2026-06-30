package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j2 {
    public j2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(wp2.b item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f448386r;
        java.lang.String str2 = str == null ? "" : str;
        r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.Z(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        if (mb4Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.LivingConvert", "preloadCover: mediaObj is null, feedId=" + item.getFeedObject().getFeedObject().getId() + ", skip preload");
            return;
        }
        if (str2.length() == 0) {
            str2 = zl2.q4.f473933a.y(mb4Var, 1);
            if (!(str2.length() > 0)) {
                if (str == null) {
                    java.lang.String string = mb4Var.getString(16);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = mb4Var.getString(20);
                    if (string2 == null) {
                        string2 = "";
                    }
                    str = string.concat(string2);
                }
                str2 = str;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb6.append(string3 != null ? string3 : "");
            str2 = sb6.toString();
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e), z17 ? g1Var.h(mn2.f1.f329968v) : g1Var.h(mn2.f1.f329953d)).a();
    }
}
