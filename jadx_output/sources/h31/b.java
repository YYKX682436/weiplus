package h31;

/* loaded from: classes9.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f278392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h31.r f278393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f278394f;

    public b(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, h31.r rVar, int i17) {
        this.f278392d = subscribeMsgRequestResult;
        this.f278393e = rVar;
        this.f278394f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f278392d;
        int i18 = subscribeMsgRequestResult.f71797w;
        h31.r rVar = this.f278393e;
        if (i18 == 0) {
            h31.a aVar = rVar.f278434h;
            if (aVar != null) {
                ((m31.y1) aVar).b(false, subscribeMsgRequestResult);
                return;
            }
            return;
        }
        h31.a aVar2 = rVar.f278434h;
        if (aVar2 != null) {
            ((m31.y1) aVar2).a(this.f278394f, i18, subscribeMsgRequestResult.f71798x);
        }
    }
}
