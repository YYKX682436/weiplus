package j85;

/* loaded from: classes15.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f298247d = str;
        this.f298248e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Throwable th6 = new java.lang.Throwable();
        com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f61028d = 1;
        systemServiceHookStatusStruct.f61035k = systemServiceHookStatusStruct.b("ProcessName", bm5.f1.a(), true);
        systemServiceHookStatusStruct.f61031g = systemServiceHookStatusStruct.b("CurrentActivity", com.tencent.mm.app.w.INSTANCE.h(), true);
        systemServiceHookStatusStruct.f61032h = systemServiceHookStatusStruct.b("MethodStack", r26.i0.t(jz5.a.b(th6), ",", ";", false), true);
        systemServiceHookStatusStruct.f61036l = systemServiceHookStatusStruct.b("ErrStack", r26.i0.v(this.f298247d, ",", ";", false, 4, null), true);
        systemServiceHookStatusStruct.f61030f = systemServiceHookStatusStruct.b("MethodName", this.f298248e, true);
        systemServiceHookStatusStruct.f61038n = 4;
        j85.g.a(j85.g.f298251a, systemServiceHookStatusStruct);
        return jz5.f0.f302826a;
    }
}
