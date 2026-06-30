package ez2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final ez2.f f257898e;

    /* renamed from: f, reason: collision with root package name */
    public static final ez2.f f257899f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ez2.f[] f257900g;

    /* renamed from: d, reason: collision with root package name */
    public final int f257901d;

    static {
        ez2.f fVar = new ez2.f("TextureView", 0, 1);
        f257898e = fVar;
        ez2.f fVar2 = new ez2.f("SurfaceView", 1, 2);
        f257899f = fVar2;
        ez2.f[] fVarArr = {fVar, fVar2};
        f257900g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f257901d = i18;
    }

    public static ez2.f valueOf(java.lang.String str) {
        return (ez2.f) java.lang.Enum.valueOf(ez2.f.class, str);
    }

    public static ez2.f[] values() {
        return (ez2.f[]) f257900g.clone();
    }
}
