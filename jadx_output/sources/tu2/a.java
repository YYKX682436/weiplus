package tu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tu2.a[] f422130d;

    static {
        tu2.a[] aVarArr = {new tu2.a("Display", 0, 1), new tu2.a("Hide", 1, 2), new tu2.a("DisplayWithFollow", 2, 3)};
        f422130d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static tu2.a valueOf(java.lang.String str) {
        return (tu2.a) java.lang.Enum.valueOf(tu2.a.class, str);
    }

    public static tu2.a[] values() {
        return (tu2.a[]) f422130d.clone();
    }
}
