package p05;

/* loaded from: classes5.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.n2 f350626a = new p05.n2();

    public final void a(int i17, java.lang.String cgiResult) {
        kotlin.jvm.internal.o.g(cgiResult, "cgiResult");
        com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct wevisionSwitchResStruct = new com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        wevisionSwitchResStruct.f62979d = tq5.i.f421269a;
        wevisionSwitchResStruct.f62981f = 1;
        wevisionSwitchResStruct.f62980e = i17;
        wevisionSwitchResStruct.f62982g = wevisionSwitchResStruct.b("CgiSwitchRes", cgiResult, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisConfigReporter", "reportCgiResult: " + wevisionSwitchResStruct.n());
        wevisionSwitchResStruct.k();
    }
}
