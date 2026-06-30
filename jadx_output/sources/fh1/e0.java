package fh1;

/* loaded from: classes7.dex */
public final class e0 implements com.tencent.mm.plugin.magicbrush.v7 {

    /* renamed from: a, reason: collision with root package name */
    public static final fh1.e0 f262543a = new fh1.e0();

    public final jc3.x b(java.lang.String instanceName, android.os.Parcelable parcelable) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs");
        com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs mBFramePkgManagementFsIPCInitArgs = (com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs) parcelable;
        fh1.l0 l0Var = new fh1.l0(instanceName);
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader wxaCommLib = mBFramePkgManagementFsIPCInitArgs.f85743f;
        kotlin.jvm.internal.o.g(wxaCommLib, "wxaCommLib");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerFileSystem fsPath:");
        java.lang.String str = mBFramePkgManagementFsIPCInitArgs.f85742e;
        sb6.append(str == null ? "" : str);
        sb6.append(", lib:");
        sb6.append(wxaCommLib.W0());
        com.tencent.mars.xlog.Log.i(l0Var.f262560e, sb6.toString());
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = new fh1.j0(str).f262556b;
        kotlin.jvm.internal.o.f(u1Var, "provide(...)");
        l0Var.f262562g = u1Var;
        l0Var.f262561f = wxaCommLib;
        return l0Var;
    }
}
