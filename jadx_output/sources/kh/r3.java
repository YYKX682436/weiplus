package kh;

/* loaded from: classes12.dex */
public final class r3 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.s3 f307905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(kh.s3 s3Var, kh.s3 s3Var2) {
        super(s3Var, s3Var2);
        this.f307905e = s3Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.s3 s3Var = new kh.s3();
        kh.p1 p1Var = kh.t1.f307916i;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        p1Var.a(this.f307905e, (kh.t1) end, s3Var);
        return s3Var;
    }
}
