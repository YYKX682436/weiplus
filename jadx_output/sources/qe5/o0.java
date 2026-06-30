package qe5;

/* loaded from: classes9.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qe5.o0 f362163a = new qe5.o0();

    public final com.tencent.mm.pluginsdk.model.app.d a(qe5.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(params.f362093b, params.f362094c);
        if (J0 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(params.f362093b);
            int i17 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", valueOf, new x51.s1());
            return J0;
        }
        if (ez.v0.f257777a.k(java.lang.Integer.valueOf(params.f362092a))) {
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(params.f362095d);
        if (h17 == null) {
            int i18 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new x51.s1());
            return null;
        }
        if (h17.field_msgInfoId != params.f362093b && !com.tencent.mm.vfs.w6.j(h17.field_fileFullPath)) {
            com.tencent.mm.pluginsdk.model.app.k0.s(params.f362093b, params.f362094c, params.f362096e, null);
            com.tencent.mm.pluginsdk.model.app.d J02 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(params.f362093b, params.f362094c);
            if (J02 == null) {
                int i19 = x51.t1.f452086a;
                com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachDownLoadUtil", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new x51.s1());
                return h17;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new qe5.n0(h17, J02), "copyAttachFromLocal");
        }
        return h17;
    }
}
