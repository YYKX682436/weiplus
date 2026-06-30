package lf4;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f318509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f318510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ if4.f f318511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z17, lf4.b0 b0Var, int i17, int i18, java.util.ArrayList arrayList, if4.f fVar) {
        super(0);
        this.f318506d = z17;
        this.f318507e = b0Var;
        this.f318508f = i17;
        this.f318509g = i18;
        this.f318510h = arrayList;
        this.f318511i = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f318506d) {
            lf4.b0 b0Var = this.f318507e;
            java.lang.String str = b0Var.f318358h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentChanged, will update row:");
            int i17 = this.f318508f;
            sb6.append(i17);
            sb6.append(" col:");
            int i18 = this.f318509g;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList = this.f318510h;
            arrayList.set(i18, this.f318511i);
            lf4.h hVar = b0Var.f318355e;
            ((sf4.a1) hVar).h(i17, arrayList);
            ((sf4.a1) hVar).e(i17, i18, 1);
            ((sf4.a1) hVar).d();
        }
        return jz5.f0.f302826a;
    }
}
