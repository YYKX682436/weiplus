package dn3;

/* loaded from: classes14.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f242000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w25.e f242001e;

    public e(dn3.f fVar, boolean z17, w25.e eVar) {
        this.f242000d = z17;
        this.f242001e = eVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof dn3.k) {
            gm0.j1.d().q(603, this);
            w25.e eVar = this.f242001e;
            if (i17 == 0 && i18 == 0) {
                eVar.i3(this.f242000d ? ((r45.th3) ((dn3.k) m1Var).f242025e.f70711b.f70700a).f386437s : ((r45.th3) ((dn3.k) m1Var).f242025e.f70711b.f70700a).f386434p, ((r45.th3) ((dn3.k) m1Var).f242025e.f70711b.f70700a).f386429h);
            } else {
                eVar.i3("", java.util.Collections.EMPTY_LIST);
            }
        }
    }
}
