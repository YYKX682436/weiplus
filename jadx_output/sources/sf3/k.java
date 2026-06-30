package sf3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final sf3.k f407396d;

    /* renamed from: e, reason: collision with root package name */
    public static final sf3.k f407397e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf3.k f407398f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf3.k f407399g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf3.k f407400h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ sf3.k[] f407401i;

    static {
        sf3.k kVar = new sf3.k(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        sf3.k kVar2 = new sf3.k("THUMB_READY", 1);
        sf3.k kVar3 = new sf3.k("DOWNLOAD_ING", 2);
        f407396d = kVar3;
        sf3.k kVar4 = new sf3.k("DOWNLOAD_SUCCESS", 3);
        f407397e = kVar4;
        sf3.k kVar5 = new sf3.k("DOWNLOAD_FAILED", 4);
        f407398f = kVar5;
        sf3.k kVar6 = new sf3.k("TRANSLATED", 5);
        f407399g = kVar6;
        sf3.k kVar7 = new sf3.k("DL_ING_PROGRESS", 6);
        sf3.k kVar8 = new sf3.k("DL_ING", 7);
        sf3.k kVar9 = new sf3.k("DL_ING_HD", 8);
        sf3.k kVar10 = new sf3.k("DL_SUCCESS", 9);
        sf3.k kVar11 = new sf3.k("DL_FAIL", 10);
        sf3.k kVar12 = new sf3.k("DL_IS_CLEANED", 11);
        sf3.k kVar13 = new sf3.k("DL_IS_CLEANED_HAS_BACKUP", 12);
        sf3.k kVar14 = new sf3.k("DL_IS_CLEANED_HAS_HD_BACKUP", 13);
        sf3.k kVar15 = new sf3.k("DL_IS_SPAM", 14);
        sf3.k kVar16 = new sf3.k("UNKNOWN", 15);
        f407400h = kVar16;
        sf3.k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16};
        f407401i = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static sf3.k valueOf(java.lang.String str) {
        return (sf3.k) java.lang.Enum.valueOf(sf3.k.class, str);
    }

    public static sf3.k[] values() {
        return (sf3.k[]) f407401i.clone();
    }
}
