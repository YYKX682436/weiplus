package d0;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1[] f225224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f225227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f225228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.d f225229i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s1.o1[] o1VarArr, java.util.List list, s1.x0 x0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, z0.d dVar) {
        super(1);
        this.f225224d = o1VarArr;
        this.f225225e = list;
        this.f225226f = x0Var;
        this.f225227g = f0Var;
        this.f225228h = f0Var2;
        this.f225229i = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        z0.d dVar = this.f225229i;
        s1.o1[] o1VarArr = this.f225224d;
        int length = o1VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            s1.o1 o1Var = o1VarArr[i18];
            int i19 = i17 + 1;
            if (o1Var == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            }
            d0.y.b(layout, o1Var, (s1.r0) this.f225225e.get(i17), this.f225226f.getLayoutDirection(), this.f225227g.f310116d, this.f225228h.f310116d, dVar);
            i18++;
            i17 = i19;
        }
        return jz5.f0.f302826a;
    }
}
