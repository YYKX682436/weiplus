package sf4;

/* loaded from: classes4.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f407422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f407423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sf4.j2 j2Var, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        super(0);
        this.f407419d = j2Var;
        this.f407420e = str;
        this.f407421f = j17;
        this.f407422g = j18;
        this.f407423h = videoInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407419d.f407499a;
        if (storyVideoView != null) {
            java.lang.String str = this.f407420e;
            long j17 = this.f407421f;
            long j18 = this.f407422g;
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f407423h;
            java.lang.String str2 = videoInfo != null ? videoInfo.svrFlag : null;
            if (str2 == null) {
                str2 = "";
            }
            storyVideoView.e0(str, j17, j18, str2);
        }
        return jz5.f0.f302826a;
    }
}
