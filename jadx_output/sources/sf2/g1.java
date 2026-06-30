package sf2;

/* loaded from: classes.dex */
public final class g1 implements ek2.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407146a;

    public g1(kotlinx.coroutines.q qVar) {
        this.f407146a = qVar;
    }

    @Override // ek2.g1
    public void a(int i17, int i18, java.lang.String str, r45.tt1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlinx.coroutines.q qVar = this.f407146a;
        if (i17 == 0 && i18 == 0) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(resp));
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSingRequestHelper", "getSongList failed: errType=" + i17 + ", errCode=" + i18);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
