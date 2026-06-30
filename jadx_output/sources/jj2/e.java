package jj2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final jj2.e f299979d;

    /* renamed from: e, reason: collision with root package name */
    public static final jj2.e f299980e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jj2.e[] f299981f;

    static {
        jj2.e eVar = new jj2.e("Circle", 0);
        f299979d = eVar;
        jj2.e eVar2 = new jj2.e("Rect", 1);
        f299980e = eVar2;
        jj2.e[] eVarArr = {eVar, eVar2};
        f299981f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static jj2.e valueOf(java.lang.String str) {
        return (jj2.e) java.lang.Enum.valueOf(jj2.e.class, str);
    }

    public static jj2.e[] values() {
        return (jj2.e[]) f299981f.clone();
    }
}
