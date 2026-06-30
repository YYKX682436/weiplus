package kl2;

/* loaded from: classes3.dex */
public final class x implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f308826a;

    public x(kl2.e0 e0Var) {
        this.f308826a = e0Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        pk2.f8.d(pk2.f8.f355747a, 4, 0, 3, z17 ? 2 : 3, null, 16, null);
        kl2.e0 e0Var = this.f308826a;
        kl2.e0.a(e0Var, z17);
        ll2.e.b(ll2.e.f319133a, "audience.more.morefunction.rewardlimit", false, false, 6, null);
        if (z17) {
            return;
        }
        jl2.b.o0(e0Var.f308759b, 2, 0L, new kl2.y(e0Var), 2, null);
    }
}
