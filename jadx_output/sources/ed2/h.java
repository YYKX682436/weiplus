package ed2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.a f251266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.i f251267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ed2.a aVar, ed2.i iVar) {
        super(0);
        this.f251266d = aVar;
        this.f251267e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showTargetWithResult] show ");
        ed2.a aVar = this.f251266d;
        sb6.append(aVar);
        sb6.append(", current: ");
        ed2.i iVar = this.f251267e;
        sb6.append(iVar.f251269e);
        com.tencent.mars.xlog.Log.i("FinderFeedBubbleTipsManager", sb6.toString());
        ed2.d dVar = (ed2.d) iVar.f251268d.get(aVar);
        if (dVar != null) {
            ed2.c cVar = (ed2.c) dVar;
            com.tencent.mm.plugin.finder.view.rm rmVar = cVar.f251258b;
            if (((ed2.m) ((jz5.n) rmVar.f251281c).getValue()).O6(rmVar.f251280b)) {
                ed2.i iVar2 = cVar.f251260d;
                in5.s0 s0Var = iVar2.f251270f;
                if (s0Var != null) {
                    android.view.View p17 = s0Var.p(cVar.f251257a);
                    kotlin.jvm.internal.o.f(p17, "getView(...)");
                    rmVar.c(p17);
                    rmVar.setOnDismissListener(new ed2.b(iVar2, cVar));
                }
                z17 = true;
            } else {
                z17 = false;
            }
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            bool = null;
        }
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            iVar.f251269e = aVar;
        }
        return jz5.f0.f302826a;
    }
}
