package ov4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final ov4.f f349230e;

    /* renamed from: f, reason: collision with root package name */
    public static final ov4.f f349231f;

    /* renamed from: g, reason: collision with root package name */
    public static final ov4.f f349232g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ov4.f[] f349233h;

    /* renamed from: d, reason: collision with root package name */
    public final int f349234d;

    static {
        ov4.f fVar = new ov4.f("EXPOSE", 0, 1);
        f349230e = fVar;
        ov4.f fVar2 = new ov4.f("CLICK", 1, 2);
        f349231f = fVar2;
        ov4.f fVar3 = new ov4.f("PULL", 2, 3);
        f349232g = fVar3;
        ov4.f[] fVarArr = {fVar, fVar2, fVar3};
        f349233h = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f349234d = i18;
    }

    public static ov4.f valueOf(java.lang.String str) {
        return (ov4.f) java.lang.Enum.valueOf(ov4.f.class, str);
    }

    public static ov4.f[] values() {
        return (ov4.f[]) f349233h.clone();
    }
}
