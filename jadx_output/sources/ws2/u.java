package ws2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ws2.y yVar) {
        super(0);
        this.f449145d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ws2.y yVar = this.f449145d;
        if (((ct2.j) yVar.c(ct2.j.class)).T6() && mm2.g0.Q6((mm2.g0) yVar.c(mm2.g0.class), null, 1, null)) {
            linkedList.add(new jz5.l(1, null));
        }
        java.lang.String str = (java.lang.String) new ws2.v(yVar).invoke();
        if (str.length() > 0) {
            linkedList.add(new jz5.l(2, str));
        }
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = yVar.f449161i;
        if (khVar != null) {
            khVar.K0(0);
        }
        com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = yVar.f449161i;
        if (khVar2 != null) {
            khVar2.A1(linkedList, false, true);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = yVar.f449163k;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) yVar.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, false, null, 14, null);
        }
        return jz5.f0.f302826a;
    }
}
