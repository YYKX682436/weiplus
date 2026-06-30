package pv3;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv3.m f358606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f358607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv3.m mVar, android.view.View view, in5.s0 s0Var) {
        super(1);
        this.f358606d = mVar;
        this.f358607e = view;
        this.f358608f = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pv3.m mVar = this.f358606d;
        if (intValue == 0) {
            mVar.a(this.f358607e);
        } else {
            mVar.c(this.f358608f);
        }
        return jz5.f0.f302826a;
    }
}
