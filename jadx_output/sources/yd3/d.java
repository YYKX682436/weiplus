package yd3;

/* loaded from: classes15.dex */
public final class d extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436107f;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.b(service, data, rVar);
        java.lang.String str = data.f148165g;
        if (str != null) {
            android.os.Parcelable parcelable = data.f148166h;
            kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type android.view.Surface");
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            xd3.c cVar = new xd3.c(rVar);
            service.Id(data.f148163e, jSONObject, (android.view.Surface) parcelable, cVar);
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f148165g == null) {
            e(rVar, -1, "no extraData");
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "RegisterHandler No extra data provided");
        } else {
            if (data.f148166h instanceof android.view.Surface) {
                return;
            }
            e(rVar, -1, "invalid surface");
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "RegisterHandler Invalid surface payload");
        }
    }
}
