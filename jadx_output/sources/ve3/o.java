package ve3;

/* loaded from: classes11.dex */
public interface o {
    static void a(ve3.o oVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        com.tencent.mm.ipcinvoker.r rVar = ((xd3.c) oVar).f453616a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(0, "", str));
        }
    }
}
