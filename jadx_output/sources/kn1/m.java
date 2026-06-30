package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.m f309632e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.m f309633f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn1.m f309634g;

    /* renamed from: h, reason: collision with root package name */
    public static final kn1.m f309635h;

    /* renamed from: i, reason: collision with root package name */
    public static final kn1.m f309636i;

    /* renamed from: m, reason: collision with root package name */
    public static final kn1.m f309637m;

    /* renamed from: n, reason: collision with root package name */
    public static final kn1.m f309638n;

    /* renamed from: o, reason: collision with root package name */
    public static final kn1.m f309639o;

    /* renamed from: p, reason: collision with root package name */
    public static final kn1.m f309640p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ kn1.m[] f309641q;

    /* renamed from: d, reason: collision with root package name */
    public final int f309642d;

    static {
        kn1.m mVar = new kn1.m("kAction_Unknown", 0, -1);
        f309632e = mVar;
        kn1.m mVar2 = new kn1.m("kAction_Start", 1, 0);
        f309633f = mVar2;
        kn1.m mVar3 = new kn1.m("kAction_Connect", 2, 1);
        f309634g = mVar3;
        kn1.m mVar4 = new kn1.m("kAction_Handshake", 3, 2);
        f309635h = mVar4;
        kn1.m mVar5 = new kn1.m("kAction_Prepare", 4, 3);
        f309636i = mVar5;
        kn1.m mVar6 = new kn1.m("kAction_DataTransfer", 5, 4);
        kn1.m mVar7 = new kn1.m("kAction_DataTransferContinue", 6, 5);
        kn1.m mVar8 = new kn1.m("kAction_DataQuickTransfer", 7, 6);
        kn1.m mVar9 = new kn1.m("kAction_Success", 8, 7);
        f309637m = mVar9;
        kn1.m mVar10 = new kn1.m("kAction_Failed", 9, 8);
        kn1.m mVar11 = new kn1.m("kAction_Stop", 10, 9);
        kn1.m mVar12 = new kn1.m("kAction_Pause", 11, 10);
        kn1.m mVar13 = new kn1.m("kAction_Other", 12, 11);
        kn1.m mVar14 = new kn1.m("kAction_Merge_Success", 13, 12);
        f309638n = mVar14;
        kn1.m mVar15 = new kn1.m("kAction_Transfer_And_Merge", 14, 13);
        kn1.m mVar16 = new kn1.m("kAction_MsgBackup", 15, 100);
        f309639o = mVar16;
        kn1.m mVar17 = new kn1.m("kAction_MsgRestore", 16, 101);
        f309640p = mVar17;
        kn1.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17};
        f309641q = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f309642d = i18;
    }

    public static kn1.m valueOf(java.lang.String str) {
        return (kn1.m) java.lang.Enum.valueOf(kn1.m.class, str);
    }

    public static kn1.m[] values() {
        return (kn1.m[]) f309641q.clone();
    }
}
