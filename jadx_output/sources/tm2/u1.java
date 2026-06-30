package tm2;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f420622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.view.ViewGroup viewGroup, fm2.b bVar) {
        super(0);
        this.f420622d = viewGroup;
        this.f420623e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup parent = this.f420622d;
        kotlin.jvm.internal.o.f(parent, "$parent");
        return new com.tencent.mm.plugin.finder.live.plugin.sw(parent, (com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView) parent.findViewById(com.tencent.mm.R.id.kwh), this.f420623e, true, tm2.t1.f420618d);
    }
}
