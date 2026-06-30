package fy3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final fy3.i f267245d;

    /* renamed from: e, reason: collision with root package name */
    public static final fy3.i f267246e;

    /* renamed from: f, reason: collision with root package name */
    public static final fy3.i f267247f;

    /* renamed from: g, reason: collision with root package name */
    public static final fy3.i f267248g;

    /* renamed from: h, reason: collision with root package name */
    public static final fy3.i f267249h;

    /* renamed from: i, reason: collision with root package name */
    public static final fy3.i f267250i;

    /* renamed from: m, reason: collision with root package name */
    public static final fy3.i f267251m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ fy3.i[] f267252n;

    static {
        fy3.i iVar = new fy3.i("Idle", 0);
        f267245d = iVar;
        fy3.i iVar2 = new fy3.i("Ready", 1);
        f267246e = iVar2;
        fy3.i iVar3 = new fy3.i("CheckingRes", 2);
        f267247f = iVar3;
        fy3.i iVar4 = new fy3.i("ConnectingService", 3);
        f267248g = iVar4;
        fy3.i iVar5 = new fy3.i("ServiceReady", 4);
        f267249h = iVar5;
        fy3.i iVar6 = new fy3.i("LoggingIn", 5);
        f267250i = iVar6;
        fy3.i iVar7 = new fy3.i("LoggedIn", 6);
        f267251m = iVar7;
        fy3.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
        f267252n = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static fy3.i valueOf(java.lang.String str) {
        return (fy3.i) java.lang.Enum.valueOf(fy3.i.class, str);
    }

    public static fy3.i[] values() {
        return (fy3.i[]) f267252n.clone();
    }
}
