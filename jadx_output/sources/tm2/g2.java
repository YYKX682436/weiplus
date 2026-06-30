package tm2;

/* loaded from: classes3.dex */
public final class g2 implements com.tencent.mm.plugin.finder.live.view.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420514b;

    public g2(tm2.s2 s2Var, fm2.b bVar) {
        this.f420513a = s2Var;
        this.f420514b = bVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.g
    public void a(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (tm2.f2.f420508a[status.ordinal()] == 1) {
            tm2.s2 s2Var = this.f420513a;
            if (s2Var.N == null) {
                s2Var.N = new com.tencent.mm.plugin.finder.live.plugin.hm((android.view.ViewGroup) tm2.s2.f(s2Var, com.tencent.mm.R.id.f1i, this.f420514b), this.f420514b, null, 4, null);
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar = s2Var.N;
                if (hmVar != null) {
                    hmVar.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = s2Var.N;
                if (hmVar2 != null) {
                    hmVar2.z0();
                }
            }
        }
    }
}
