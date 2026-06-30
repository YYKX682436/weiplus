package u04;

/* loaded from: classes12.dex */
public final class b implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423471a;

    public b(int i17) {
        this.f423471a = i17;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
        r45.x60 x60Var = (r45.x60) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryHelper", "getWithoutClear " + x60Var);
        pm0.v.V(500L, new u04.a(this.f423471a, x60Var));
    }
}
