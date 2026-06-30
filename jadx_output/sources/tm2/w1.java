package tm2;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f420629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(android.view.ViewGroup viewGroup, fm2.b bVar) {
        super(0);
        this.f420629d = viewGroup;
        this.f420630e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup parent = this.f420629d;
        kotlin.jvm.internal.o.f(parent, "$parent");
        return new com.tencent.mm.plugin.finder.live.plugin.sw(parent, (com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView) parent.findViewById(com.tencent.mm.R.id.awr), this.f420630e, false, tm2.v1.f420626d);
    }
}
