package ws2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ws2.y yVar) {
        super(0);
        this.f449151d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.y yVar = this.f449151d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = yVar.f449163k;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) yVar.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, false, null, 14, null);
        }
        return jz5.f0.f302826a;
    }
}
