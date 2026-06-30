package zy0;

/* loaded from: classes5.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f477307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477308b;

    public a(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String str) {
        this.f477307a = audioCacheInfo;
        this.f477308b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("REPORT_KEY_DYNAMIC_PARAM_AUDIOINFO", this.f477307a), new jz5.l("REPORT_KEY_DYNAMIC_PARAM_SOURCEPAGE", this.f477308b));
    }
}
