package db2;

/* loaded from: classes2.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.s3 f228140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lx2 f228141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(db2.s3 s3Var, r45.lx2 lx2Var) {
        super(0);
        this.f228140d = s3Var;
        this.f228141e = lx2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderStreamReRankEvent finderStreamReRankEvent = new com.tencent.mm.autogen.events.FinderStreamReRankEvent();
        java.util.LinkedList linkedList = this.f228140d.f228150t;
        am.fd fdVar = finderStreamReRankEvent.f54326g;
        fdVar.f6672a = linkedList;
        fdVar.f6673b = this.f228141e;
        finderStreamReRankEvent.e();
        return jz5.f0.f302826a;
    }
}
