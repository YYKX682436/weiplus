package tm2;

/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(tm2.s2 s2Var) {
        super(0);
        this.f420545d = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tm2.s2 s2Var = this.f420545d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = s2Var.f420603o;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) s2Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, true, null, 10, null);
        }
        return jz5.f0.f302826a;
    }
}
