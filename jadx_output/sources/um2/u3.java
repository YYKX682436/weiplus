package um2;

/* loaded from: classes3.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(android.view.ViewGroup viewGroup, fm2.c cVar) {
        super(0);
        this.f428978d = viewGroup;
        this.f428979e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup parent = this.f428978d;
        kotlin.jvm.internal.o.f(parent, "$parent");
        return new com.tencent.mm.plugin.finder.live.plugin.sw(parent, (com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView) parent.findViewById(com.tencent.mm.R.id.awr), this.f428979e, false, um2.t3.f428966d);
    }
}
