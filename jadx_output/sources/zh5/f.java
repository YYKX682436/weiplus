package zh5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final zh5.f f473021d;

    /* renamed from: e, reason: collision with root package name */
    public static final zh5.f f473022e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zh5.f[] f473023f;

    static {
        zh5.f fVar = new zh5.f("Success", 0);
        f473021d = fVar;
        zh5.f fVar2 = new zh5.f("Error", 1);
        f473022e = fVar2;
        zh5.f[] fVarArr = {fVar, fVar2, new zh5.f("InvalidFileId", 2), new zh5.f("NotSupport", 3)};
        f473023f = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static zh5.f valueOf(java.lang.String str) {
        return (zh5.f) java.lang.Enum.valueOf(zh5.f.class, str);
    }

    public static zh5.f[] values() {
        return (zh5.f[]) f473023f.clone();
    }
}
