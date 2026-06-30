package xd3;

/* loaded from: classes15.dex */
public abstract class d implements xd3.a {
    public void b(ve3.r service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
    }

    public void c(ve3.u action, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        ve3.r rVar2;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = data.f148164f;
        if (str == null) {
            e(rVar, -1, "texture type invalid");
            return;
        }
        xd3.f fVar = kotlin.jvm.internal.o.b(str, "finder-live") ? xd3.f.f453617d : kotlin.jvm.internal.o.b(str, "video") ? xd3.f.f453618e : null;
        if (fVar == null) {
            e(rVar, -1, "service type invalid");
            return;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            rVar2 = (ve3.r) i95.n0.c(ve3.n.class);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            rVar2 = (ve3.r) i95.n0.c(ve3.s.class);
        }
        if (rVar2 == null) {
            e(rVar, -1, "service not found");
            return;
        }
        b(rVar2, data, rVar);
        if (rVar2 instanceof ve3.s) {
            d((ve3.s) rVar2, data, rVar);
        }
    }

    public void d(ve3.s service, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
    }

    public final void e(com.tencent.mm.ipcinvoker.r rVar, int i17, java.lang.String errorMessage) {
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData(i17, errorMessage, null, 4, null));
        }
    }

    public void f(ve3.u action, com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData data, com.tencent.mm.ipcinvoker.r rVar) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(data, "data");
    }
}
