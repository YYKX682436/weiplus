package lf4;

/* loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f318409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f318410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ if4.f f318411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(boolean z17, lf4.j1 j1Var, int i17, int i18, java.util.ArrayList arrayList, if4.f fVar) {
        super(0);
        this.f318406d = z17;
        this.f318407e = j1Var;
        this.f318408f = i17;
        this.f318409g = i18;
        this.f318410h = arrayList;
        this.f318411i = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f318406d) {
            lf4.j1 j1Var = this.f318407e;
            java.lang.String str = j1Var.f318421h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentChanged, will update row:");
            int i17 = this.f318408f;
            sb6.append(i17);
            sb6.append(" col:");
            int i18 = this.f318409g;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList = this.f318410h;
            arrayList.set(i18, this.f318411i);
            lf4.h hVar = j1Var.f318419f;
            ((sf4.a1) hVar).h(i17, arrayList);
            ((sf4.a1) hVar).e(i17, i18, 1);
            ((sf4.a1) hVar).d();
        }
        return jz5.f0.f302826a;
    }
}
