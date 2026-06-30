package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sight.base.h a(boolean z17) {
        com.tencent.mm.plugin.sight.base.h hVar;
        synchronized (com.tencent.mm.plugin.sight.base.h.f162414c) {
            hVar = new com.tencent.mm.plugin.sight.base.h(com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForHardRemux(com.tencent.mm.plugin.sight.base.c.b(), com.tencent.mm.plugin.sight.base.c.c(false, z17), true, z17));
        }
        return hVar;
    }

    public final com.tencent.mm.plugin.sight.base.h b(int i17, int i18, int i19, float f17, boolean z17, boolean z18, int i27, int i28, int i29, int i37, float f18, int i38, int i39) {
        int i47;
        com.tencent.mm.plugin.sight.base.h hVar;
        if (i37 != -1) {
            i47 = i37;
        } else {
            i47 = z17 ? 5 : 1;
        }
        synchronized (com.tencent.mm.plugin.sight.base.h.f162414c) {
            hVar = new com.tencent.mm.plugin.sight.base.h(com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForSoftRemux(i17, i18, i19, f17, z17, i47, 8, 2, f18, i38, i39, true, i27, i28, i29, z18, com.tencent.mm.plugin.sight.base.c.b()));
        }
        return hVar;
    }
}
