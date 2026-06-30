package sm2;

/* loaded from: classes3.dex */
public final class d3 implements com.tencent.mm.plugin.finder.live.view.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409425b;

    public d3(sm2.o4 o4Var, fm2.a aVar) {
        this.f409424a = o4Var;
        this.f409425b = aVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.g
    public void a(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (sm2.c3.f409393a[status.ordinal()] == 1) {
            sm2.o4 o4Var = this.f409424a;
            if (o4Var.f409607c0 == null) {
                o4Var.f409607c0 = new com.tencent.mm.plugin.finder.live.plugin.hm((android.view.ViewGroup) sm2.o4.j(o4Var, com.tencent.mm.R.id.f1i, this.f409425b), this.f409425b, null, 4, null);
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar = o4Var.f409607c0;
                if (hmVar != null) {
                    hmVar.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = o4Var.f409607c0;
                if (hmVar2 != null) {
                    hmVar2.z0();
                }
            }
        }
    }
}
