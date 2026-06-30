package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class q4 {
    public q4(kotlin.jvm.internal.i iVar) {
    }

    public final void a(vp2.j0 item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.X(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.X(item.getFeedObject().getMediaList());
        java.lang.String str = item.f448386r;
        java.lang.String str2 = str == null ? "" : str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (str == null) {
                java.lang.String string = mb4Var.getString(16);
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String string3 = mb4Var.getString(1);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String string4 = mb4Var.getString(19);
            str2 = string3.concat(string4 != null ? string4 : "");
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e), z17 ? g1Var.h(mn2.f1.f329968v) : g1Var.h(mn2.f1.f329953d)).a();
    }
}
