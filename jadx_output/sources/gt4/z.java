package gt4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final gt4.z f275578d;

    /* renamed from: e, reason: collision with root package name */
    public static final gt4.z f275579e;

    /* renamed from: f, reason: collision with root package name */
    public static final gt4.z f275580f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gt4.z[] f275581g;

    static {
        gt4.z zVar = new gt4.z("None", 0);
        gt4.z zVar2 = new gt4.z("OneWeek", 1);
        f275578d = zVar2;
        gt4.z zVar3 = new gt4.z("OneMonth", 2);
        f275579e = zVar3;
        gt4.z zVar4 = new gt4.z("ThreeMonth", 3);
        f275580f = zVar4;
        gt4.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f275581g = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    public static gt4.z valueOf(java.lang.String str) {
        return (gt4.z) java.lang.Enum.valueOf(gt4.z.class, str);
    }

    public static gt4.z[] values() {
        return (gt4.z[]) f275581g.clone();
    }
}
