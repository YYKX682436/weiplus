package wr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ wr3.p0[] f448866d;

    static {
        wr3.p0[] p0VarArr = {new wr3.p0("Unmodified", 0, 0), new wr3.p0("Processing", 1, 1), new wr3.p0("Modified", 2, 2)};
        f448866d = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17, int i18) {
    }

    public static wr3.p0 valueOf(java.lang.String str) {
        return (wr3.p0) java.lang.Enum.valueOf(wr3.p0.class, str);
    }

    public static wr3.p0[] values() {
        return (wr3.p0[]) f448866d.clone();
    }
}
