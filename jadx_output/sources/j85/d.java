package j85;

/* loaded from: classes15.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f298246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, boolean z17) {
        super(0);
        this.f298244d = str;
        this.f298245e = str2;
        this.f298246f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Throwable th6 = new java.lang.Throwable();
        com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f61028d = 1;
        systemServiceHookStatusStruct.f61035k = systemServiceHookStatusStruct.b("ProcessName", bm5.f1.a(), true);
        systemServiceHookStatusStruct.f61031g = systemServiceHookStatusStruct.b("CurrentActivity", com.tencent.mm.app.w.INSTANCE.h(), true);
        systemServiceHookStatusStruct.f61029e = systemServiceHookStatusStruct.b("ServiceName", this.f298244d, true);
        systemServiceHookStatusStruct.f61032h = systemServiceHookStatusStruct.b("MethodStack", r26.i0.t(jz5.a.b(th6), ",", ";", false), true);
        systemServiceHookStatusStruct.f61030f = systemServiceHookStatusStruct.b("MethodName", this.f298245e, true);
        systemServiceHookStatusStruct.f61034j = systemServiceHookStatusStruct.b("MethodOffsetTime", java.lang.String.valueOf(this.f298246f), true);
        systemServiceHookStatusStruct.f61038n = 3;
        j85.g.a(j85.g.f298251a, systemServiceHookStatusStruct);
        return jz5.f0.f302826a;
    }
}
