package vu0;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f440098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kotlinx.coroutines.q qVar) {
        super(1);
        this.f440098d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Exception it = (java.lang.Exception) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.e("VideoSubtitleService", "extractAudio: " + it.getMessage(), it);
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f440098d;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
