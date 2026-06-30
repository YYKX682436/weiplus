package ty2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final ty2.q f423105e;

    /* renamed from: f, reason: collision with root package name */
    public static final ty2.q f423106f;

    /* renamed from: g, reason: collision with root package name */
    public static final ty2.q f423107g;

    /* renamed from: h, reason: collision with root package name */
    public static final ty2.q f423108h;

    /* renamed from: i, reason: collision with root package name */
    public static final ty2.q f423109i;

    /* renamed from: m, reason: collision with root package name */
    public static final ty2.q f423110m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ty2.q[] f423111n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f423112d;

    static {
        ty2.q qVar = new ty2.q("IMG", 0, "头图");
        f423105e = qVar;
        ty2.q qVar2 = new ty2.q("TITLE", 1, "商品名");
        f423106f = qVar2;
        ty2.q qVar3 = new ty2.q("LABEL", 2, "商品标签");
        f423107g = qVar3;
        ty2.q qVar4 = new ty2.q("PRICE", 3, "商品价格");
        f423108h = qVar4;
        ty2.q qVar5 = new ty2.q("PLATFORM_NAME", 4, "店铺名");
        f423109i = qVar5;
        ty2.q qVar6 = new ty2.q("EMPTY", 5, "空视图");
        f423110m = qVar6;
        ty2.q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
        f423111n = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, java.lang.String str2) {
        this.f423112d = str2;
    }

    public static ty2.q valueOf(java.lang.String str) {
        return (ty2.q) java.lang.Enum.valueOf(ty2.q.class, str);
    }

    public static ty2.q[] values() {
        return (ty2.q[]) f423111n.clone();
    }
}
