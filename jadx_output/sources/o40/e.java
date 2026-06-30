package o40;

/* loaded from: classes9.dex */
public interface e extends i95.m {
    static void g8(o40.e eVar, android.content.Context context, byte[] bArr, boolean z17, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFinderAudioCollection");
        }
        byte[] bArr2 = (i17 & 2) != 0 ? null : bArr;
        if ((i17 & 8) != 0) {
            map = null;
        }
        wy2.g gVar = (wy2.g) eVar;
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        x40.h wi6 = gVar.wi();
        java.util.Map hashMap = map == null ? new java.util.HashMap() : map;
        wi6.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.c(wi6, hashMap, context, z17, bArr2, null), 3, null);
    }

    static /* synthetic */ void ta(o40.e eVar, android.content.Context context, byte[] bArr, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFinderAudioPage");
        }
        if ((i17 & 2) != 0) {
            bArr = null;
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        ((wy2.g) eVar).Bi(context, bArr, map);
    }
}
