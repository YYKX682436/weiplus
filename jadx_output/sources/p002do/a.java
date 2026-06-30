package p002do;

/* loaded from: classes10.dex */
public final class a extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void e() {
        g75.r rVar = this.f269401a;
        g75.z zVar = (g75.z) rVar.f269400o.f298076g;
        zVar.getClass();
        java.lang.Object obj = zVar.f().get("KeyAppMsgSubType");
        int intValue = obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : 0;
        java.lang.String j17 = ((g75.z) rVar.f269400o.f298076g).j("Common_ImageKey", "");
        java.lang.String j18 = ((g75.z) rVar.f269400o.f298076g).j("Common_TargetPath", "");
        java.lang.String j19 = ((g75.z) rVar.f269400o.f298076g).j("KeyFileMd5", "");
        i95.m c17 = i95.n0.c(a00.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zz.b vi6 = a00.i.vi((a00.i) c17, j18, intValue, j19, null, 8, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageLoaderAppMsgCheckDupPPC", "onDestroy " + j17 + ' ' + vi6.f477691a + ' ' + vi6.f477692b);
    }
}
