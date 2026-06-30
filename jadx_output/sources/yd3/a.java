package yd3;

/* loaded from: classes15.dex */
public final class a extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436110i;
    }

    @Override // xd3.d
    public void d(ve3.s service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.d(service, data, rVar);
        java.lang.String str = data.f148165g;
        if (str != null) {
            xd3.c cVar = new xd3.c(rVar);
            ((xe3.p) service).f453963e.put(java.lang.Integer.valueOf(data.f148163e), str);
            ve3.o.a(cVar, null, 1, null);
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f148165g == null) {
            e(rVar, -1, "extraData data is null");
            com.tencent.mars.xlog.Log.w("MB_External_surface_action", "EventHandler hint| event data is null");
        }
    }
}
