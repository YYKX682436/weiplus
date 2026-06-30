package lf4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f318475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f318476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lf4.b0 b0Var, int i17, java.util.ArrayList arrayList, androidx.recyclerview.widget.c0 c0Var) {
        super(0);
        this.f318473d = b0Var;
        this.f318474e = i17;
        this.f318475f = arrayList;
        this.f318476g = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.b0 b0Var = this.f318473d;
        sf4.a1 a1Var = (sf4.a1) b0Var.f318355e;
        int i17 = this.f318474e;
        a1Var.h(i17, this.f318475f);
        ((sf4.a1) b0Var.f318355e).d();
        this.f318476g.a(new lf4.q(b0Var, i17));
        return jz5.f0.f302826a;
    }
}
