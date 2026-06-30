package mk1;

/* loaded from: classes7.dex */
public final class b implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk1.v f327093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f327094b;

    public b(mk1.v vVar, android.os.Handler handler) {
        this.f327093a = vVar;
        this.f327094b = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        ye1.r lVar;
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        if (!(dataSource instanceof mk1.z)) {
            return null;
        }
        mk1.v vVar = this.f327093a;
        if (vVar != null) {
            lVar = vVar.a(dataSource);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            lVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.l(context, this.f327094b.getLooper(), false, false, false, 28, null);
        }
        if (lVar != null) {
            return lVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandExoThumbCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
        return new ye1.e0();
    }
}
