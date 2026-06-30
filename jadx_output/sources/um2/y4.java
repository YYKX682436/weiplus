package um2;

/* loaded from: classes3.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(um2.x5 x5Var) {
        super(0);
        this.f429100d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f429100d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = x5Var.f429071s;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) x5Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, true, null, 10, null);
        }
        return jz5.f0.f302826a;
    }
}
