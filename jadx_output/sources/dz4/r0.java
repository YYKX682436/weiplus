package dz4;

/* loaded from: classes12.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f245383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f245385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f245386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f245387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, long j18, long j19, long j27, long j28, long j29) {
        super(0);
        this.f245383d = j17;
        this.f245384e = j18;
        this.f245385f = j19;
        this.f245386g = j27;
        this.f245387h = j28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k82.c cVar = k82.c.f304887a;
        java.util.HashMap hashMap = k82.c.f304888b;
        long j17 = this.f245383d;
        k82.b bVar = (k82.b) hashMap.get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f304883m = true;
            long j18 = this.f245385f;
            long j19 = bVar.f304876f;
            bVar.f304877g = j18 + j19;
            bVar.f304878h = true;
            long j27 = j19 + this.f245384e;
            bVar.f304880j = j27;
            bVar.f304881k = j27 + this.f245386g + this.f245387h;
            cVar.d(bVar);
        } else {
            com.tencent.mars.xlog.Log.e("FavEnterReporter", "reportFlutterNoteEnterSuccess: localId not found, localId=" + j17);
        }
        return jz5.f0.f302826a;
    }
}
