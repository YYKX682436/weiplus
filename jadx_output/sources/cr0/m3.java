package cr0;

/* loaded from: classes12.dex */
public final class m3 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.n3 f221687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(cr0.n3 n3Var, cr0.n3 n3Var2) {
        super(n3Var, n3Var2);
        this.f221687e = n3Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.n3 n3Var = new cr0.n3();
        cr0.b0 b0Var = cr0.h0.f221633k;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        b0Var.b(this.f221687e, (cr0.h0) end, n3Var);
        return n3Var;
    }
}
