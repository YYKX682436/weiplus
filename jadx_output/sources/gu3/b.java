package gu3;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout f275941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout finderLiveAvatarEditPluginLayout) {
        super(0);
        this.f275941d = finderLiveAvatarEditPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout.f155768w;
        l45.q qVar = this.f275941d.getPreviewPlugin().f243726p;
        l45.n nVar = qVar instanceof l45.n ? (l45.n) qVar : null;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }
}
