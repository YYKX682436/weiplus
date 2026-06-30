package oz3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final oz3.f f350265e;

    /* renamed from: f, reason: collision with root package name */
    public static final oz3.f f350266f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oz3.f[] f350267g;

    /* renamed from: d, reason: collision with root package name */
    public final int f350268d;

    static {
        oz3.f fVar = new oz3.f("TypeAll", 0, 16777215);
        f350265e = fVar;
        oz3.f fVar2 = new oz3.f("TypeNormal", 1, 1);
        oz3.f fVar3 = new oz3.f("TypePay", 2, 2);
        f350266f = fVar3;
        oz3.f[] fVarArr = {fVar, fVar2, fVar3};
        f350267g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f350268d = i18;
    }

    public static oz3.f valueOf(java.lang.String str) {
        return (oz3.f) java.lang.Enum.valueOf(oz3.f.class, str);
    }

    public static oz3.f[] values() {
        return (oz3.f[]) f350267g.clone();
    }
}
