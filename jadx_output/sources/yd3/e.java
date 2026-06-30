package yd3;

/* loaded from: classes15.dex */
public final class e extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436108g;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.b(service, data, rVar);
        service.G1(data.f148163e, new xd3.c(rVar));
    }
}
