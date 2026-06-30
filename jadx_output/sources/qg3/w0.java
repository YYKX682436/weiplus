package qg3;

/* loaded from: classes.dex */
public final class w0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362883d;

    public w0(yz5.l lVar) {
        this.f362883d = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", "fetchTopicList onCgiBack errType:" + i17 + ", errCode:" + i18);
        yz5.l lVar = this.f362883d;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            byte[] bArr = null;
            r45.oa1 oa1Var = fVar instanceof r45.oa1 ? (r45.oa1) fVar : null;
            if (oa1Var != null) {
                try {
                    bArr = oa1Var.toByteArray();
                } catch (java.lang.Exception e17) {
                    lVar.invoke(new byte[0]);
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NativeCgiJavaStatic", e17, "fetchTopicList toByteArray", new java.lang.Object[0]);
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
