package rv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final rv3.z f400420d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv3.z f400421e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv3.z f400422f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rv3.z[] f400423g;

    static {
        rv3.z zVar = new rv3.z("NORMAL", 0);
        f400420d = zVar;
        rv3.z zVar2 = new rv3.z("USED", 1);
        f400421e = zVar2;
        rv3.z zVar3 = new rv3.z("LOADING", 2);
        f400422f = zVar3;
        rv3.z[] zVarArr = {zVar, zVar2, zVar3};
        f400423g = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    public static rv3.z valueOf(java.lang.String str) {
        return (rv3.z) java.lang.Enum.valueOf(rv3.z.class, str);
    }

    public static rv3.z[] values() {
        return (rv3.z[]) f400423g.clone();
    }
}
