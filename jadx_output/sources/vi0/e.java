package vi0;

/* loaded from: classes2.dex */
public final class e implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f437251a;

    public e(kotlinx.coroutines.q qVar) {
        this.f437251a = qVar;
    }

    @Override // ep0.c
    public void a(ip0.a url, cp0.n nVar, hp0.e eVar) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(((mn2.h3) url.f293573a).getPath(), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderDataSource", "onImageLoadFinish: url=" + url + ", path=" + i17);
        this.f437251a.resumeWith(kotlin.Result.m521constructorimpl(i17));
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FinderDataSource", "onImageLoadStart: " + aVar);
    }
}
