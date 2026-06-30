package f65;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f65.x[] f260004d;

    static {
        f65.x[] xVarArr = {new f65.x("SendWithRaw", 0, 1L), new f65.x("SendWithoutRaw", 1, 2L)};
        f260004d = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17, long j17) {
    }

    public static f65.x valueOf(java.lang.String str) {
        return (f65.x) java.lang.Enum.valueOf(f65.x.class, str);
    }

    public static f65.x[] values() {
        return (f65.x[]) f260004d.clone();
    }
}
