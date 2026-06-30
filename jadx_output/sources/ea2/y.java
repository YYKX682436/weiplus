package ea2;

/* loaded from: classes2.dex */
public final class y implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f250591c;

    public y(java.lang.String str, com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, android.widget.ImageView imageView) {
        this.f250589a = str;
        this.f250590b = finderMusicTopicHeaderUIC;
        this.f250591c = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "[loadCover] source:" + this.f250589a + " 1, resource:" + bitmap);
        if (bitmap == null) {
            this.f250590b.getClass();
            pm0.v.X(new ea2.i(this.f250591c));
        }
    }
}
