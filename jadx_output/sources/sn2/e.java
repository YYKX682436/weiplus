package sn2;

/* loaded from: classes11.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService f410128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410130c;

    public e(com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService, java.lang.String str, java.lang.String str2) {
        this.f410128a = finderLiveMediaBrowserService;
        this.f410129b = str;
        this.f410130c = str2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            d75.b.g(new sn2.d(this.f410128a, bitmap, this.f410129b, this.f410130c));
        }
    }
}
