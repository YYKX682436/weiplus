package yd3;

/* loaded from: classes15.dex */
public final class c extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436105d;
    }

    @Override // xd3.d
    public void d(ve3.s service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.d(service, data, rVar);
        try {
            xe3.p pVar = (xe3.p) service;
            pVar.wi(data.f148163e, new org.json.JSONObject(data.f148165g), new xd3.c(rVar));
        } catch (java.lang.Exception unused) {
            e(rVar, -2, "json parse error");
        }
    }
}
