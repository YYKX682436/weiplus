package ve3;

/* loaded from: classes7.dex */
public abstract class q {
    public static /* synthetic */ void c(ve3.q qVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEventToScl");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        qVar.b(str, str2);
    }

    public abstract int a();

    public void b(java.lang.String eventType, java.lang.String str) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        java.lang.String str2 = bf3.w0.f19672a.a(bf3.v0.f19670d) ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193059g;
        if (str2 == null) {
            str2 = com.tencent.mm.sdk.platformtools.w9.f193059g;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(str2, new com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData(a(), eventType, str), ve3.x.class, ve3.p.f436104d);
    }
}
