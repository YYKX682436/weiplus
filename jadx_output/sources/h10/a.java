package h10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h10.a[] f277957d;

    static {
        h10.a[] aVarArr = {new h10.a("ACCESSIBLE_NAVIGATION", 0, 1), new h10.a("INVERT_COLORS", 1, 2), new h10.a("DISABLE_ANIMATIONS", 2, 4), new h10.a("BOLD_TEXT", 3, 8), new h10.a("REDUCE_MOTION", 4, 16), new h10.a("HIGH_CONTRAST", 5, 32), new h10.a("ON_OFF_SWITCH_LABELS", 6, 64)};
        f277957d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static h10.a valueOf(java.lang.String str) {
        return (h10.a) java.lang.Enum.valueOf(h10.a.class, str);
    }

    public static h10.a[] values() {
        return (h10.a[]) f277957d.clone();
    }
}
