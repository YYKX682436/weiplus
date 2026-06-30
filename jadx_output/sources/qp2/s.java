package qp2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f365800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qp2.y yVar, java.lang.String str, boolean z17, java.util.LinkedList linkedList) {
        super(0);
        this.f365798d = yVar;
        this.f365799e = str;
        this.f365800f = z17;
        this.f365801g = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qp2.y yVar = this.f365798d;
        yVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPageTitle title:");
        java.lang.String str = this.f365799e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", sb6.toString());
        if (!android.text.TextUtils.isEmpty(str)) {
            ((android.widget.TextView) yVar.getActivity().findViewById(com.tencent.mm.R.id.fnn)).setText(str);
        }
        yVar.f365807d = this.f365800f;
        java.util.List list = yVar.f365808e;
        ((java.util.LinkedList) list).addAll(this.f365801g);
        yVar.O6(list);
        if (c92.g.f39738a.b()) {
            androidx.fragment.app.Fragment fragment = yVar.getFragment();
            kotlin.jvm.internal.o.d(fragment);
            int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5);
            if (integer == 9500001 || integer == 9500002 || integer == 9500004 || integer == 9500003) {
                com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for in operation game page.");
            } else {
                pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.K, yVar.getActivity(), new qp2.u(yVar));
            }
        } else {
            com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for no hit finder live.");
        }
        return jz5.f0.f302826a;
    }
}
