package ge1;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ge1.j f270953a = new ge1.j();

    /* renamed from: b, reason: collision with root package name */
    public static volatile ge1.i f270954b;

    public final java.lang.String a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object invoke = cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, str);
            java.lang.String str2 = invoke instanceof java.lang.String ? (java.lang.String) invoke : null;
            if (str2 == null) {
                return "";
            }
            java.lang.String obj = r26.n0.u0(str2).toString();
            return obj == null ? "" : obj;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.VendorRouter", "getSystemProperty failed, key=" + str + ", error=" + e17.getMessage());
            return "";
        }
    }

    public final ge1.i b() {
        java.lang.String str;
        ge1.i iVar;
        ge1.i iVar2 = f270954b;
        if (iVar2 != null) {
            return iVar2;
        }
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        if (str2 != null) {
            str = str2.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(str, "toUpperCase(...)");
        } else {
            str = "";
        }
        boolean z17 = false;
        if (r26.n0.B(str, "HONOR", false)) {
            java.lang.String a17 = a("ro.build.version.emui");
            if (!android.text.TextUtils.isEmpty(a17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.VendorRouter", "isBindHonorWallet, has EMUI version=" + a17 + ", using Huawei wallet");
            } else if ((!android.text.TextUtils.isEmpty(a("ro.odm.build.dgimage"))) && (!android.text.TextUtils.isEmpty(a("persist.sys.dg_image_resume")))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.VendorRouter", "isBindHonorWallet, dgImage marks present, using Huawei wallet");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.VendorRouter", "isBindHonorWallet, using Honor wallet");
                z17 = true;
            }
            if (z17) {
                iVar = ge1.i.f270949d;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.VendorRouter", "getVendorType, Honor device but bound to Huawei wallet, treating as UNSUPPORTED");
                iVar = ge1.i.f270951f;
            }
        } else {
            iVar = (r26.n0.B(str, "OPPO", false) || r26.n0.B(str, "ONEPLUS", false) || r26.n0.B(str, "REALME", false)) ? ge1.i.f270950e : ge1.i.f270951f;
        }
        f270954b = iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.VendorRouter", "getVendorType, manufacturer=" + str + ", vendorType=" + iVar);
        return iVar;
    }
}
