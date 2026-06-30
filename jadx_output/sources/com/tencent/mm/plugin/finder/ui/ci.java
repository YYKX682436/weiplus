package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.ci f128994a = new com.tencent.mm.plugin.finder.ui.ci();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f128995b = jz5.h.b(com.tencent.mm.plugin.finder.ui.bi.f128954d);

    public final java.util.List a() {
        java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f128995b).getValue()).getString("recent_v1", null);
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (string == null) {
            return p0Var;
        }
        if (string.length() == 0) {
            return p0Var;
        }
        java.util.List f07 = r26.n0.f0(string, new java.lang.String[]{"\n"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
