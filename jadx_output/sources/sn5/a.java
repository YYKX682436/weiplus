package sn5;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final sn5.a f410145c;

    /* renamed from: d, reason: collision with root package name */
    public static final sn5.a f410146d;

    /* renamed from: e, reason: collision with root package name */
    public static final sn5.a f410147e;

    /* renamed from: f, reason: collision with root package name */
    public static final sn5.a f410148f;

    /* renamed from: g, reason: collision with root package name */
    public static final sn5.a f410149g;

    /* renamed from: h, reason: collision with root package name */
    public static final sn5.a f410150h;

    /* renamed from: i, reason: collision with root package name */
    public static final sn5.a[] f410151i;

    /* renamed from: a, reason: collision with root package name */
    public final int f410152a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410153b;

    static {
        sn5.a aVar = new sn5.a(0, false);
        f410145c = aVar;
        sn5.a aVar2 = new sn5.a(1, true);
        sn5.a aVar3 = new sn5.a(2, false);
        f410146d = aVar3;
        sn5.a aVar4 = new sn5.a(3, true);
        sn5.a aVar5 = new sn5.a(4, false);
        f410147e = aVar5;
        sn5.a aVar6 = new sn5.a(5, true);
        sn5.a aVar7 = new sn5.a(6, false);
        f410148f = aVar7;
        sn5.a aVar8 = new sn5.a(7, true);
        sn5.a aVar9 = new sn5.a(8, false);
        f410149g = aVar9;
        sn5.a aVar10 = new sn5.a(9, true);
        f410150h = aVar10;
        f410151i = new sn5.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, new sn5.a(10, false), new sn5.a(10, true)};
    }

    public a(int i17, boolean z17) {
        this.f410152a = i17;
        this.f410153b = z17;
    }

    public final boolean a(sn5.a status) {
        kotlin.jvm.internal.o.g(status, "status");
        int i17 = this.f410152a;
        int i18 = status.f410152a;
        return i17 < i18 || ((!this.f410153b || f410150h == this) && i17 == i18);
    }
}
