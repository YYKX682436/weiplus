package im2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC) {
        super(0);
        this.f292301d = finderLiveExitAnimateOpUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh()) {
            ig2.m.f291393a.c();
        }
        ig2.m mVar = ig2.m.f291393a;
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f292301d;
        ig2.r f17 = mVar.f(finderLiveExitAnimateOpUIC.f116985h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("directorHashCode: ");
        sb6.append(finderLiveExitAnimateOpUIC.f116988n);
        sb6.append(" direct: ");
        boolean z17 = false;
        sb6.append(f17 != null ? f17.hashCode() : 0);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = finderLiveExitAnimateOpUIC.f116981d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (f17 instanceof ig2.i) {
            ig2.i iVar = (ig2.i) f17;
            if (iVar.c().f291409h != null && iVar.hashCode() == finderLiveExitAnimateOpUIC.f116988n) {
                com.tencent.mars.xlog.Log.e(str, "checkLeak auto stop " + finderLiveExitAnimateOpUIC.f116985h + " scene: " + iVar.c().f291402a);
                f17.a();
                mVar.d();
                mn0.b0 b0Var = iVar.c().f291409h;
                if (b0Var != null) {
                    mn0.b0.C(b0Var, true, false, false, 6, null);
                }
            }
        }
        ug5.f fVar = ug5.v.f427655g;
        java.lang.String key = java.lang.String.valueOf(finderLiveExitAnimateOpUIC.f116985h);
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "removePerformer key: ".concat(key));
        java.lang.Object remove = ug5.v.f427657i.remove(key);
        ug5.v vVar = remove instanceof ug5.v ? (ug5.v) remove : null;
        if (vVar != null) {
            java.lang.Object d17 = vVar.d("key_player");
            mn0.b0 b0Var2 = d17 instanceof mn0.b0 ? (mn0.b0) d17 : null;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("performerDirectorHashCode: ");
            sb8.append(finderLiveExitAnimateOpUIC.f116989o);
            sb8.append(" code: ");
            sb8.append(vVar.hashCode());
            sb8.append(" playing: ");
            sb8.append(b0Var2 != null ? java.lang.Boolean.valueOf(((mn0.y) b0Var2).b(false)) : null);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            if ((f17 != null ? f17.hashCode() : 0) == finderLiveExitAnimateOpUIC.f116988n) {
                if (b0Var2 != null && ((mn0.y) b0Var2).b(false)) {
                    z17 = true;
                }
                if (z17) {
                    mn0.b0.C(b0Var2, true, false, false, 6, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
