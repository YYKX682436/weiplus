package yd3;

/* loaded from: classes15.dex */
public final class b extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        return action == ve3.u.f436109h;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.b(service, data, rVar);
        android.os.Parcelable parcelable = data.f148166h;
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.ipcinvoker.type.IPCString");
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) parcelable).f68406d;
        xd3.c cVar = new xd3.c(rVar);
        boolean b17 = kotlin.jvm.internal.o.b(str, "startPlay");
        int i17 = data.f148163e;
        if (b17) {
            service.R7(i17, cVar);
        } else if (kotlin.jvm.internal.o.b(str, "stopPlay")) {
            service.r4(i17, cVar);
        }
    }

    @Override // xd3.d
    public void d(ve3.s service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        int i17;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        super.d(service, data, rVar);
        android.os.Parcelable parcelable = data.f148166h;
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.ipcinvoker.type.IPCString");
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) parcelable).f68406d;
        xd3.c cVar = new xd3.c(rVar);
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = data.f148165g;
            int i18 = data.f148163e;
            switch (hashCode) {
                case -934426579:
                    if (str.equals("resume")) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.j(cVar), "resumePlay failed");
                        return;
                    }
                    return;
                case 3327652:
                    if (str.equals("loop") && str2 != null) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.l(new org.json.JSONObject(str2).getBoolean("enableLoop"), cVar), "setLoop failed");
                        return;
                    }
                    return;
                case 3363353:
                    if (str.equals("mute") && str2 != null) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.m(new org.json.JSONObject(str2).getBoolean("enableMute"), cVar), "setMute failed");
                        return;
                    }
                    return;
                case 3526264:
                    if (str.equals("seek") && str2 != null && (i17 = new org.json.JSONObject(str2).getInt("progress")) >= 0) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.k(i17, cVar), "seek failed");
                        return;
                    }
                    return;
                case 106440182:
                    if (str.equals("pause")) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.g(cVar), "pausePlay failed");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
        android.os.Parcelable parcelable = data.f148166h;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = parcelable instanceof com.tencent.mm.ipcinvoker.type.IPCString ? (com.tencent.mm.ipcinvoker.type.IPCString) parcelable : null;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null) {
            e(rVar, -1, "action invalid");
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "OperateHandler Invalid action payload");
            return;
        }
        if (!(kotlin.jvm.internal.o.b(str, "startPlay") || kotlin.jvm.internal.o.b(str, "stopPlay") || kotlin.jvm.internal.o.b(str, "resume") || kotlin.jvm.internal.o.b(str, "mute") || kotlin.jvm.internal.o.b(str, "loop") || kotlin.jvm.internal.o.b(str, "seek") || kotlin.jvm.internal.o.b(str, "pause"))) {
            e(rVar, -1, "action invalid Unsupported operation: ".concat(str));
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "OperateHandler Unsupported operation: ".concat(str));
            return;
        }
        if ((kotlin.jvm.internal.o.b(str, "mute") || kotlin.jvm.internal.o.b(str, "loop") || kotlin.jvm.internal.o.b(str, "seek")) && data.f148165g == null) {
            e(rVar, -1, "no extraData");
            com.tencent.mars.xlog.Log.e("MB_External_surface_action", "OperateHandler no extraData");
        }
    }
}
