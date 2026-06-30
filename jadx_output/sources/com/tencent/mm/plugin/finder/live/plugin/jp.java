package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public interface jp {
    static /* synthetic */ void b(com.tencent.mm.plugin.finder.live.plugin.jp jpVar, boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip ipVar, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGiftCallback");
        }
        jpVar.a(z17, i17, ipVar, str, (i19 & 16) != 0 ? null : l17, i18, str2, (i19 & 128) != 0 ? null : str3, (i19 & 256) != 0 ? null : i2Var);
    }

    void a(boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip ipVar, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var);
}
