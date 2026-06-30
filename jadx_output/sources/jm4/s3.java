package jm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jm4.s3[] f300428d;

    static {
        jm4.s3[] s3VarArr = {new jm4.s3("pre", 0, 0), new jm4.s3("next", 1, 1), new jm4.s3("MAX", 2, 1), new jm4.s3("MIN", 3, 0), new jm4.s3("COUNT", 4, 2)};
        f300428d = s3VarArr;
        rz5.b.a(s3VarArr);
    }

    public s3(java.lang.String str, int i17, int i18) {
    }

    public static jm4.s3 valueOf(java.lang.String str) {
        return (jm4.s3) java.lang.Enum.valueOf(jm4.s3.class, str);
    }

    public static jm4.s3[] values() {
        return (jm4.s3[]) f300428d.clone();
    }
}
