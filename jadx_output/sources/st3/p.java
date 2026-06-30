package st3;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.p f412561a = new st3.p();

    /* renamed from: b, reason: collision with root package name */
    public static int f412562b;

    /* renamed from: c, reason: collision with root package name */
    public static int f412563c;

    /* renamed from: d, reason: collision with root package name */
    public static st3.q f412564d;

    /* renamed from: e, reason: collision with root package name */
    public static int f412565e;

    /* renamed from: f, reason: collision with root package name */
    public static int f412566f;

    /* renamed from: g, reason: collision with root package name */
    public static int f412567g;

    /* renamed from: h, reason: collision with root package name */
    public static int f412568h;

    public static void a(st3.p pVar, int i17, int i18, int i19, java.lang.Object obj) {
        st3.q qVar;
        if ((i19 & 1) != 0) {
            i17 = -1;
        }
        pVar.getClass();
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(null);
        f412566f = a17.f197136b;
        f412567g = a17.f197135a;
        f412568h = (int) ((r2 * 16) / 9.0f);
        if (i17 == -1) {
            f412563c = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "updateNavigationBarHeight >> " + f412563c);
        } else {
            f412563c = i17;
        }
        int i27 = f412566f;
        f412565e = (i27 - f412568h) - f412563c;
        f412562b = (((i27 - com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 88)) - f412563c) - com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 116)) - com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 64);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "calculateImproveRadioConfig >> captureSafetyHeight: " + i18 + " currentBottomHeight: " + i17 + ", longSide: " + f412566f + ", shortSide: " + f412567g + ", cameraViewHeight: " + f412568h + ", xStrategy: " + f412565e + ", navigationBarHeight: " + f412563c + ", resideAreaHeight: " + f412562b + ' ');
        int i28 = f412565e;
        if (i28 >= i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_TOP");
            qVar = st3.q.f412569d;
        } else if (i28 >= f412563c + com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 88)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Bottom");
            qVar = st3.q.f412571f;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Center");
            qVar = st3.q.f412570e;
        }
        f412564d = qVar;
    }
}
