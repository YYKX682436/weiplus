package gu0;

/* loaded from: classes5.dex */
public final class w0 implements com.tencent.maas.moviecomposing.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.ExportSession f275836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f275839d;

    public w0(com.tencent.maas.moviecomposing.ExportSession exportSession, gu0.k2 k2Var, java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f275836a = exportSession;
        this.f275837b = k2Var;
        this.f275838c = str;
        this.f275839d = qVar;
    }

    @Override // com.tencent.maas.moviecomposing.k
    public final void a(java.lang.String str, boolean z17, com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MJCC.Session", "export complete: checksum=" + str + ", error=" + mJError);
        this.f275836a.b();
        this.f275837b.f275739o = null;
        i95.m c17 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String str2 = this.f275838c;
        java.lang.String Ai = ((yy0.m0) ((pp0.h0) c17)).Ai(str2);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f275839d.resumeWith(kotlin.Result.m521constructorimpl(new jz5.o(str2, Ai, mJError)));
    }
}
