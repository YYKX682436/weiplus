package sf3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final sf3.m f407402d;

    /* renamed from: e, reason: collision with root package name */
    public static final sf3.m f407403e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf3.m f407404f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf3.m f407405g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf3.m f407406h;

    /* renamed from: i, reason: collision with root package name */
    public static final sf3.m f407407i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ sf3.m[] f407408m;

    static {
        sf3.m mVar = new sf3.m("UNKNOWN", 0, com.eclipsesource.mmv8.Platform.UNKNOWN);
        f407402d = mVar;
        sf3.m mVar2 = new sf3.m("RAW", 1, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
        f407403e = mVar2;
        sf3.m mVar3 = new sf3.m("MID", 2, "mid");
        f407404f = mVar3;
        sf3.m mVar4 = new sf3.m("MID_TRANSLATE", 3, "mid_translate");
        f407405g = mVar4;
        sf3.m mVar5 = new sf3.m("THUMB", 4, "thumb");
        f407406h = mVar5;
        sf3.m mVar6 = new sf3.m("THUMB_HD", 5, "thumb");
        f407407i = mVar6;
        sf3.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new sf3.m("HEVC_RAW", 6, "hevc_mid"), new sf3.m("HEVC_MID", 7, "hevc_raw")};
        f407408m = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, java.lang.String str2) {
    }

    public static sf3.m valueOf(java.lang.String str) {
        return (sf3.m) java.lang.Enum.valueOf(sf3.m.class, str);
    }

    public static sf3.m[] values() {
        return (sf3.m[]) f407408m.clone();
    }
}
