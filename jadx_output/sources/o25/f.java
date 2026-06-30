package o25;

/* loaded from: classes11.dex */
public final class f implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f342512a;

    public f(long j17) {
        this.f342512a = j17;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "old: DownLoadImage finish: url = %s", str);
        com.tencent.mm.sdk.platformtools.u3.i(o25.e.f342506d, this.f342512a);
    }
}
