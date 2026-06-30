package id2;

/* loaded from: classes3.dex */
public final class z4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290908a;

    public z4(id2.f5 f5Var) {
        this.f290908a = f5Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        id2.f5 f5Var = this.f290908a;
        id2.f5.O6(f5Var, z17);
        if (z17) {
            return;
        }
        jl2.b.o0(f5Var.f290574n, 2, 0L, new id2.t4(f5Var), 2, null);
    }
}
