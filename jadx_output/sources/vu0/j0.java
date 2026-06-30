package vu0;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f440105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlinx.coroutines.q qVar) {
        super(1);
        this.f440105d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String audioFilePath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(audioFilePath, "audioFilePath");
        com.tencent.mars.xlog.Log.i("VideoSubtitleService", "result audioFilePath ".concat(audioFilePath));
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f440105d;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(audioFilePath));
        }
        return jz5.f0.f302826a;
    }
}
