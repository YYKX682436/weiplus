package iy4;

@j95.b
/* loaded from: classes11.dex */
public final class z extends i95.w {
    public static final boolean wi() {
        boolean b17 = kotlin.jvm.internal.o.b(j62.e.g().j("clicfg_ext_devlice_mul_platform_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableMultiPlatformImpl: " + b17);
        return b17;
    }

    public final void Ai(java.lang.String uuid) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(uuid, "uuid");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList K = ug3.i.K();
        kotlin.jvm.internal.o.f(K, "getOnlineInfoList(...)");
        java.util.Iterator it = kz5.n0.S0(K).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((ug3.k) obj).f392473p, uuid)) {
                    break;
                }
            }
        }
        ug3.k kVar = (ug3.k) obj;
        if (kVar != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new iy4.y(kVar, context, uuid, null), 3, null);
        } else {
            ot5.g.a("MicroMsg.ExtDeviceService", "not find device for uuid: ".concat(uuid));
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.wechat.aff.ext_device.g.f216697a = iy4.v.f296014a;
        com.tencent.wechat.aff.ext_device.d.f216696a = iy4.w.f296017a;
    }
}
