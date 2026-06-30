package cu0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f222312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, cu0.x xVar) {
        super(0);
        this.f222312d = audioCacheInfo;
        this.f222313e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222312d;
        if (audioCacheInfo != null) {
            pv3.n.f358619a.a(this.f222313e.h(), audioCacheInfo);
        }
        return jz5.f0.f302826a;
    }
}
