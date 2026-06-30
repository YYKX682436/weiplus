package sf2;

/* loaded from: classes5.dex */
public final class h1 implements ek2.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407157b;

    public h1(int i17, kotlinx.coroutines.q qVar) {
        this.f407156a = i17;
        this.f407157b = qVar;
    }

    @Override // ek2.q2
    public void a(int i17, int i18, java.lang.String str, r45.rd2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlinx.coroutines.q qVar = this.f407157b;
        int i19 = this.f407156a;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " success");
            qVar.resumeWith(kotlin.Result.m521constructorimpl(resp));
            return;
        }
        if (i18 == -200431) {
            com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " success (no change)");
            qVar.resumeWith(kotlin.Result.m521constructorimpl(resp));
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveNormalRoomSingRequestHelper", "updateSongList " + i19 + " failed: errType=" + i17 + ", errCode=" + i18);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
