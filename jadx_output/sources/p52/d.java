package p52;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p52.d[] f352007d;

    static {
        p52.d[] dVarArr = {new p52.d("EXPOSURE", 0, 0), new p52.d("INOUT", 1, 1), new p52.d("INOUT_WITHOUT_78EVENT", 2, 2)};
        f352007d = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
    }

    public static p52.d valueOf(java.lang.String str) {
        return (p52.d) java.lang.Enum.valueOf(p52.d.class, str);
    }

    public static p52.d[] values() {
        return (p52.d[]) f352007d.clone();
    }
}
