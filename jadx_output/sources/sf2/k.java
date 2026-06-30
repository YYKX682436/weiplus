package sf2;

/* loaded from: classes10.dex */
public final class k implements ek2.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407183b;

    public k(kotlinx.coroutines.q qVar, sf2.x xVar) {
        this.f407182a = qVar;
        this.f407183b = xVar;
    }

    @Override // ek2.g1
    public void a(int i17, int i18, java.lang.String str, r45.tt1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlinx.coroutines.q qVar = this.f407182a;
        if (!((kotlinx.coroutines.r) qVar).n()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "continuation is not active, skip new song list cgi result");
            return;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && i18 == 0) {
            sf2.x xVar = this.f407183b;
            ((mm2.m6) xVar.business(mm2.m6.class)).f329249q.a(resp);
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "new song list cgi callback with list count: " + ((mm2.m6) xVar.business(mm2.m6.class)).f329249q.f234085a.size());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "getNewSingSongList failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
    }
}
