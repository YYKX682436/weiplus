package im2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f292269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ng2.g f292270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mo0.a f292271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, kotlin.jvm.internal.c0 c0Var, ng2.g gVar, mo0.a aVar) {
        super(1);
        this.f292268d = finderLiveExitAnimateOpUIC;
        this.f292269e = c0Var;
        this.f292270f = gVar;
        this.f292271g = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = this.f292268d.f116981d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNotifyVisibilityFunction: ");
        sb6.append(intValue);
        sb6.append(" isHandler: ");
        kotlin.jvm.internal.c0 c0Var = this.f292269e;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (intValue == 0 && !c0Var.f310112d) {
            c0Var.f310112d = true;
            this.f292270f.a();
            ig2.m.f291393a.d();
        }
        this.f292271g.f330256f = null;
        return jz5.f0.f302826a;
    }
}
