package uh5;

/* loaded from: classes12.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String fileName, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fileName) && i17 != 0 && i18 != 0) {
                java.util.HashMap hashMap = uh5.h.f428010e;
                uh5.h hVar = (uh5.h) hashMap.get(fileName);
                if (hVar == null) {
                    hVar = new uh5.h();
                    java.lang.System.currentTimeMillis();
                    hashMap.put(fileName, hVar);
                }
                hVar.f428012b += i19 + '|';
                if (i19 > 0) {
                    if (hVar.f428011a == 0) {
                        hVar.f428011a = i19;
                    }
                } else if (hVar.f428011a != 0) {
                    hVar.f428013c++;
                    hVar.f428011a = 0;
                }
                com.tencent.mars.xlog.Log.i("MediaGallery.LimitImageDecoder", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hVar.f428011a), java.lang.Integer.valueOf(hVar.f428013c), hVar.f428012b, fileName);
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MediaGallery.LimitImageDecoder", "get useopt  addBit :%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
    }
}
