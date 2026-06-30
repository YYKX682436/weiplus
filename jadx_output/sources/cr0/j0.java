package cr0;

/* loaded from: classes12.dex */
public final class j0 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr0.k0 f221656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(cr0.k0 k0Var, cr0.k0 k0Var2) {
        super(k0Var, k0Var2);
        this.f221656e = k0Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        cr0.k0 k0Var = new cr0.k0();
        cr0.u uVar = cr0.w.f221786h;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        uVar.b(this.f221656e, (cr0.w) end, k0Var);
        return k0Var;
    }
}
