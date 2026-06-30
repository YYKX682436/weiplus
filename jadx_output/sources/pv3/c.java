package pv3;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f358584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iv3.a f358585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, iv3.a aVar) {
        super(2);
        this.f358584d = audioCacheInfo;
        this.f358585e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        this.f358585e.a(((java.lang.Boolean) obj).booleanValue(), new lv3.a(this.f358584d.f155711e, (java.lang.String) obj2, 0L, 4, null));
        return jz5.f0.f302826a;
    }
}
