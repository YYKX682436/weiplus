package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn0.n[] f309579d;

    static {
        kn0.n[] nVarArr = {new kn0.n("ROLE_DEFAULT", 0), new kn0.n("ROLE_APPLY_PK", 1), new kn0.n("ROLE_ACCEPT_PK", 2)};
        f309579d = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static kn0.n valueOf(java.lang.String str) {
        return (kn0.n) java.lang.Enum.valueOf(kn0.n.class, str);
    }

    public static kn0.n[] values() {
        return (kn0.n[]) f309579d.clone();
    }
}
