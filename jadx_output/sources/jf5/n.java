package jf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final jf5.n f299481d;

    /* renamed from: e, reason: collision with root package name */
    public static final jf5.n f299482e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jf5.n[] f299483f;

    static {
        jf5.n nVar = new jf5.n("VERTICAL", 0);
        f299481d = nVar;
        jf5.n nVar2 = new jf5.n("HORIZONTAL", 1);
        f299482e = nVar2;
        jf5.n[] nVarArr = {nVar, nVar2};
        f299483f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static jf5.n valueOf(java.lang.String str) {
        return (jf5.n) java.lang.Enum.valueOf(jf5.n.class, str);
    }

    public static jf5.n[] values() {
        return (jf5.n[]) f299483f.clone();
    }
}
