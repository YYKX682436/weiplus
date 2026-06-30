package gx0;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig f277189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig movieComposingConfig) {
        super(0);
        this.f277189d = movieComposingConfig;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f277189d.f69348m;
        android.os.Bundle bundle = recordConfigProvider != null ? recordConfigProvider.M : null;
        if (bundle == null) {
            return com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        bundle.setClassLoader(com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig.class.getClassLoader());
        return com.tencent.maas.model.time.MJTime.fromSeconds(bundle.getDouble("ShootComposingUI.SHOOT_TEMPLATE_COVER_START_TIME", 0.0d));
    }
}
