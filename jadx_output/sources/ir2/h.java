package ir2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedDeleteEvent f294142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.o f294143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent, ir2.o oVar) {
        super(0);
        this.f294142d = feedDeleteEvent;
        this.f294143e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = this.f294142d;
        feedDeleteEvent.f54247g.getClass();
        am.da daVar = feedDeleteEvent.f54247g;
        long j17 = daVar.f6437a;
        ir2.o oVar = this.f294143e;
        if (j17 != 0) {
            ir2.y.X1(oVar.f294188d, j17, false, 2, null);
        } else {
            pf5.e.launch$default(oVar.f294188d, null, null, new ir2.l(oVar, daVar.f6438b, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
