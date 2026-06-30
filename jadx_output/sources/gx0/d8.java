package gx0;

/* loaded from: classes5.dex */
public final class d8 implements com.tencent.maas.moviecomposing.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f276323a;

    public d8(kotlinx.coroutines.q qVar) {
        this.f276323a = qVar;
    }

    @Override // com.tencent.maas.moviecomposing.k
    public final void a(java.lang.String str, boolean z17, com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "startExporting: onComplete, checksum:" + str + ", isSoftwareEncoding:" + z17 + ", error:" + mJError);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f276323a.resumeWith(kotlin.Result.m521constructorimpl(new jz5.o(str, java.lang.Boolean.valueOf(z17), mJError)));
    }
}
