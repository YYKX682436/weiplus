package ll2;

/* loaded from: classes3.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f319132d;

    public d(yz5.l lVar) {
        this.f319132d = lVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        ll2.e eVar = ll2.e.f319133a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive notification path ");
        sb6.append(aVar.f105331e);
        sb6.append(", show = ");
        sb6.append(aVar.f105327a);
        sb6.append(", group id = ");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
        sb6.append((jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : vs2Var.f388500u);
        com.tencent.mars.xlog.Log.i("FinderLiveRedDotNotifier", sb6.toString());
        this.f319132d.invoke(aVar);
    }
}
