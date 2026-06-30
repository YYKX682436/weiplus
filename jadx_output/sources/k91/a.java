package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final k91.a f305521e;

    /* renamed from: f, reason: collision with root package name */
    public static final k91.a f305522f;

    /* renamed from: g, reason: collision with root package name */
    public static final k91.a f305523g;

    /* renamed from: h, reason: collision with root package name */
    public static final k91.a f305524h;

    /* renamed from: i, reason: collision with root package name */
    public static final k91.a f305525i;

    /* renamed from: m, reason: collision with root package name */
    public static final k91.a f305526m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k91.a[] f305527n;

    /* renamed from: d, reason: collision with root package name */
    public final int f305528d;

    static {
        k91.a aVar = new k91.a("ShareToWeWork", 0, 0);
        k91.a aVar2 = new k91.a("ShareToFriend", 1, 1);
        f305521e = aVar2;
        k91.a aVar3 = new k91.a("CopyShortLink", 2, 2);
        f305522f = aVar3;
        k91.a aVar4 = new k91.a("SecFlagForSinglePageMode", 3, 3);
        f305523g = aVar4;
        k91.a aVar5 = new k91.a("ShowTradeComplaint", 4, 4);
        f305524h = aVar5;
        k91.a aVar6 = new k91.a("ScreenshotJumpWxaBtn", 5, 5);
        f305525i = aVar6;
        k91.a aVar7 = new k91.a("PosterJumpWxaBtn", 6, 6);
        f305526m = aVar7;
        k91.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f305527n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f305528d = i18;
    }

    public static int b(k91.a aVar, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC config, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getControlByte");
        }
        boolean z17 = false;
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(config, "config");
        byte[] bArr = config.f77342y1;
        if (!(bArr == null)) {
            int length = bArr.length - 1;
            int i19 = aVar.f305528d;
            if (length >= i19) {
                byte b17 = bArr[i19];
                if (b17 >= 0 && b17 < 4) {
                    z17 = true;
                }
                if (z17) {
                    i17 = b17;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionSheetControlIndex", "getControlByte for " + aVar.name() + " [" + i17 + ']');
        return i17;
    }

    public static k91.a valueOf(java.lang.String str) {
        return (k91.a) java.lang.Enum.valueOf(k91.a.class, str);
    }

    public static k91.a[] values() {
        return (k91.a[]) f305527n.clone();
    }

    public final int a(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC config) {
        kotlin.jvm.internal.o.g(config, "config");
        return b(this, config, 0, 2, null);
    }
}
