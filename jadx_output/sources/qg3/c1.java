package qg3;

/* loaded from: classes.dex */
public final class c1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362815e;

    public c1(int i17, yz5.l lVar) {
        this.f362814d = i17;
        this.f362815e = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", "prefetchChannelFlow onCgiBack pullType:" + this.f362814d + ", errType:" + i17 + ", errCode:" + i18);
        yz5.l lVar = this.f362815e;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            byte[] bArr = null;
            bw5.wp wpVar = fVar instanceof bw5.wp ? (bw5.wp) fVar : null;
            if (wpVar != null) {
                try {
                    bArr = wpVar.toByteArray();
                } catch (java.lang.Exception e17) {
                    lVar.invoke(new byte[0]);
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
                }
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            lVar.invoke(bArr);
        } else {
            lVar.invoke(new byte[0]);
        }
        return 0;
    }
}
