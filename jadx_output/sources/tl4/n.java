package tl4;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final tl4.n f420324d = new tl4.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.media.browse.MediaBrowser mediaBrowser = tl4.p.f420326a;
        if (!(mediaBrowser != null && mediaBrowser.isConnected()) && !tl4.p.f420328c) {
            tl4.p.f420328c = true;
            tl4.m mVar = new tl4.m();
            tl4.p.f420329d = true;
            tl4.p.f420326a = new android.media.browse.MediaBrowser(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.ting.media.TingMediaBrowserService.class), mVar, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppSessionController", "mainThreadConnect");
            android.media.browse.MediaBrowser mediaBrowser2 = tl4.p.f420326a;
            if (mediaBrowser2 != null) {
                mediaBrowser2.connect();
            }
        }
        return jz5.f0.f302826a;
    }
}
