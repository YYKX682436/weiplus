package sp2;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(sp2.o2 o2Var) {
        super(0);
        this.f411050d = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.o2 o2Var = this.f411050d;
        up2.m mVar = o2Var.f411160v;
        if (mVar != null) {
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
            if (finderParentRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            mVar.e("transResponseToListData", finderParentRecyclerView);
        }
        return jz5.f0.f302826a;
    }
}
