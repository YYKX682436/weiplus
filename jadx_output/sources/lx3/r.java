package lx3;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final lx3.r f322113a = new lx3.r();

    public final void a(java.lang.Number businessId, java.lang.String reqJson, yz5.l onSuccess, yz5.q onFail) {
        kotlin.jvm.internal.o.g(businessId, "businessId");
        kotlin.jvm.internal.o.g(reqJson, "reqJson");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onFail, "onFail");
        r45.zj zjVar = new r45.zj();
        zjVar.f392126d = businessId.intValue();
        zjVar.f392127e = reqJson;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = zjVar;
        lVar.f70665b = new r45.ak();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/report/bizcommreport";
        lVar.f70667d = 4779;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new lx3.q(onFail, onSuccess), false);
    }
}
