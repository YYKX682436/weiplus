package tl;

/* loaded from: classes12.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f420174a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f420175b;

    static {
        a();
    }

    public static void a() {
        boolean z17 = j62.e.g().i("clicfg_load_silkso_ignore_cpu", 1, true, true) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkCodec", "load wechatvoicesilk, ignore cpu: %s", java.lang.Boolean.valueOf(z17));
        int a17 = wo.r.a();
        java.lang.String str = android.os.Build.CPU_ABI;
        java.lang.String str2 = android.os.Build.CPU_ABI2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkCodec", "abi: %s, abi2: %s, cpuFlag: %d", str, str2, java.lang.Integer.valueOf(a17));
        if (z17) {
            try {
                tl.i0.class.getClassLoader();
                fp.d0.n("wechatvoicesilk");
                f420174a = true;
                f420175b = true;
            } catch (java.lang.UnsatisfiedLinkError unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkCodec", "load library failed!");
                f420174a = false;
                f420175b = false;
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.contains("armeabi") || com.tencent.mm.sdk.platformtools.t8.K0(str2) || str2.contains("armeabi")) {
            try {
                if ((a17 & 1024) != 0) {
                    tl.i0.class.getClassLoader();
                    fp.d0.n("wechatvoicesilk");
                    f420174a = true;
                    f420175b = true;
                } else if ((a17 & 512) != 0) {
                    com.tencent.mars.xlog.Log.e("voice SilkCodec", "load library failed! silk don't support armv6!!!!");
                    f420174a = false;
                    f420175b = false;
                } else {
                    com.tencent.mars.xlog.Log.e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
                    f420174a = false;
                    f420175b = false;
                }
            } catch (java.lang.UnsatisfiedLinkError unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkCodec", "load library failed!");
                f420174a = false;
                f420175b = false;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkCodec", "don't contains armeabi");
            com.tencent.mars.xlog.Log.e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
            f420174a = false;
            f420175b = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkCodec", "finish load silk so, canUseSilkDecode: %b, canUseSilkEncode: %b", java.lang.Boolean.valueOf(f420174a), java.lang.Boolean.valueOf(f420175b));
    }
}
