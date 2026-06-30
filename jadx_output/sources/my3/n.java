package my3;

/* loaded from: classes13.dex */
public final class n implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332816d;

    public n(my3.q qVar) {
        this.f332816d = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        fy3.i iVar = fy3.i.f267249h;
        my3.q qVar = this.f332816d;
        qVar.Ri(iVar);
        boolean z17 = qVar.f332822e.length() > 0;
        hy3.a aVar = hy3.b.f286071a;
        if (!z17) {
            if (!(qVar.f332821d.length() > 0)) {
                fy3.f fVar = qVar.f332833s;
                if (fVar == null) {
                    qVar.Ri(fy3.i.f267245d);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onStartService");
                int i17 = com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.E;
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
                rtosWatchLoginUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "handleScanResult");
                fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
                java.lang.String deviceMac = rtosWatchLoginUI.f158601s;
                java.lang.String avatar = rtosWatchLoginUI.f158605w;
                my3.q qVar2 = (my3.q) eVar;
                qVar2.getClass();
                kotlin.jvm.internal.o.g(deviceMac, "deviceMac");
                kotlin.jvm.internal.o.g(avatar, "avatar");
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "deviceMac sha256=".concat(deviceMac));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (aVar.b(context)) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    java.lang.String a17 = aVar.a(context2, deviceMac);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "handleScanInfo watch newmac=" + a17 + ", avatar is " + avatar);
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                    if (aVar.c(context3, a17)) {
                        qVar2.ij(a17, avatar, true);
                    } else {
                        qVar2.Ri(fy3.i.f267246e);
                        fy3.f fVar2 = qVar2.f332833s;
                        if (fVar2 != null) {
                            ((oy3.t) fVar2).b(9);
                        }
                    }
                } else {
                    qVar2.Ri(fy3.i.f267246e);
                    fy3.f fVar3 = qVar2.f332833s;
                    if (fVar3 != null) {
                        ((oy3.t) fVar3).b(13);
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1904, 60);
                return;
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1904, 61);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "init callback status " + qVar.f332832r);
        fy3.i iVar2 = qVar.f332832r;
        fy3.i iVar3 = fy3.i.f267250i;
        if (iVar2 == iVar3 || iVar2 == fy3.i.f267251m) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosServiceImpl", "logging in");
            return;
        }
        qVar.Ri(iVar3);
        java.lang.String str = qVar.f332821d;
        java.lang.String str2 = qVar.f332822e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startConnectWatchAndAutoLogin mac:%s username:%s", str, str2);
        android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        if (!aVar.b(context4)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bluetooth is not enable");
            qVar.nj(str, str2);
            return;
        }
        android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        java.lang.String a18 = aVar.a(context5, str);
        android.content.Context context6 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        if (aVar.c(context6, a18)) {
            qVar.nj(str, str2);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "unBonded need logout and clearBindInfo");
        qVar.Zi(4);
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.u.class);
    }
}
