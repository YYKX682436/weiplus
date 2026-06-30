package po1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final po1.f f357306d;

    /* renamed from: e, reason: collision with root package name */
    public static final po1.e[] f357307e;

    /* renamed from: f, reason: collision with root package name */
    public static final po1.g f357308f;

    /* renamed from: g, reason: collision with root package name */
    public static final po1.g f357309g;

    /* renamed from: h, reason: collision with root package name */
    public static final po1.g f357310h;

    /* renamed from: i, reason: collision with root package name */
    public static final po1.g f357311i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ po1.g[] f357312m;

    static {
        po1.g gVar = new po1.g("DEVICE_PC", 0);
        f357308f = gVar;
        po1.g gVar2 = new po1.g("DEVICE_MAC", 1);
        f357309g = gVar2;
        po1.g gVar3 = new po1.g("DEVICE_USB_DISK", 2);
        f357310h = gVar3;
        po1.g gVar4 = new po1.g("DEVICE_NAS", 3);
        po1.g gVar5 = new po1.g("DEVICE_UNKNOWN", 4);
        f357311i = gVar5;
        po1.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f357312m = gVarArr;
        rz5.b.a(gVarArr);
        f357306d = new po1.f(null);
        f357307e = new po1.e[]{new po1.e(gVar2, com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_MAC, 4011), new po1.e(gVar, com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_WINDOWS, 4011), new po1.e(gVar3, com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_PORTABLE_DISK, 13001), new po1.e(gVar4, com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_NAS, 13000)};
    }

    public g(java.lang.String str, int i17) {
    }

    public static po1.g valueOf(java.lang.String str) {
        return (po1.g) java.lang.Enum.valueOf(po1.g.class, str);
    }

    public static po1.g[] values() {
        return (po1.g[]) f357312m.clone();
    }

    public final int h() {
        po1.e eVar;
        po1.e[] eVarArr = f357307e;
        int length = eVarArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr[i17];
            if (eVar.f357303a == this) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            return eVar.f357305c;
        }
        return -1;
    }
}
