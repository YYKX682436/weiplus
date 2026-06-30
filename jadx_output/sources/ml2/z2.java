package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.z2[] f328341d;

    static {
        ml2.z2[] z2VarArr = {new ml2.z2("CLICKED", 0, 1), new ml2.z2("OTHER", 1, 2)};
        f328341d = z2VarArr;
        rz5.b.a(z2VarArr);
    }

    public z2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.z2 valueOf(java.lang.String str) {
        return (ml2.z2) java.lang.Enum.valueOf(ml2.z2.class, str);
    }

    public static ml2.z2[] values() {
        return (ml2.z2[]) f328341d.clone();
    }
}
