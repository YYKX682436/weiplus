package xd3;

/* loaded from: classes11.dex */
public final class c implements ve3.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f453616a;

    public c(com.tencent.mm.ipcinvoker.r rVar) {
        this.f453616a = rVar;
    }

    public void b(int i17, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.ipcinvoker.r rVar = this.f453616a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(i17, errorMsg, null, 4, null));
        }
    }
}
