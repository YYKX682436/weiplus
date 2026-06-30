package j85;

/* loaded from: classes15.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f298242d = str;
        this.f298243e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct systemServiceHookStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct();
        systemServiceHookStatusStruct.f61028d = 0;
        systemServiceHookStatusStruct.f61035k = systemServiceHookStatusStruct.b("ProcessName", bm5.f1.a(), true);
        systemServiceHookStatusStruct.f61036l = systemServiceHookStatusStruct.b("ErrStack", r26.i0.v(this.f298242d + " \n " + android.util.Log.getStackTraceString(new java.lang.Throwable()), ",", ";", false, 4, null), true);
        systemServiceHookStatusStruct.f61031g = systemServiceHookStatusStruct.b("CurrentActivity", com.tencent.mm.app.w.INSTANCE.h(), true);
        systemServiceHookStatusStruct.f61029e = systemServiceHookStatusStruct.b("ServiceName", this.f298243e, true);
        systemServiceHookStatusStruct.f61038n = 3;
        j85.g.a(j85.g.f298251a, systemServiceHookStatusStruct);
        return jz5.f0.f302826a;
    }
}
