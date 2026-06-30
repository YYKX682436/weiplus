package pk2;

/* loaded from: classes3.dex */
public final class fb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f355751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f355752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f355753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(pk2.o9 o9Var, yz5.a aVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.view.MenuItem menuItem) {
        super(1);
        this.f355750d = o9Var;
        this.f355751e = aVar;
        this.f355752f = finderObject;
        this.f355753g = menuItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o25.y1 y1Var;
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        pk2.o9 o9Var = this.f355750d;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "[clickAnchorQuickShare] onClick onMenuItemSelect");
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        r45.pk5 pk5Var = (r45.pk5) eVar.Ai(mMActivity, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk2.d9 d9Var = o9Var.f356082f;
            pk5Var.f383136h = (d9Var == null || (y1Var = d9Var.f355666i) == null) ? 0 : ((com.tencent.mm.pluginsdk.forward.m) y1Var).f188722e;
        }
        mm2.n0 n0Var = (mm2.n0) o9Var.c(mm2.n0.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f355752f;
        qe2.a.f(finderObject, n0Var);
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
        a17.setEcSource(((mm2.c1) o9Var.c(mm2.c1.class)).f328786c3);
        a17.setShareScene(zl2.r4.f473950a.Z0());
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Nj(mMActivity, userName, (db5.h4) this.f355753g, a17, new pk2.eb(o9Var));
        yz5.a aVar = this.f355751e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
