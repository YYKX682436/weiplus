package rv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final rv3.f f400389d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv3.f f400390e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rv3.f[] f400391f;

    static {
        rv3.f fVar = new rv3.f("USE_STATUS", 0);
        f400389d = fVar;
        rv3.f fVar2 = new rv3.f("FAV_STATUS", 1);
        f400390e = fVar2;
        rv3.f[] fVarArr = {fVar, fVar2};
        f400391f = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static rv3.f valueOf(java.lang.String str) {
        return (rv3.f) java.lang.Enum.valueOf(rv3.f.class, str);
    }

    public static rv3.f[] values() {
        return (rv3.f[]) f400391f.clone();
    }
}
