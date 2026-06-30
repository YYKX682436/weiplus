package my0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final my0.f f332658e;

    /* renamed from: f, reason: collision with root package name */
    public static final my0.f f332659f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ my0.f[] f332660g;

    /* renamed from: d, reason: collision with root package name */
    public final int f332661d;

    static {
        my0.f fVar = new my0.f("ChunJie", 0, 0);
        f332658e = fVar;
        my0.f fVar2 = new my0.f("ImageExt", 1, 1);
        f332659f = fVar2;
        my0.f[] fVarArr = {fVar, fVar2};
        f332660g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f332661d = i18;
    }

    public static my0.f valueOf(java.lang.String str) {
        return (my0.f) java.lang.Enum.valueOf(my0.f.class, str);
    }

    public static my0.f[] values() {
        return (my0.f[]) f332660g.clone();
    }
}
