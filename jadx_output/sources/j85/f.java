package j85;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f298249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f298250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, int i17) {
        super(0);
        this.f298249d = j17;
        this.f298250e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f61028d = 3;
        systemServiceHookStatusStruct.f61035k = systemServiceHookStatusStruct.b("ProcessName", bm5.f1.a(), true);
        systemServiceHookStatusStruct.f61039o = this.f298249d / 1000;
        systemServiceHookStatusStruct.f61040p = this.f298250e;
        systemServiceHookStatusStruct.f61038n = 3;
        j85.g.a(j85.g.f298251a, systemServiceHookStatusStruct);
        return jz5.f0.f302826a;
    }
}
