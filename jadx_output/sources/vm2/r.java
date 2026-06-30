package vm2;

/* loaded from: classes3.dex */
public final class r extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm2.v f438111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f438112b;

    public r(vm2.v vVar, r45.f62 f62Var) {
        this.f438111a = vVar;
        this.f438112b = f62Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            vm2.v vVar = this.f438111a;
            if (vVar.f438122f) {
                return;
            }
            df2.dd ddVar = df2.od.f230952w;
            gk2.e liveRoomData = vVar.f438120d.getLiveRoomData();
            ml2.u1 u1Var = ml2.u1.N2;
            r45.f62 f62Var = this.f438112b;
            ddVar.d(liveRoomData, u1Var, f62Var.getString(0));
            ddVar.a(vVar.f438120d.getLiveRoomData(), 1, 8, (r13 & 8) != 0 ? null : f62Var.getString(0), (r13 & 16) != 0 ? null : null);
        }
    }
}
