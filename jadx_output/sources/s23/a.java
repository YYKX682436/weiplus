package s23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s23.a[] f402297d;

    static {
        s23.a[] aVarArr = {new s23.a("NO_SELECT", 0, 0), new s23.a("SELECTED", 1, 1), new s23.a("SELECTED_NO_ENABLE_CHANGE", 2, 2)};
        f402297d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static s23.a valueOf(java.lang.String str) {
        return (s23.a) java.lang.Enum.valueOf(s23.a.class, str);
    }

    public static s23.a[] values() {
        return (s23.a[]) f402297d.clone();
    }
}
