package ea2;

/* loaded from: classes2.dex */
public final class z implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f250594c;

    public z(java.lang.String str, com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, android.widget.ImageView imageView) {
        this.f250592a = str;
        this.f250593b = finderMusicTopicHeaderUIC;
        this.f250594c = imageView;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "[loadCover] source:" + this.f250592a + " 2, success:" + z17);
        if (z17) {
            return;
        }
        this.f250593b.getClass();
        pm0.v.X(new ea2.i(this.f250594c));
    }
}
