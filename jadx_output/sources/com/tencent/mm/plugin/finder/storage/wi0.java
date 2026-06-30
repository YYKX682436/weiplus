package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wi0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wi0 f128257d = new com.tencent.mm.plugin.finder.storage.wi0();

    public wi0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "红点是否限频", null, null, 12, null);
        aVar.a("USERINFO_FINDER_TEST_RED_DOT_FACTOR_INT_SYNC", kz5.c0.i(1, 1000000000), kz5.c0.i("默认", "无限制"));
        aVar.f317745p = "常用";
        java.util.ArrayList arrayList = aVar.f317741i;
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFakeConfig", "applyChosenDebugConfigFromAssist: please call bindDebugConfig first.");
        } else {
            com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("Finder.FinderFakeConfig", "Fail to get debugger, skip apply chosen item from assist key %s", ".com.tencent.mm.debug.finder.reddot.notimelimit");
            } else {
                java.lang.Integer c17 = b17.c(".com.tencent.mm.debug.finder.reddot.notimelimit");
                if (c17 == null || c17.intValue() < 0) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderFakeConfig", "Assist does not specify value with key %s", ".com.tencent.mm.debug.finder.reddot.notimelimit");
                } else {
                    int intValue = c17.intValue();
                    java.util.ArrayList arrayList2 = aVar.f317741i;
                    kotlin.jvm.internal.o.d(arrayList2);
                    if (intValue >= arrayList2.size()) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderFakeConfig", "Bad value %s from assist specified with key %s", c17, ".com.tencent.mm.debug.finder.reddot.notimelimit");
                    } else {
                        aVar.f317750e = c17.intValue();
                        com.tencent.mars.xlog.Log.i("Finder.FinderFakeConfig", "Chosen item of debug config %s was override by assist with key %s", aVar.f317740h, ".com.tencent.mm.debug.finder.reddot.notimelimit");
                    }
                }
            }
        }
        return aVar;
    }
}
