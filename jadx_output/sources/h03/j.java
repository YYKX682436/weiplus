package h03;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h03.q f277895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, java.lang.String str, h03.q qVar) {
        super(0);
        this.f277893d = megaVideoFeedInfo;
        this.f277894e = str;
        this.f277895f = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = c03.i.a(this.f277893d);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "reportBulletComment finderItem is null");
        } else {
            java.lang.String str = this.f277894e;
            java.lang.Long j17 = r26.h0.j(str);
            if (j17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "reportBulletComment bulletId[" + str + "] is null");
            } else {
                android.app.Activity activity = this.f277895f.f277912f;
                if (activity != null) {
                    bd2.b.f19244a.f(activity, a17.getId(), a17.getDupFlag(), j17.longValue());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
