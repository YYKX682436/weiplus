package defpackage;

/* loaded from: classes15.dex */
public final class i extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436106e;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.b(service, data, rVar);
        int i17 = data.f148163e;
        if (service.H1(i17)) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(0, "", null));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "CheckEnvironmentHandler id duplicated");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(-1, "id duplicated " + i17, null));
            }
        }
    }
}
