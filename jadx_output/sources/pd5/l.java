package pd5;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final pd5.k f353580b = new pd5.k(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f353581c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f353582d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f353583e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f353584a = new int[8];

    static {
        java.lang.Class[] clsArr = {com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_AppBrand.class, com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_OpenSdkAppBrand.class, com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ItemFactoryCustomSupport.class, com.tencent.mm.repairer.config.chatting.file.RepairerConfigMvvmItem_FileNewStyle.class, com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_LiteApp.class, com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_FinderNameCard.class, com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ImgArcProgress.class, com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupUiVisibility.class};
        f353581c = clsArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
        for (java.lang.Class cls : clsArr) {
            arrayList.add(((q55.e) cls.newInstance()).k());
        }
        f353582d = arrayList;
        f353583e = new java.util.LinkedHashMap();
    }

    public l() {
        a();
    }

    public final boolean a() {
        boolean z17 = false;
        for (int i17 = 0; i17 < 8; i17++) {
            int c17 = j62.e.g().c((q55.e) f353581c[i17].newInstance());
            int[] iArr = this.f353584a;
            if (c17 != iArr[i17]) {
                iArr[i17] = c17;
                z17 = true;
            }
        }
        return z17;
    }
}
