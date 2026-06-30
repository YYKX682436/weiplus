package wu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final wu2.q f449695e;

    /* renamed from: f, reason: collision with root package name */
    public static final wu2.q f449696f;

    /* renamed from: g, reason: collision with root package name */
    public static final wu2.q f449697g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wu2.q[] f449698h;

    /* renamed from: d, reason: collision with root package name */
    public final int f449699d;

    static {
        wu2.q qVar = new wu2.q("Default", 0, 0);
        f449695e = qVar;
        wu2.q qVar2 = new wu2.q("Click", 1, 1);
        f449696f = qVar2;
        wu2.q qVar3 = new wu2.q("Scroll", 2, 2);
        f449697g = qVar3;
        wu2.q[] qVarArr = {qVar, qVar2, qVar3};
        f449698h = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, int i18) {
        this.f449699d = i18;
    }

    public static wu2.q valueOf(java.lang.String str) {
        return (wu2.q) java.lang.Enum.valueOf(wu2.q.class, str);
    }

    public static wu2.q[] values() {
        return (wu2.q[]) f449698h.clone();
    }
}
