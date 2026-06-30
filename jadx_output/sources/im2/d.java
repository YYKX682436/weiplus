package im2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f292282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ng2.g f292283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, kotlin.jvm.internal.c0 c0Var, ng2.g gVar) {
        super(0);
        this.f292281d = finderLiveExitAnimateOpUIC;
        this.f292282e = c0Var;
        this.f292283f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f292281d.f116981d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachToWindow safe remove isHandler: ");
        kotlin.jvm.internal.c0 c0Var = this.f292282e;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            this.f292283f.a();
            ig2.m.f291393a.d();
        }
        return jz5.f0.f302826a;
    }
}
