package sf2;

/* loaded from: classes5.dex */
public final class w implements ek2.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f407327b;

    public w(kotlinx.coroutines.q qVar, int i17) {
        this.f407326a = qVar;
        this.f407327b = i17;
    }

    @Override // ek2.q2
    public void a(int i17, int i18, java.lang.String str, r45.rd2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlinx.coroutines.q qVar = this.f407326a;
        if (!((kotlinx.coroutines.r) qVar).n()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList: continuation is not active, skip result");
            return;
        }
        int i19 = this.f407327b;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " success");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new sf2.h3(resp)));
            return;
        }
        if (i18 == -200431) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " success (no change)");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new sf2.h3(resp)));
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "updateSongList " + i19 + " failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new sf2.g3(i18, str)));
    }
}
