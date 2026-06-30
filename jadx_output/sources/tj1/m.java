package tj1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final tj1.l f419703e;

    /* renamed from: f, reason: collision with root package name */
    public static final tj1.m f419704f;

    /* renamed from: g, reason: collision with root package name */
    public static final tj1.m f419705g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tj1.m[] f419706h;

    /* renamed from: d, reason: collision with root package name */
    public final int f419707d;

    static {
        tj1.m mVar = new tj1.m("CANNOT_TRANSLATE", 0, 0);
        f419704f = mVar;
        tj1.m mVar2 = new tj1.m("CAN_TRANSLATE", 1, 1);
        f419705g = mVar2;
        tj1.m[] mVarArr = {mVar, mVar2};
        f419706h = mVarArr;
        rz5.b.a(mVarArr);
        f419703e = new tj1.l(null);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f419707d = i18;
    }

    public static tj1.m valueOf(java.lang.String str) {
        return (tj1.m) java.lang.Enum.valueOf(tj1.m.class, str);
    }

    public static tj1.m[] values() {
        return (tj1.m[]) f419706h.clone();
    }
}
