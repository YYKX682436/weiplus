package u35;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final u35.c f424434a = new u35.c();

    public final void a(int i17, yb5.d dVar) {
        b(i17, dVar, "", "");
    }

    public final void b(int i17, yb5.d dVar, java.lang.String userSessionId, java.lang.String wording) {
        kotlin.jvm.internal.o.g(userSessionId, "userSessionId");
        kotlin.jvm.internal.o.g(wording, "wording");
        int i18 = dVar != null && dVar.D() ? 2 : 1;
        com.tencent.mm.autogen.mmdata.rpt.FullScreenInputStruct fullScreenInputStruct = new com.tencent.mm.autogen.mmdata.rpt.FullScreenInputStruct();
        fullScreenInputStruct.f58263d = i17;
        fullScreenInputStruct.f58264e = i18;
        fullScreenInputStruct.f58265f = fullScreenInputStruct.b("sessionid", userSessionId, true);
        fullScreenInputStruct.f58266g = fullScreenInputStruct.b("Wording", wording, true);
        fullScreenInputStruct.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fullScreenInputStruct.g());
        java.lang.String n17 = fullScreenInputStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("FSInputReporter", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
