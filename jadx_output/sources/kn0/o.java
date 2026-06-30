package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn0.o[] f309580d;

    static {
        kn0.o[] oVarArr = {new kn0.o("NO_PK", 0), new kn0.o("PK_WAITING", 1), new kn0.o("PK_LINKING", 2)};
        f309580d = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static kn0.o valueOf(java.lang.String str) {
        return (kn0.o) java.lang.Enum.valueOf(kn0.o.class, str);
    }

    public static kn0.o[] values() {
        return (kn0.o[]) f309580d.clone();
    }
}
