package t14;

/* loaded from: classes11.dex */
public final class x implements com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f414599d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f414600e;

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            try {
                int h17 = gm0.j1.b().h();
                java.lang.String k17 = gm0.j1.b().k();
                com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountOnSceneEnd", "onSceneEnd() called errMsg = " + str + ", scene = " + m1Var + " uin:" + h17 + " username:" + k17);
                if (f414599d != null) {
                    com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                    errorMsgInfoStruct.f56113e = 2877L;
                    errorMsgInfoStruct.f56117i = h17;
                    errorMsgInfoStruct.f56118j = f414599d != null ? r7.intValue() : 0L;
                    errorMsgInfoStruct.r(k17);
                    errorMsgInfoStruct.s(f414600e);
                    errorMsgInfoStruct.t(com.tencent.mm.sdk.platformtools.z.f193109e);
                    errorMsgInfoStruct.o();
                    errorMsgInfoStruct.k();
                }
                f414599d = java.lang.Integer.valueOf(h17);
                f414600e = k17;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwitchAccountOnSceneEnd", th6, "onSceneEnd err", new java.lang.Object[0]);
            }
        }
    }
}
