package ws2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ws2.y yVar) {
        super(0);
        this.f449153d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.y yVar = this.f449153d;
        ((mm2.x4) yVar.c(mm2.x4.class)).f329528f.clear();
        ((mm2.c1) yVar.c(mm2.c1.class)).Q3.clear();
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = yVar.f449163k;
        if (mgVar != null) {
            mgVar.L1();
        }
        return jz5.f0.f302826a;
    }
}
