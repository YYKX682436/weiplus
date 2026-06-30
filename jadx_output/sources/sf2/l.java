package sf2;

/* loaded from: classes10.dex */
public final class l implements ek2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407190b;

    public l(kotlinx.coroutines.q qVar, sf2.x xVar) {
        this.f407189a = qVar;
        this.f407190b = xVar;
    }

    @Override // ek2.c0
    public void a(int i17, int i18, java.lang.String str, r45.f81 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlinx.coroutines.q qVar = this.f407189a;
        if (!((kotlinx.coroutines.r) qVar).n()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "continuation is not active, skip old song list cgi result");
            return;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && i18 == 0) {
            sf2.x xVar = this.f407190b;
            ((mm2.m6) xVar.business(mm2.m6.class)).f329241f.f(resp, xVar.O6());
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "old song list cgi callback with list count: " + ((mm2.m6) xVar.business(mm2.m6.class)).f329241f.f234053b.size());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "getSingSongList failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
    }
}
