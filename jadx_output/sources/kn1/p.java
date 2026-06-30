package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.p f309654e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.p f309655f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn1.p[] f309656g;

    /* renamed from: d, reason: collision with root package name */
    public final int f309657d;

    static {
        kn1.p pVar = new kn1.p("kType_Unknown", 0, org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID);
        f309654e = pVar;
        kn1.p pVar2 = new kn1.p("kType_DestPhoneFromPhone", 1, 200);
        kn1.p pVar3 = new kn1.p("kType_SrcPhoneToPhone", 2, 201);
        kn1.p pVar4 = new kn1.p("kType_DestPcFromPhone", 3, 202);
        kn1.p pVar5 = new kn1.p("kType_SrcPhoneToPc", 4, 203);
        kn1.p pVar6 = new kn1.p("kType_DestPhoneFromPc", 5, 204);
        kn1.p pVar7 = new kn1.p("kType_SrcPcToPhone", 6, 205);
        kn1.p pVar8 = new kn1.p("kType_DestPhoneOldRestoreFromPc", 7, 206);
        kn1.p pVar9 = new kn1.p("kType_SrcPcOldRestoreToPhone", 8, 207);
        kn1.p pVar10 = new kn1.p("kType_DestPcFromPhone_Import", 9, 208);
        kn1.p pVar11 = new kn1.p("kType_DestPhoneFromPhone_Old", 10, 250);
        f309655f = pVar11;
        kn1.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, new kn1.p("kType_DestPhoneFromPhone_UI", 11, 300), new kn1.p("kType_SrcPhoneToPhone_UI", 12, 301), new kn1.p("kType_DestPcFromPhone_UI", 13, 302), new kn1.p("kType_SrcPhoneToPc_UI", 14, 303), new kn1.p("kType_DestPhoneFromPc_UI", 15, 304), new kn1.p("kType_SrcPcToPhone_UI", 16, 305), new kn1.p("kType_SrcPcOldRestoreToPhone_UI", 17, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE), new kn1.p("kType_DestPcFromPhone_Import_UI", 18, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR)};
        f309656g = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
        this.f309657d = i18;
    }

    public static kn1.p valueOf(java.lang.String str) {
        return (kn1.p) java.lang.Enum.valueOf(kn1.p.class, str);
    }

    public static kn1.p[] values() {
        return (kn1.p[]) f309656g.clone();
    }
}
