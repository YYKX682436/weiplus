package sz3;

/* loaded from: classes15.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final sz3.y a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
        java.lang.String str2 = wz3.e.f450777a;
        java.lang.String str3 = wz3.e.f450778b;
        if ((str2.length() > 0) && com.tencent.mm.vfs.w6.j(str2)) {
            if ((str3.length() > 0) && com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanFocusEngineInitModelParam", "getInitModelParam useXNet and model valid");
                sz3.y yVar = new sz3.y();
                yVar.f414158c = true;
                yVar.f414159d = true;
                yVar.f414156a = str2;
                yVar.f414157b = str3;
                return yVar;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanFocusEngineInitModelParam", "getInitModelParam useXNet and model invalid");
        sz3.y yVar2 = new sz3.y();
        yVar2.f414158c = true;
        yVar2.f414159d = false;
        return yVar2;
    }
}
