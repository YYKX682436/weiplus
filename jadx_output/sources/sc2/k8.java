package sc2;

/* loaded from: classes2.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f406026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f406027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f406028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(java.util.ArrayList arrayList, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, sc2.p8 p8Var) {
        super(1);
        this.f406026d = arrayList;
        this.f406027e = wxRecyclerView;
        this.f406028f = p8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.Iterator it = this.f406026d.iterator();
        while (it.hasNext()) {
            ((sc2.v8) it.next()).f406318e = intValue;
        }
        androidx.recyclerview.widget.f2 adapter = this.f406027e.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i(this.f406028f.f406152w, "onBindView: getImageColor=" + intValue);
        return jz5.f0.f302826a;
    }
}
