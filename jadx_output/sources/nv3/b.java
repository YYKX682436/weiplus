package nv3;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev3.d f340649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f340651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f340652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv3.v f340653h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ev3.d dVar, int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, rv3.v vVar) {
        super(2);
        this.f340649d = dVar;
        this.f340650e = i17;
        this.f340651f = audioCacheInfo;
        this.f340652g = z17;
        this.f340653h = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ev3.d dVar;
        if (((java.lang.Boolean) obj).booleanValue() && (dVar = this.f340649d) != null) {
            dVar.i(this.f340650e, this.f340651f, this.f340652g, this.f340653h);
        }
        return jz5.f0.f302826a;
    }
}
