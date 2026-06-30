package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(int i17) {
        return "k1kExposeTab-" + i17;
    }

    public final boolean b(int i17) {
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.TopStoryDataUIC", 2, null);
        kotlin.jvm.internal.o.f(N, "getMMKV(...)");
        return N.getBoolean(a(i17), false);
    }
}
