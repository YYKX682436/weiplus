package xn5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.d f455659d;

    /* renamed from: e, reason: collision with root package name */
    public static final xn5.d f455660e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xn5.d[] f455661f;

    static {
        xn5.d dVar = new xn5.d("Start", 0);
        f455659d = dVar;
        xn5.d dVar2 = new xn5.d("End", 1);
        f455660e = dVar2;
        xn5.d[] dVarArr = {dVar, dVar2};
        f455661f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static xn5.d valueOf(java.lang.String str) {
        return (xn5.d) java.lang.Enum.valueOf(xn5.d.class, str);
    }

    public static xn5.d[] values() {
        return (xn5.d[]) f455661f.clone();
    }
}
