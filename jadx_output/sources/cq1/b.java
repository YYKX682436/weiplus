package cq1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cq1.b[] f221328d;

    static {
        cq1.b[] bVarArr = {new cq1.b("UNDEFINE", 0, 0), new cq1.b("END", 1, 1), new cq1.b("PASS", 2, 2)};
        f221328d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
    }

    public static cq1.b valueOf(java.lang.String str) {
        return (cq1.b) java.lang.Enum.valueOf(cq1.b.class, str);
    }

    public static cq1.b[] values() {
        return (cq1.b[]) f221328d.clone();
    }
}
