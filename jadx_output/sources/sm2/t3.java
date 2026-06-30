package sm2;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(sm2.o4 o4Var) {
        super(0);
        this.f409713d = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409713d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = o4Var.f409628o;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) o4Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, true, null, 10, null);
        }
        return jz5.f0.f302826a;
    }
}
