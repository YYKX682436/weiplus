package hk4;

/* loaded from: classes10.dex */
public final class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f281946b;

    public h(hk4.n nVar, kotlin.coroutines.Continuation continuation) {
        this.f281945a = nVar;
        this.f281946b = continuation;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i(this.f281945a.f281956k, "loadImageBitmap finished, url:" + aVar + ", resource:" + bitmap);
        this.f281946b.resumeWith(kotlin.Result.m521constructorimpl(bitmap));
    }
}
