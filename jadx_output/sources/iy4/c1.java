package iy4;

/* loaded from: classes11.dex */
public class c1 implements com.tencent.mm.modelbase.i1, k70.w {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f295938d;

    public final void b(java.util.Map map, int i17) {
        java.lang.String str = (java.lang.String) map.get(".msg.op.name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("syncRecord")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusNotifyMsgExtension", "ExtDeviceService - onNewSyncRecordSync - error function name was not matched");
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.op.arg");
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatusNotifyMsgExtension", "ExtDeviceService - onNewSyncRecordSync - error no arg");
            return;
        }
        ((iy4.z) i95.n0.c(iy4.z.class)).getClass();
        com.tencent.wechat.aff.ext_device.m.f216700c.e(str2, i17 * 1000, iy4.u.f296010a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0793  */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r37) {
        /*
            Method dump skipped, instructions count: 2434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iy4.c1.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusNotifyMsgExtension", "onImgTaskEnd imgLocalId:%d, msgLocalId:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
