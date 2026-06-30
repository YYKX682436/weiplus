package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final z01.t f469161d;

    /* renamed from: e, reason: collision with root package name */
    public static final z01.t f469162e;

    /* renamed from: f, reason: collision with root package name */
    public static final z01.t f469163f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z01.t[] f469164g;

    static {
        z01.t tVar = new z01.t("LEFT", 0);
        f469161d = tVar;
        z01.t tVar2 = new z01.t("CENTER", 1);
        f469162e = tVar2;
        z01.t tVar3 = new z01.t("RIGHT", 2);
        f469163f = tVar3;
        z01.t[] tVarArr = {tVar, tVar2, tVar3};
        f469164g = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    public static z01.t valueOf(java.lang.String str) {
        return (z01.t) java.lang.Enum.valueOf(z01.t.class, str);
    }

    public static z01.t[] values() {
        return (z01.t[]) f469164g.clone();
    }
}
