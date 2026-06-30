package um2;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.view.ViewGroup viewGroup, fm2.c cVar) {
        super(0);
        this.f428806d = viewGroup;
        this.f428807e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f428806d;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ozm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f484840fo5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.le0(viewGroup, (android.widget.ImageView) findViewById, (android.view.ViewGroup) findViewById2, this.f428807e);
    }
}
