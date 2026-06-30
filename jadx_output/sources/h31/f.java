package h31;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f278404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h31.r f278405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f278406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, h31.r rVar, int i17) {
        super(0);
        this.f278404d = subscribeMsgRequestResult;
        this.f278405e = rVar;
        this.f278406f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f278404d;
        int i17 = subscribeMsgRequestResult.f71797w;
        h31.r rVar = this.f278405e;
        if (i17 == 0) {
            h31.a aVar = rVar.f278434h;
            if (aVar != null) {
                ((m31.y1) aVar).b(false, subscribeMsgRequestResult);
            }
        } else {
            h31.a aVar2 = rVar.f278434h;
            if (aVar2 != null) {
                ((m31.y1) aVar2).a(this.f278406f, i17, subscribeMsgRequestResult.f71798x);
            }
        }
        return jz5.f0.f302826a;
    }
}
