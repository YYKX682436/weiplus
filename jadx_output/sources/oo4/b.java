package oo4;

/* loaded from: classes5.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f347195a;

    public b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        this.f347195a = audioCacheInfo;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.b1.e(new jz5.l("bgm_panel_collect_status", java.lang.Integer.valueOf(this.f347195a.L ? 2 : 1)));
    }
}
