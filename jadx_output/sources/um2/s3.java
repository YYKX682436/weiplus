package um2;

/* loaded from: classes3.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(android.view.ViewGroup viewGroup, fm2.c cVar) {
        super(0);
        this.f428956d = viewGroup;
        this.f428957e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup parent = this.f428956d;
        kotlin.jvm.internal.o.f(parent, "$parent");
        return new com.tencent.mm.plugin.finder.live.plugin.sw(parent, (com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView) parent.findViewById(com.tencent.mm.R.id.kwh), this.f428957e, true, um2.r3.f428945d);
    }
}
