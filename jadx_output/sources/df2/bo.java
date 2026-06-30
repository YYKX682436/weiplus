package df2;

/* loaded from: classes3.dex */
public final class bo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.co f229819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(df2.co coVar) {
        super(0);
        this.f229819d = coVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.o1 o1Var;
        df2.co coVar = this.f229819d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) coVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null && (o1Var = mgVar.D) != null) {
            java.util.List list = ((mm2.x4) coVar.business(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            java.util.ArrayList arrayList = o1Var.f22180m;
            arrayList.clear();
            arrayList.addAll(list);
            o1Var.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = (com.tencent.mm.plugin.finder.live.plugin.mg) coVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar2 != null) {
            com.tencent.mm.plugin.finder.live.plugin.mg.y1(mgVar2, null, 0, 3, null);
        }
        return jz5.f0.f302826a;
    }
}
