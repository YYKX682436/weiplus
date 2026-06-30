package r70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final r70.d f393083d;

    /* renamed from: e, reason: collision with root package name */
    public static final r70.d f393084e;

    /* renamed from: f, reason: collision with root package name */
    public static final r70.d f393085f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r70.d[] f393086g;

    static {
        r70.d dVar = new r70.d("Start", 0);
        f393083d = dVar;
        r70.d dVar2 = new r70.d("Progress", 1);
        f393084e = dVar2;
        r70.d dVar3 = new r70.d("Finish", 2);
        f393085f = dVar3;
        r70.d[] dVarArr = {dVar, dVar2, dVar3};
        f393086g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static r70.d valueOf(java.lang.String str) {
        return (r70.d) java.lang.Enum.valueOf(r70.d.class, str);
    }

    public static r70.d[] values() {
        return (r70.d[]) f393086g.clone();
    }
}
