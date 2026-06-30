package h82;

/* loaded from: classes8.dex */
public class g implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h82.h f279534d;

    public g(h82.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f279534d = hVar;
        this.f279531a = str;
        this.f279532b = str2;
        this.f279533c = str3;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        h82.h hVar = this.f279534d;
        java.util.concurrent.CountDownLatch countDownLatch = hVar.f279537f;
        objArr2[0] = countDownLatch == null ? "null" : java.lang.Long.valueOf(countDownLatch.getCount());
        java.lang.String str = this.f279531a;
        objArr2[1] = str;
        objArr2[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineService", "replaceImagUrl num:%s url:%s, success:%b", objArr2);
        if (z17) {
            hVar.f279536e.put(str, "./" + this.f279532b + "/" + this.f279533c);
        }
        java.util.concurrent.CountDownLatch countDownLatch2 = hVar.f279537f;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }
}
