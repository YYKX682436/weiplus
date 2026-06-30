package yt3;

/* loaded from: classes10.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f465422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f465423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, yz5.a aVar, yt3.r4 r4Var) {
        super(2);
        this.f465422d = audioCacheInfo;
        this.f465423e = aVar;
        this.f465424f = r4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "cacheAudio callback success " + booleanValue);
        if (booleanValue) {
            this.f465422d.f155716m = true;
            this.f465423e.invoke();
            ru3.f fVar = this.f465424f.f465647e;
            if (fVar != null) {
                fVar.f399755b = yt3.c4.f465394d;
            }
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new yt3.d4(this.f465424f));
            yt3.r4.b(this.f465424f);
        }
        return jz5.f0.f302826a;
    }
}
