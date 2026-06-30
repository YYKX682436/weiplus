package pk2;

/* loaded from: classes3.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(pk2.o9 o9Var) {
        super(0);
        this.f356295d = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderLiveUninterestedEvent finderLiveUninterestedEvent = new com.tencent.mm.autogen.events.FinderLiveUninterestedEvent();
        long j17 = ((mm2.e1) this.f356295d.c(mm2.e1.class)).f328983m;
        am.fc fcVar = finderLiveUninterestedEvent.f54301g;
        fcVar.f6670a = j17;
        fcVar.f6671b = true;
        finderLiveUninterestedEvent.e();
        return jz5.f0.f302826a;
    }
}
