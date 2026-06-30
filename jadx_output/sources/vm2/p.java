package vm2;

/* loaded from: classes3.dex */
public final class p extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm2.v f438106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f438107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vm2.o f438108c;

    public p(vm2.v vVar, r45.f62 f62Var, vm2.o oVar) {
        this.f438106a = vVar;
        this.f438107b = f62Var;
        this.f438108c = oVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            vm2.v vVar = this.f438106a;
            if (vVar.f438122f) {
                return;
            }
            df2.dd ddVar = df2.od.f230952w;
            gk2.e liveRoomData = vVar.f438120d.getLiveRoomData();
            r45.f62 f62Var = this.f438107b;
            ddVar.a(liveRoomData, 1, 3, (r13 & 8) != 0 ? null : f62Var.getString(0), (r13 & 16) != 0 ? null : null);
            if (this.f438108c.f438101d.isShown()) {
                return;
            }
            ddVar.d(vVar.f438120d.getLiveRoomData(), ml2.u1.M2, f62Var.getString(0));
        }
    }
}
