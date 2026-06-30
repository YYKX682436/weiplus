package o25;

/* loaded from: classes11.dex */
public final class h implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f342528a;

    public h(long j17) {
        this.f342528a = j17;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "new: DownLoadImage finish: url = %s", str);
        com.tencent.mm.sdk.platformtools.u3.i(o25.g.f342524d, this.f342528a);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
