package ss3;

/* loaded from: classes9.dex */
public class r implements com.tencent.mm.modelbase.i1 {

    /* renamed from: d, reason: collision with root package name */
    public long f412014d = 0;

    /* JADX WARN: Removed duplicated region for block: B:43:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x065f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x077a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r40) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss3.r.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        java.lang.String str = (java.lang.String) r0Var.f70758b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppMsgExtension", "[onPreDelMessage] functionId:%s", str);
        try {
            ss3.d0.Di().n0(str, 20, true, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReaderAppMsgExtension", "[onPreDelMessage] Exception:%s", e17);
        }
    }
}
