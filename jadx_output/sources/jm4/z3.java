package jm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z3 {

    /* renamed from: d, reason: collision with root package name */
    public static final jm4.y3 f300453d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jm4.z3[] f300454e;

    static {
        jm4.z3[] z3VarArr = {new jm4.z3("LoadNetFirstStart", 0, 1), new jm4.z3("LoadNetFirstFinish", 1, 2), new jm4.z3("RefreshStart", 2, 3), new jm4.z3("RefreshFinish", 3, 4), new jm4.z3("LoadNetMoreStart", 4, 5), new jm4.z3("LoadNetMoreFinish", 5, 6), new jm4.z3("MAX", 6, 6), new jm4.z3("MIN", 7, 1), new jm4.z3("COUNT", 8, 6)};
        f300454e = z3VarArr;
        rz5.b.a(z3VarArr);
        f300453d = new jm4.y3(null);
    }

    public z3(java.lang.String str, int i17, int i18) {
    }

    public static jm4.z3 valueOf(java.lang.String str) {
        return (jm4.z3) java.lang.Enum.valueOf(jm4.z3.class, str);
    }

    public static jm4.z3[] values() {
        return (jm4.z3[]) f300454e.clone();
    }
}
