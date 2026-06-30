package nv3;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv3.h f340643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f340644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dv3.c f340645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f340646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ev3.d f340647h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f340648i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rv3.h hVar, boolean z17, dv3.c cVar, int i17, ev3.d dVar, int i18) {
        super(2);
        this.f340643d = hVar;
        this.f340644e = z17;
        this.f340645f = cVar;
        this.f340646g = i17;
        this.f340647h = dVar;
        this.f340648i = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ev3.d dVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        rv3.h hVar = this.f340643d;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = hVar.f400395d;
        boolean z17 = this.f340644e;
        audioCacheInfo.L = z17;
        dv3.c cVar = this.f340645f;
        if (cVar != null) {
            cVar.notifyItemChanged(this.f340646g);
        }
        if (booleanValue && (dVar = this.f340647h) != null) {
            dVar.b(this.f340648i, hVar.f400395d, z17, hVar.f400396e);
        }
        return jz5.f0.f302826a;
    }
}
