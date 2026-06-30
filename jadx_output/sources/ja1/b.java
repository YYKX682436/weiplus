package ja1;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.udp.libmmudp.b {
    @Override // com.tencent.mm.udp.libmmudp.b
    public void loadLibrary(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
            boolean z17 = ja1.e.f298603a;
            fp.d0.n(str);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e17, "hy: link %s error!!", str);
            va1.f.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }
}
